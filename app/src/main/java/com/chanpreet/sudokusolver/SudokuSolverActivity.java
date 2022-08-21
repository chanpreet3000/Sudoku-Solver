package com.chanpreet.sudokusolver;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.chanpreet.sudokusolver.databinding.ActivitySudokuSolverBinding;

public class SudokuSolverActivity extends AppCompatActivity {
    private SudokuSolver sudokuSolver = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySudokuSolverBinding binding = ActivitySudokuSolverBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        //
        SudokuInfo sudokuInfo = (SudokuInfo) getIntent().getSerializableExtra("SUDOKU_INFO");
        //
        binding.solveButton.setOnClickListener(v -> solveSudoku());
        binding.resetButton.setOnClickListener(v -> resetToDefaults());
        String headerText = sudokuInfo.getMatrixOrderName() + " Sudoku";
        binding.headerTextView.setText(headerText);
        //
        Toast.makeText(this, "Please wait.", Toast.LENGTH_SHORT).show();
        //Creating Layout.
        sudokuSolver = new SudokuSolver(this, binding.constraintLayout, sudokuInfo.getOrder(), sudokuInfo.getN(), sudokuInfo.getM());
    }

    private void solveSudoku() {
        sudokuSolver.solveSudoku();
    }

    private void resetToDefaults() {
        sudokuSolver.resetToDefaults();
    }
}