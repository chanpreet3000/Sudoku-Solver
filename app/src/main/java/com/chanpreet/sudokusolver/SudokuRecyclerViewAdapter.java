package com.chanpreet.sudokusolver;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SudokuRecyclerViewAdapter extends RecyclerView.Adapter<SudokuRecyclerViewAdapter.SudokuRecyclerViewHolder> {
    private final Context context;
    private final List<SudokuInfo> sudokuInfoList;
    private OnItemClickListener mItemClickListener;

    public SudokuRecyclerViewAdapter(Context context, List<SudokuInfo> sudokuInfoList) {
        this.context = context;
        this.sudokuInfoList = sudokuInfoList;
    }

    @NonNull
    @Override
    public SudokuRecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.sudoku_item, parent, false);
        return new SudokuRecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SudokuRecyclerViewHolder holder, int position) {
        holder.matrixOrderTextView.setText(sudokuInfoList.get(position).getMatrixOrderName());
        holder.subMatrixOrderTextView.setText(sudokuInfoList.get(position).getSubMatrixOrderName());

        holder.itemView.setOnClickListener(v -> {
            if (mItemClickListener != null)
                mItemClickListener.onClick(position);
        });
    }

    @Override
    public int getItemCount() {
        return sudokuInfoList.size();
    }

    static public class SudokuRecyclerViewHolder extends RecyclerView.ViewHolder {
        private TextView matrixOrderTextView;
        private TextView subMatrixOrderTextView;

        public SudokuRecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            matrixOrderTextView = itemView.findViewById(R.id.matrixOrderTextView);
            subMatrixOrderTextView = itemView.findViewById(R.id.subMatrixOrderTextView);
        }
    }

    public void setItemClickListener(OnItemClickListener mItemClickListener) {
        this.mItemClickListener = mItemClickListener;
    }

    public interface OnItemClickListener {
        void onClick(int position);
    }
}
