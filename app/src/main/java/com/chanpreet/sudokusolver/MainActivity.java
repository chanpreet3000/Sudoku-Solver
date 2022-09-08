package com.chanpreet.sudokusolver;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

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
        Objects.requireNonNull(getSupportActionBar()).hide();
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

        binding.createButton.setOnClickListener(v->startActivity(new Intent(getApplicationContext(), CreateCustomActivity.class)));
    }

    private void initRecyclerView() {
        binding.recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL));
        SudokuRecyclerViewAdapter adapter = new SudokuRecyclerViewAdapter(this, sudokuInfoList);
        binding.recyclerView.setAdapter(adapter);
        adapter.setItemClickListener(position -> {
            Intent intent = new Intent(getApplicationContext(), SudokuSolverActivity.class);
            intent.putExtra("SUDOKU_INFO", sudokuInfoList.get(position));
            startActivity(intent);
        });
    }
}