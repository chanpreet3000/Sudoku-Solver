package com.chanpreet.sudokusolver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.content.Intent;
import android.os.Bundle;

import com.chanpreet.sudokusolver.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    List<SudokuInfo> sudokuInfoList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //
        Objects.requireNonNull(getSupportActionBar()).setTitle("Solve Sudoku!");
        //
        //
        sudokuInfoList.add(new SudokuInfo(4, 2, 2));
        sudokuInfoList.add(new SudokuInfo(6, 2, 3));
        sudokuInfoList.add(new SudokuInfo(6, 3, 2));
        sudokuInfoList.add(new SudokuInfo(8, 4, 2));
        sudokuInfoList.add(new SudokuInfo(8, 2, 4));
        sudokuInfoList.add(new SudokuInfo(9, 3, 3));
        sudokuInfoList.add(new SudokuInfo(10, 5, 2));
        sudokuInfoList.add(new SudokuInfo(10, 2, 5));
        sudokuInfoList.add(new SudokuInfo(12, 4, 3));
        sudokuInfoList.add(new SudokuInfo(12, 3, 4));
        //
        initRecyclerView();
    }

    private void initRecyclerView() {
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        SudokuRecyclerViewAdapter adapter = new SudokuRecyclerViewAdapter(this, sudokuInfoList);
        binding.recyclerView.setAdapter(adapter);
        adapter.setItemClickListener(position -> {
            Intent intent = new Intent(getApplicationContext(), SudokuSolverActivity.class);
            intent.putExtra("SUDOKU_INFO", sudokuInfoList.get(position));
            startActivity(intent);
        });
    }
}