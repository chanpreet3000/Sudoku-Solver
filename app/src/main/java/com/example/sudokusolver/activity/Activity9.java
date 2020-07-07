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

public class Activity9 extends AppCompatActivity {
    private int[][] sudoku = new int[9][9];
    private int point = 0;
    private BoxInfo[] b = new BoxInfo[90];
    private boolean correct = true, numbergreater = false;
    private RelativeLayout konfettiView;
    private Button solvebtn;
    private EditText e9_0, e9_1, e9_2, e9_3, e9_4, e9_5, e9_6, e9_7, e9_8, e9_9, e9_10, e9_11, e9_12, e9_13, e9_14, e9_15, e9_16, e9_17, e9_18, e9_19, e9_20, e9_21, e9_22, e9_23, e9_24, e9_25, e9_26, e9_27, e9_28, e9_29, e9_30, e9_31, e9_32, e9_33, e9_34, e9_35, e9_36, e9_37, e9_38, e9_39, e9_40, e9_41, e9_42, e9_43, e9_44, e9_45, e9_46, e9_47, e9_48, e9_49, e9_50, e9_51, e9_52, e9_53, e9_54, e9_55, e9_56, e9_57, e9_58, e9_59, e9_60, e9_61, e9_62, e9_63, e9_64, e9_65, e9_66, e9_67, e9_68, e9_69, e9_70, e9_71, e9_72, e9_73, e9_74, e9_75, e9_76, e9_77, e9_78, e9_79, e9_80;
    private TextView sudokusolved;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_9);
        getSupportActionBar().setTitle("9x9");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //button

        konfettiView = findViewById(R.id.konfettiView);
        solvebtn = findViewById(R.id.solve9_btn);
        Button clearbtn = findViewById(R.id.clear9_btn);
        sudokusolved = findViewById(R.id.textView9);
        e9_0 = findViewById(R.id.e9_0);
        e9_1 = findViewById(R.id.e9_1);
        e9_2 = findViewById(R.id.e9_2);
        e9_3 = findViewById(R.id.e9_3);
        e9_4 = findViewById(R.id.e9_4);
        e9_5 = findViewById(R.id.e9_5);
        e9_6 = findViewById(R.id.e9_6);
        e9_7 = findViewById(R.id.e9_7);
        e9_8 = findViewById(R.id.e9_8);
        e9_9 = findViewById(R.id.e9_9);
        e9_10 = findViewById(R.id.e9_10);
        e9_11 = findViewById(R.id.e9_11);
        e9_12 = findViewById(R.id.e9_12);
        e9_13 = findViewById(R.id.e9_13);
        e9_14 = findViewById(R.id.e9_14);
        e9_15 = findViewById(R.id.e9_15);
        e9_16 = findViewById(R.id.e9_16);
        e9_17 = findViewById(R.id.e9_17);
        e9_18 = findViewById(R.id.e9_18);
        e9_19 = findViewById(R.id.e9_19);
        e9_20 = findViewById(R.id.e9_20);
        e9_21 = findViewById(R.id.e9_21);
        e9_22 = findViewById(R.id.e9_22);
        e9_23 = findViewById(R.id.e9_23);
        e9_24 = findViewById(R.id.e9_24);
        e9_25 = findViewById(R.id.e9_25);
        e9_26 = findViewById(R.id.e9_26);
        e9_27 = findViewById(R.id.e9_27);
        e9_28 = findViewById(R.id.e9_28);
        e9_29 = findViewById(R.id.e9_29);
        e9_30 = findViewById(R.id.e9_30);
        e9_31 = findViewById(R.id.e9_31);
        e9_32 = findViewById(R.id.e9_32);
        e9_33 = findViewById(R.id.e9_33);
        e9_34 = findViewById(R.id.e9_34);
        e9_35 = findViewById(R.id.e9_35);
        e9_36 = findViewById(R.id.e9_36);
        e9_37 = findViewById(R.id.e9_37);
        e9_38 = findViewById(R.id.e9_38);
        e9_39 = findViewById(R.id.e9_39);
        e9_40 = findViewById(R.id.e9_40);
        e9_41 = findViewById(R.id.e9_41);
        e9_42 = findViewById(R.id.e9_42);
        e9_43 = findViewById(R.id.e9_43);
        e9_44 = findViewById(R.id.e9_44);
        e9_45 = findViewById(R.id.e9_45);
        e9_46 = findViewById(R.id.e9_46);
        e9_47 = findViewById(R.id.e9_47);
        e9_48 = findViewById(R.id.e9_48);
        e9_49 = findViewById(R.id.e9_49);
        e9_50 = findViewById(R.id.e9_50);
        e9_51 = findViewById(R.id.e9_51);
        e9_52 = findViewById(R.id.e9_52);
        e9_53 = findViewById(R.id.e9_53);
        e9_54 = findViewById(R.id.e9_54);
        e9_55 = findViewById(R.id.e9_55);
        e9_56 = findViewById(R.id.e9_56);
        e9_57 = findViewById(R.id.e9_57);
        e9_58 = findViewById(R.id.e9_58);
        e9_59 = findViewById(R.id.e9_59);
        e9_60 = findViewById(R.id.e9_60);
        e9_61 = findViewById(R.id.e9_61);
        e9_62 = findViewById(R.id.e9_62);
        e9_63 = findViewById(R.id.e9_63);
        e9_64 = findViewById(R.id.e9_64);
        e9_65 = findViewById(R.id.e9_65);
        e9_66 = findViewById(R.id.e9_66);
        e9_67 = findViewById(R.id.e9_67);
        e9_68 = findViewById(R.id.e9_68);
        e9_69 = findViewById(R.id.e9_69);
        e9_70 = findViewById(R.id.e9_70);
        e9_71 = findViewById(R.id.e9_71);
        e9_72 = findViewById(R.id.e9_72);
        e9_73 = findViewById(R.id.e9_73);
        e9_74 = findViewById(R.id.e9_74);
        e9_75 = findViewById(R.id.e9_75);
        e9_76 = findViewById(R.id.e9_76);
        e9_77 = findViewById(R.id.e9_77);
        e9_78 = findViewById(R.id.e9_78);
        e9_79 = findViewById(R.id.e9_79);
        e9_80 = findViewById(R.id.e9_80);

        //New button
        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Activity9.this, Activity9.class);
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
                    if (e9_0.getText().toString().isEmpty()) {
                        sudoku[0][0] = 0;
                    } else {
                        sudoku[0][0] = Integer.parseInt(e9_0.getText().toString());
                        e9_0.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_1.getText().toString().isEmpty()) {
                        sudoku[0][1] = 0;
                    } else {
                        sudoku[0][1] = Integer.parseInt(e9_1.getText().toString());
                        e9_1.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_2.getText().toString().isEmpty()) {
                        sudoku[0][2] = 0;
                    } else {
                        sudoku[0][2] = Integer.parseInt(e9_2.getText().toString());
                        e9_2.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_3.getText().toString().isEmpty()) {
                        sudoku[0][3] = 0;
                    } else {
                        sudoku[0][3] = Integer.parseInt(e9_3.getText().toString());
                        e9_3.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_4.getText().toString().isEmpty()) {
                        sudoku[0][4] = 0;
                    } else {
                        sudoku[0][4] = Integer.parseInt(e9_4.getText().toString());
                        e9_4.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_5.getText().toString().isEmpty()) {
                        sudoku[0][5] = 0;
                    } else {
                        sudoku[0][5] = Integer.parseInt(e9_5.getText().toString());
                        e9_5.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_6.getText().toString().isEmpty()) {
                        sudoku[0][6] = 0;
                    } else {
                        sudoku[0][6] = Integer.parseInt(e9_6.getText().toString());
                        e9_6.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_7.getText().toString().isEmpty()) {
                        sudoku[0][7] = 0;
                    } else {
                        sudoku[0][7] = Integer.parseInt(e9_7.getText().toString());
                        e9_7.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_8.getText().toString().isEmpty()) {
                        sudoku[0][8] = 0;
                    } else {
                        sudoku[0][8] = Integer.parseInt(e9_8.getText().toString());
                        e9_8.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_9.getText().toString().isEmpty()) {
                        sudoku[1][0] = 0;
                    } else {
                        sudoku[1][0] = Integer.parseInt(e9_9.getText().toString());
                        e9_9.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_10.getText().toString().isEmpty()) {
                        sudoku[1][1] = 0;
                    } else {
                        sudoku[1][1] = Integer.parseInt(e9_10.getText().toString());
                        e9_10.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_11.getText().toString().isEmpty()) {
                        sudoku[1][2] = 0;
                    } else {
                        sudoku[1][2] = Integer.parseInt(e9_11.getText().toString());
                        e9_11.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_12.getText().toString().isEmpty()) {
                        sudoku[1][3] = 0;
                    } else {
                        sudoku[1][3] = Integer.parseInt(e9_12.getText().toString());
                        e9_12.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_13.getText().toString().isEmpty()) {
                        sudoku[1][4] = 0;
                    } else {
                        sudoku[1][4] = Integer.parseInt(e9_13.getText().toString());
                        e9_13.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_14.getText().toString().isEmpty()) {
                        sudoku[1][5] = 0;
                    } else {
                        sudoku[1][5] = Integer.parseInt(e9_14.getText().toString());
                        e9_14.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_15.getText().toString().isEmpty()) {
                        sudoku[1][6] = 0;
                    } else {
                        sudoku[1][6] = Integer.parseInt(e9_15.getText().toString());
                        e9_15.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_16.getText().toString().isEmpty()) {
                        sudoku[1][7] = 0;
                    } else {
                        sudoku[1][7] = Integer.parseInt(e9_16.getText().toString());
                        e9_16.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_17.getText().toString().isEmpty()) {
                        sudoku[1][8] = 0;
                    } else {
                        sudoku[1][8] = Integer.parseInt(e9_17.getText().toString());
                        e9_17.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_18.getText().toString().isEmpty()) {
                        sudoku[2][0] = 0;
                    } else {
                        sudoku[2][0] = Integer.parseInt(e9_18.getText().toString());
                        e9_18.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_19.getText().toString().isEmpty()) {
                        sudoku[2][1] = 0;
                    } else {
                        sudoku[2][1] = Integer.parseInt(e9_19.getText().toString());
                        e9_19.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_20.getText().toString().isEmpty()) {
                        sudoku[2][2] = 0;
                    } else {
                        sudoku[2][2] = Integer.parseInt(e9_20.getText().toString());
                        e9_20.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_21.getText().toString().isEmpty()) {
                        sudoku[2][3] = 0;
                    } else {
                        sudoku[2][3] = Integer.parseInt(e9_21.getText().toString());
                        e9_21.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_22.getText().toString().isEmpty()) {
                        sudoku[2][4] = 0;
                    } else {
                        sudoku[2][4] = Integer.parseInt(e9_22.getText().toString());
                        e9_22.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_23.getText().toString().isEmpty()) {
                        sudoku[2][5] = 0;
                    } else {
                        sudoku[2][5] = Integer.parseInt(e9_23.getText().toString());
                        e9_23.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_24.getText().toString().isEmpty()) {
                        sudoku[2][6] = 0;
                    } else {
                        sudoku[2][6] = Integer.parseInt(e9_24.getText().toString());
                        e9_24.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_25.getText().toString().isEmpty()) {
                        sudoku[2][7] = 0;
                    } else {
                        sudoku[2][7] = Integer.parseInt(e9_25.getText().toString());
                        e9_25.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_26.getText().toString().isEmpty()) {
                        sudoku[2][8] = 0;
                    } else {
                        sudoku[2][8] = Integer.parseInt(e9_26.getText().toString());
                        e9_26.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_27.getText().toString().isEmpty()) {
                        sudoku[3][0] = 0;
                    } else {
                        sudoku[3][0] = Integer.parseInt(e9_27.getText().toString());
                        e9_27.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_28.getText().toString().isEmpty()) {
                        sudoku[3][1] = 0;
                    } else {
                        sudoku[3][1] = Integer.parseInt(e9_28.getText().toString());
                        e9_28.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_29.getText().toString().isEmpty()) {
                        sudoku[3][2] = 0;
                    } else {
                        sudoku[3][2] = Integer.parseInt(e9_29.getText().toString());
                        e9_29.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_30.getText().toString().isEmpty()) {
                        sudoku[3][3] = 0;
                    } else {
                        sudoku[3][3] = Integer.parseInt(e9_30.getText().toString());
                        e9_30.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_31.getText().toString().isEmpty()) {
                        sudoku[3][4] = 0;
                    } else {
                        sudoku[3][4] = Integer.parseInt(e9_31.getText().toString());
                        e9_31.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_32.getText().toString().isEmpty()) {
                        sudoku[3][5] = 0;
                    } else {
                        sudoku[3][5] = Integer.parseInt(e9_32.getText().toString());
                        e9_32.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_33.getText().toString().isEmpty()) {
                        sudoku[3][6] = 0;
                    } else {
                        sudoku[3][6] = Integer.parseInt(e9_33.getText().toString());
                        e9_33.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_34.getText().toString().isEmpty()) {
                        sudoku[3][7] = 0;
                    } else {
                        sudoku[3][7] = Integer.parseInt(e9_34.getText().toString());
                        e9_34.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_35.getText().toString().isEmpty()) {
                        sudoku[3][8] = 0;
                    } else {
                        sudoku[3][8] = Integer.parseInt(e9_35.getText().toString());
                        e9_35.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_36.getText().toString().isEmpty()) {
                        sudoku[4][0] = 0;
                    } else {
                        sudoku[4][0] = Integer.parseInt(e9_36.getText().toString());
                        e9_36.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_37.getText().toString().isEmpty()) {
                        sudoku[4][1] = 0;
                    } else {
                        sudoku[4][1] = Integer.parseInt(e9_37.getText().toString());
                        e9_37.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_38.getText().toString().isEmpty()) {
                        sudoku[4][2] = 0;
                    } else {
                        sudoku[4][2] = Integer.parseInt(e9_38.getText().toString());
                        e9_38.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_39.getText().toString().isEmpty()) {
                        sudoku[4][3] = 0;
                    } else {
                        sudoku[4][3] = Integer.parseInt(e9_39.getText().toString());
                        e9_39.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_40.getText().toString().isEmpty()) {
                        sudoku[4][4] = 0;
                    } else {
                        sudoku[4][4] = Integer.parseInt(e9_40.getText().toString());
                        e9_40.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_41.getText().toString().isEmpty()) {
                        sudoku[4][5] = 0;
                    } else {
                        sudoku[4][5] = Integer.parseInt(e9_41.getText().toString());
                        e9_41.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_42.getText().toString().isEmpty()) {
                        sudoku[4][6] = 0;
                    } else {
                        sudoku[4][6] = Integer.parseInt(e9_42.getText().toString());
                        e9_42.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_43.getText().toString().isEmpty()) {
                        sudoku[4][7] = 0;
                    } else {
                        sudoku[4][7] = Integer.parseInt(e9_43.getText().toString());
                        e9_43.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_44.getText().toString().isEmpty()) {
                        sudoku[4][8] = 0;
                    } else {
                        sudoku[4][8] = Integer.parseInt(e9_44.getText().toString());
                        e9_44.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_45.getText().toString().isEmpty()) {
                        sudoku[5][0] = 0;
                    } else {
                        sudoku[5][0] = Integer.parseInt(e9_45.getText().toString());
                        e9_45.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_46.getText().toString().isEmpty()) {
                        sudoku[5][1] = 0;
                    } else {
                        sudoku[5][1] = Integer.parseInt(e9_46.getText().toString());
                        e9_46.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_47.getText().toString().isEmpty()) {
                        sudoku[5][2] = 0;
                    } else {
                        sudoku[5][2] = Integer.parseInt(e9_47.getText().toString());
                        e9_47.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_48.getText().toString().isEmpty()) {
                        sudoku[5][3] = 0;
                    } else {
                        sudoku[5][3] = Integer.parseInt(e9_48.getText().toString());
                        e9_48.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_49.getText().toString().isEmpty()) {
                        sudoku[5][4] = 0;
                    } else {
                        sudoku[5][4] = Integer.parseInt(e9_49.getText().toString());
                        e9_49.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_50.getText().toString().isEmpty()) {
                        sudoku[5][5] = 0;
                    } else {
                        sudoku[5][5] = Integer.parseInt(e9_50.getText().toString());
                        e9_50.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_51.getText().toString().isEmpty()) {
                        sudoku[5][6] = 0;
                    } else {
                        sudoku[5][6] = Integer.parseInt(e9_51.getText().toString());
                        e9_51.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_52.getText().toString().isEmpty()) {
                        sudoku[5][7] = 0;
                    } else {
                        sudoku[5][7] = Integer.parseInt(e9_52.getText().toString());
                        e9_52.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_53.getText().toString().isEmpty()) {
                        sudoku[5][8] = 0;
                    } else {
                        sudoku[5][8] = Integer.parseInt(e9_53.getText().toString());
                        e9_53.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_54.getText().toString().isEmpty()) {
                        sudoku[6][0] = 0;
                    } else {
                        sudoku[6][0] = Integer.parseInt(e9_54.getText().toString());
                        e9_54.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_55.getText().toString().isEmpty()) {
                        sudoku[6][1] = 0;
                    } else {
                        sudoku[6][1] = Integer.parseInt(e9_55.getText().toString());
                        e9_55.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_56.getText().toString().isEmpty()) {
                        sudoku[6][2] = 0;
                    } else {
                        sudoku[6][2] = Integer.parseInt(e9_56.getText().toString());
                        e9_56.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_57.getText().toString().isEmpty()) {
                        sudoku[6][3] = 0;
                    } else {
                        sudoku[6][3] = Integer.parseInt(e9_57.getText().toString());
                        e9_57.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_58.getText().toString().isEmpty()) {
                        sudoku[6][4] = 0;
                    } else {
                        sudoku[6][4] = Integer.parseInt(e9_58.getText().toString());
                        e9_58.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_59.getText().toString().isEmpty()) {
                        sudoku[6][5] = 0;
                    } else {
                        sudoku[6][5] = Integer.parseInt(e9_59.getText().toString());
                        e9_59.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_60.getText().toString().isEmpty()) {
                        sudoku[6][6] = 0;
                    } else {
                        sudoku[6][6] = Integer.parseInt(e9_60.getText().toString());
                        e9_60.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_61.getText().toString().isEmpty()) {
                        sudoku[6][7] = 0;
                    } else {
                        sudoku[6][7] = Integer.parseInt(e9_61.getText().toString());
                        e9_61.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_62.getText().toString().isEmpty()) {
                        sudoku[6][8] = 0;
                    } else {
                        sudoku[6][8] = Integer.parseInt(e9_62.getText().toString());
                        e9_62.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_63.getText().toString().isEmpty()) {
                        sudoku[7][0] = 0;
                    } else {
                        sudoku[7][0] = Integer.parseInt(e9_63.getText().toString());
                        e9_63.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_64.getText().toString().isEmpty()) {
                        sudoku[7][1] = 0;
                    } else {
                        sudoku[7][1] = Integer.parseInt(e9_64.getText().toString());
                        e9_64.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_65.getText().toString().isEmpty()) {
                        sudoku[7][2] = 0;
                    } else {
                        sudoku[7][2] = Integer.parseInt(e9_65.getText().toString());
                        e9_65.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_66.getText().toString().isEmpty()) {
                        sudoku[7][3] = 0;
                    } else {
                        sudoku[7][3] = Integer.parseInt(e9_66.getText().toString());
                        e9_66.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_67.getText().toString().isEmpty()) {
                        sudoku[7][4] = 0;
                    } else {
                        sudoku[7][4] = Integer.parseInt(e9_67.getText().toString());
                        e9_67.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_68.getText().toString().isEmpty()) {
                        sudoku[7][5] = 0;
                    } else {
                        sudoku[7][5] = Integer.parseInt(e9_68.getText().toString());
                        e9_68.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_69.getText().toString().isEmpty()) {
                        sudoku[7][6] = 0;
                    } else {
                        sudoku[7][6] = Integer.parseInt(e9_69.getText().toString());
                        e9_69.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_70.getText().toString().isEmpty()) {
                        sudoku[7][7] = 0;
                    } else {
                        sudoku[7][7] = Integer.parseInt(e9_70.getText().toString());
                        e9_70.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_71.getText().toString().isEmpty()) {
                        sudoku[7][8] = 0;
                    } else {
                        sudoku[7][8] = Integer.parseInt(e9_71.getText().toString());
                        e9_71.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_72.getText().toString().isEmpty()) {
                        sudoku[8][0] = 0;
                    } else {
                        sudoku[8][0] = Integer.parseInt(e9_72.getText().toString());
                        e9_72.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_73.getText().toString().isEmpty()) {
                        sudoku[8][1] = 0;
                    } else {
                        sudoku[8][1] = Integer.parseInt(e9_73.getText().toString());
                        e9_73.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_74.getText().toString().isEmpty()) {
                        sudoku[8][2] = 0;
                    } else {
                        sudoku[8][2] = Integer.parseInt(e9_74.getText().toString());
                        e9_74.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_75.getText().toString().isEmpty()) {
                        sudoku[8][3] = 0;
                    } else {
                        sudoku[8][3] = Integer.parseInt(e9_75.getText().toString());
                        e9_75.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_76.getText().toString().isEmpty()) {
                        sudoku[8][4] = 0;
                    } else {
                        sudoku[8][4] = Integer.parseInt(e9_76.getText().toString());
                        e9_76.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_77.getText().toString().isEmpty()) {
                        sudoku[8][5] = 0;
                    } else {
                        sudoku[8][5] = Integer.parseInt(e9_77.getText().toString());
                        e9_77.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_78.getText().toString().isEmpty()) {
                        sudoku[8][6] = 0;
                    } else {
                        sudoku[8][6] = Integer.parseInt(e9_78.getText().toString());
                        e9_78.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_79.getText().toString().isEmpty()) {
                        sudoku[8][7] = 0;
                    } else {
                        sudoku[8][7] = Integer.parseInt(e9_79.getText().toString());
                        e9_79.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                    if (e9_80.getText().toString().isEmpty()) {
                        sudoku[8][8] = 0;
                    } else {
                        sudoku[8][8] = Integer.parseInt(e9_80.getText().toString());
                        e9_80.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.filledblock));
                    }
                }
                outer:
                for (int i = 0; i < 9; i++) {
                    for (int j = 0; j < 9; j++) {
                        if (sudoku[i][j] > 9) {
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
                    e9_0.setText("" + sudoku[0][0]);
                    e9_1.setText("" + sudoku[0][1]);
                    e9_2.setText("" + sudoku[0][2]);
                    e9_3.setText("" + sudoku[0][3]);
                    e9_4.setText("" + sudoku[0][4]);
                    e9_5.setText("" + sudoku[0][5]);
                    e9_6.setText("" + sudoku[0][6]);
                    e9_7.setText("" + sudoku[0][7]);
                    e9_8.setText("" + sudoku[0][8]);
                    e9_9.setText("" + sudoku[1][0]);
                    e9_10.setText("" + sudoku[1][1]);
                    e9_11.setText("" + sudoku[1][2]);
                    e9_12.setText("" + sudoku[1][3]);
                    e9_13.setText("" + sudoku[1][4]);
                    e9_14.setText("" + sudoku[1][5]);
                    e9_15.setText("" + sudoku[1][6]);
                    e9_16.setText("" + sudoku[1][7]);
                    e9_17.setText("" + sudoku[1][8]);
                    e9_18.setText("" + sudoku[2][0]);
                    e9_19.setText("" + sudoku[2][1]);
                    e9_20.setText("" + sudoku[2][2]);
                    e9_21.setText("" + sudoku[2][3]);
                    e9_22.setText("" + sudoku[2][4]);
                    e9_23.setText("" + sudoku[2][5]);
                    e9_24.setText("" + sudoku[2][6]);
                    e9_25.setText("" + sudoku[2][7]);
                    e9_26.setText("" + sudoku[2][8]);
                    e9_27.setText("" + sudoku[3][0]);
                    e9_28.setText("" + sudoku[3][1]);
                    e9_29.setText("" + sudoku[3][2]);
                    e9_30.setText("" + sudoku[3][3]);
                    e9_31.setText("" + sudoku[3][4]);
                    e9_32.setText("" + sudoku[3][5]);
                    e9_33.setText("" + sudoku[3][6]);
                    e9_34.setText("" + sudoku[3][7]);
                    e9_35.setText("" + sudoku[3][8]);
                    e9_36.setText("" + sudoku[4][0]);
                    e9_37.setText("" + sudoku[4][1]);
                    e9_38.setText("" + sudoku[4][2]);
                    e9_39.setText("" + sudoku[4][3]);
                    e9_40.setText("" + sudoku[4][4]);
                    e9_41.setText("" + sudoku[4][5]);
                    e9_42.setText("" + sudoku[4][6]);
                    e9_43.setText("" + sudoku[4][7]);
                    e9_44.setText("" + sudoku[4][8]);
                    e9_45.setText("" + sudoku[5][0]);
                    e9_46.setText("" + sudoku[5][1]);
                    e9_47.setText("" + sudoku[5][2]);
                    e9_48.setText("" + sudoku[5][3]);
                    e9_49.setText("" + sudoku[5][4]);
                    e9_50.setText("" + sudoku[5][5]);
                    e9_51.setText("" + sudoku[5][6]);
                    e9_52.setText("" + sudoku[5][7]);
                    e9_53.setText("" + sudoku[5][8]);
                    e9_54.setText("" + sudoku[6][0]);
                    e9_55.setText("" + sudoku[6][1]);
                    e9_56.setText("" + sudoku[6][2]);
                    e9_57.setText("" + sudoku[6][3]);
                    e9_58.setText("" + sudoku[6][4]);
                    e9_59.setText("" + sudoku[6][5]);
                    e9_60.setText("" + sudoku[6][6]);
                    e9_61.setText("" + sudoku[6][7]);
                    e9_62.setText("" + sudoku[6][8]);
                    e9_63.setText("" + sudoku[7][0]);
                    e9_64.setText("" + sudoku[7][1]);
                    e9_65.setText("" + sudoku[7][2]);
                    e9_66.setText("" + sudoku[7][3]);
                    e9_67.setText("" + sudoku[7][4]);
                    e9_68.setText("" + sudoku[7][5]);
                    e9_69.setText("" + sudoku[7][6]);
                    e9_70.setText("" + sudoku[7][7]);
                    e9_71.setText("" + sudoku[7][8]);
                    e9_72.setText("" + sudoku[8][0]);
                    e9_73.setText("" + sudoku[8][1]);
                    e9_74.setText("" + sudoku[8][2]);
                    e9_75.setText("" + sudoku[8][3]);
                    e9_76.setText("" + sudoku[8][4]);
                    e9_77.setText("" + sudoku[8][5]);
                    e9_78.setText("" + sudoku[8][6]);
                    e9_79.setText("" + sudoku[8][7]);
                    e9_80.setText("" + sudoku[8][8]);
                    solvebtn.setVisibility(View.INVISIBLE);
                    e9_0.setEnabled(false);
                    e9_1.setEnabled(false);
                    e9_2.setEnabled(false);
                    e9_3.setEnabled(false);
                    e9_4.setEnabled(false);
                    e9_5.setEnabled(false);
                    e9_6.setEnabled(false);
                    e9_7.setEnabled(false);
                    e9_8.setEnabled(false);
                    e9_9.setEnabled(false);
                    e9_10.setEnabled(false);
                    e9_11.setEnabled(false);
                    e9_12.setEnabled(false);
                    e9_13.setEnabled(false);
                    e9_14.setEnabled(false);
                    e9_15.setEnabled(false);
                    e9_16.setEnabled(false);
                    e9_17.setEnabled(false);
                    e9_18.setEnabled(false);
                    e9_19.setEnabled(false);
                    e9_20.setEnabled(false);
                    e9_21.setEnabled(false);
                    e9_22.setEnabled(false);
                    e9_23.setEnabled(false);
                    e9_24.setEnabled(false);
                    e9_25.setEnabled(false);
                    e9_26.setEnabled(false);
                    e9_27.setEnabled(false);
                    e9_28.setEnabled(false);
                    e9_29.setEnabled(false);
                    e9_30.setEnabled(false);
                    e9_31.setEnabled(false);
                    e9_32.setEnabled(false);
                    e9_33.setEnabled(false);
                    e9_34.setEnabled(false);
                    e9_35.setEnabled(false);
                    e9_36.setEnabled(false);
                    e9_37.setEnabled(false);
                    e9_38.setEnabled(false);
                    e9_39.setEnabled(false);
                    e9_40.setEnabled(false);
                    e9_41.setEnabled(false);
                    e9_42.setEnabled(false);
                    e9_43.setEnabled(false);
                    e9_44.setEnabled(false);
                    e9_45.setEnabled(false);
                    e9_46.setEnabled(false);
                    e9_47.setEnabled(false);
                    e9_48.setEnabled(false);
                    e9_49.setEnabled(false);
                    e9_50.setEnabled(false);
                    e9_51.setEnabled(false);
                    e9_52.setEnabled(false);
                    e9_53.setEnabled(false);
                    e9_54.setEnabled(false);
                    e9_55.setEnabled(false);
                    e9_56.setEnabled(false);
                    e9_57.setEnabled(false);
                    e9_58.setEnabled(false);
                    e9_59.setEnabled(false);
                    e9_60.setEnabled(false);
                    e9_61.setEnabled(false);
                    e9_62.setEnabled(false);
                    e9_63.setEnabled(false);
                    e9_64.setEnabled(false);
                    e9_65.setEnabled(false);
                    e9_66.setEnabled(false);
                    e9_67.setEnabled(false);
                    e9_68.setEnabled(false);
                    e9_69.setEnabled(false);
                    e9_70.setEnabled(false);
                    e9_71.setEnabled(false);
                    e9_72.setEnabled(false);
                    e9_73.setEnabled(false);
                    e9_74.setEnabled(false);
                    e9_75.setEnabled(false);
                    e9_76.setEnabled(false);
                    e9_77.setEnabled(false);
                    e9_78.setEnabled(false);
                    e9_79.setEnabled(false);
                    e9_80.setEnabled(false);
                    sudokusolved.setText("SUDOKU SOLVED!!!");
                    AppPreference.getInstance().setBananas(AppPreference.getInstance().getBananas()-1);
                    showKonfetti();
                } else {
                    point = 0;
                    numbergreater = false;
                    correct = true;
                    Toast.makeText(getApplicationContext(),
                            "Sudoku entered is invalid !!",
                            Toast.LENGTH_SHORT).show();
                    e9_0.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_1.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_2.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_3.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_4.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_5.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_6.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_7.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_8.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_9.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_10.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_11.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_12.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_13.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_14.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_15.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_16.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_17.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_18.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_19.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_20.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_21.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_22.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_23.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_24.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_25.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_26.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_27.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_28.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_29.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_30.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_31.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_32.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_33.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_34.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_35.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_36.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_37.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_38.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_39.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_40.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_41.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_42.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_43.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_44.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_45.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_46.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_47.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_48.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_49.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_50.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_51.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_52.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_53.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_54.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_55.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_56.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_57.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_58.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_59.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_60.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_61.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_62.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_63.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_64.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_65.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_66.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_67.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_68.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_69.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_70.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_71.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_72.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_73.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_74.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_75.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_76.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_77.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_78.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_79.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
                    e9_80.setBackground(ContextCompat.getDrawable(getApplicationContext(), R.drawable.eachbox));
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
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
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
            if (sudoku[b[i].rowno][b[i].coloumnno] == 9) {
                sudoku[b[i].rowno][b[i].coloumnno] = 0;
                i -= 2;
            } else {
                for (int randomno = sudoku[b[i].rowno][b[i].coloumnno] + 1; randomno <= 9; randomno++) {
                    if (checkrow(randomno, b[i].rowno) == 0 && checkcoloumn(randomno, b[i].coloumnno) == 0 && (checkbox(randomno, b[i].rowno, b[i].coloumnno) == 0)) {
                        sudoku[b[i].rowno][b[i].coloumnno] = randomno;
                        break;
                    }
                    if (randomno == 9) {
                        sudoku[b[i].rowno][b[i].coloumnno] = 0;
                        i -= 2;
                    }

                }
            }
        }
    }

    int checkrow(int number, int row) {
        int f = 0;
        for (int i = 0; i < 9; i++) {
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
        for (int i = 0; i < 9; i++) {
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
        for (int i = (rown / 3) * 3; i < (rown / 3) * 3 + 3; i++) {
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
        for (int i = 0; i < 9; i++) {
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
        for (int i = 0; i < 9; i++) {
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
        for (int i = (rown / 3) * 3; i < (rown / 3) * 3 + 3; i++) {
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
        for (int k = 1; k <= 9; k++) {
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
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

