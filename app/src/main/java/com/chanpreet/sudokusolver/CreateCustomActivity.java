package com.chanpreet.sudokusolver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;

import com.chanpreet.sudokusolver.databinding.ActivityCreateCustomBinding;

import java.util.Objects;

public class CreateCustomActivity extends AppCompatActivity {

    private ActivityCreateCustomBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityCreateCustomBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Objects.requireNonNull(getSupportActionBar()).hide();

        binding.backButton.setOnClickListener(v -> onBackPressed());
        binding.createButton.setOnClickListener(v -> createButtonClicked());
        //Adapter
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.custom_sudoku_limit, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //setting Adapter.
        binding.bigRowSpinner.setAdapter(adapter);
        binding.bigColumnSpinner.setAdapter(adapter);
        binding.smallRowSpinner.setAdapter(adapter);
        binding.smallColumnSpinner.setAdapter(adapter);

    }

    private void createButtonClicked() {
        int order = Integer.parseInt(binding.bigRowSpinner.getSelectedItem().toString());
        int N = Integer.parseInt(binding.smallRowSpinner.getSelectedItem().toString());
        int M = Integer.parseInt(binding.smallColumnSpinner.getSelectedItem().toString());
        SudokuInfo sudokuInfo = new SudokuInfo(order, N, M);

        Intent intent = new Intent(getApplicationContext(), SudokuSolverActivity.class);
        intent.putExtra("SUDOKU_INFO", sudokuInfo);
        startActivity(intent);
    }
}