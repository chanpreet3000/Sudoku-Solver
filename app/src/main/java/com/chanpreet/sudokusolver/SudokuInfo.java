package com.chanpreet.sudokusolver;

import java.io.Serializable;
import java.util.Locale;

public class SudokuInfo implements Serializable {
    private final Integer N;
    private final Integer M;
    private final Integer subN;
    private final Integer subM;

    public SudokuInfo(Integer n, Integer m, Integer subN, Integer subM) {
        N = n;
        M = m;
        this.subN = subN;
        this.subM = subM;
    }

    public Integer getSubN() {
        return subN;
    }

    public Integer getSubM() {
        return subM;
    }

    public Integer getN() {
        return N;
    }

    public Integer getM() {
        return M;
    }

    public String getMatrixOrderName() {
        return String.format(Locale.ENGLISH, "%d x %d", N, M);
    }

    public String getSubMatrixOrderName() {
        return String.format(Locale.ENGLISH, "(%d x %d)", subN, subM);
    }
}
