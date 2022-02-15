package com.chanpreet.sudokusolver;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class SudokuLayoutBuilder {

    public List<List<EditText>> build(Context context, LinearLayout parent, int order) {
        List<List<EditText>> listOfEditText = new ArrayList<>();
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1f);

        for (int i = 0; i < order; i++) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            parent.addView(linearLayout, i, params);

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

    public void buildBackground(Context context, GridLayout parent, int order, int N, int M, int resourceID) {
        parent.setBackgroundResource(resourceID);
        for (int i = 0; i < order / M; i++) {
            GridLayout.Spec rowSpec = GridLayout.spec(i, 1, 1f);
            for (int j = 0; j < order / N; j++) {
                GridLayout.Spec colSpec = GridLayout.spec(j, 1, 1f);
                GridLayout gridLayout = new GridLayout(context);
                gridLayout.setBackgroundResource(R.drawable.outline_2dp);
                GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
                layoutParams.rowSpec = rowSpec;
                layoutParams.columnSpec = colSpec;
                parent.addView(gridLayout, layoutParams);
            }
        }
    }
}
//
//    public void build() {
//        parent.setRowCount(order);
//        parent.setColumnCount(order);
//
//        for (int i = 0; i < order; i++) {
//            GridLayout.Spec rowSpec = GridLayout.spec(i, 1, 1f);
//            for (int j = 0; j < order; j++) {
//                GridLayout.Spec colSpec = GridLayout.spec(j, 1, 1f);
//
//                GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
//                layoutParams.rowSpec = rowSpec;
//                layoutParams.columnSpec = colSpec;
//
//                EditText editText = new EditText(context);
//                editText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
//                editText.setInputType(InputType.TYPE_CLASS_NUMBER);
//                editText.setBackgroundResource(R.drawable.outline_1dp);
//
//                InputFilter[] FilterArray = new InputFilter[1];
//                FilterArray[0] = new InputFilter.LengthFilter(order / 10 + 1);
//                editText.setFilters(FilterArray);
//                parent.addView(editText, i * order + j, layoutParams);
//            }
//        }
//    }

//    public void build() {
//        parent.setRowCount(a);
//        parent.setColumnCount(b);
//        parent.setBackgroundResource(R.drawable.outline_4dp);
//
//        for (int i = 0; i < order / b; i++) {
//            GridLayout.Spec rowSpec = GridLayout.spec(i, 1,1f);
//            for (int j = 0; j < order / a; j++) {
//                GridLayout.Spec colSpec = GridLayout.spec(j, 1,1f);
//                GridLayout gridLayout = new GridLayout(context);
//                gridLayout.setRowCount(order / a);
//                gridLayout.setColumnCount(order / b);
//                gridLayout.setBackgroundResource(R.drawable.outline_2dp);
//
//                GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
//                layoutParams.rowSpec = rowSpec;
//                layoutParams.columnSpec = colSpec;
//
//                parent.addView(gridLayout, layoutParams);
//            }
//        }
//
//        for (int i = 0; i < order; i++) {
//            GridLayout gridLayout = (GridLayout) parent.getChildAt(i);
//
//            for (int j = 0; j < gridLayout.getRowCount(); j++) {
//                GridLayout.Spec rowSpec = GridLayout.spec(j, 1,1f);
//                for (int k = 0; k < gridLayout.getColumnCount(); k++) {
//                    GridLayout.Spec colSpec = GridLayout.spec(k, 1,1f);
//
//                    GridLayout.LayoutParams layoutParams = new GridLayout.LayoutParams();
//                    layoutParams.rowSpec = rowSpec;
//                    layoutParams.columnSpec = colSpec;
//
//                    EditText editText = new EditText(context);
//                    editText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
//                    editText.setInputType(InputType.TYPE_CLASS_NUMBER);
//                    editText.setBackgroundResource(R.drawable.outline_1dp);
//
//                    InputFilter[] FilterArray = new InputFilter[1];
//                    FilterArray[0] = new InputFilter.LengthFilter(order / 10 + 1);
//                    editText.setFilters(FilterArray);
//                    gridLayout.addView(editText, j * gridLayout.getColumnCount() + k, layoutParams);
//                }
//            }
//        }
//    }
//}

//        for (int i = 0; i < order; i++) {
//            GridLayout gridLayout = new GridLayout(context);
//            gridLayout.setRowCount(order / a);
//            gridLayout.setColumnCount(order / b);
//
//            layoutParams.rowSpec = new GridLayout.Spec();
//            parent.addView(gridLayout, i, );
//        }

//    LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1f);
//
//        for(
//    int i = 0;
//    i<order;i++)
//
//    {
//        LinearLayout linearLayout = new LinearLayout(context);
//        linearLayout.setOrientation(LinearLayout.HORIZONTAL);
//        parent.addView(linearLayout, i, params);
//
//        listOfEditText.add(new ArrayList<>());
//        for (int j = 0; j < order; j++) {
//            EditText editText = new EditText(context);
//            editText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
//            editText.setInputType(InputType.TYPE_CLASS_NUMBER);
//            editText.setBackgroundResource(R.drawable.outline_1dp);
//
//            InputFilter[] FilterArray = new InputFilter[1];
//            FilterArray[0] = new InputFilter.LengthFilter(order / 10 + 1);
//            editText.setFilters(FilterArray);
//
//            linearLayout.addView(editText, j, params);
//            listOfEditText.get(i).add(editText);
//
//        }
//    }
//
//        return listOfEditText;
//}


//    public List<List<EditText>> build() {
//        List<List<EditText>> listOfEditText = new ArrayList<>();
//
//        parent.setRowCount(a);
//        parent.setColumnCount(b);
//        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1f);
//
//        for (int i = 0; i < order; i++) {
//            LinearLayout linearLayout = new LinearLayout(context);
//            linearLayout.setOrientation(LinearLayout.HORIZONTAL);
//            parent.addView(linearLayout, i, params);
//
//            listOfEditText.add(new ArrayList<>());
//            for (int j = 0; j < order; j++) {
//                EditText editText = new EditText(context);
//                editText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
//                editText.setInputType(InputType.TYPE_CLASS_NUMBER);
//                editText.setBackgroundResource(R.drawable.outline_1dp);
//
//                InputFilter[] FilterArray = new InputFilter[1];
//                FilterArray[0] = new InputFilter.LengthFilter(order / 10 + 1);
//                editText.setFilters(FilterArray);
//
//                linearLayout.addView(editText, j, params);
//                listOfEditText.get(i).add(editText);
//
//            }
//        }
//
//        return listOfEditText;
//    }
