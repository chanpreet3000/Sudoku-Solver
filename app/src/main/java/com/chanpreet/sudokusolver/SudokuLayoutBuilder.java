package com.chanpreet.sudokusolver;

import android.content.Context;
import android.text.InputFilter;
import android.text.InputType;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;
import java.util.List;

public class SudokuLayoutBuilder {
    private final Context context;
    private final ConstraintLayout constraintLayout;
    private final SudokuInfo sudokuInfo;
    private static final Integer BOX_WIDTH = 128;
    private static final Integer BOX_HEIGHT = 128;

    public SudokuLayoutBuilder(Context context, ConstraintLayout constraintLayout, SudokuInfo sudokuInfo) {
        this.context = context;
        this.constraintLayout = constraintLayout;
        this.sudokuInfo = sudokuInfo;
    }

    public List<List<EditText>> build() {

        //Parent Linear Layout.
        LinearLayout parent = new LinearLayout(context);
        parent.setOrientation(LinearLayout.VERTICAL);

        List<List<EditText>> listOfEditText = new ArrayList<>();
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1f);

        //Making sudoku input Fields
        for (int i = 0; i < sudokuInfo.getN(); i++) {
            //Horizontal linear layout is added to one vertical linear layout.
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);

            listOfEditText.add(new ArrayList<>());
            for (int j = 0; j < sudokuInfo.getM(); j++) {
                EditText editText = new EditText(context);
                editText.setTextAlignment(View.TEXT_ALIGNMENT_CENTER);
                editText.setInputType(InputType.TYPE_CLASS_NUMBER);
                editText.setTextSize(16);
                //1dp border.
                editText.setBackgroundResource(R.drawable.outline_1dp);

                InputFilter[] FilterArray = new InputFilter[1];
                FilterArray[0] = new InputFilter.LengthFilter((sudokuInfo.getSubN() * sudokuInfo.getSubM()) / 10 + 1);
                editText.setFilters(FilterArray);
                linearLayout.addView(editText, BOX_WIDTH, BOX_HEIGHT);
                //adding single edit text to horizontal linear layout.
                listOfEditText.get(i).add(editText);
            }
            //adding horizontal Linear layout to parent Vertical Linear Layout.
            parent.addView(linearLayout, i, params);
        }
        constraintLayout.addView(parent, 0, params);

        //building background;
        buildBackground();
        return listOfEditText;
    }

    private void buildBackground() {
        LinearLayout parent = new LinearLayout(context);
        parent.setOrientation(LinearLayout.VERTICAL);
        parent.setBackgroundResource(R.drawable.outline_4dp);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.MATCH_PARENT, 1f);
        for (int i = 0; i < sudokuInfo.getN() / sudokuInfo.getSubN(); i++) {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(LinearLayout.HORIZONTAL);
            for (int j = 0; j < sudokuInfo.getM() / sudokuInfo.getSubM(); j++) {
                LinearLayout child = new LinearLayout(context);
                child.setBackgroundResource(R.drawable.outline_2dp);
                LinearLayout.LayoutParams childParams = new LinearLayout.LayoutParams(sudokuInfo.getSubM() * BOX_WIDTH, sudokuInfo.getSubN() * BOX_HEIGHT, 1f);
                linearLayout.addView(child, j, childParams);
            }
            linearLayout.setBackgroundResource(R.drawable.outline_2dp);
            parent.addView(linearLayout, i, params);
        }

        constraintLayout.addView(parent, 1, params);
    }
}