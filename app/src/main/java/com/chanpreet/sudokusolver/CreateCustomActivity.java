package com.chanpreet.sudokusolver;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.AnimationUtils;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.chanpreet.sudokusolver.databinding.ActivityCreateCustomBinding;

import java.util.Objects;

public class CreateCustomActivity extends AppCompatActivity {

    private static final int MIN_VALUE = 1;
    private static final int MAX_VALUE = 16;
    private ActivityCreateCustomBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreateCustomBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Objects.requireNonNull(getSupportActionBar()).hide();

        binding.backButton.setOnClickListener(v -> onBackPressed());
        binding.createButton.setOnClickListener(v -> createButtonClicked());
        binding.cardView1.setAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_left));
        binding.cardView2.setAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_right));
        binding.cardView3.setAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_left));
        binding.cardView4.setAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_right));
        binding.cardView5.setAnimation(AnimationUtils.loadAnimation(this, R.anim.slide_in_left));


        binding.rowNumberPicker.setMinValue(MIN_VALUE);
        binding.rowNumberPicker.setMaxValue(MAX_VALUE);

        binding.columnNumberPicker.setMinValue(MIN_VALUE);
        binding.columnNumberPicker.setMaxValue(MAX_VALUE);

        binding.smallRowNumberPicker.setMinValue(MIN_VALUE);
        binding.smallRowNumberPicker.setMaxValue(MAX_VALUE);

        binding.smallColumnNumberPicker.setMinValue(MIN_VALUE);
        binding.smallColumnNumberPicker.setMaxValue(MAX_VALUE);
    }

    private void createButtonClicked() {
        int N = binding.rowNumberPicker.getValue();
        int M = binding.columnNumberPicker.getValue();
        int subN = binding.smallRowNumberPicker.getValue();
        int subM = binding.smallColumnNumberPicker.getValue();
        SudokuInfo sudokuInfo = new SudokuInfo(N, M, subN, subM);
        if (checkSudokuInfo(sudokuInfo)) {
            Intent intent = new Intent(getApplicationContext(), SudokuSolverActivity.class);
            intent.putExtra("SUDOKU_INFO", sudokuInfo);
            startActivity(intent);
        } else {
            Toast.makeText(getApplicationContext(), "Incorrect Information.", Toast.LENGTH_SHORT).show();
        }
    }

    private boolean checkSudokuInfo(SudokuInfo sudokuInfo) {
        if (sudokuInfo.getSubN() == 1 || sudokuInfo.getSubM() == 1) {
            return false;
        } else return sudokuInfo.getN() % sudokuInfo.getSubN() == 0 && sudokuInfo.getM() % sudokuInfo.getSubM() == 0;
    }
}