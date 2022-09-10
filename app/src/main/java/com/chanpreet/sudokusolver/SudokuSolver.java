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
    private final SudokuInfo sudokuInfo;
    private final List<List<EditText>> listOfEditTexts;

    public SudokuSolver(Context context, ConstraintLayout constraintLayout, SudokuInfo sudokuInfo) {
        this.context = context;
        this.sudokuInfo = sudokuInfo;
        SudokuLayoutBuilder sudokuLayoutBuilder = new SudokuLayoutBuilder(context, constraintLayout, sudokuInfo);
        this.listOfEditTexts = sudokuLayoutBuilder.build();
    }


    public boolean solveSudoku() {
        //Initializing Sudoku Matrix
        List<List<Integer>> sudoku = getValuesFromEditText();
        //Check if sudoku solved is correct
        if (isSudokuValid(sudoku)) {
            //Sudoku is Correct.
            colorFilledBoxes(sudoku);
            setEnabledEditTexts(false);
            sudokuSolverHelper(sudoku);//Solving Sudoku Solver using Helper;
            fillSolvedSudoku(sudoku);
            return true;
        } else {
            //Sudoku is InCorrect.
            return false;
        }
    }


    private boolean isValid(List<List<Integer>> board, int x, int y, int num) {
        for (int i = 0; i < sudokuInfo.getN(); i++)
            if (board.get(i).get(y) == num)
                return false;
        for (int i = 0; i < sudokuInfo.getM(); i++)
            if (board.get(x).get(i) == num)
                return false;
        x /= sudokuInfo.getSubN();
        y /= sudokuInfo.getSubM();
        for (int i = sudokuInfo.getSubN() * x; i < sudokuInfo.getSubN() * (x + 1); i++) {
            for (int j = sudokuInfo.getSubM() * y; j < sudokuInfo.getSubM() * (y + 1); j++) {
                if (board.get(i).get(j) == num)
                    return false;
            }
        }
        return true;
    }

    private boolean sudokuSolverHelper(List<List<Integer>> board) {
        int _max = sudokuInfo.getSubN() * sudokuInfo.getSubM();

        for (int i = 0; i < sudokuInfo.getN(); i++) {
            for (int j = 0; j < sudokuInfo.getM(); j++) {
                if (board.get(i).get(j) == 0) {
                    for (int num = 1; num <= _max; num++) {
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

    private void colorFilledBoxes(List<List<Integer>> sudoku) {
        for (int i = 0; i < sudokuInfo.getN(); i++) {
            for (int j = 0; j < sudokuInfo.getM(); j++) {
                if (sudoku.get(i).get(j) != 0) {
                    listOfEditTexts.get(i).get(j).setBackgroundResource(R.drawable.outline_filled_1dp);
                    listOfEditTexts.get(i).get(j).setTextColor(context.getColor(R.color.white));
                }
            }
        }
    }

    private List<List<Integer>> getValuesFromEditText() {
        List<List<Integer>> sudoku = new ArrayList<>();
        for (int i = 0; i < sudokuInfo.getN(); i++)
            sudoku.add(new ArrayList<>());

        //filling sudoku wth values from editTexts
        for (int i = 0; i < sudokuInfo.getN(); i++) {
            for (int j = 0; j < sudokuInfo.getM(); j++) {
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
        int _max = sudokuInfo.getSubN() * sudokuInfo.getSubM();
        //Checking rows for invalid input
        for (int i = 0; i < sudokuInfo.getN(); i++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < sudokuInfo.getM(); j++) {
                int key = sudoku.get(i).get(j);
                Integer count = map.get(key);
                if (count == null) {
                    map.put(key, 1);
                } else {
                    map.put(key, count + 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getKey() != 0 && (entry.getKey() > _max || entry.getValue() > 1)) {
                    return false;
                }
            }
        }
        //Checking columns for invalid input
        for (int j = 0; j < sudokuInfo.getM(); j++) {
            HashMap<Integer, Integer> map = new HashMap<>();
            for (int i = 0; i < sudokuInfo.getN(); i++) {
                int key = sudoku.get(i).get(j);
                Integer count = map.get(key);
                if (count == null) {
                    map.put(key, 1);
                } else {
                    map.put(key, count + 1);
                }
            }
            for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                if (entry.getKey() != 0 && (entry.getKey() > _max || entry.getValue() > 1)) {
                    return false;
                }
            }
        }
        //Checking boxes for invalid input
        for (int x = 0; x < sudokuInfo.getN() / sudokuInfo.getSubN(); x++) {
            for (int y = 0; y < sudokuInfo.getM() / sudokuInfo.getSubM(); y++) {
                HashMap<Integer, Integer> map = new HashMap<>();
                for (int i = sudokuInfo.getSubN() * x; i < sudokuInfo.getSubN() * (x + 1); i++) {
                    for (int j = sudokuInfo.getSubM() * y; j < sudokuInfo.getSubM() * (y + 1); j++) {
                        int key = sudoku.get(i).get(j);
                        Integer count = map.get(key);
                        if (count == null) {
                            map.put(key, 1);
                        } else {
                            map.put(key, count + 1);
                        }
                    }
                }
                for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
                    if (entry.getKey() != 0 && (entry.getKey() > _max || entry.getValue() > 1)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private void fillSolvedSudoku(List<List<Integer>> sudoku) {
        for (int i = 0; i < sudokuInfo.getN(); i++) {
            for (int j = 0; j < sudokuInfo.getM(); j++) {
                listOfEditTexts.get(i).get(j).setText(String.valueOf(sudoku.get(i).get(j)));
            }
        }
    }

    public void resetToDefaults() {
        for (int i = 0; i < sudokuInfo.getN(); i++) {
            for (int j = 0; j < sudokuInfo.getM(); j++) {
                listOfEditTexts.get(i).get(j).setText("");
                listOfEditTexts.get(i).get(j).setBackgroundResource(R.drawable.outline_1dp);
                listOfEditTexts.get(i).get(j).setTextColor(context.getColor(R.color.black));
            }
        }
        setEnabledEditTexts(true);
    }

    private void setEnabledEditTexts(Boolean isEnabled) {
        for (int i = 0; i < sudokuInfo.getN(); i++) {
            for (int j = 0; j < sudokuInfo.getM(); j++) {
                listOfEditTexts.get(i).get(j).setEnabled(isEnabled);
            }
        }
    }
}