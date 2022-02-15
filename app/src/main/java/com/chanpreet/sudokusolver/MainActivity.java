package com.chanpreet.sudokusolver;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final int order = 9;
    private static final int N = 3;
    private static final int M = 3;
    private List<List<EditText>> listOfEditText = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button solveButton = findViewById(R.id.solveButton);
        Button resetButton = findViewById(R.id.resetButton);
        solveButton.setOnClickListener(view -> solveSudoku());
        resetButton.setOnClickListener(view -> resetToDefaults());

        //Creating Layout.
        LinearLayout linearLayout = findViewById(R.id.linearLayout);
        GridLayout gridLayout = findViewById(R.id.gridLayout);
        listOfEditText = new SudokuLayoutBuilder().build(getApplicationContext(), linearLayout, order);
        new SudokuLayoutBuilder().buildBackground(getApplicationContext(), gridLayout, order, N, M, R.drawable.outline_4dp);

    }

    private void solveSudoku() {
        //Initializing array
        List<List<Integer>> sudoku = new ArrayList<>();
        for (int i = 0; i < order; i++)
            sudoku.add(new ArrayList<>());

        //filling sudoku wth values from editTexts
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                String s = listOfEditText.get(i).get(j).getText().toString().trim();
                int number = 0;

                if (!s.isEmpty()) {
                    number = Integer.parseInt(s);
                }
                sudoku.get(i).add(number);
            }
        }

        SudokuSolver.getInstance()
                .setSudoku(sudoku, order, N, M)
                .addOnFailureListener(() -> Toast.makeText(MainActivity.this, "Invalid Sudoku!", Toast.LENGTH_SHORT).show())
                .addOnSuccessListener(solvedSudoku -> {
                    for (int i = 0; i < solvedSudoku.size(); i++) {
                        for (int j = 0; j < solvedSudoku.size(); j++) {
                            listOfEditText.get(i).get(j).setText(String.valueOf(solvedSudoku.get(i).get(j)));
                        }
                    }
                })
                .solve();
    }


    private void resetToDefaults() {
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                listOfEditText.get(i).get(j).setText("");
            }
        }
    }
}