package com.chanpreet.sudokusolver;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final int N = 4;
    private List<List<EditText>> listOfEditText = new ArrayList<>();
    private Button solveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        solveButton = findViewById(R.id.solveButton);
        solveButton.setEnabled(false);
        Button resetButton = findViewById(R.id.resetButton);
        solveButton.setOnClickListener(view -> solveSudoku());
        resetButton.setOnClickListener(view -> resetToDefaults());

        //Creating Layout.
        ViewGroup baseLayer = (ViewGroup) findViewById(R.id.baseLayer);
        new SudokuLayoutBuilder(getApplicationContext(), baseLayer, N)
                .addOnFailureListener(() -> Toast.makeText(MainActivity.this, "Failed to generate Layout!", Toast.LENGTH_SHORT).show())
                .addOnSuccessListener(listOfEditText -> {
                    setListOfEditText(listOfEditText);
                    solveButton.setEnabled(true);
                })
                .build();

    }

    private void solveSudoku() {
        //Initializing array
        List<List<Integer>> sudoku = new ArrayList<>();
        for (int i = 0; i < N; i++)
            sudoku.add(new ArrayList<>());

        //filling sudoku wth values from editTexts
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                String s = listOfEditText.get(i).get(j).getText().toString().trim();
                int number = 0;

                if (!s.isEmpty()) {
                    number = Integer.parseInt(s);
                }
                sudoku.get(i).add(number);
            }
        }

        SudokuSolver.getInstance()
                .setSudoku(sudoku, N)
                .addOnFailureListener(() -> Toast.makeText(MainActivity.this, "Invalid Sudoku!", Toast.LENGTH_SHORT).show())
                .addOnSuccessListener(solvedSudoku -> {
                    for (int i = 0; i < N; i++) {
                        for (int j = 0; j < N; j++) {
                            listOfEditText.get(i).get(j).setText(String.valueOf(solvedSudoku.get(i).get(j)));
                        }
                    }
                })
                .solve();
    }


    private void resetToDefaults() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                listOfEditText.get(i).get(j).setText("");
            }
        }
    }

    public void setListOfEditText(List<List<EditText>> listOfEditText) {
        this.listOfEditText = listOfEditText;
    }
}