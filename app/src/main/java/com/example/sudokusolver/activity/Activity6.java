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

public class Activity6 extends AppCompatActivity {
    private int[][] sudoku = new int[9][9];
    private int point = 0;
    private BoxInfo[] b = new BoxInfo[90];
    boolean correct = true, numbergreater = false;
    private RelativeLayout konfettiView;

    private Button solvebtn;
    private EditText e6_0, e6_1, e6_2, e6_3, e6_4, e6_5, e6_6, e6_7, e6_8, e6_9, e6_10, e6_11, e6_12, e6_13, e6_14, e6_15, e6_16, e6_17, e6_18, e6_19, e6_20, e6_21, e6_22, e6_23, e6_24, e6_25, e6_26, e6_27, e6_28, e6_29, e6_30, e6_31, e6_32, e6_33, e6_34, e6_35;
    private TextView Error9, sudokusolved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_6);
        getSupportActionBar().setTitle("6x6");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //button

        konfettiView = findViewById(R.id.konfettiView);
        solvebtn = findViewById(R.id.solve6_btn);
        Button clearbtn = findViewById(R.id.clear6_btn);
        sudokusolved = findViewById(R.id.textView6);
        e6_0 = findViewById(R.id.e6_0);
        e6_1 = findViewById(R.id.e6_1);
        e6_2 = findViewById(R.id.e6_2);
        e6_3 = findViewById(R.id.e6_3);
        e6_4 = findViewById(R.id.e6_4);
        e6_5 = findViewById(R.id.e6_5);
        e6_6 = findViewById(R.id.e6_6);
        e6_7 = findViewById(R.id.e6_7);
        e6_8 = findViewById(R.id.e6_8);
        e6_9 = findViewById(R.id.e6_9);
        e6_10 = findViewById(R.id.e6_10);
        e6_11 = findViewById(R.id.e6_11);
        e6_12 = findViewById(R.id.e6_12);
        e6_13 = findViewById(R.id.e6_13);
        e6_14 = findViewById(R.id.e6_14);
        e6_15 = findViewById(R.id.e6_15);
        e6_16 = findViewById(R.id.e6_16);
        e6_17 = findViewById(R.id.e6_17);
        e6_18 = findViewById(R.id.e6_18);
        e6_19 = findViewById(R.id.e6_19);
        e6_20 = findViewById(R.id.e6_20);
        e6_21 = findViewById(R.id.e6_21);
        e6_22 = findViewById(R.id.e6_22);
        e6_23 = findViewById(R.id.e6_23);
        e6_24 = findViewById(R.id.e6_24);
        e6_25 = findViewById(R.id.e6_25);
        e6_26 = findViewById(R.id.e6_26);
        e6_27 = findViewById(R.id.e6_27);
        e6_28 = findViewById(R.id.e6_28);
        e6_29 = findViewById(R.id.e6_29);
        e6_30 = findViewById(R.id.e6_30);
        e6_31 = findViewById(R.id.e6_31);
        e6_32 = findViewById(R.id.e6_32);
        e6_33 = findViewById(R.id.e6_33);
        e6_34 = findViewById(R.id.e6_34);
        e6_35 = findViewById(R.id.e6_35);
        //New button
        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity6.this, Activity6.class);
                startActivity(intent);
                finish();
            }
        });
        //button to solve sudoku
        solvebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //sudoku araay fill
                {
                    if (e6_0.getText().toString().isEmpty()) {
                        sudoku[0][0] = 0;
                    } else {
                        sudoku[0][0] = Integer.parseInt(e6_0.getText().toString());
                        e6_0.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_1.getText().toString().isEmpty()) {
                        sudoku[0][1] = 0;
                    } else {
                        sudoku[0][1] = Integer.parseInt(e6_1.getText().toString());
                        e6_1.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_2.getText().toString().isEmpty()) {
                        sudoku[0][2] = 0;
                    } else {
                        sudoku[0][2] = Integer.parseInt(e6_2.getText().toString());
                        e6_2.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_3.getText().toString().isEmpty()) {
                        sudoku[0][3] = 0;
                    } else {
                        sudoku[0][3] = Integer.parseInt(e6_3.getText().toString());
                        e6_3.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_4.getText().toString().isEmpty()) {
                        sudoku[0][4] = 0;
                    } else {
                        sudoku[0][4] = Integer.parseInt(e6_4.getText().toString());
                        e6_4.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_5.getText().toString().isEmpty()) {
                        sudoku[0][5] = 0;
                    } else {
                        sudoku[0][5] = Integer.parseInt(e6_5.getText().toString());
                        e6_5.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_6.getText().toString().isEmpty()) {
                        sudoku[1][0] = 0;
                    } else {
                        sudoku[1][0] = Integer.parseInt(e6_6.getText().toString());
                        e6_6.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_7.getText().toString().isEmpty()) {
                        sudoku[1][1] = 0;
                    } else {
                        sudoku[1][1] = Integer.parseInt(e6_7.getText().toString());
                        e6_7.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_8.getText().toString().isEmpty()) {
                        sudoku[1][2] = 0;
                    } else {
                        sudoku[1][2] = Integer.parseInt(e6_8.getText().toString());
                        e6_8.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_9.getText().toString().isEmpty()) {
                        sudoku[1][3] = 0;
                    } else {
                        sudoku[1][3] = Integer.parseInt(e6_9.getText().toString());
                        e6_9.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_10.getText().toString().isEmpty()) {
                        sudoku[1][4] = 0;
                    } else {
                        sudoku[1][4] = Integer.parseInt(e6_10.getText().toString());
                        e6_10.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_11.getText().toString().isEmpty()) {
                        sudoku[1][5] = 0;
                    } else {
                        sudoku[1][5] = Integer.parseInt(e6_11.getText().toString());
                        e6_11.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_12.getText().toString().isEmpty()) {
                        sudoku[2][0] = 0;
                    } else {
                        sudoku[2][0] = Integer.parseInt(e6_12.getText().toString());
                        e6_12.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_13.getText().toString().isEmpty()) {
                        sudoku[2][1] = 0;
                    } else {
                        sudoku[2][1] = Integer.parseInt(e6_13.getText().toString());
                        e6_13.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_14.getText().toString().isEmpty()) {
                        sudoku[2][2] = 0;
                    } else {
                        sudoku[2][2] = Integer.parseInt(e6_14.getText().toString());
                        e6_14.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_15.getText().toString().isEmpty()) {
                        sudoku[2][3] = 0;
                    } else {
                        sudoku[2][3] = Integer.parseInt(e6_15.getText().toString());
                        e6_15.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_16.getText().toString().isEmpty()) {
                        sudoku[2][4] = 0;
                    } else {
                        sudoku[2][4] = Integer.parseInt(e6_16.getText().toString());
                        e6_16.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_17.getText().toString().isEmpty()) {
                        sudoku[2][5] = 0;
                    } else {
                        sudoku[2][5] = Integer.parseInt(e6_17.getText().toString());
                        e6_17.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_18.getText().toString().isEmpty()) {
                        sudoku[3][0] = 0;
                    } else {
                        sudoku[3][0] = Integer.parseInt(e6_18.getText().toString());
                        e6_18.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_19.getText().toString().isEmpty()) {
                        sudoku[3][1] = 0;
                    } else {
                        sudoku[3][1] = Integer.parseInt(e6_19.getText().toString());
                        e6_19.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_20.getText().toString().isEmpty()) {
                        sudoku[3][2] = 0;
                    } else {
                        sudoku[3][2] = Integer.parseInt(e6_20.getText().toString());
                        e6_20.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_21.getText().toString().isEmpty()) {
                        sudoku[3][3] = 0;
                    } else {
                        sudoku[3][3] = Integer.parseInt(e6_21.getText().toString());
                        e6_21.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_22.getText().toString().isEmpty()) {
                        sudoku[3][4] = 0;
                    } else {
                        sudoku[3][4] = Integer.parseInt(e6_22.getText().toString());
                        e6_22.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_23.getText().toString().isEmpty()) {
                        sudoku[3][5] = 0;
                    } else {
                        sudoku[3][5] = Integer.parseInt(e6_23.getText().toString());
                        e6_23.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_24.getText().toString().isEmpty()) {
                        sudoku[4][0] = 0;
                    } else {
                        sudoku[4][0] = Integer.parseInt(e6_24.getText().toString());
                        e6_24.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_25.getText().toString().isEmpty()) {
                        sudoku[4][1] = 0;
                    } else {
                        sudoku[4][1] = Integer.parseInt(e6_25.getText().toString());
                        e6_25.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_26.getText().toString().isEmpty()) {
                        sudoku[4][2] = 0;
                    } else {
                        sudoku[4][2] = Integer.parseInt(e6_26.getText().toString());
                        e6_26.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_27.getText().toString().isEmpty()) {
                        sudoku[4][3] = 0;
                    } else {
                        sudoku[4][3] = Integer.parseInt(e6_27.getText().toString());
                        e6_27.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_28.getText().toString().isEmpty()) {
                        sudoku[4][4] = 0;
                    } else {
                        sudoku[4][4] = Integer.parseInt(e6_28.getText().toString());
                        e6_28.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_29.getText().toString().isEmpty()) {
                        sudoku[4][5] = 0;
                    } else {
                        sudoku[4][5] = Integer.parseInt(e6_29.getText().toString());
                        e6_29.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_30.getText().toString().isEmpty()) {
                        sudoku[5][0] = 0;
                    } else {
                        sudoku[5][0] = Integer.parseInt(e6_30.getText().toString());
                        e6_30.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_31.getText().toString().isEmpty()) {
                        sudoku[5][1] = 0;
                    } else {
                        sudoku[5][1] = Integer.parseInt(e6_31.getText().toString());
                        e6_31.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_32.getText().toString().isEmpty()) {
                        sudoku[5][2] = 0;
                    } else {
                        sudoku[5][2] = Integer.parseInt(e6_32.getText().toString());
                        e6_32.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_33.getText().toString().isEmpty()) {
                        sudoku[5][3] = 0;
                    } else {
                        sudoku[5][3] = Integer.parseInt(e6_33.getText().toString());
                        e6_33.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_34.getText().toString().isEmpty()) {
                        sudoku[5][4] = 0;
                    } else {
                        sudoku[5][4] = Integer.parseInt(e6_34.getText().toString());
                        e6_34.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e6_35.getText().toString().isEmpty()) {
                        sudoku[5][5] = 0;
                    } else {
                        sudoku[5][5] = Integer.parseInt(e6_35.getText().toString());
                        e6_35.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                }
                //checking greater number
                outer:
                for (int i = 0; i < 6; i++) {
                    for (int j = 0; j < 6; j++) {
                        if (sudoku[i][j] > 6) {
                            numbergreater = true;
                            break outer;
                        }
                    }
                }
                //start to solve
                if (checkinitialsudoku() == true && numbergreater == false) {
                    hideKeyboard(getApplicationContext(), v);
                    countemptyspaces();
                    fillemptyspaces();
                    e6_0.setText("" + sudoku[0][0]);
                    e6_1.setText("" + sudoku[0][1]);
                    e6_2.setText("" + sudoku[0][2]);
                    e6_3.setText("" + sudoku[0][3]);
                    e6_4.setText("" + sudoku[0][4]);
                    e6_5.setText("" + sudoku[0][5]);
                    e6_6.setText("" + sudoku[1][0]);
                    e6_7.setText("" + sudoku[1][1]);
                    e6_8.setText("" + sudoku[1][2]);
                    e6_9.setText("" + sudoku[1][3]);
                    e6_10.setText("" + sudoku[1][4]);
                    e6_11.setText("" + sudoku[1][5]);
                    e6_12.setText("" + sudoku[2][0]);
                    e6_13.setText("" + sudoku[2][1]);
                    e6_14.setText("" + sudoku[2][2]);
                    e6_15.setText("" + sudoku[2][3]);
                    e6_16.setText("" + sudoku[2][4]);
                    e6_17.setText("" + sudoku[2][5]);
                    e6_18.setText("" + sudoku[3][0]);
                    e6_19.setText("" + sudoku[3][1]);
                    e6_20.setText("" + sudoku[3][2]);
                    e6_21.setText("" + sudoku[3][3]);
                    e6_22.setText("" + sudoku[3][4]);
                    e6_23.setText("" + sudoku[3][5]);
                    e6_24.setText("" + sudoku[4][0]);
                    e6_25.setText("" + sudoku[4][1]);
                    e6_26.setText("" + sudoku[4][2]);
                    e6_27.setText("" + sudoku[4][3]);
                    e6_28.setText("" + sudoku[4][4]);
                    e6_29.setText("" + sudoku[4][5]);
                    e6_30.setText("" + sudoku[5][0]);
                    e6_31.setText("" + sudoku[5][1]);
                    e6_32.setText("" + sudoku[5][2]);
                    e6_33.setText("" + sudoku[5][3]);
                    e6_34.setText("" + sudoku[5][4]);
                    e6_35.setText("" + sudoku[5][5]);
                    solvebtn.setVisibility(View.INVISIBLE);
                    e6_0.setEnabled(false);
                    e6_1.setEnabled(false);
                    e6_2.setEnabled(false);
                    e6_3.setEnabled(false);
                    e6_4.setEnabled(false);
                    e6_5.setEnabled(false);
                    e6_6.setEnabled(false);
                    e6_7.setEnabled(false);
                    e6_8.setEnabled(false);
                    e6_9.setEnabled(false);
                    e6_10.setEnabled(false);
                    e6_11.setEnabled(false);
                    e6_12.setEnabled(false);
                    e6_13.setEnabled(false);
                    e6_14.setEnabled(false);
                    e6_15.setEnabled(false);
                    e6_16.setEnabled(false);
                    e6_17.setEnabled(false);
                    e6_18.setEnabled(false);
                    e6_19.setEnabled(false);
                    e6_20.setEnabled(false);
                    e6_21.setEnabled(false);
                    e6_22.setEnabled(false);
                    e6_23.setEnabled(false);
                    e6_24.setEnabled(false);
                    e6_25.setEnabled(false);
                    e6_26.setEnabled(false);
                    e6_27.setEnabled(false);
                    e6_28.setEnabled(false);
                    e6_29.setEnabled(false);
                    e6_30.setEnabled(false);
                    e6_31.setEnabled(false);
                    e6_32.setEnabled(false);
                    e6_33.setEnabled(false);
                    e6_34.setEnabled(false);
                    e6_35.setEnabled(false);
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
                    AppPreference.getInstance().setIs6X6(true);
                } else {
                    point = 0;
                    numbergreater = false;
                    correct = true;
                    Toast.makeText(getApplicationContext(),
                            "Sudoku entered is invalid !!",
                            Toast.LENGTH_SHORT).show();
                    e6_0.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_1.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_2.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_3.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_4.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_5.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_6.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_7.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_8.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_9.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_10.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_11.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_12.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_13.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_14.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_15.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_16.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_17.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_18.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_19.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_20.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_21.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_22.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_23.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_24.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_25.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_26.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_27.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_28.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_29.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_30.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_31.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_32.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_33.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_34.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e6_35.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
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
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
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
            if (sudoku[b[i].rowno][b[i].coloumnno] == 6) {
                sudoku[b[i].rowno][b[i].coloumnno] = 0;
                i -= 2;
            } else {
                for (int randomno = sudoku[b[i].rowno][b[i].coloumnno] + 1; randomno <= 6; randomno++) {
                    if (checkrow(randomno, b[i].rowno) == 0 && checkcoloumn(randomno, b[i].coloumnno) == 0 && (checkbox(randomno, b[i].rowno, b[i].coloumnno) == 0)) {
                        sudoku[b[i].rowno][b[i].coloumnno] = randomno;
                        break;
                    }
                    if (randomno == 6) {
                        sudoku[b[i].rowno][b[i].coloumnno] = 0;
                        i -= 2;
                    }

                }
            }
        }
    }

    int checkrow(int number, int row) {
        int f = 0;
        for (int i = 0; i < 6; i++) {
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
        for (int i = 0; i < 6; i++) {
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
            for (int j = (coloumn / 3) * 3; j < (coloumn / 3) * 3 + 3; j++) {
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
        for (int i = 0; i < 6; i++) {
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
        for (int i = 0; i < 6; i++) {
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
            for (int j = (coloumn / 3) * 3; j < (coloumn / 3) * 3 + 3; j++) {
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

    boolean checkinitialsudoku() {
        outer:
        for (int k = 1; k <= 6; k++) {
            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    if ((sudoku[i][j] != 0) && ((initialcheckrow(k, i) == 1) || (initialcheckcoloumn(k, j) == 1) || (initialcheckbox(k, i, j) == 1))) {
                        correct = false;
                        break outer;
                    }
                }
            }
        }
        return correct;
    }
    public static void hideKeyboard(Context context, View view) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        if (view != null)
            if (imm != null) {
                imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
    }
}

