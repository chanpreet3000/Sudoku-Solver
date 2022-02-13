package com.chanpreet.sudokusolver;

import android.os.AsyncTask;
import android.util.Pair;

import androidx.annotation.NonNull;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SudokuSolver {
    private static SudokuSolver Instance = null;
    private int order;
    private List<List<Integer>> sudoku;
    private SuccessListener successListener;
    private FailureListener failureListener;

    public static synchronized SudokuSolver getInstance() {
        if (Instance == null) {
            Instance = new SudokuSolver();
        }
        return Instance;
    }

    public SudokuSolver setSudoku(List<List<Integer>> sudoku, int order) {
        this.sudoku = sudoku;
        this.order = order;
        return this;
    }

    public void solve() {
        if (!isValidSudoku()) {
            failureListener.onFailure();
            return;
        }
        new AsyncSudokuSolver().execute();
    }

    private boolean isValidSudoku() {
        boolean result = false;

        //        check if empty
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                if (sudoku.get(i).get(j) != 0) {
                    result = true;
                    break;
                }
            }
        }

        //        check if invalid input
        for (int i = 0; i < order; i++) {
            for (int j = 0; j < order; j++) {
                if (sudoku.get(i).get(j) < 0 || sudoku.get(i).get(j) > order) {
                    result = false;
                    break;
                }
            }
        }

        //        check for invalid row input
        for (int i = 0; i < order; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < order; j++) {
                int key = sudoku.get(i).get(j);
                if (key == 0) continue;
                if (map.containsKey(key)) {
                    result = false;
                    break;
                } else {
                    map.put(key, 1);
                }
            }
        }

        //        check for invalid column input
        for (int i = 0; i < order; i++) {
            Map<Integer, Integer> map = new HashMap<>();
            for (int j = 0; j < order; j++) {
                int key = sudoku.get(j).get(i);
                if (key == 0) continue;
                if (map.containsKey(key)) {
                    result = false;
                    break;
                } else {
                    map.put(key, 1);
                }
            }
        }

        //        check for invalid box input
        int n = (int) Math.sqrt(order);
        for (int i = 0; i < order; i += n) {
            for (int j = 0; j < order; j += n) {
                Map<Integer, Integer> map = new HashMap<>();
                for (int k = i; k < i + n; k++) {
                    for (int l = j; l < j + n; l++) {
                        int key = sudoku.get(k).get(l);
                        if (key == 0) continue;
                        if (map.containsKey(key)) {
                            result = false;
                            break;
                        } else {
                            map.put(key, 1);
                        }
                    }
                }
            }
        }
        return result;
    }

    @NonNull
    private List<Pair<Integer, Integer>> getEmptyBoxes() {
        List<Pair<Integer, Integer>> listOfEmptySpaces = new ArrayList<>();
        for (int i = 0; i < order; i++)
            for (int j = 0; j < order; j++)
                if (sudoku.get(i).get(j) == 0)
                    listOfEmptySpaces.add(Pair.create(i, j));
        return listOfEmptySpaces;
    }

    private boolean isValidRow(int number, int rowNo) {
        for (int i = 0; i < order; i++)
            if (sudoku.get(rowNo).get(i) == number)
                return false;
        return true;
    }

    private boolean isValidColumn(int number, int columnNo) {
        for (int i = 0; i < order; i++)
            if (sudoku.get(i).get(columnNo) == number)
                return false;
        return true;
    }

    private boolean isValidBox(int number, int rowNo, int columnNo) {
        int n = (int) Math.sqrt(order);
        for (int i = (rowNo / n) * n; i < (rowNo / n) * n + n; i++)
            for (int j = (columnNo / n) * n; j < (columnNo / n) * n + n; j++)
                if (sudoku.get(i).get(j) == number)
                    return false;
        return true;
    }


    public class AsyncSudokuSolver extends AsyncTask<Void, Void, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            List<Pair<Integer, Integer>> listOfEmptySpaces = getEmptyBoxes();
            for (int i = 0; i < listOfEmptySpaces.size(); i++) {
                if (i < 0) {
                    failureListener.onFailure();
                    return null;
                }
                int rowNo = listOfEmptySpaces.get(i).first;
                int columnNo = listOfEmptySpaces.get(i).second;
                if (sudoku.get(rowNo).get(columnNo) == order) {
                    sudoku.get(rowNo).set(columnNo, 0);
                    i -= 2;
                } else {
                    for (int j = sudoku.get(rowNo).get(columnNo) + 1; j <= order; j++) {
                        if (isValidRow(j, rowNo) && isValidColumn(j, columnNo) && isValidBox(j, rowNo, columnNo)) {
                            sudoku.get(rowNo).set(columnNo, j);
                            break;
                        }
                        if (j == order) {
                            sudoku.get(rowNo).set(columnNo, 0);
                            i -= 2;
                        }
                    }
                }
            }
            successListener.onSuccess(sudoku);
            return null;
        }
    }

    public SudokuSolver addOnSuccessListener(SuccessListener successListener) {
        this.successListener = successListener;
        return this;
    }

    public SudokuSolver addOnFailureListener(FailureListener failureListener) {
        this.failureListener = failureListener;
        return this;
    }

    public interface SuccessListener {
        void onSuccess(List<List<Integer>> solvedSudoku);
    }

    public interface FailureListener {
        void onFailure();
    }
}