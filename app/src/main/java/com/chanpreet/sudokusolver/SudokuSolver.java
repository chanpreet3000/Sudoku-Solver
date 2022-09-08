package com.chanpreet.sudokusolver;

import android.content.Context;
import android.widget.EditText;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SudokuSolver {
    private final Context context;
    private final int order;
    private final int N;
    private final int M;
    private final List<List<EditText>> listOfEditTexts;

    public SudokuSolver(Context context, ConstraintLayout constraintLayout, SudokuInfo sudokuInfo) {
        this.context = context;
        this.order = sudokuInfo.getOrder();
        N = sudokuInfo.getN();
        M = sudokuInfo.getM();
        SudokuLayoutBuilder sudokuLayoutBuilder = new SudokuLayoutBuilder(context, constraintLayout, this.order, this.N, this.M);
        this.listOfEditTexts = sudokuLayoutBuilder.build();
    }


    public void solveSudoku() {
        //Initializing Sudoku Matrix
        List<List<Integer>> sudoku = getValuesFromEditText();
        //Check if sudoku solved is correct
        if (isSudokuValid(sudoku)) {
            //Sudoku is Correct.
            setEnabledEditTexts(false);
            sudokuSolverHelper(sudoku);//Solving Sudoku Solver using Helper;
            fillSolvedSudoku(sudoku);
            Toast.makeText(context, "Sudoku Solved!", Toast.LENGTH_SHORT).show();
        } else {
            //Sudoku is InCorrect.
            Toast.makeText(context, "Incorrect Information.", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean isValid(List<List<Integer>> board, int x, int y, int num) {
        for (int i = 0; i < order; i++) {
            if (board.get(x).get(i) == num)
                return false;
            if (board.get(i).get(y) == num)
                return false;
        }
        x /= N;
        y /= M;
        for (int i = N * x; i < N * (x + 1); i++) {
            for (int j = M * y; j < M * (y + 1); j++) {
                if (board.get(i).get(j) == num)
                    return false;
            }
        }
        return true;
    }

    private boolean sudokuSolverHelper(List<List<Integer>> board) {
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                if (board.get(i).get(j) == 0) {
                    for (int num = 1; num <= order; num++) {
                        if (isValid(board, i, j, num)) {
                            board.get(i).set(j, num);
                            if (sudokuSolverHelper(board)) {
                                return true;
                            }
                            board.get(i).set(j, 0);
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }


    private List<List<Integer>> getValuesFromEditText() {
        List<List<Integer>> sudoku = new ArrayList<>();
        for (int i = 0; i < order; i++)
            sudoku.add(new ArrayList<>());

        //filling sudoku wth values from editTexts
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                String s = listOfEditTexts.get(i).get(j).getText().toString().trim();
                int number = 0;

                if (!s.isEmpty()) {
                    number = Integer.parseInt(s);
                }
                sudoku.get(i).add(number);
            }
        }
        return sudoku;
    }

    private Boolean isSudokuValid(List<List<Integer>> sudoku) {
        //Checking rows for invalid input
        for (int i = 0; i < order; i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < order; j++) {
                int key = sudoku.get(i).get(j);
                Integer count = map.get(key);
                if (count == null) {
                    map.put(key, 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getKey() != 0 && (entry.getKey() > order || entry.getValue() > 1)) {
                    return false;
                }
            }
        }
        //Checking columns for invalid input
        for (int j = 0; j < order; j++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < order; i++) {
                int key = sudoku.get(i).get(j);
                Integer count = map.get(key);
                if (count == null) {
                    map.put(key, 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getKey() != 0 && (entry.getKey() > order || entry.getValue() > 1)) {
                    return false;
                }
            }
        }
        //Checking boxes for invalid input
        for (int x = 0; x < order / N; x++) {
            for (int y = 0; y < order / M; y++) {
                HashMap<Integer, Integer> map = new HashMap<>();
                for (int i = N * x; i < N * (x + 1); i++) {
                    for (int j = M * y; j < M * (y + 1); j++) {
                        int key = sudoku.get(i).get(j);
                        Integer count = map.get(key);
                        if (count == null) {
                            map.put(key, 1);
                        }
                    }
                }
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getKey() != 0 && (entry.getKey() > order || entry.getValue() > 1)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void fillSolvedSudoku(List<List<Integer>> sudoku) {
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                listOfEditTexts.get(i).get(j).setText(String.valueOf(sudoku.get(i).get(j)));
            }
        }
    }

    public void resetToDefaults() {
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                listOfEditTexts.get(i).get(j).setText("");
            }
        }
        setEnabledEditTexts(true);
    }

    private void setEnabledEditTexts(Boolean isEnabled) {
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                listOfEditTexts.get(i).get(j).setEnabled(isEnabled);
            }
        }
    }
}