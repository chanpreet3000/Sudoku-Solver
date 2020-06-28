package com.example.sudokusolver.Utilities;


import android.content.Context;
import android.content.SharedPreferences;

import com.example.sudokusolver.SudokuSolver;


/**
 * Created by DELL on 6/22/2017.
 */

public class AppPreference {

    private static AppPreference mInstance;
    private final String PREF_NAME = "pref";
    private final String is4X4 = "4X4";
    private final String is6X6 = "6X6";

    public SharedPreferences sharedPref;
    private SharedPreferences.Editor mEditor;

    public AppPreference() {
        sharedPref = SudokuSolver.getInstance().getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE);
    }

    public static AppPreference getInstance() {
        if (mInstance == null)
            mInstance = new AppPreference();

        return mInstance;
    }


    public void clearData(Context context) {

        SharedPreferences.Editor mEditor = sharedPref.edit();
        mEditor.clear();
        mEditor.apply();
    }


    private void saveData(String key, boolean val) {
        SharedPreferences.Editor mEditor = sharedPref.edit();
        mEditor.putBoolean(key, val);
        mEditor.commit();
    }


    private boolean getBooleanData(String key, boolean defValue) {
        return sharedPref.getBoolean(key, defValue);
    }

    public boolean getIs4X4() {
        return getBooleanData(is4X4, false);
    }

    public void setIs4X4(boolean b) {
        saveData(is4X4, b);
    }


    public boolean getIs6x6() {
        return getBooleanData(is6X6, false);
    }

    public void setIs6X6(boolean b) {
        saveData(is6X6, b);
    }

}

