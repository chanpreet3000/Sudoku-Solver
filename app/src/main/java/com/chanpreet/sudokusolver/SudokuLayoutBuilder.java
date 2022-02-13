package com.chanpreet.sudokusolver;

import android.content.Context;
import android.os.AsyncTask;
import android.text.InputFilter;
import android.text.InputType;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;
import java.util.List;

public class SudokuLayoutBuilder {

    private final Context context;
    private final ViewGroup viewGroup;
    private final int order;
    private SuccessListener successListener;
    private FailureListener failureListener;

    public SudokuLayoutBuilder(Context context, ViewGroup viewGroup, int order) {
        this.context = context;
        this.viewGroup = viewGroup;
        this.order = order;
    }

    public void build() {
        new AsyncSudokuLayoutBuilder().execute();
    }

    private class AsyncSudokuLayoutBuilder extends AsyncTask<Void, Void, List<List<EditText>>> {
        private ConstraintLayout backgroundParent;
        private ConstraintLayout mainParent;

        @Override
        protected void onPreExecute() {
            super.onPreExecute();
            backgroundParent = new ConstraintLayout(context);
            mainParent = new ConstraintLayout(context);
            viewGroup.addView(backgroundParent, new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT));
            viewGroup.addView(mainParent, new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT));

        }

        @Override
        protected List<List<EditText>> doInBackground(Void... voids) {
            List<List<EditText>> listOfEditText = new ArrayList<>();
            LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT,
                    1f);


            // Background for sudoku
            LinearLayout backgroundLayout = new LinearLayout(context);
            backgroundLayout.setOrientation(LinearLayout.VERTICAL);
            backgroundLayout.setBackgroundResource(R.drawable.outline_4dp);
            backgroundParent.addView(backgroundLayout, new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT));

            int sq = (int) Math.sqrt(order);
            for (int i = 0; i < sq; i++) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(LinearLayout.HORIZONTAL);
                linearLayout.setBackgroundResource(R.drawable.outline_2dp);
                backgroundLayout.addView(linearLayout, i, params);
            }

            for (int i = 0; i < sq; i++) {
                for (int j = 0; j < sq; j++) {
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(LinearLayout.VERTICAL);
                    linearLayout.setBackgroundResource(R.drawable.outline_2dp);
                    ((LinearLayout) backgroundLayout.getChildAt(i)).addView(linearLayout, j, params);
                }
            }

            // main sudoku with edit Texts
            LinearLayout mainLayout = new LinearLayout(context);
            mainLayout.setOrientation(LinearLayout.VERTICAL);
            mainParent.addView(mainLayout, new ConstraintLayout.LayoutParams(ConstraintLayout.LayoutParams.MATCH_PARENT, ConstraintLayout.LayoutParams.MATCH_PARENT));

            for (int i = 0; i < order; i++) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(LinearLayout.HORIZONTAL);
                mainLayout.addView(linearLayout, i, params);
                listOfEditText.add(new ArrayList<>());
                for (int j = 0; j < order; j++) {
                    EditText editText = new EditText(context);
                    editText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                    editText.setInputType(InputType.TYPE_CLASS_NUMBER);
                    editText.setBackgroundResource(R.drawable.outline_1dp);

                    InputFilter[] FilterArray = new InputFilter[1];
                    FilterArray[0] = new InputFilter.LengthFilter(order / 10 + 1);
                    editText.setFilters(FilterArray);

                    linearLayout.addView(editText, j, params);
                    listOfEditText.get(i).add(editText);
                }
            }
             return listOfEditText;
        }

        @Override
        protected void onPostExecute(List<List<EditText>> lists) {
            super.onPostExecute(lists);
            successListener.onSuccess(lists);
        }

        @Override
        protected void onCancelled() {
            super.onCancelled();
            failureListener.onFailure();
        }
    }

    public SudokuLayoutBuilder addOnSuccessListener(SuccessListener successListener) {
        this.successListener = successListener;
        return this;
    }

    public SudokuLayoutBuilder addOnFailureListener(FailureListener failureListener) {
        this.failureListener = failureListener;
        return this;
    }

    public interface SuccessListener {
        void onSuccess(List<List<EditText>> listOfEditText);
    }

    public interface FailureListener {
        void onFailure();
    }
}
