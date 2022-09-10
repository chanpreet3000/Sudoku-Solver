package com.chanpreet.sudokusolver;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SudokuRecyclerViewAdapter extends RecyclerView.Adapter<SudokuRecyclerViewAdapter.SudokuRecyclerViewHolder> {
    private final Context context;
    private final List<SudokuInfo> sudokuInfoList;
    private OnItemClickListener mItemClickListener;

    private int lastAnimated = -1;

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
        if (position > lastAnimated) {
            lastAnimated = position;
            holder.itemView.setAnimation(AnimationUtils.loadAnimation(context, R.anim.fade_in));
        }
        holder.matrixOrderTextView.setText(sudokuInfoList.get(position).getMatrixOrderName());
        holder.subMatrixOrderTextView.setText(sudokuInfoList.get(position).getSubMatrixOrderName());
        holder.itemView.setHapticFeedbackEnabled(true);
        //
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
        private final TextView matrixOrderTextView;
        private final TextView subMatrixOrderTextView;

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
