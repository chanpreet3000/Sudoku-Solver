package com.chanpreet.sudokusolver;

import android.os.Parcelable;

import java.io.Serializable;

public class SudokuInfo implements Serializable {
    private final Integer order;
    private final Integer N;
    private final Integer M;

    public SudokuInfo(Integer order, Integer n, Integer m) {
        this.order = order;
        N = n;
        M = m;
    }

    public Integer getOrder() {
        return order;
    }

    public Integer getN() {
        return N;
    }

    public Integer getM() {
        return M;
    }

    public String getMatrixOrderName() {
        return String.format("%d x %d", order, order);
    }

    public String getSubMatrixOrderName() {
        return String.format("%d x %d", N, M);
    }
}
