package com.chanpreet.sudokusolver;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.chanpreet.sudokusolver.databinding.ActivitySudokuSolverBinding;

import java.util.Objects;

public class SudokuSolverActivity extends AppCompatActivity {
    private SudokuSolver sudokuSolver = null;
    private ActivitySudokuSolverBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivitySudokuSolverBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //
        Objects.requireNonNull(getSupportActionBar()).hide();
        //
        SudokuInfo sudokuInfo = (SudokuInfo) getIntent().getSerializableExtra("SUDOKU_INFO");
        //
        binding.solveButton.setOnClickListener(v -> solveSudoku());
        binding.resetButton.setOnClickListener(v -> resetToDefaults());
        String headerText = sudokuInfo.getMatrixOrderName() + "\n" + sudokuInfo.getSubMatrixOrderName();
        binding.headerTextView.setText(headerText);
        binding.backButton.setOnClickListener(v -> onBackPressed());
        //
        //Creating Layout.
        sudokuSolver = new SudokuSolver(this, binding.constraintLayout, sudokuInfo);

    }

    private void solveSudoku() {

        if (sudokuSolver.solveSudoku()) {
            binding.failHelper.setVisibility(View.GONE);
            binding.successHelper.setVisibility(View.VISIBLE);
//            Toast.makeText(getApplicationContext(), "Sudoku Solved!", Toast.LENGTH_SHORT).show();
        } else {
            binding.failHelper.setVisibility(View.VISIBLE);
            binding.successHelper.setVisibility(View.GONE);
//            Toast.makeText(getApplicationContext(), "Incorrect Information.", Toast.LENGTH_SHORT).show();
        }
    }

    private void resetToDefaults() {
        binding.failHelper.setVisibility(View.INVISIBLE);
        binding.successHelper.setVisibility(View.GONE);
        sudokuSolver.resetToDefaults();
    }
}