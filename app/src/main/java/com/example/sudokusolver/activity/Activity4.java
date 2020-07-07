package com.example.sudokusolver.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;


import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sudokusolver.Utilities.AppPreference;
import com.example.sudokusolver.Utilities.BoxInfo;
import com.example.sudokusolver.R;
import com.github.jinatonic.confetti.CommonConfetti;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;

public class Activity4 extends AppCompatActivity {
    private int[][] sudoku = new int[4][4];
    private int point = 0;
    private RelativeLayout konfettiView;
    private BoxInfo[] b = new BoxInfo[20];
    boolean correct = true, numberGreater = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);
        //button,Views,EditText
        getSupportActionBar().setTitle("4x4");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        final Button solvebtn, clearbtn;
        final EditText e4_0, e4_1, e4_2, e4_3, e4_4, e4_5, e4_6, e4_7, e4_8, e4_9, e4_10, e4_11, e4_12, e4_13, e4_14, e4_15;
        final TextView sudokusolved;
        AdView mAdView;
        solvebtn = findViewById(R.id.solve4_btn);
        clearbtn = findViewById(R.id.clear4_btn);
        sudokusolved = findViewById(R.id.textView4);
        konfettiView = findViewById(R.id.konfettiView);
        e4_0 = findViewById(R.id.e4_0);
        e4_1 = findViewById(R.id.e4_1);
        e4_2 = findViewById(R.id.e4_2);
        e4_3 = findViewById(R.id.e4_3);
        e4_4 = findViewById(R.id.e4_4);
        e4_5 = findViewById(R.id.e4_5);
        e4_6 = findViewById(R.id.e4_6);
        e4_7 = findViewById(R.id.e4_7);
        e4_8 = findViewById(R.id.e4_8);
        e4_9 = findViewById(R.id.e4_9);
        e4_10 = findViewById(R.id.e4_10);
        e4_11 = findViewById(R.id.e4_11);
        e4_12 = findViewById(R.id.e4_12);
        e4_13 = findViewById(R.id.e4_13);
        e4_14 = findViewById(R.id.e4_14);
        e4_15 = findViewById(R.id.e4_15);

        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //New button
        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity4.this, Activity4.class);
                startActivity(intent);
                finish();
            }
        });
        //button to solve sudoku
        solvebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //filling sudoku
                {
                    if (e4_0.getText().toString().isEmpty()) {
                        sudoku[0][0] = 0;
                    } else {
                        sudoku[0][0] = Integer.parseInt(e4_0.getText().toString());
                        e4_0.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e4_1.getText().toString().isEmpty()) {
                        sudoku[0][1] = 0;
                    } else {
                        sudoku[0][1] = Integer.parseInt(e4_1.getText().toString());
                        e4_1.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e4_2.getText().toString().isEmpty()) {
                        sudoku[0][2] = 0;
                    } else {
                        sudoku[0][2] = Integer.parseInt(e4_2.getText().toString());
                        e4_2.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e4_3.getText().toString().isEmpty()) {
                        sudoku[0][3] = 0;
                    } else {
                        sudoku[0][3] = Integer.parseInt(e4_3.getText().toString());
                        e4_3.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e4_4.getText().toString().isEmpty()) {
                        sudoku[1][0] = 0;
                    } else {
                        sudoku[1][0] = Integer.parseInt(e4_4.getText().toString());
                        e4_4.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e4_5.getText().toString().isEmpty()) {
                        sudoku[1][1] = 0;
                    } else {
                        sudoku[1][1] = Integer.parseInt(e4_5.getText().toString());
                        e4_5.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e4_6.getText().toString().isEmpty()) {
                        sudoku[1][2] = 0;
                    } else {
                        sudoku[1][2] = Integer.parseInt(e4_6.getText().toString());
                        e4_6.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e4_7.getText().toString().isEmpty()) {
                        sudoku[1][3] = 0;
                    } else {
                        sudoku[1][3] = Integer.parseInt(e4_7.getText().toString());
                        e4_7.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e4_8.getText().toString().isEmpty()) {
                        sudoku[2][0] = 0;
                    } else {
                        sudoku[2][0] = Integer.parseInt(e4_8.getText().toString());
                        e4_8.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e4_9.getText().toString().isEmpty()) {
                        sudoku[2][1] = 0;
                    } else {
                        sudoku[2][1] = Integer.parseInt(e4_9.getText().toString());
                        e4_9.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e4_10.getText().toString().isEmpty()) {
                        sudoku[2][2] = 0;
                    } else {
                        sudoku[2][2] = Integer.parseInt(e4_10.getText().toString());
                        e4_10.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e4_11.getText().toString().isEmpty()) {
                        sudoku[2][3] = 0;
                    } else {
                        sudoku[2][3] = Integer.parseInt(e4_11.getText().toString());
                        e4_11.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e4_12.getText().toString().isEmpty()) {
                        sudoku[3][0] = 0;
                    } else {
                        sudoku[3][0] = Integer.parseInt(e4_12.getText().toString());
                        e4_12.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e4_13.getText().toString().isEmpty()) {
                        sudoku[3][1] = 0;
                    } else {
                        sudoku[3][1] = Integer.parseInt(e4_13.getText().toString());
                        e4_13.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e4_14.getText().toString().isEmpty()) {
                        sudoku[3][2] = 0;
                    } else {
                        sudoku[3][2] = Integer.parseInt(e4_14.getText().toString());
                        e4_14.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e4_15.getText().toString().isEmpty()) {
                        sudoku[3][3] = 0;
                    } else {
                        sudoku[3][3] = Integer.parseInt(e4_15.getText().toString());
                        e4_15.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                }
                outer:
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 4; j++) {
                        if (sudoku[i][j] > 4) {
                            numberGreater = true;
                            break outer;
                        }
                    }
                }
                //start to solve
                if (checkinitialsudoku() == true && numberGreater == false) {
                    hideKeyboard(getApplicationContext(), v);
                    countemptyspaces();
                    fillemptyspaces();
                    e4_0.setText("" + sudoku[0][0]);
                    e4_1.setText("" + sudoku[0][1]);
                    e4_2.setText("" + sudoku[0][2]);
                    e4_3.setText("" + sudoku[0][3]);
                    e4_4.setText("" + sudoku[1][0]);
                    e4_5.setText("" + sudoku[1][1]);
                    e4_6.setText("" + sudoku[1][2]);
                    e4_7.setText("" + sudoku[1][3]);
                    e4_8.setText("" + sudoku[2][0]);
                    e4_9.setText("" + sudoku[2][1]);
                    e4_10.setText("" + sudoku[2][2]);
                    e4_11.setText("" + sudoku[2][3]);
                    e4_12.setText("" + sudoku[3][0]);
                    e4_13.setText("" + sudoku[3][1]);
                    e4_14.setText("" + sudoku[3][2]);
                    e4_15.setText("" + sudoku[3][3]);
                    solvebtn.setVisibility(View.INVISIBLE);
                    e4_0.setEnabled(false);
                    e4_1.setEnabled(false);
                    e4_2.setEnabled(false);
                    e4_3.setEnabled(false);
                    e4_4.setEnabled(false);
                    e4_5.setEnabled(false);
                    e4_6.setEnabled(false);
                    e4_7.setEnabled(false);
                    e4_8.setEnabled(false);
                    e4_9.setEnabled(false);
                    e4_10.setEnabled(false);
                    e4_11.setEnabled(false);
                    e4_12.setEnabled(false);
                    e4_13.setEnabled(false);
                    e4_14.setEnabled(false);
                    e4_15.setEnabled(false);
                    AppPreference.getInstance().setBananas(AppPreference.getInstance().getBananas()-1);
                    showKonfetti();

                    if(!AppPreference.getInstance().getIs4X4())
                    {
                        sudokusolved.setText("HURRAY! You have unlocked 6x6");
                        sudokusolved.setTextSize(25);
                    }
                    else
                    {
                        sudokusolved.setText("SUDOKU SOLVED!!!");
                    }
                    AppPreference.getInstance().setIs4X4(true);
                } else {
                    point = 0;
                    numberGreater = false;
                    correct = true;
                    Toast.makeText(getApplicationContext(),
                            "Sudoku entered is invalid !!",
                            Toast.LENGTH_SHORT).show();
                    e4_0.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e4_1.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e4_2.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e4_3.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e4_4.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e4_5.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e4_6.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e4_7.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e4_8.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e4_9.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e4_10.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e4_11.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e4_12.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e4_13.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e4_14.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e4_15.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                }
            }
        });
    }

    private void showKonfetti() {
        new Handler().postDelayed(new Runnable() {
            public void run() {
                CommonConfetti.rainingConfetti(konfettiView, new int[]{Color.BLACK, Color.RED, Color.BLUE,
                        Color.WHITE, Color.GREEN, Color.YELLOW})
                        .stream(3000).setVelocityY(600);
            }
        }, 400);

    }

    void countemptyspaces() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (sudoku[i][j] == 0) {
                    b[point] = new BoxInfo();
                    b[point].rowno = i;
                    b[point].coloumnno = j;
                    point++;
                }
            }
        }
    }

    void fillemptyspaces() {
        for (int i = 0; i < point; i++) {
            if (i < 0) {
                correct = false;
                break;
            }
            if (sudoku[b[i].rowno][b[i].coloumnno] == 4) {
                sudoku[b[i].rowno][b[i].coloumnno] = 0;
                i -= 2;
            } else {
                for (int randomno = sudoku[b[i].rowno][b[i].coloumnno] + 1; randomno <= 4; randomno++) {
                    if (checkrow(randomno, b[i].rowno) == 0 && checkcoloumn(randomno, b[i].coloumnno) == 0 && (checkbox(randomno, b[i].rowno, b[i].coloumnno) == 0)) {
                        sudoku[b[i].rowno][b[i].coloumnno] = randomno;
                        break;
                    }
                    if (randomno == 4) {
                        sudoku[b[i].rowno][b[i].coloumnno] = 0;
                        i -= 2;
                    }
                }
            }
        }
    }

    int checkrow(int number, int row) {
        int f = 0;
        for (int i = 0; i < 4; i++) {
            if (sudoku[row][i] == number) {
                f = 1;
                break;
            }

        }
        if (f == 1) {
            return 1;
        } else
            return 0;
    }

    int checkcoloumn(int number, int coloumn) {
        int f = 0;
        for (int i = 0; i < 4; i++) {
            if (sudoku[i][coloumn] == number) {
                f = 1;
                break;
            }

        }
        if (f == 1) {
            return 1;
        } else
            return 0;
    }

    int checkbox(int number, int rown, int coloumn) {
        int f = 0;
        for (int i = (rown / 2) * 2; i < (rown / 2) * 2 + 2; i++) {
            for (int j = (coloumn / 2) * 2; j < (coloumn / 2) * 2 + 2; j++) {
                if (sudoku[i][j] == number) {
                    f = 1;
                    break;
                }
            }
        }
        if (f == 1) {
            return 1;
        } else {
            return 0;
        }
    }

    int initialcheckrow(int number, int row) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (sudoku[row][i] == number) {
                sum++;
            }
        }
        if (sum > 1) {
            return 1;
        } else
            return 0;
    }

    int initialcheckcoloumn(int number, int coloumn) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (sudoku[i][coloumn] == number) {
                sum++;
            }
        }
        if (sum > 1) {
            return 1;
        } else
            return 0;
    }

    int initialcheckbox(int number, int rown, int coloumn) {
        int sum = 0;
        for (int i = (rown / 2) * 2; i < (rown / 2) * 2 + 2; i++) {
            for (int j = (coloumn / 2) * 2; j < (coloumn / 2) * 2 + 2; j++) {
                if (sudoku[i][j] == number) {
                    sum++;
                }
            }
        }
        if (sum > 1) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void hideKeyboard(Context context, View view) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (view != null)
            if (imm != null) {
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
    }

    boolean checkinitialsudoku() {
        outer:
        for (int k = 1; k <= 4; k++) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < 4; j++) {
                    if ((sudoku[i][j] != 0) && ((initialcheckrow(k, i) == 1) ||
                            (initialcheckcoloumn(k, j) == 1) || (initialcheckbox(k, i, j) == 1))) {
                        correct = false;
                        break outer;
                    }
                }
            }
        }
        return correct;
    }
}

