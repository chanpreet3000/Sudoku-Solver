package com.example.sudokusolver;

/**
 * Created by DELL on 6/22/2017.
 */

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.DisplayMetrics;

import java.io.File;
import java.util.Locale;


public class SudokuSolver extends Application {
    private static SudokuSolver mInstance;

    public static SudokuSolver getInstance() {
        return mInstance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;
    }

}
