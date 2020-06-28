package com.example.sudokusolver.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sudokusolver.Utilities.BoxInfo;
import com.example.sudokusolver.R;
import com.github.jinatonic.confetti.CommonConfetti;

public class Activity16 extends AppCompatActivity {
    int sudoku[][] = new int[16][16];
    int point = 0;
    BoxInfo[] b = new BoxInfo[256];
    boolean correct=true,numbergreater=false;
    private RelativeLayout konfettiView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_16);
        getSupportActionBar().setTitle("16x16");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //button
        final Button solvebtn ,clearbtn;
        final EditText e16_0,e16_1,e16_2,e16_3,e16_4,e16_5,e16_6,e16_7,e16_8,e16_9,e16_10,e16_11,e16_12,e16_13,e16_14,e16_15,e16_16,e16_17,e16_18,e16_19,e16_20,e16_21,e16_22,e16_23,e16_24,e16_25,e16_26,e16_27,e16_28,e16_29,e16_30,e16_31,e16_32,e16_33,e16_34,e16_35,e16_36,e16_37,e16_38,e16_39,e16_40,e16_41,e16_42,e16_43,e16_44,e16_45,e16_46,e16_47,e16_48,e16_49,e16_50,e16_51,e16_52,e16_53,e16_54,e16_55,e16_56,e16_57,e16_58,e16_59,e16_60,e16_61,e16_62,e16_63,e16_64,e16_65,e16_66,e16_67,e16_68,e16_69,e16_70,e16_71,e16_72,e16_73,e16_74,e16_75,e16_76,e16_77,e16_78,e16_79,e16_80,e16_81,e16_82,e16_83,e16_84,e16_85,e16_86,e16_87,e16_88,e16_89,e16_90,e16_91,e16_92,e16_93,e16_94,e16_95,e16_96,e16_97,e16_98,e16_99,e16_100,e16_101,e16_102,e16_103,e16_104,e16_105,e16_106,e16_107,e16_108,e16_109,e16_110,e16_111,e16_112,e16_113,e16_114,e16_115,e16_116,e16_117,e16_118,e16_119,e16_120,e16_121,e16_122,e16_123,e16_124,e16_125,e16_126,e16_127,e16_128,e16_129,e16_130,e16_131,e16_132,e16_133,e16_134,e16_135,e16_136,e16_137,e16_138,e16_139,e16_140,e16_141,e16_142,e16_143,e16_144,e16_145,e16_146,e16_147,e16_148,e16_149,e16_150,e16_151,e16_152,e16_153,e16_154,e16_155,e16_156,e16_157,e16_158,e16_159,e16_160,e16_161,e16_162,e16_163,e16_164,e16_165,e16_166,e16_167,e16_168,e16_169,e16_170,e16_171,e16_172,e16_173,e16_174,e16_175,e16_176,e16_177,e16_178,e16_179,e16_180,e16_181,e16_182,e16_183,e16_184,e16_185,e16_186,e16_187,e16_188,e16_189,e16_190,e16_191,e16_192,e16_193,e16_194,e16_195,e16_196,e16_197,e16_198,e16_199,e16_200,e16_201,e16_202,e16_203,e16_204,e16_205,e16_206,e16_207,e16_208,e16_209,e16_210,e16_211,e16_212,e16_213,e16_214,e16_215,e16_216,e16_217,e16_218,e16_219,e16_220,e16_221,e16_222,e16_223,e16_224,e16_225,e16_226,e16_227,e16_228,e16_229,e16_230,e16_231,e16_232,e16_233,e16_234,e16_235,e16_236,e16_237,e16_238,e16_239,e16_240,e16_241,e16_242,e16_243,e16_244,e16_245,e16_246,e16_247,e16_248,e16_249,e16_250,e16_251,e16_252,e16_253,e16_254,e16_255;
        final TextView sudokusolved;
        konfettiView = findViewById(R.id.konfettiView);
        solvebtn=findViewById(R.id.solve16_btn);
        clearbtn=findViewById(R.id.clear16_btn);
        sudokusolved=findViewById(R.id.textView16);
        e16_0 = findViewById(R.id.e16_0);
        e16_1 = findViewById(R.id.e16_1);
        e16_2 = findViewById(R.id.e16_2);
        e16_3 = findViewById(R.id.e16_3);
        e16_4 = findViewById(R.id.e16_4);
        e16_5 = findViewById(R.id.e16_5);
        e16_6 = findViewById(R.id.e16_6);
        e16_7 = findViewById(R.id.e16_7);
        e16_8 = findViewById(R.id.e16_8);
        e16_9 = findViewById(R.id.e16_9);
        e16_10 = findViewById(R.id.e16_10);
        e16_11 = findViewById(R.id.e16_11);
        e16_12 = findViewById(R.id.e16_12);
        e16_13 = findViewById(R.id.e16_13);
        e16_14 = findViewById(R.id.e16_14);
        e16_15 = findViewById(R.id.e16_15);
        e16_16 = findViewById(R.id.e16_16);
        e16_17 = findViewById(R.id.e16_17);
        e16_18 = findViewById(R.id.e16_18);
        e16_19 = findViewById(R.id.e16_19);
        e16_20 = findViewById(R.id.e16_20);
        e16_21 = findViewById(R.id.e16_21);
        e16_22 = findViewById(R.id.e16_22);
        e16_23 = findViewById(R.id.e16_23);
        e16_24 = findViewById(R.id.e16_24);
        e16_25 = findViewById(R.id.e16_25);
        e16_26 = findViewById(R.id.e16_26);
        e16_27 = findViewById(R.id.e16_27);
        e16_28 = findViewById(R.id.e16_28);
        e16_29 = findViewById(R.id.e16_29);
        e16_30 = findViewById(R.id.e16_30);
        e16_31 = findViewById(R.id.e16_31);
        e16_32 = findViewById(R.id.e16_32);
        e16_33 = findViewById(R.id.e16_33);
        e16_34 = findViewById(R.id.e16_34);
        e16_35 = findViewById(R.id.e16_35);
        e16_36 = findViewById(R.id.e16_36);
        e16_37 = findViewById(R.id.e16_37);
        e16_38 = findViewById(R.id.e16_38);
        e16_39 = findViewById(R.id.e16_39);
        e16_40 = findViewById(R.id.e16_40);
        e16_41 = findViewById(R.id.e16_41);
        e16_42 = findViewById(R.id.e16_42);
        e16_43 = findViewById(R.id.e16_43);
        e16_44 = findViewById(R.id.e16_44);
        e16_45 = findViewById(R.id.e16_45);
        e16_46 = findViewById(R.id.e16_46);
        e16_47 = findViewById(R.id.e16_47);
        e16_48 = findViewById(R.id.e16_48);
        e16_49 = findViewById(R.id.e16_49);
        e16_50 = findViewById(R.id.e16_50);
        e16_51 = findViewById(R.id.e16_51);
        e16_52 = findViewById(R.id.e16_52);
        e16_53 = findViewById(R.id.e16_53);
        e16_54 = findViewById(R.id.e16_54);
        e16_55 = findViewById(R.id.e16_55);
        e16_56 = findViewById(R.id.e16_56);
        e16_57 = findViewById(R.id.e16_57);
        e16_58 = findViewById(R.id.e16_58);
        e16_59 = findViewById(R.id.e16_59);
        e16_60 = findViewById(R.id.e16_60);
        e16_61 = findViewById(R.id.e16_61);
        e16_62 = findViewById(R.id.e16_62);
        e16_63 = findViewById(R.id.e16_63);
        e16_64 = findViewById(R.id.e16_64);
        e16_65 = findViewById(R.id.e16_65);
        e16_66 = findViewById(R.id.e16_66);
        e16_67 = findViewById(R.id.e16_67);
        e16_68 = findViewById(R.id.e16_68);
        e16_69 = findViewById(R.id.e16_69);
        e16_70 = findViewById(R.id.e16_70);
        e16_71 = findViewById(R.id.e16_71);
        e16_72 = findViewById(R.id.e16_72);
        e16_73 = findViewById(R.id.e16_73);
        e16_74 = findViewById(R.id.e16_74);
        e16_75 = findViewById(R.id.e16_75);
        e16_76 = findViewById(R.id.e16_76);
        e16_77 = findViewById(R.id.e16_77);
        e16_78 = findViewById(R.id.e16_78);
        e16_79 = findViewById(R.id.e16_79);
        e16_80 = findViewById(R.id.e16_80);
        e16_81 = findViewById(R.id.e16_81);
        e16_82 = findViewById(R.id.e16_82);
        e16_83 = findViewById(R.id.e16_83);
        e16_84 = findViewById(R.id.e16_84);
        e16_85 = findViewById(R.id.e16_85);
        e16_86 = findViewById(R.id.e16_86);
        e16_87 = findViewById(R.id.e16_87);
        e16_88 = findViewById(R.id.e16_88);
        e16_89 = findViewById(R.id.e16_89);
        e16_90 = findViewById(R.id.e16_90);
        e16_91 = findViewById(R.id.e16_91);
        e16_92 = findViewById(R.id.e16_92);
        e16_93 = findViewById(R.id.e16_93);
        e16_94 = findViewById(R.id.e16_94);
        e16_95 = findViewById(R.id.e16_95);
        e16_96 = findViewById(R.id.e16_96);
        e16_97 = findViewById(R.id.e16_97);
        e16_98 = findViewById(R.id.e16_98);
        e16_99 = findViewById(R.id.e16_99);
        e16_100 = findViewById(R.id.e16_100);
        e16_101 = findViewById(R.id.e16_101);
        e16_102 = findViewById(R.id.e16_102);
        e16_103 = findViewById(R.id.e16_103);
        e16_104 = findViewById(R.id.e16_104);
        e16_105 = findViewById(R.id.e16_105);
        e16_106 = findViewById(R.id.e16_106);
        e16_107 = findViewById(R.id.e16_107);
        e16_108 = findViewById(R.id.e16_108);
        e16_109 = findViewById(R.id.e16_109);
        e16_110 = findViewById(R.id.e16_110);
        e16_111 = findViewById(R.id.e16_111);
        e16_112 = findViewById(R.id.e16_112);
        e16_113 = findViewById(R.id.e16_113);
        e16_114 = findViewById(R.id.e16_114);
        e16_115 = findViewById(R.id.e16_115);
        e16_116 = findViewById(R.id.e16_116);
        e16_117 = findViewById(R.id.e16_117);
        e16_118 = findViewById(R.id.e16_118);
        e16_119 = findViewById(R.id.e16_119);
        e16_120 = findViewById(R.id.e16_120);
        e16_121 = findViewById(R.id.e16_121);
        e16_122 = findViewById(R.id.e16_122);
        e16_123 = findViewById(R.id.e16_123);
        e16_124 = findViewById(R.id.e16_124);
        e16_125 = findViewById(R.id.e16_125);
        e16_126 = findViewById(R.id.e16_126);
        e16_127 = findViewById(R.id.e16_127);
        e16_128 = findViewById(R.id.e16_128);
        e16_129 = findViewById(R.id.e16_129);
        e16_130 = findViewById(R.id.e16_130);
        e16_131 = findViewById(R.id.e16_131);
        e16_132 = findViewById(R.id.e16_132);
        e16_133 = findViewById(R.id.e16_133);
        e16_134 = findViewById(R.id.e16_134);
        e16_135 = findViewById(R.id.e16_135);
        e16_136 = findViewById(R.id.e16_136);
        e16_137 = findViewById(R.id.e16_137);
        e16_138 = findViewById(R.id.e16_138);
        e16_139 = findViewById(R.id.e16_139);
        e16_140 = findViewById(R.id.e16_140);
        e16_141 = findViewById(R.id.e16_141);
        e16_142 = findViewById(R.id.e16_142);
        e16_143 = findViewById(R.id.e16_143);
        e16_144 = findViewById(R.id.e16_144);
        e16_145 = findViewById(R.id.e16_145);
        e16_146 = findViewById(R.id.e16_146);
        e16_147 = findViewById(R.id.e16_147);
        e16_148 = findViewById(R.id.e16_148);
        e16_149 = findViewById(R.id.e16_149);
        e16_150 = findViewById(R.id.e16_150);
        e16_151 = findViewById(R.id.e16_151);
        e16_152 = findViewById(R.id.e16_152);
        e16_153 = findViewById(R.id.e16_153);
        e16_154 = findViewById(R.id.e16_154);
        e16_155 = findViewById(R.id.e16_155);
        e16_156 = findViewById(R.id.e16_156);
        e16_157 = findViewById(R.id.e16_157);
        e16_158 = findViewById(R.id.e16_158);
        e16_159 = findViewById(R.id.e16_159);
        e16_160 = findViewById(R.id.e16_160);
        e16_161 = findViewById(R.id.e16_161);
        e16_162 = findViewById(R.id.e16_162);
        e16_163 = findViewById(R.id.e16_163);
        e16_164 = findViewById(R.id.e16_164);
        e16_165 = findViewById(R.id.e16_165);
        e16_166 = findViewById(R.id.e16_166);
        e16_167 = findViewById(R.id.e16_167);
        e16_168 = findViewById(R.id.e16_168);
        e16_169 = findViewById(R.id.e16_169);
        e16_170 = findViewById(R.id.e16_170);
        e16_171 = findViewById(R.id.e16_171);
        e16_172 = findViewById(R.id.e16_172);
        e16_173 = findViewById(R.id.e16_173);
        e16_174 = findViewById(R.id.e16_174);
        e16_175 = findViewById(R.id.e16_175);
        e16_176 = findViewById(R.id.e16_176);
        e16_177 = findViewById(R.id.e16_177);
        e16_178 = findViewById(R.id.e16_178);
        e16_179 = findViewById(R.id.e16_179);
        e16_180 = findViewById(R.id.e16_180);
        e16_181 = findViewById(R.id.e16_181);
        e16_182 = findViewById(R.id.e16_182);
        e16_183 = findViewById(R.id.e16_183);
        e16_184 = findViewById(R.id.e16_184);
        e16_185 = findViewById(R.id.e16_185);
        e16_186 = findViewById(R.id.e16_186);
        e16_187 = findViewById(R.id.e16_187);
        e16_188 = findViewById(R.id.e16_188);
        e16_189 = findViewById(R.id.e16_189);
        e16_190 = findViewById(R.id.e16_190);
        e16_191 = findViewById(R.id.e16_191);
        e16_192 = findViewById(R.id.e16_192);
        e16_193 = findViewById(R.id.e16_193);
        e16_194 = findViewById(R.id.e16_194);
        e16_195 = findViewById(R.id.e16_195);
        e16_196 = findViewById(R.id.e16_196);
        e16_197 = findViewById(R.id.e16_197);
        e16_198 = findViewById(R.id.e16_198);
        e16_199 = findViewById(R.id.e16_199);
        e16_200 = findViewById(R.id.e16_200);
        e16_201 = findViewById(R.id.e16_201);
        e16_202 = findViewById(R.id.e16_202);
        e16_203 = findViewById(R.id.e16_203);
        e16_204 = findViewById(R.id.e16_204);
        e16_205 = findViewById(R.id.e16_205);
        e16_206 = findViewById(R.id.e16_206);
        e16_207 = findViewById(R.id.e16_207);
        e16_208 = findViewById(R.id.e16_208);
        e16_209 = findViewById(R.id.e16_209);
        e16_210 = findViewById(R.id.e16_210);
        e16_211 = findViewById(R.id.e16_211);
        e16_212 = findViewById(R.id.e16_212);
        e16_213 = findViewById(R.id.e16_213);
        e16_214 = findViewById(R.id.e16_214);
        e16_215 = findViewById(R.id.e16_215);
        e16_216 = findViewById(R.id.e16_216);
        e16_217 = findViewById(R.id.e16_217);
        e16_218 = findViewById(R.id.e16_218);
        e16_219 = findViewById(R.id.e16_219);
        e16_220 = findViewById(R.id.e16_220);
        e16_221 = findViewById(R.id.e16_221);
        e16_222 = findViewById(R.id.e16_222);
        e16_223 = findViewById(R.id.e16_223);
        e16_224 = findViewById(R.id.e16_224);
        e16_225 = findViewById(R.id.e16_225);
        e16_226 = findViewById(R.id.e16_226);
        e16_227 = findViewById(R.id.e16_227);
        e16_228 = findViewById(R.id.e16_228);
        e16_229 = findViewById(R.id.e16_229);
        e16_230 = findViewById(R.id.e16_230);
        e16_231 = findViewById(R.id.e16_231);
        e16_232 = findViewById(R.id.e16_232);
        e16_233 = findViewById(R.id.e16_233);
        e16_234 = findViewById(R.id.e16_234);
        e16_235 = findViewById(R.id.e16_235);
        e16_236 = findViewById(R.id.e16_236);
        e16_237 = findViewById(R.id.e16_237);
        e16_238 = findViewById(R.id.e16_238);
        e16_239 = findViewById(R.id.e16_239);
        e16_240 = findViewById(R.id.e16_240);
        e16_241 = findViewById(R.id.e16_241);
        e16_242 = findViewById(R.id.e16_242);
        e16_243 = findViewById(R.id.e16_243);
        e16_244 = findViewById(R.id.e16_244);
        e16_245 = findViewById(R.id.e16_245);
        e16_246 = findViewById(R.id.e16_246);
        e16_247 = findViewById(R.id.e16_247);
        e16_248 = findViewById(R.id.e16_248);
        e16_249 = findViewById(R.id.e16_249);
        e16_250 = findViewById(R.id.e16_250);
        e16_251 = findViewById(R.id.e16_251);
        e16_252 = findViewById(R.id.e16_252);
        e16_253 = findViewById(R.id.e16_253);
        e16_254 = findViewById(R.id.e16_254);
        e16_255 = findViewById(R.id.e16_255);


        //New button
        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Activity16.this,Activity16.class);
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
                    if (e16_0.getText().toString().isEmpty()) {
                        sudoku[0][0] = 0;
                    } else {
                        sudoku[0][0] = Integer.parseInt(e16_0.getText().toString());
                        e16_0.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_1.getText().toString().isEmpty()) {
                        sudoku[0][1] = 0;
                    } else {
                        sudoku[0][1] = Integer.parseInt(e16_1.getText().toString());
                        e16_1.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_2.getText().toString().isEmpty()) {
                        sudoku[0][2] = 0;
                    } else {
                        sudoku[0][2] = Integer.parseInt(e16_2.getText().toString());
                        e16_2.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_3.getText().toString().isEmpty()) {
                        sudoku[0][3] = 0;
                    } else {
                        sudoku[0][3] = Integer.parseInt(e16_3.getText().toString());
                        e16_3.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_4.getText().toString().isEmpty()) {
                        sudoku[0][4] = 0;
                    } else {
                        sudoku[0][4] = Integer.parseInt(e16_4.getText().toString());
                        e16_4.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_5.getText().toString().isEmpty()) {
                        sudoku[0][5] = 0;
                    } else {
                        sudoku[0][5] = Integer.parseInt(e16_5.getText().toString());
                        e16_5.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_6.getText().toString().isEmpty()) {
                        sudoku[0][6] = 0;
                    } else {
                        sudoku[0][6] = Integer.parseInt(e16_6.getText().toString());
                        e16_6.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_7.getText().toString().isEmpty()) {
                        sudoku[0][7] = 0;
                    } else {
                        sudoku[0][7] = Integer.parseInt(e16_7.getText().toString());
                        e16_7.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_8.getText().toString().isEmpty()) {
                        sudoku[0][8] = 0;
                    } else {
                        sudoku[0][8] = Integer.parseInt(e16_8.getText().toString());
                        e16_8.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_9.getText().toString().isEmpty()) {
                        sudoku[0][9] = 0;
                    } else {
                        sudoku[0][9] = Integer.parseInt(e16_9.getText().toString());
                        e16_9.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_10.getText().toString().isEmpty()) {
                        sudoku[0][10] = 0;
                    } else {
                        sudoku[0][10] = Integer.parseInt(e16_10.getText().toString());
                        e16_10.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_11.getText().toString().isEmpty()) {
                        sudoku[0][11] = 0;
                    } else {
                        sudoku[0][11] = Integer.parseInt(e16_11.getText().toString());
                        e16_11.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_12.getText().toString().isEmpty()) {
                        sudoku[0][12] = 0;
                    } else {
                        sudoku[0][12] = Integer.parseInt(e16_12.getText().toString());
                        e16_12.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_13.getText().toString().isEmpty()) {
                        sudoku[0][13] = 0;
                    } else {
                        sudoku[0][13] = Integer.parseInt(e16_13.getText().toString());
                        e16_13.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_14.getText().toString().isEmpty()) {
                        sudoku[0][14] = 0;
                    } else {
                        sudoku[0][14] = Integer.parseInt(e16_14.getText().toString());
                        e16_14.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_15.getText().toString().isEmpty()) {
                        sudoku[0][15] = 0;
                    } else {
                        sudoku[0][15] = Integer.parseInt(e16_15.getText().toString());
                        e16_15.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_16.getText().toString().isEmpty()) {
                        sudoku[1][0] = 0;
                    } else {
                        sudoku[1][0] = Integer.parseInt(e16_16.getText().toString());
                        e16_16.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_17.getText().toString().isEmpty()) {
                        sudoku[1][1] = 0;
                    } else {
                        sudoku[1][1] = Integer.parseInt(e16_17.getText().toString());
                        e16_17.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_18.getText().toString().isEmpty()) {
                        sudoku[1][2] = 0;
                    } else {
                        sudoku[1][2] = Integer.parseInt(e16_18.getText().toString());
                        e16_18.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_19.getText().toString().isEmpty()) {
                        sudoku[1][3] = 0;
                    } else {
                        sudoku[1][3] = Integer.parseInt(e16_19.getText().toString());
                        e16_19.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_20.getText().toString().isEmpty()) {
                        sudoku[1][4] = 0;
                    } else {
                        sudoku[1][4] = Integer.parseInt(e16_20.getText().toString());
                        e16_20.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_21.getText().toString().isEmpty()) {
                        sudoku[1][5] = 0;
                    } else {
                        sudoku[1][5] = Integer.parseInt(e16_21.getText().toString());
                        e16_21.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_22.getText().toString().isEmpty()) {
                        sudoku[1][6] = 0;
                    } else {
                        sudoku[1][6] = Integer.parseInt(e16_22.getText().toString());
                        e16_22.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_23.getText().toString().isEmpty()) {
                        sudoku[1][7] = 0;
                    } else {
                        sudoku[1][7] = Integer.parseInt(e16_23.getText().toString());
                        e16_23.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_24.getText().toString().isEmpty()) {
                        sudoku[1][8] = 0;
                    } else {
                        sudoku[1][8] = Integer.parseInt(e16_24.getText().toString());
                        e16_24.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_25.getText().toString().isEmpty()) {
                        sudoku[1][9] = 0;
                    } else {
                        sudoku[1][9] = Integer.parseInt(e16_25.getText().toString());
                        e16_25.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_26.getText().toString().isEmpty()) {
                        sudoku[1][10] = 0;
                    } else {
                        sudoku[1][10] = Integer.parseInt(e16_26.getText().toString());
                        e16_26.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_27.getText().toString().isEmpty()) {
                        sudoku[1][11] = 0;
                    } else {
                        sudoku[1][11] = Integer.parseInt(e16_27.getText().toString());
                        e16_27.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_28.getText().toString().isEmpty()) {
                        sudoku[1][12] = 0;
                    } else {
                        sudoku[1][12] = Integer.parseInt(e16_28.getText().toString());
                        e16_28.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_29.getText().toString().isEmpty()) {
                        sudoku[1][13] = 0;
                    } else {
                        sudoku[1][13] = Integer.parseInt(e16_29.getText().toString());
                        e16_29.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_30.getText().toString().isEmpty()) {
                        sudoku[1][14] = 0;
                    } else {
                        sudoku[1][14] = Integer.parseInt(e16_30.getText().toString());
                        e16_30.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_31.getText().toString().isEmpty()) {
                        sudoku[1][15] = 0;
                    } else {
                        sudoku[1][15] = Integer.parseInt(e16_31.getText().toString());
                        e16_31.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_32.getText().toString().isEmpty()) {
                        sudoku[2][0] = 0;
                    } else {
                        sudoku[2][0] = Integer.parseInt(e16_32.getText().toString());
                        e16_32.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_33.getText().toString().isEmpty()) {
                        sudoku[2][1] = 0;
                    } else {
                        sudoku[2][1] = Integer.parseInt(e16_33.getText().toString());
                        e16_33.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_34.getText().toString().isEmpty()) {
                        sudoku[2][2] = 0;
                    } else {
                        sudoku[2][2] = Integer.parseInt(e16_34.getText().toString());
                        e16_34.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_35.getText().toString().isEmpty()) {
                        sudoku[2][3] = 0;
                    } else {
                        sudoku[2][3] = Integer.parseInt(e16_35.getText().toString());
                        e16_35.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_36.getText().toString().isEmpty()) {
                        sudoku[2][4] = 0;
                    } else {
                        sudoku[2][4] = Integer.parseInt(e16_36.getText().toString());
                        e16_36.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_37.getText().toString().isEmpty()) {
                        sudoku[2][5] = 0;
                    } else {
                        sudoku[2][5] = Integer.parseInt(e16_37.getText().toString());
                        e16_37.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_38.getText().toString().isEmpty()) {
                        sudoku[2][6] = 0;
                    } else {
                        sudoku[2][6] = Integer.parseInt(e16_38.getText().toString());
                        e16_38.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_39.getText().toString().isEmpty()) {
                        sudoku[2][7] = 0;
                    } else {
                        sudoku[2][7] = Integer.parseInt(e16_39.getText().toString());
                        e16_39.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_40.getText().toString().isEmpty()) {
                        sudoku[2][8] = 0;
                    } else {
                        sudoku[2][8] = Integer.parseInt(e16_40.getText().toString());
                        e16_40.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_41.getText().toString().isEmpty()) {
                        sudoku[2][9] = 0;
                    } else {
                        sudoku[2][9] = Integer.parseInt(e16_41.getText().toString());
                        e16_41.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_42.getText().toString().isEmpty()) {
                        sudoku[2][10] = 0;
                    } else {
                        sudoku[2][10] = Integer.parseInt(e16_42.getText().toString());
                        e16_42.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_43.getText().toString().isEmpty()) {
                        sudoku[2][11] = 0;
                    } else {
                        sudoku[2][11] = Integer.parseInt(e16_43.getText().toString());
                        e16_43.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_44.getText().toString().isEmpty()) {
                        sudoku[2][12] = 0;
                    } else {
                        sudoku[2][12] = Integer.parseInt(e16_44.getText().toString());
                        e16_44.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_45.getText().toString().isEmpty()) {
                        sudoku[2][13] = 0;
                    } else {
                        sudoku[2][13] = Integer.parseInt(e16_45.getText().toString());
                        e16_45.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_46.getText().toString().isEmpty()) {
                        sudoku[2][14] = 0;
                    } else {
                        sudoku[2][14] = Integer.parseInt(e16_46.getText().toString());
                        e16_46.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_47.getText().toString().isEmpty()) {
                        sudoku[2][15] = 0;
                    } else {
                        sudoku[2][15] = Integer.parseInt(e16_47.getText().toString());
                        e16_47.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_48.getText().toString().isEmpty()) {
                        sudoku[3][0] = 0;
                    } else {
                        sudoku[3][0] = Integer.parseInt(e16_48.getText().toString());
                        e16_48.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_49.getText().toString().isEmpty()) {
                        sudoku[3][1] = 0;
                    } else {
                        sudoku[3][1] = Integer.parseInt(e16_49.getText().toString());
                        e16_49.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_50.getText().toString().isEmpty()) {
                        sudoku[3][2] = 0;
                    } else {
                        sudoku[3][2] = Integer.parseInt(e16_50.getText().toString());
                        e16_50.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_51.getText().toString().isEmpty()) {
                        sudoku[3][3] = 0;
                    } else {
                        sudoku[3][3] = Integer.parseInt(e16_51.getText().toString());
                        e16_51.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_52.getText().toString().isEmpty()) {
                        sudoku[3][4] = 0;
                    } else {
                        sudoku[3][4] = Integer.parseInt(e16_52.getText().toString());
                        e16_52.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_53.getText().toString().isEmpty()) {
                        sudoku[3][5] = 0;
                    } else {
                        sudoku[3][5] = Integer.parseInt(e16_53.getText().toString());
                        e16_53.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_54.getText().toString().isEmpty()) {
                        sudoku[3][6] = 0;
                    } else {
                        sudoku[3][6] = Integer.parseInt(e16_54.getText().toString());
                        e16_54.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_55.getText().toString().isEmpty()) {
                        sudoku[3][7] = 0;
                    } else {
                        sudoku[3][7] = Integer.parseInt(e16_55.getText().toString());
                        e16_55.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_56.getText().toString().isEmpty()) {
                        sudoku[3][8] = 0;
                    } else {
                        sudoku[3][8] = Integer.parseInt(e16_56.getText().toString());
                        e16_56.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_57.getText().toString().isEmpty()) {
                        sudoku[3][9] = 0;
                    } else {
                        sudoku[3][9] = Integer.parseInt(e16_57.getText().toString());
                        e16_57.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_58.getText().toString().isEmpty()) {
                        sudoku[3][10] = 0;
                    } else {
                        sudoku[3][10] = Integer.parseInt(e16_58.getText().toString());
                        e16_58.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_59.getText().toString().isEmpty()) {
                        sudoku[3][11] = 0;
                    } else {
                        sudoku[3][11] = Integer.parseInt(e16_59.getText().toString());
                        e16_59.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_60.getText().toString().isEmpty()) {
                        sudoku[3][12] = 0;
                    } else {
                        sudoku[3][12] = Integer.parseInt(e16_60.getText().toString());
                        e16_60.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_61.getText().toString().isEmpty()) {
                        sudoku[3][13] = 0;
                    } else {
                        sudoku[3][13] = Integer.parseInt(e16_61.getText().toString());
                        e16_61.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_62.getText().toString().isEmpty()) {
                        sudoku[3][14] = 0;
                    } else {
                        sudoku[3][14] = Integer.parseInt(e16_62.getText().toString());
                        e16_62.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_63.getText().toString().isEmpty()) {
                        sudoku[3][15] = 0;
                    } else {
                        sudoku[3][15] = Integer.parseInt(e16_63.getText().toString());
                        e16_63.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_64.getText().toString().isEmpty()) {
                        sudoku[4][0] = 0;
                    } else {
                        sudoku[4][0] = Integer.parseInt(e16_64.getText().toString());
                        e16_64.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_65.getText().toString().isEmpty()) {
                        sudoku[4][1] = 0;
                    } else {
                        sudoku[4][1] = Integer.parseInt(e16_65.getText().toString());
                        e16_65.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_66.getText().toString().isEmpty()) {
                        sudoku[4][2] = 0;
                    } else {
                        sudoku[4][2] = Integer.parseInt(e16_66.getText().toString());
                        e16_66.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_67.getText().toString().isEmpty()) {
                        sudoku[4][3] = 0;
                    } else {
                        sudoku[4][3] = Integer.parseInt(e16_67.getText().toString());
                        e16_67.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_68.getText().toString().isEmpty()) {
                        sudoku[4][4] = 0;
                    } else {
                        sudoku[4][4] = Integer.parseInt(e16_68.getText().toString());
                        e16_68.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_69.getText().toString().isEmpty()) {
                        sudoku[4][5] = 0;
                    } else {
                        sudoku[4][5] = Integer.parseInt(e16_69.getText().toString());
                        e16_69.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_70.getText().toString().isEmpty()) {
                        sudoku[4][6] = 0;
                    } else {
                        sudoku[4][6] = Integer.parseInt(e16_70.getText().toString());
                        e16_70.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_71.getText().toString().isEmpty()) {
                        sudoku[4][7] = 0;
                    } else {
                        sudoku[4][7] = Integer.parseInt(e16_71.getText().toString());
                        e16_71.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_72.getText().toString().isEmpty()) {
                        sudoku[4][8] = 0;
                    } else {
                        sudoku[4][8] = Integer.parseInt(e16_72.getText().toString());
                        e16_72.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_73.getText().toString().isEmpty()) {
                        sudoku[4][9] = 0;
                    } else {
                        sudoku[4][9] = Integer.parseInt(e16_73.getText().toString());
                        e16_73.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_74.getText().toString().isEmpty()) {
                        sudoku[4][10] = 0;
                    } else {
                        sudoku[4][10] = Integer.parseInt(e16_74.getText().toString());
                        e16_74.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_75.getText().toString().isEmpty()) {
                        sudoku[4][11] = 0;
                    } else {
                        sudoku[4][11] = Integer.parseInt(e16_75.getText().toString());
                        e16_75.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_76.getText().toString().isEmpty()) {
                        sudoku[4][12] = 0;
                    } else {
                        sudoku[4][12] = Integer.parseInt(e16_76.getText().toString());
                        e16_76.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_77.getText().toString().isEmpty()) {
                        sudoku[4][13] = 0;
                    } else {
                        sudoku[4][13] = Integer.parseInt(e16_77.getText().toString());
                        e16_77.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_78.getText().toString().isEmpty()) {
                        sudoku[4][14] = 0;
                    } else {
                        sudoku[4][14] = Integer.parseInt(e16_78.getText().toString());
                        e16_78.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_79.getText().toString().isEmpty()) {
                        sudoku[4][15] = 0;
                    } else {
                        sudoku[4][15] = Integer.parseInt(e16_79.getText().toString());
                        e16_79.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_80.getText().toString().isEmpty()) {
                        sudoku[5][0] = 0;
                    } else {
                        sudoku[5][0] = Integer.parseInt(e16_80.getText().toString());
                        e16_80.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_81.getText().toString().isEmpty()) {
                        sudoku[5][1] = 0;
                    } else {
                        sudoku[5][1] = Integer.parseInt(e16_81.getText().toString());
                        e16_81.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_82.getText().toString().isEmpty()) {
                        sudoku[5][2] = 0;
                    } else {
                        sudoku[5][2] = Integer.parseInt(e16_82.getText().toString());
                        e16_82.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_83.getText().toString().isEmpty()) {
                        sudoku[5][3] = 0;
                    } else {
                        sudoku[5][3] = Integer.parseInt(e16_83.getText().toString());
                        e16_83.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_84.getText().toString().isEmpty()) {
                        sudoku[5][4] = 0;
                    } else {
                        sudoku[5][4] = Integer.parseInt(e16_84.getText().toString());
                        e16_84.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_85.getText().toString().isEmpty()) {
                        sudoku[5][5] = 0;
                    } else {
                        sudoku[5][5] = Integer.parseInt(e16_85.getText().toString());
                        e16_85.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_86.getText().toString().isEmpty()) {
                        sudoku[5][6] = 0;
                    } else {
                        sudoku[5][6] = Integer.parseInt(e16_86.getText().toString());
                        e16_86.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_87.getText().toString().isEmpty()) {
                        sudoku[5][7] = 0;
                    } else {
                        sudoku[5][7] = Integer.parseInt(e16_87.getText().toString());
                        e16_87.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_88.getText().toString().isEmpty()) {
                        sudoku[5][8] = 0;
                    } else {
                        sudoku[5][8] = Integer.parseInt(e16_88.getText().toString());
                        e16_88.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_89.getText().toString().isEmpty()) {
                        sudoku[5][9] = 0;
                    } else {
                        sudoku[5][9] = Integer.parseInt(e16_89.getText().toString());
                        e16_89.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_90.getText().toString().isEmpty()) {
                        sudoku[5][10] = 0;
                    } else {
                        sudoku[5][10] = Integer.parseInt(e16_90.getText().toString());
                        e16_90.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_91.getText().toString().isEmpty()) {
                        sudoku[5][11] = 0;
                    } else {
                        sudoku[5][11] = Integer.parseInt(e16_91.getText().toString());
                        e16_91.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_92.getText().toString().isEmpty()) {
                        sudoku[5][12] = 0;
                    } else {
                        sudoku[5][12] = Integer.parseInt(e16_92.getText().toString());
                        e16_92.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_93.getText().toString().isEmpty()) {
                        sudoku[5][13] = 0;
                    } else {
                        sudoku[5][13] = Integer.parseInt(e16_93.getText().toString());
                        e16_93.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_94.getText().toString().isEmpty()) {
                        sudoku[5][14] = 0;
                    } else {
                        sudoku[5][14] = Integer.parseInt(e16_94.getText().toString());
                        e16_94.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_95.getText().toString().isEmpty()) {
                        sudoku[5][15] = 0;
                    } else {
                        sudoku[5][15] = Integer.parseInt(e16_95.getText().toString());
                        e16_95.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_96.getText().toString().isEmpty()) {
                        sudoku[6][0] = 0;
                    } else {
                        sudoku[6][0] = Integer.parseInt(e16_96.getText().toString());
                        e16_96.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_97.getText().toString().isEmpty()) {
                        sudoku[6][1] = 0;
                    } else {
                        sudoku[6][1] = Integer.parseInt(e16_97.getText().toString());
                        e16_97.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_98.getText().toString().isEmpty()) {
                        sudoku[6][2] = 0;
                    } else {
                        sudoku[6][2] = Integer.parseInt(e16_98.getText().toString());
                        e16_98.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_99.getText().toString().isEmpty()) {
                        sudoku[6][3] = 0;
                    } else {
                        sudoku[6][3] = Integer.parseInt(e16_99.getText().toString());
                        e16_99.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_100.getText().toString().isEmpty()) {
                        sudoku[6][4] = 0;
                    } else {
                        sudoku[6][4] = Integer.parseInt(e16_100.getText().toString());
                        e16_100.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_101.getText().toString().isEmpty()) {
                        sudoku[6][5] = 0;
                    } else {
                        sudoku[6][5] = Integer.parseInt(e16_101.getText().toString());
                        e16_101.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_102.getText().toString().isEmpty()) {
                        sudoku[6][6] = 0;
                    } else {
                        sudoku[6][6] = Integer.parseInt(e16_102.getText().toString());
                        e16_102.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_103.getText().toString().isEmpty()) {
                        sudoku[6][7] = 0;
                    } else {
                        sudoku[6][7] = Integer.parseInt(e16_103.getText().toString());
                        e16_103.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_104.getText().toString().isEmpty()) {
                        sudoku[6][8] = 0;
                    } else {
                        sudoku[6][8] = Integer.parseInt(e16_104.getText().toString());
                        e16_104.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_105.getText().toString().isEmpty()) {
                        sudoku[6][9] = 0;
                    } else {
                        sudoku[6][9] = Integer.parseInt(e16_105.getText().toString());
                        e16_105.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_106.getText().toString().isEmpty()) {
                        sudoku[6][10] = 0;
                    } else {
                        sudoku[6][10] = Integer.parseInt(e16_106.getText().toString());
                        e16_106.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_107.getText().toString().isEmpty()) {
                        sudoku[6][11] = 0;
                    } else {
                        sudoku[6][11] = Integer.parseInt(e16_107.getText().toString());
                        e16_107.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_108.getText().toString().isEmpty()) {
                        sudoku[6][12] = 0;
                    } else {
                        sudoku[6][12] = Integer.parseInt(e16_108.getText().toString());
                        e16_108.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_109.getText().toString().isEmpty()) {
                        sudoku[6][13] = 0;
                    } else {
                        sudoku[6][13] = Integer.parseInt(e16_109.getText().toString());
                        e16_109.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_110.getText().toString().isEmpty()) {
                        sudoku[6][14] = 0;
                    } else {
                        sudoku[6][14] = Integer.parseInt(e16_110.getText().toString());
                        e16_110.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_111.getText().toString().isEmpty()) {
                        sudoku[6][15] = 0;
                    } else {
                        sudoku[6][15] = Integer.parseInt(e16_111.getText().toString());
                        e16_111.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_112.getText().toString().isEmpty()) {
                        sudoku[7][0] = 0;
                    } else {
                        sudoku[7][0] = Integer.parseInt(e16_112.getText().toString());
                        e16_112.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_113.getText().toString().isEmpty()) {
                        sudoku[7][1] = 0;
                    } else {
                        sudoku[7][1] = Integer.parseInt(e16_113.getText().toString());
                        e16_113.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_114.getText().toString().isEmpty()) {
                        sudoku[7][2] = 0;
                    } else {
                        sudoku[7][2] = Integer.parseInt(e16_114.getText().toString());
                        e16_114.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_115.getText().toString().isEmpty()) {
                        sudoku[7][3] = 0;
                    } else {
                        sudoku[7][3] = Integer.parseInt(e16_115.getText().toString());
                        e16_115.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_116.getText().toString().isEmpty()) {
                        sudoku[7][4] = 0;
                    } else {
                        sudoku[7][4] = Integer.parseInt(e16_116.getText().toString());
                        e16_116.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_117.getText().toString().isEmpty()) {
                        sudoku[7][5] = 0;
                    } else {
                        sudoku[7][5] = Integer.parseInt(e16_117.getText().toString());
                        e16_117.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_118.getText().toString().isEmpty()) {
                        sudoku[7][6] = 0;
                    } else {
                        sudoku[7][6] = Integer.parseInt(e16_118.getText().toString());
                        e16_118.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_119.getText().toString().isEmpty()) {
                        sudoku[7][7] = 0;
                    } else {
                        sudoku[7][7] = Integer.parseInt(e16_119.getText().toString());
                        e16_119.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_120.getText().toString().isEmpty()) {
                        sudoku[7][8] = 0;
                    } else {
                        sudoku[7][8] = Integer.parseInt(e16_120.getText().toString());
                        e16_120.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_121.getText().toString().isEmpty()) {
                        sudoku[7][9] = 0;
                    } else {
                        sudoku[7][9] = Integer.parseInt(e16_121.getText().toString());
                        e16_121.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_122.getText().toString().isEmpty()) {
                        sudoku[7][10] = 0;
                    } else {
                        sudoku[7][10] = Integer.parseInt(e16_122.getText().toString());
                        e16_122.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_123.getText().toString().isEmpty()) {
                        sudoku[7][11] = 0;
                    } else {
                        sudoku[7][11] = Integer.parseInt(e16_123.getText().toString());
                        e16_123.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_124.getText().toString().isEmpty()) {
                        sudoku[7][12] = 0;
                    } else {
                        sudoku[7][12] = Integer.parseInt(e16_124.getText().toString());
                        e16_124.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_125.getText().toString().isEmpty()) {
                        sudoku[7][13] = 0;
                    } else {
                        sudoku[7][13] = Integer.parseInt(e16_125.getText().toString());
                        e16_125.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_126.getText().toString().isEmpty()) {
                        sudoku[7][14] = 0;
                    } else {
                        sudoku[7][14] = Integer.parseInt(e16_126.getText().toString());
                        e16_126.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_127.getText().toString().isEmpty()) {
                        sudoku[7][15] = 0;
                    } else {
                        sudoku[7][15] = Integer.parseInt(e16_127.getText().toString());
                        e16_127.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_128.getText().toString().isEmpty()) {
                        sudoku[8][0] = 0;
                    } else {
                        sudoku[8][0] = Integer.parseInt(e16_128.getText().toString());
                        e16_128.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_129.getText().toString().isEmpty()) {
                        sudoku[8][1] = 0;
                    } else {
                        sudoku[8][1] = Integer.parseInt(e16_129.getText().toString());
                        e16_129.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_130.getText().toString().isEmpty()) {
                        sudoku[8][2] = 0;
                    } else {
                        sudoku[8][2] = Integer.parseInt(e16_130.getText().toString());
                        e16_130.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_131.getText().toString().isEmpty()) {
                        sudoku[8][3] = 0;
                    } else {
                        sudoku[8][3] = Integer.parseInt(e16_131.getText().toString());
                        e16_131.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_132.getText().toString().isEmpty()) {
                        sudoku[8][4] = 0;
                    } else {
                        sudoku[8][4] = Integer.parseInt(e16_132.getText().toString());
                        e16_132.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_133.getText().toString().isEmpty()) {
                        sudoku[8][5] = 0;
                    } else {
                        sudoku[8][5] = Integer.parseInt(e16_133.getText().toString());
                        e16_133.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_134.getText().toString().isEmpty()) {
                        sudoku[8][6] = 0;
                    } else {
                        sudoku[8][6] = Integer.parseInt(e16_134.getText().toString());
                        e16_134.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_135.getText().toString().isEmpty()) {
                        sudoku[8][7] = 0;
                    } else {
                        sudoku[8][7] = Integer.parseInt(e16_135.getText().toString());
                        e16_135.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_136.getText().toString().isEmpty()) {
                        sudoku[8][8] = 0;
                    } else {
                        sudoku[8][8] = Integer.parseInt(e16_136.getText().toString());
                        e16_136.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_137.getText().toString().isEmpty()) {
                        sudoku[8][9] = 0;
                    } else {
                        sudoku[8][9] = Integer.parseInt(e16_137.getText().toString());
                        e16_137.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_138.getText().toString().isEmpty()) {
                        sudoku[8][10] = 0;
                    } else {
                        sudoku[8][10] = Integer.parseInt(e16_138.getText().toString());
                        e16_138.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_139.getText().toString().isEmpty()) {
                        sudoku[8][11] = 0;
                    } else {
                        sudoku[8][11] = Integer.parseInt(e16_139.getText().toString());
                        e16_139.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_140.getText().toString().isEmpty()) {
                        sudoku[8][12] = 0;
                    } else {
                        sudoku[8][12] = Integer.parseInt(e16_140.getText().toString());
                        e16_140.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_141.getText().toString().isEmpty()) {
                        sudoku[8][13] = 0;
                    } else {
                        sudoku[8][13] = Integer.parseInt(e16_141.getText().toString());
                        e16_141.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_142.getText().toString().isEmpty()) {
                        sudoku[8][14] = 0;
                    } else {
                        sudoku[8][14] = Integer.parseInt(e16_142.getText().toString());
                        e16_142.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_143.getText().toString().isEmpty()) {
                        sudoku[8][15] = 0;
                    } else {
                        sudoku[8][15] = Integer.parseInt(e16_143.getText().toString());
                        e16_143.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_144.getText().toString().isEmpty()) {
                        sudoku[9][0] = 0;
                    } else {
                        sudoku[9][0] = Integer.parseInt(e16_144.getText().toString());
                        e16_144.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_145.getText().toString().isEmpty()) {
                        sudoku[9][1] = 0;
                    } else {
                        sudoku[9][1] = Integer.parseInt(e16_145.getText().toString());
                        e16_145.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_146.getText().toString().isEmpty()) {
                        sudoku[9][2] = 0;
                    } else {
                        sudoku[9][2] = Integer.parseInt(e16_146.getText().toString());
                        e16_146.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_147.getText().toString().isEmpty()) {
                        sudoku[9][3] = 0;
                    } else {
                        sudoku[9][3] = Integer.parseInt(e16_147.getText().toString());
                        e16_147.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_148.getText().toString().isEmpty()) {
                        sudoku[9][4] = 0;
                    } else {
                        sudoku[9][4] = Integer.parseInt(e16_148.getText().toString());
                        e16_148.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_149.getText().toString().isEmpty()) {
                        sudoku[9][5] = 0;
                    } else {
                        sudoku[9][5] = Integer.parseInt(e16_149.getText().toString());
                        e16_149.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_150.getText().toString().isEmpty()) {
                        sudoku[9][6] = 0;
                    } else {
                        sudoku[9][6] = Integer.parseInt(e16_150.getText().toString());
                        e16_150.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_151.getText().toString().isEmpty()) {
                        sudoku[9][7] = 0;
                    } else {
                        sudoku[9][7] = Integer.parseInt(e16_151.getText().toString());
                        e16_151.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_152.getText().toString().isEmpty()) {
                        sudoku[9][8] = 0;
                    } else {
                        sudoku[9][8] = Integer.parseInt(e16_152.getText().toString());
                        e16_152.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_153.getText().toString().isEmpty()) {
                        sudoku[9][9] = 0;
                    } else {
                        sudoku[9][9] = Integer.parseInt(e16_153.getText().toString());
                        e16_153.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_154.getText().toString().isEmpty()) {
                        sudoku[9][10] = 0;
                    } else {
                        sudoku[9][10] = Integer.parseInt(e16_154.getText().toString());
                        e16_154.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_155.getText().toString().isEmpty()) {
                        sudoku[9][11] = 0;
                    } else {
                        sudoku[9][11] = Integer.parseInt(e16_155.getText().toString());
                        e16_155.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_156.getText().toString().isEmpty()) {
                        sudoku[9][12] = 0;
                    } else {
                        sudoku[9][12] = Integer.parseInt(e16_156.getText().toString());
                        e16_156.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_157.getText().toString().isEmpty()) {
                        sudoku[9][13] = 0;
                    } else {
                        sudoku[9][13] = Integer.parseInt(e16_157.getText().toString());
                        e16_157.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_158.getText().toString().isEmpty()) {
                        sudoku[9][14] = 0;
                    } else {
                        sudoku[9][14] = Integer.parseInt(e16_158.getText().toString());
                        e16_158.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_159.getText().toString().isEmpty()) {
                        sudoku[9][15] = 0;
                    } else {
                        sudoku[9][15] = Integer.parseInt(e16_159.getText().toString());
                        e16_159.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_160.getText().toString().isEmpty()) {
                        sudoku[10][0] = 0;
                    } else {
                        sudoku[10][0] = Integer.parseInt(e16_160.getText().toString());
                        e16_160.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_161.getText().toString().isEmpty()) {
                        sudoku[10][1] = 0;
                    } else {
                        sudoku[10][1] = Integer.parseInt(e16_161.getText().toString());
                        e16_161.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_162.getText().toString().isEmpty()) {
                        sudoku[10][2] = 0;
                    } else {
                        sudoku[10][2] = Integer.parseInt(e16_162.getText().toString());
                        e16_162.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_163.getText().toString().isEmpty()) {
                        sudoku[10][3] = 0;
                    } else {
                        sudoku[10][3] = Integer.parseInt(e16_163.getText().toString());
                        e16_163.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_164.getText().toString().isEmpty()) {
                        sudoku[10][4] = 0;
                    } else {
                        sudoku[10][4] = Integer.parseInt(e16_164.getText().toString());
                        e16_164.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_165.getText().toString().isEmpty()) {
                        sudoku[10][5] = 0;
                    } else {
                        sudoku[10][5] = Integer.parseInt(e16_165.getText().toString());
                        e16_165.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_166.getText().toString().isEmpty()) {
                        sudoku[10][6] = 0;
                    } else {
                        sudoku[10][6] = Integer.parseInt(e16_166.getText().toString());
                        e16_166.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_167.getText().toString().isEmpty()) {
                        sudoku[10][7] = 0;
                    } else {
                        sudoku[10][7] = Integer.parseInt(e16_167.getText().toString());
                        e16_167.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_168.getText().toString().isEmpty()) {
                        sudoku[10][8] = 0;
                    } else {
                        sudoku[10][8] = Integer.parseInt(e16_168.getText().toString());
                        e16_168.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_169.getText().toString().isEmpty()) {
                        sudoku[10][9] = 0;
                    } else {
                        sudoku[10][9] = Integer.parseInt(e16_169.getText().toString());
                        e16_169.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_170.getText().toString().isEmpty()) {
                        sudoku[10][10] = 0;
                    } else {
                        sudoku[10][10] = Integer.parseInt(e16_170.getText().toString());
                        e16_170.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_171.getText().toString().isEmpty()) {
                        sudoku[10][11] = 0;
                    } else {
                        sudoku[10][11] = Integer.parseInt(e16_171.getText().toString());
                        e16_171.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_172.getText().toString().isEmpty()) {
                        sudoku[10][12] = 0;
                    } else {
                        sudoku[10][12] = Integer.parseInt(e16_172.getText().toString());
                        e16_172.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_173.getText().toString().isEmpty()) {
                        sudoku[10][13] = 0;
                    } else {
                        sudoku[10][13] = Integer.parseInt(e16_173.getText().toString());
                        e16_173.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_174.getText().toString().isEmpty()) {
                        sudoku[10][14] = 0;
                    } else {
                        sudoku[10][14] = Integer.parseInt(e16_174.getText().toString());
                        e16_174.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_175.getText().toString().isEmpty()) {
                        sudoku[10][15] = 0;
                    } else {
                        sudoku[10][15] = Integer.parseInt(e16_175.getText().toString());
                        e16_175.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_176.getText().toString().isEmpty()) {
                        sudoku[11][0] = 0;
                    } else {
                        sudoku[11][0] = Integer.parseInt(e16_176.getText().toString());
                        e16_176.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_177.getText().toString().isEmpty()) {
                        sudoku[11][1] = 0;
                    } else {
                        sudoku[11][1] = Integer.parseInt(e16_177.getText().toString());
                        e16_177.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_178.getText().toString().isEmpty()) {
                        sudoku[11][2] = 0;
                    } else {
                        sudoku[11][2] = Integer.parseInt(e16_178.getText().toString());
                        e16_178.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_179.getText().toString().isEmpty()) {
                        sudoku[11][3] = 0;
                    } else {
                        sudoku[11][3] = Integer.parseInt(e16_179.getText().toString());
                        e16_179.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_180.getText().toString().isEmpty()) {
                        sudoku[11][4] = 0;
                    } else {
                        sudoku[11][4] = Integer.parseInt(e16_180.getText().toString());
                        e16_180.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_181.getText().toString().isEmpty()) {
                        sudoku[11][5] = 0;
                    } else {
                        sudoku[11][5] = Integer.parseInt(e16_181.getText().toString());
                        e16_181.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_182.getText().toString().isEmpty()) {
                        sudoku[11][6] = 0;
                    } else {
                        sudoku[11][6] = Integer.parseInt(e16_182.getText().toString());
                        e16_182.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_183.getText().toString().isEmpty()) {
                        sudoku[11][7] = 0;
                    } else {
                        sudoku[11][7] = Integer.parseInt(e16_183.getText().toString());
                        e16_183.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_184.getText().toString().isEmpty()) {
                        sudoku[11][8] = 0;
                    } else {
                        sudoku[11][8] = Integer.parseInt(e16_184.getText().toString());
                        e16_184.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_185.getText().toString().isEmpty()) {
                        sudoku[11][9] = 0;
                    } else {
                        sudoku[11][9] = Integer.parseInt(e16_185.getText().toString());
                        e16_185.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_186.getText().toString().isEmpty()) {
                        sudoku[11][10] = 0;
                    } else {
                        sudoku[11][10] = Integer.parseInt(e16_186.getText().toString());
                        e16_186.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_187.getText().toString().isEmpty()) {
                        sudoku[11][11] = 0;
                    } else {
                        sudoku[11][11] = Integer.parseInt(e16_187.getText().toString());
                        e16_187.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_188.getText().toString().isEmpty()) {
                        sudoku[11][12] = 0;
                    } else {
                        sudoku[11][12] = Integer.parseInt(e16_188.getText().toString());
                        e16_188.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_189.getText().toString().isEmpty()) {
                        sudoku[11][13] = 0;
                    } else {
                        sudoku[11][13] = Integer.parseInt(e16_189.getText().toString());
                        e16_189.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_190.getText().toString().isEmpty()) {
                        sudoku[11][14] = 0;
                    } else {
                        sudoku[11][14] = Integer.parseInt(e16_190.getText().toString());
                        e16_190.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_191.getText().toString().isEmpty()) {
                        sudoku[11][15] = 0;
                    } else {
                        sudoku[11][15] = Integer.parseInt(e16_191.getText().toString());
                        e16_191.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_192.getText().toString().isEmpty()) {
                        sudoku[12][0] = 0;
                    } else {
                        sudoku[12][0] = Integer.parseInt(e16_192.getText().toString());
                        e16_192.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_193.getText().toString().isEmpty()) {
                        sudoku[12][1] = 0;
                    } else {
                        sudoku[12][1] = Integer.parseInt(e16_193.getText().toString());
                        e16_193.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_194.getText().toString().isEmpty()) {
                        sudoku[12][2] = 0;
                    } else {
                        sudoku[12][2] = Integer.parseInt(e16_194.getText().toString());
                        e16_194.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_195.getText().toString().isEmpty()) {
                        sudoku[12][3] = 0;
                    } else {
                        sudoku[12][3] = Integer.parseInt(e16_195.getText().toString());
                        e16_195.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_196.getText().toString().isEmpty()) {
                        sudoku[12][4] = 0;
                    } else {
                        sudoku[12][4] = Integer.parseInt(e16_196.getText().toString());
                        e16_196.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_197.getText().toString().isEmpty()) {
                        sudoku[12][5] = 0;
                    } else {
                        sudoku[12][5] = Integer.parseInt(e16_197.getText().toString());
                        e16_197.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_198.getText().toString().isEmpty()) {
                        sudoku[12][6] = 0;
                    } else {
                        sudoku[12][6] = Integer.parseInt(e16_198.getText().toString());
                        e16_198.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_199.getText().toString().isEmpty()) {
                        sudoku[12][7] = 0;
                    } else {
                        sudoku[12][7] = Integer.parseInt(e16_199.getText().toString());
                        e16_199.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_200.getText().toString().isEmpty()) {
                        sudoku[12][8] = 0;
                    } else {
                        sudoku[12][8] = Integer.parseInt(e16_200.getText().toString());
                        e16_200.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_201.getText().toString().isEmpty()) {
                        sudoku[12][9] = 0;
                    } else {
                        sudoku[12][9] = Integer.parseInt(e16_201.getText().toString());
                        e16_201.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_202.getText().toString().isEmpty()) {
                        sudoku[12][10] = 0;
                    } else {
                        sudoku[12][10] = Integer.parseInt(e16_202.getText().toString());
                        e16_202.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_203.getText().toString().isEmpty()) {
                        sudoku[12][11] = 0;
                    } else {
                        sudoku[12][11] = Integer.parseInt(e16_203.getText().toString());
                        e16_203.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_204.getText().toString().isEmpty()) {
                        sudoku[12][12] = 0;
                    } else {
                        sudoku[12][12] = Integer.parseInt(e16_204.getText().toString());
                        e16_204.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_205.getText().toString().isEmpty()) {
                        sudoku[12][13] = 0;
                    } else {
                        sudoku[12][13] = Integer.parseInt(e16_205.getText().toString());
                        e16_205.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_206.getText().toString().isEmpty()) {
                        sudoku[12][14] = 0;
                    } else {
                        sudoku[12][14] = Integer.parseInt(e16_206.getText().toString());
                        e16_206.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_207.getText().toString().isEmpty()) {
                        sudoku[12][15] = 0;
                    } else {
                        sudoku[12][15] = Integer.parseInt(e16_207.getText().toString());
                        e16_207.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_208.getText().toString().isEmpty()) {
                        sudoku[13][0] = 0;
                    } else {
                        sudoku[13][0] = Integer.parseInt(e16_208.getText().toString());
                        e16_208.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_209.getText().toString().isEmpty()) {
                        sudoku[13][1] = 0;
                    } else {
                        sudoku[13][1] = Integer.parseInt(e16_209.getText().toString());
                        e16_209.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_210.getText().toString().isEmpty()) {
                        sudoku[13][2] = 0;
                    } else {
                        sudoku[13][2] = Integer.parseInt(e16_210.getText().toString());
                        e16_210.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_211.getText().toString().isEmpty()) {
                        sudoku[13][3] = 0;
                    } else {
                        sudoku[13][3] = Integer.parseInt(e16_211.getText().toString());
                        e16_211.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_212.getText().toString().isEmpty()) {
                        sudoku[13][4] = 0;
                    } else {
                        sudoku[13][4] = Integer.parseInt(e16_212.getText().toString());
                        e16_212.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_213.getText().toString().isEmpty()) {
                        sudoku[13][5] = 0;
                    } else {
                        sudoku[13][5] = Integer.parseInt(e16_213.getText().toString());
                        e16_213.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_214.getText().toString().isEmpty()) {
                        sudoku[13][6] = 0;
                    } else {
                        sudoku[13][6] = Integer.parseInt(e16_214.getText().toString());
                        e16_214.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_215.getText().toString().isEmpty()) {
                        sudoku[13][7] = 0;
                    } else {
                        sudoku[13][7] = Integer.parseInt(e16_215.getText().toString());
                        e16_215.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_216.getText().toString().isEmpty()) {
                        sudoku[13][8] = 0;
                    } else {
                        sudoku[13][8] = Integer.parseInt(e16_216.getText().toString());
                        e16_216.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_217.getText().toString().isEmpty()) {
                        sudoku[13][9] = 0;
                    } else {
                        sudoku[13][9] = Integer.parseInt(e16_217.getText().toString());
                        e16_217.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_218.getText().toString().isEmpty()) {
                        sudoku[13][10] = 0;
                    } else {
                        sudoku[13][10] = Integer.parseInt(e16_218.getText().toString());
                        e16_218.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_219.getText().toString().isEmpty()) {
                        sudoku[13][11] = 0;
                    } else {
                        sudoku[13][11] = Integer.parseInt(e16_219.getText().toString());
                        e16_219.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_220.getText().toString().isEmpty()) {
                        sudoku[13][12] = 0;
                    } else {
                        sudoku[13][12] = Integer.parseInt(e16_220.getText().toString());
                        e16_220.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_221.getText().toString().isEmpty()) {
                        sudoku[13][13] = 0;
                    } else {
                        sudoku[13][13] = Integer.parseInt(e16_221.getText().toString());
                        e16_221.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_222.getText().toString().isEmpty()) {
                        sudoku[13][14] = 0;
                    } else {
                        sudoku[13][14] = Integer.parseInt(e16_222.getText().toString());
                        e16_222.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_223.getText().toString().isEmpty()) {
                        sudoku[13][15] = 0;
                    } else {
                        sudoku[13][15] = Integer.parseInt(e16_223.getText().toString());
                        e16_223.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_224.getText().toString().isEmpty()) {
                        sudoku[14][0] = 0;
                    } else {
                        sudoku[14][0] = Integer.parseInt(e16_224.getText().toString());
                        e16_224.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_225.getText().toString().isEmpty()) {
                        sudoku[14][1] = 0;
                    } else {
                        sudoku[14][1] = Integer.parseInt(e16_225.getText().toString());
                        e16_225.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_226.getText().toString().isEmpty()) {
                        sudoku[14][2] = 0;
                    } else {
                        sudoku[14][2] = Integer.parseInt(e16_226.getText().toString());
                        e16_226.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_227.getText().toString().isEmpty()) {
                        sudoku[14][3] = 0;
                    } else {
                        sudoku[14][3] = Integer.parseInt(e16_227.getText().toString());
                        e16_227.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_228.getText().toString().isEmpty()) {
                        sudoku[14][4] = 0;
                    } else {
                        sudoku[14][4] = Integer.parseInt(e16_228.getText().toString());
                        e16_228.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_229.getText().toString().isEmpty()) {
                        sudoku[14][5] = 0;
                    } else {
                        sudoku[14][5] = Integer.parseInt(e16_229.getText().toString());
                        e16_229.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_230.getText().toString().isEmpty()) {
                        sudoku[14][6] = 0;
                    } else {
                        sudoku[14][6] = Integer.parseInt(e16_230.getText().toString());
                        e16_230.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_231.getText().toString().isEmpty()) {
                        sudoku[14][7] = 0;
                    } else {
                        sudoku[14][7] = Integer.parseInt(e16_231.getText().toString());
                        e16_231.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_232.getText().toString().isEmpty()) {
                        sudoku[14][8] = 0;
                    } else {
                        sudoku[14][8] = Integer.parseInt(e16_232.getText().toString());
                        e16_232.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_233.getText().toString().isEmpty()) {
                        sudoku[14][9] = 0;
                    } else {
                        sudoku[14][9] = Integer.parseInt(e16_233.getText().toString());
                        e16_233.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_234.getText().toString().isEmpty()) {
                        sudoku[14][10] = 0;
                    } else {
                        sudoku[14][10] = Integer.parseInt(e16_234.getText().toString());
                        e16_234.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_235.getText().toString().isEmpty()) {
                        sudoku[14][11] = 0;
                    } else {
                        sudoku[14][11] = Integer.parseInt(e16_235.getText().toString());
                        e16_235.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_236.getText().toString().isEmpty()) {
                        sudoku[14][12] = 0;
                    } else {
                        sudoku[14][12] = Integer.parseInt(e16_236.getText().toString());
                        e16_236.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_237.getText().toString().isEmpty()) {
                        sudoku[14][13] = 0;
                    } else {
                        sudoku[14][13] = Integer.parseInt(e16_237.getText().toString());
                        e16_237.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_238.getText().toString().isEmpty()) {
                        sudoku[14][14] = 0;
                    } else {
                        sudoku[14][14] = Integer.parseInt(e16_238.getText().toString());
                        e16_238.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_239.getText().toString().isEmpty()) {
                        sudoku[14][15] = 0;
                    } else {
                        sudoku[14][15] = Integer.parseInt(e16_239.getText().toString());
                        e16_239.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_240.getText().toString().isEmpty()) {
                        sudoku[15][0] = 0;
                    } else {
                        sudoku[15][0] = Integer.parseInt(e16_240.getText().toString());
                        e16_240.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_241.getText().toString().isEmpty()) {
                        sudoku[15][1] = 0;
                    } else {
                        sudoku[15][1] = Integer.parseInt(e16_241.getText().toString());
                        e16_241.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_242.getText().toString().isEmpty()) {
                        sudoku[15][2] = 0;
                    } else {
                        sudoku[15][2] = Integer.parseInt(e16_242.getText().toString());
                        e16_242.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_243.getText().toString().isEmpty()) {
                        sudoku[15][3] = 0;
                    } else {
                        sudoku[15][3] = Integer.parseInt(e16_243.getText().toString());
                        e16_243.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_244.getText().toString().isEmpty()) {
                        sudoku[15][4] = 0;
                    } else {
                        sudoku[15][4] = Integer.parseInt(e16_244.getText().toString());
                        e16_244.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_245.getText().toString().isEmpty()) {
                        sudoku[15][5] = 0;
                    } else {
                        sudoku[15][5] = Integer.parseInt(e16_245.getText().toString());
                        e16_245.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_246.getText().toString().isEmpty()) {
                        sudoku[15][6] = 0;
                    } else {
                        sudoku[15][6] = Integer.parseInt(e16_246.getText().toString());
                        e16_246.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_247.getText().toString().isEmpty()) {
                        sudoku[15][7] = 0;
                    } else {
                        sudoku[15][7] = Integer.parseInt(e16_247.getText().toString());
                        e16_247.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_248.getText().toString().isEmpty()) {
                        sudoku[15][8] = 0;
                    } else {
                        sudoku[15][8] = Integer.parseInt(e16_248.getText().toString());
                        e16_248.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_249.getText().toString().isEmpty()) {
                        sudoku[15][9] = 0;
                    } else {
                        sudoku[15][9] = Integer.parseInt(e16_249.getText().toString());
                        e16_249.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_250.getText().toString().isEmpty()) {
                        sudoku[15][10] = 0;
                    } else {
                        sudoku[15][10] = Integer.parseInt(e16_250.getText().toString());
                        e16_250.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_251.getText().toString().isEmpty()) {
                        sudoku[15][11] = 0;
                    } else {
                        sudoku[15][11] = Integer.parseInt(e16_251.getText().toString());
                        e16_251.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_252.getText().toString().isEmpty()) {
                        sudoku[15][12] = 0;
                    } else {
                        sudoku[15][12] = Integer.parseInt(e16_252.getText().toString());
                        e16_252.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_253.getText().toString().isEmpty()) {
                        sudoku[15][13] = 0;
                    } else {
                        sudoku[15][13] = Integer.parseInt(e16_253.getText().toString());
                        e16_253.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_254.getText().toString().isEmpty()) {
                        sudoku[15][14] = 0;
                    } else {
                        sudoku[15][14] = Integer.parseInt(e16_254.getText().toString());
                        e16_254.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                    if (e16_255.getText().toString().isEmpty()) {
                        sudoku[15][15] = 0;
                    } else {
                        sudoku[15][15] = Integer.parseInt(e16_255.getText().toString());
                        e16_255.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.filledblock));
                    }
                }
                outer:for(int i=0;i<16;i++)
                {
                    for(int j=0;j<16;j++)
                    {
                        if(sudoku[i][j]>16)
                        {
                            numbergreater=true;
                            break outer;
                        }
                    }
                }
                //start to solve
                if (checkinitialsudoku() == true&&numbergreater==false) {
                    countemptyspaces();
                    fillemptyspaces();
                    e16_0.setText("" + sudoku[0][0]);
                    e16_1.setText("" + sudoku[0][1]);
                    e16_2.setText("" + sudoku[0][2]);
                    e16_3.setText("" + sudoku[0][3]);
                    e16_4.setText("" + sudoku[0][4]);
                    e16_5.setText("" + sudoku[0][5]);
                    e16_6.setText("" + sudoku[0][6]);
                    e16_7.setText("" + sudoku[0][7]);
                    e16_8.setText("" + sudoku[0][8]);
                    e16_9.setText("" + sudoku[0][9]);
                    e16_10.setText("" + sudoku[0][10]);
                    e16_11.setText("" + sudoku[0][11]);
                    e16_12.setText("" + sudoku[0][12]);
                    e16_13.setText("" + sudoku[0][13]);
                    e16_14.setText("" + sudoku[0][14]);
                    e16_15.setText("" + sudoku[0][15]);
                    e16_16.setText("" + sudoku[1][0]);
                    e16_17.setText("" + sudoku[1][1]);
                    e16_18.setText("" + sudoku[1][2]);
                    e16_19.setText("" + sudoku[1][3]);
                    e16_20.setText("" + sudoku[1][4]);
                    e16_21.setText("" + sudoku[1][5]);
                    e16_22.setText("" + sudoku[1][6]);
                    e16_23.setText("" + sudoku[1][7]);
                    e16_24.setText("" + sudoku[1][8]);
                    e16_25.setText("" + sudoku[1][9]);
                    e16_26.setText("" + sudoku[1][10]);
                    e16_27.setText("" + sudoku[1][11]);
                    e16_28.setText("" + sudoku[1][12]);
                    e16_29.setText("" + sudoku[1][13]);
                    e16_30.setText("" + sudoku[1][14]);
                    e16_31.setText("" + sudoku[1][15]);
                    e16_32.setText("" + sudoku[2][0]);
                    e16_33.setText("" + sudoku[2][1]);
                    e16_34.setText("" + sudoku[2][2]);
                    e16_35.setText("" + sudoku[2][3]);
                    e16_36.setText("" + sudoku[2][4]);
                    e16_37.setText("" + sudoku[2][5]);
                    e16_38.setText("" + sudoku[2][6]);
                    e16_39.setText("" + sudoku[2][7]);
                    e16_40.setText("" + sudoku[2][8]);
                    e16_41.setText("" + sudoku[2][9]);
                    e16_42.setText("" + sudoku[2][10]);
                    e16_43.setText("" + sudoku[2][11]);
                    e16_44.setText("" + sudoku[2][12]);
                    e16_45.setText("" + sudoku[2][13]);
                    e16_46.setText("" + sudoku[2][14]);
                    e16_47.setText("" + sudoku[2][15]);
                    e16_48.setText("" + sudoku[3][0]);
                    e16_49.setText("" + sudoku[3][1]);
                    e16_50.setText("" + sudoku[3][2]);
                    e16_51.setText("" + sudoku[3][3]);
                    e16_52.setText("" + sudoku[3][4]);
                    e16_53.setText("" + sudoku[3][5]);
                    e16_54.setText("" + sudoku[3][6]);
                    e16_55.setText("" + sudoku[3][7]);
                    e16_56.setText("" + sudoku[3][8]);
                    e16_57.setText("" + sudoku[3][9]);
                    e16_58.setText("" + sudoku[3][10]);
                    e16_59.setText("" + sudoku[3][11]);
                    e16_60.setText("" + sudoku[3][12]);
                    e16_61.setText("" + sudoku[3][13]);
                    e16_62.setText("" + sudoku[3][14]);
                    e16_63.setText("" + sudoku[3][15]);
                    e16_64.setText("" + sudoku[4][0]);
                    e16_65.setText("" + sudoku[4][1]);
                    e16_66.setText("" + sudoku[4][2]);
                    e16_67.setText("" + sudoku[4][3]);
                    e16_68.setText("" + sudoku[4][4]);
                    e16_69.setText("" + sudoku[4][5]);
                    e16_70.setText("" + sudoku[4][6]);
                    e16_71.setText("" + sudoku[4][7]);
                    e16_72.setText("" + sudoku[4][8]);
                    e16_73.setText("" + sudoku[4][9]);
                    e16_74.setText("" + sudoku[4][10]);
                    e16_75.setText("" + sudoku[4][11]);
                    e16_76.setText("" + sudoku[4][12]);
                    e16_77.setText("" + sudoku[4][13]);
                    e16_78.setText("" + sudoku[4][14]);
                    e16_79.setText("" + sudoku[4][15]);
                    e16_80.setText("" + sudoku[5][0]);
                    e16_81.setText("" + sudoku[5][1]);
                    e16_82.setText("" + sudoku[5][2]);
                    e16_83.setText("" + sudoku[5][3]);
                    e16_84.setText("" + sudoku[5][4]);
                    e16_85.setText("" + sudoku[5][5]);
                    e16_86.setText("" + sudoku[5][6]);
                    e16_87.setText("" + sudoku[5][7]);
                    e16_88.setText("" + sudoku[5][8]);
                    e16_89.setText("" + sudoku[5][9]);
                    e16_90.setText("" + sudoku[5][10]);
                    e16_91.setText("" + sudoku[5][11]);
                    e16_92.setText("" + sudoku[5][12]);
                    e16_93.setText("" + sudoku[5][13]);
                    e16_94.setText("" + sudoku[5][14]);
                    e16_95.setText("" + sudoku[5][15]);
                    e16_96.setText("" + sudoku[6][0]);
                    e16_97.setText("" + sudoku[6][1]);
                    e16_98.setText("" + sudoku[6][2]);
                    e16_99.setText("" + sudoku[6][3]);
                    e16_100.setText("" + sudoku[6][4]);
                    e16_101.setText("" + sudoku[6][5]);
                    e16_102.setText("" + sudoku[6][6]);
                    e16_103.setText("" + sudoku[6][7]);
                    e16_104.setText("" + sudoku[6][8]);
                    e16_105.setText("" + sudoku[6][9]);
                    e16_106.setText("" + sudoku[6][10]);
                    e16_107.setText("" + sudoku[6][11]);
                    e16_108.setText("" + sudoku[6][12]);
                    e16_109.setText("" + sudoku[6][13]);
                    e16_110.setText("" + sudoku[6][14]);
                    e16_111.setText("" + sudoku[6][15]);
                    e16_112.setText("" + sudoku[7][0]);
                    e16_113.setText("" + sudoku[7][1]);
                    e16_114.setText("" + sudoku[7][2]);
                    e16_115.setText("" + sudoku[7][3]);
                    e16_116.setText("" + sudoku[7][4]);
                    e16_117.setText("" + sudoku[7][5]);
                    e16_118.setText("" + sudoku[7][6]);
                    e16_119.setText("" + sudoku[7][7]);
                    e16_120.setText("" + sudoku[7][8]);
                    e16_121.setText("" + sudoku[7][9]);
                    e16_122.setText("" + sudoku[7][10]);
                    e16_123.setText("" + sudoku[7][11]);
                    e16_124.setText("" + sudoku[7][12]);
                    e16_125.setText("" + sudoku[7][13]);
                    e16_126.setText("" + sudoku[7][14]);
                    e16_127.setText("" + sudoku[7][15]);
                    e16_128.setText("" + sudoku[8][0]);
                    e16_129.setText("" + sudoku[8][1]);
                    e16_130.setText("" + sudoku[8][2]);
                    e16_131.setText("" + sudoku[8][3]);
                    e16_132.setText("" + sudoku[8][4]);
                    e16_133.setText("" + sudoku[8][5]);
                    e16_134.setText("" + sudoku[8][6]);
                    e16_135.setText("" + sudoku[8][7]);
                    e16_136.setText("" + sudoku[8][8]);
                    e16_137.setText("" + sudoku[8][9]);
                    e16_138.setText("" + sudoku[8][10]);
                    e16_139.setText("" + sudoku[8][11]);
                    e16_140.setText("" + sudoku[8][12]);
                    e16_141.setText("" + sudoku[8][13]);
                    e16_142.setText("" + sudoku[8][14]);
                    e16_143.setText("" + sudoku[8][15]);
                    e16_144.setText("" + sudoku[9][0]);
                    e16_145.setText("" + sudoku[9][1]);
                    e16_146.setText("" + sudoku[9][2]);
                    e16_147.setText("" + sudoku[9][3]);
                    e16_148.setText("" + sudoku[9][4]);
                    e16_149.setText("" + sudoku[9][5]);
                    e16_150.setText("" + sudoku[9][6]);
                    e16_151.setText("" + sudoku[9][7]);
                    e16_152.setText("" + sudoku[9][8]);
                    e16_153.setText("" + sudoku[9][9]);
                    e16_154.setText("" + sudoku[9][10]);
                    e16_155.setText("" + sudoku[9][11]);
                    e16_156.setText("" + sudoku[9][12]);
                    e16_157.setText("" + sudoku[9][13]);
                    e16_158.setText("" + sudoku[9][14]);
                    e16_159.setText("" + sudoku[9][15]);
                    e16_160.setText("" + sudoku[10][0]);
                    e16_161.setText("" + sudoku[10][1]);
                    e16_162.setText("" + sudoku[10][2]);
                    e16_163.setText("" + sudoku[10][3]);
                    e16_164.setText("" + sudoku[10][4]);
                    e16_165.setText("" + sudoku[10][5]);
                    e16_166.setText("" + sudoku[10][6]);
                    e16_167.setText("" + sudoku[10][7]);
                    e16_168.setText("" + sudoku[10][8]);
                    e16_169.setText("" + sudoku[10][9]);
                    e16_170.setText("" + sudoku[10][10]);
                    e16_171.setText("" + sudoku[10][11]);
                    e16_172.setText("" + sudoku[10][12]);
                    e16_173.setText("" + sudoku[10][13]);
                    e16_174.setText("" + sudoku[10][14]);
                    e16_175.setText("" + sudoku[10][15]);
                    e16_176.setText("" + sudoku[11][0]);
                    e16_177.setText("" + sudoku[11][1]);
                    e16_178.setText("" + sudoku[11][2]);
                    e16_179.setText("" + sudoku[11][3]);
                    e16_180.setText("" + sudoku[11][4]);
                    e16_181.setText("" + sudoku[11][5]);
                    e16_182.setText("" + sudoku[11][6]);
                    e16_183.setText("" + sudoku[11][7]);
                    e16_184.setText("" + sudoku[11][8]);
                    e16_185.setText("" + sudoku[11][9]);
                    e16_186.setText("" + sudoku[11][10]);
                    e16_187.setText("" + sudoku[11][11]);
                    e16_188.setText("" + sudoku[11][12]);
                    e16_189.setText("" + sudoku[11][13]);
                    e16_190.setText("" + sudoku[11][14]);
                    e16_191.setText("" + sudoku[11][15]);
                    e16_192.setText("" + sudoku[12][0]);
                    e16_193.setText("" + sudoku[12][1]);
                    e16_194.setText("" + sudoku[12][2]);
                    e16_195.setText("" + sudoku[12][3]);
                    e16_196.setText("" + sudoku[12][4]);
                    e16_197.setText("" + sudoku[12][5]);
                    e16_198.setText("" + sudoku[12][6]);
                    e16_199.setText("" + sudoku[12][7]);
                    e16_200.setText("" + sudoku[12][8]);
                    e16_201.setText("" + sudoku[12][9]);
                    e16_202.setText("" + sudoku[12][10]);
                    e16_203.setText("" + sudoku[12][11]);
                    e16_204.setText("" + sudoku[12][12]);
                    e16_205.setText("" + sudoku[12][13]);
                    e16_206.setText("" + sudoku[12][14]);
                    e16_207.setText("" + sudoku[12][15]);
                    e16_208.setText("" + sudoku[13][0]);
                    e16_209.setText("" + sudoku[13][1]);
                    e16_210.setText("" + sudoku[13][2]);
                    e16_211.setText("" + sudoku[13][3]);
                    e16_212.setText("" + sudoku[13][4]);
                    e16_213.setText("" + sudoku[13][5]);
                    e16_214.setText("" + sudoku[13][6]);
                    e16_215.setText("" + sudoku[13][7]);
                    e16_216.setText("" + sudoku[13][8]);
                    e16_217.setText("" + sudoku[13][9]);
                    e16_218.setText("" + sudoku[13][10]);
                    e16_219.setText("" + sudoku[13][11]);
                    e16_220.setText("" + sudoku[13][12]);
                    e16_221.setText("" + sudoku[13][13]);
                    e16_222.setText("" + sudoku[13][14]);
                    e16_223.setText("" + sudoku[13][15]);
                    e16_224.setText("" + sudoku[14][0]);
                    e16_225.setText("" + sudoku[14][1]);
                    e16_226.setText("" + sudoku[14][2]);
                    e16_227.setText("" + sudoku[14][3]);
                    e16_228.setText("" + sudoku[14][4]);
                    e16_229.setText("" + sudoku[14][5]);
                    e16_230.setText("" + sudoku[14][6]);
                    e16_231.setText("" + sudoku[14][7]);
                    e16_232.setText("" + sudoku[14][8]);
                    e16_233.setText("" + sudoku[14][9]);
                    e16_234.setText("" + sudoku[14][10]);
                    e16_235.setText("" + sudoku[14][11]);
                    e16_236.setText("" + sudoku[14][12]);
                    e16_237.setText("" + sudoku[14][13]);
                    e16_238.setText("" + sudoku[14][14]);
                    e16_239.setText("" + sudoku[14][15]);
                    e16_240.setText("" + sudoku[15][0]);
                    e16_241.setText("" + sudoku[15][1]);
                    e16_242.setText("" + sudoku[15][2]);
                    e16_243.setText("" + sudoku[15][3]);
                    e16_244.setText("" + sudoku[15][4]);
                    e16_245.setText("" + sudoku[15][5]);
                    e16_246.setText("" + sudoku[15][6]);
                    e16_247.setText("" + sudoku[15][7]);
                    e16_248.setText("" + sudoku[15][8]);
                    e16_249.setText("" + sudoku[15][9]);
                    e16_250.setText("" + sudoku[15][10]);
                    e16_251.setText("" + sudoku[15][11]);
                    e16_252.setText("" + sudoku[15][12]);
                    e16_253.setText("" + sudoku[15][13]);
                    e16_254.setText("" + sudoku[15][14]);
                    e16_255.setText("" + sudoku[15][15]);
                    solvebtn.setVisibility(View.INVISIBLE);
                    e16_0.setEnabled(false);
                    e16_1.setEnabled(false);
                    e16_2.setEnabled(false);
                    e16_3.setEnabled(false);
                    e16_4.setEnabled(false);
                    e16_5.setEnabled(false);
                    e16_6.setEnabled(false);
                    e16_7.setEnabled(false);
                    e16_8.setEnabled(false);
                    e16_9.setEnabled(false);
                    e16_10.setEnabled(false);
                    e16_11.setEnabled(false);
                    e16_12.setEnabled(false);
                    e16_13.setEnabled(false);
                    e16_14.setEnabled(false);
                    e16_15.setEnabled(false);
                    e16_16.setEnabled(false);
                    e16_17.setEnabled(false);
                    e16_18.setEnabled(false);
                    e16_19.setEnabled(false);
                    e16_20.setEnabled(false);
                    e16_21.setEnabled(false);
                    e16_22.setEnabled(false);
                    e16_23.setEnabled(false);
                    e16_24.setEnabled(false);
                    e16_25.setEnabled(false);
                    e16_26.setEnabled(false);
                    e16_27.setEnabled(false);
                    e16_28.setEnabled(false);
                    e16_29.setEnabled(false);
                    e16_30.setEnabled(false);
                    e16_31.setEnabled(false);
                    e16_32.setEnabled(false);
                    e16_33.setEnabled(false);
                    e16_34.setEnabled(false);
                    e16_35.setEnabled(false);
                    e16_36.setEnabled(false);
                    e16_37.setEnabled(false);
                    e16_38.setEnabled(false);
                    e16_39.setEnabled(false);
                    e16_40.setEnabled(false);
                    e16_41.setEnabled(false);
                    e16_42.setEnabled(false);
                    e16_43.setEnabled(false);
                    e16_44.setEnabled(false);
                    e16_45.setEnabled(false);
                    e16_46.setEnabled(false);
                    e16_47.setEnabled(false);
                    e16_48.setEnabled(false);
                    e16_49.setEnabled(false);
                    e16_50.setEnabled(false);
                    e16_51.setEnabled(false);
                    e16_52.setEnabled(false);
                    e16_53.setEnabled(false);
                    e16_54.setEnabled(false);
                    e16_55.setEnabled(false);
                    e16_56.setEnabled(false);
                    e16_57.setEnabled(false);
                    e16_58.setEnabled(false);
                    e16_59.setEnabled(false);
                    e16_60.setEnabled(false);
                    e16_61.setEnabled(false);
                    e16_62.setEnabled(false);
                    e16_63.setEnabled(false);
                    e16_64.setEnabled(false);
                    e16_65.setEnabled(false);
                    e16_66.setEnabled(false);
                    e16_67.setEnabled(false);
                    e16_68.setEnabled(false);
                    e16_69.setEnabled(false);
                    e16_70.setEnabled(false);
                    e16_71.setEnabled(false);
                    e16_72.setEnabled(false);
                    e16_73.setEnabled(false);
                    e16_74.setEnabled(false);
                    e16_75.setEnabled(false);
                    e16_76.setEnabled(false);
                    e16_77.setEnabled(false);
                    e16_78.setEnabled(false);
                    e16_79.setEnabled(false);
                    e16_80.setEnabled(false);
                    e16_81.setEnabled(false);
                    e16_82.setEnabled(false);
                    e16_83.setEnabled(false);
                    e16_84.setEnabled(false);
                    e16_85.setEnabled(false);
                    e16_86.setEnabled(false);
                    e16_87.setEnabled(false);
                    e16_88.setEnabled(false);
                    e16_89.setEnabled(false);
                    e16_90.setEnabled(false);
                    e16_91.setEnabled(false);
                    e16_92.setEnabled(false);
                    e16_93.setEnabled(false);
                    e16_94.setEnabled(false);
                    e16_95.setEnabled(false);
                    e16_96.setEnabled(false);
                    e16_97.setEnabled(false);
                    e16_98.setEnabled(false);
                    e16_99.setEnabled(false);
                    e16_100.setEnabled(false);
                    e16_101.setEnabled(false);
                    e16_102.setEnabled(false);
                    e16_103.setEnabled(false);
                    e16_104.setEnabled(false);
                    e16_105.setEnabled(false);
                    e16_106.setEnabled(false);
                    e16_107.setEnabled(false);
                    e16_108.setEnabled(false);
                    e16_109.setEnabled(false);
                    e16_110.setEnabled(false);
                    e16_111.setEnabled(false);
                    e16_112.setEnabled(false);
                    e16_113.setEnabled(false);
                    e16_114.setEnabled(false);
                    e16_115.setEnabled(false);
                    e16_116.setEnabled(false);
                    e16_117.setEnabled(false);
                    e16_118.setEnabled(false);
                    e16_119.setEnabled(false);
                    e16_120.setEnabled(false);
                    e16_121.setEnabled(false);
                    e16_122.setEnabled(false);
                    e16_123.setEnabled(false);
                    e16_124.setEnabled(false);
                    e16_125.setEnabled(false);
                    e16_126.setEnabled(false);
                    e16_127.setEnabled(false);
                    e16_128.setEnabled(false);
                    e16_129.setEnabled(false);
                    e16_130.setEnabled(false);
                    e16_131.setEnabled(false);
                    e16_132.setEnabled(false);
                    e16_133.setEnabled(false);
                    e16_134.setEnabled(false);
                    e16_135.setEnabled(false);
                    e16_136.setEnabled(false);
                    e16_137.setEnabled(false);
                    e16_138.setEnabled(false);
                    e16_139.setEnabled(false);
                    e16_140.setEnabled(false);
                    e16_141.setEnabled(false);
                    e16_142.setEnabled(false);
                    e16_143.setEnabled(false);
                    e16_144.setEnabled(false);
                    e16_145.setEnabled(false);
                    e16_146.setEnabled(false);
                    e16_147.setEnabled(false);
                    e16_148.setEnabled(false);
                    e16_149.setEnabled(false);
                    e16_150.setEnabled(false);
                    e16_151.setEnabled(false);
                    e16_152.setEnabled(false);
                    e16_153.setEnabled(false);
                    e16_154.setEnabled(false);
                    e16_155.setEnabled(false);
                    e16_156.setEnabled(false);
                    e16_157.setEnabled(false);
                    e16_158.setEnabled(false);
                    e16_159.setEnabled(false);
                    e16_160.setEnabled(false);
                    e16_161.setEnabled(false);
                    e16_162.setEnabled(false);
                    e16_163.setEnabled(false);
                    e16_164.setEnabled(false);
                    e16_165.setEnabled(false);
                    e16_166.setEnabled(false);
                    e16_167.setEnabled(false);
                    e16_168.setEnabled(false);
                    e16_169.setEnabled(false);
                    e16_170.setEnabled(false);
                    e16_171.setEnabled(false);
                    e16_172.setEnabled(false);
                    e16_173.setEnabled(false);
                    e16_174.setEnabled(false);
                    e16_175.setEnabled(false);
                    e16_176.setEnabled(false);
                    e16_177.setEnabled(false);
                    e16_178.setEnabled(false);
                    e16_179.setEnabled(false);
                    e16_180.setEnabled(false);
                    e16_181.setEnabled(false);
                    e16_182.setEnabled(false);
                    e16_183.setEnabled(false);
                    e16_184.setEnabled(false);
                    e16_185.setEnabled(false);
                    e16_186.setEnabled(false);
                    e16_187.setEnabled(false);
                    e16_188.setEnabled(false);
                    e16_189.setEnabled(false);
                    e16_190.setEnabled(false);
                    e16_191.setEnabled(false);
                    e16_192.setEnabled(false);
                    e16_193.setEnabled(false);
                    e16_194.setEnabled(false);
                    e16_195.setEnabled(false);
                    e16_196.setEnabled(false);
                    e16_197.setEnabled(false);
                    e16_198.setEnabled(false);
                    e16_199.setEnabled(false);
                    e16_200.setEnabled(false);
                    e16_201.setEnabled(false);
                    e16_202.setEnabled(false);
                    e16_203.setEnabled(false);
                    e16_204.setEnabled(false);
                    e16_205.setEnabled(false);
                    e16_206.setEnabled(false);
                    e16_207.setEnabled(false);
                    e16_208.setEnabled(false);
                    e16_209.setEnabled(false);
                    e16_210.setEnabled(false);
                    e16_211.setEnabled(false);
                    e16_212.setEnabled(false);
                    e16_213.setEnabled(false);
                    e16_214.setEnabled(false);
                    e16_215.setEnabled(false);
                    e16_216.setEnabled(false);
                    e16_217.setEnabled(false);
                    e16_218.setEnabled(false);
                    e16_219.setEnabled(false);
                    e16_220.setEnabled(false);
                    e16_221.setEnabled(false);
                    e16_222.setEnabled(false);
                    e16_223.setEnabled(false);
                    e16_224.setEnabled(false);
                    e16_225.setEnabled(false);
                    e16_226.setEnabled(false);
                    e16_227.setEnabled(false);
                    e16_228.setEnabled(false);
                    e16_229.setEnabled(false);
                    e16_230.setEnabled(false);
                    e16_231.setEnabled(false);
                    e16_232.setEnabled(false);
                    e16_233.setEnabled(false);
                    e16_234.setEnabled(false);
                    e16_235.setEnabled(false);
                    e16_236.setEnabled(false);
                    e16_237.setEnabled(false);
                    e16_238.setEnabled(false);
                    e16_239.setEnabled(false);
                    e16_240.setEnabled(false);
                    e16_241.setEnabled(false);
                    e16_242.setEnabled(false);
                    e16_243.setEnabled(false);
                    e16_244.setEnabled(false);
                    e16_245.setEnabled(false);
                    e16_246.setEnabled(false);
                    e16_247.setEnabled(false);
                    e16_248.setEnabled(false);
                    e16_249.setEnabled(false);
                    e16_250.setEnabled(false);
                    e16_251.setEnabled(false);
                    e16_252.setEnabled(false);
                    e16_253.setEnabled(false);
                    e16_254.setEnabled(false);
                    e16_255.setEnabled(false);
                    sudokusolved.setText("SUDOKU SOLVED!!!");
                    showKonfetti();
                }
                else
                {
                    point = 0;
                    numbergreater = false;
                    correct=true;
                    Toast.makeText(getApplicationContext(),
                            "Sudoku entered is invalid !!",
                            Toast.LENGTH_SHORT).show();
                    e16_0.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_1.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_2.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_3.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_4.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_5.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_6.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_7.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_8.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_9.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_10.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_11.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_12.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_13.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_14.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_15.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_16.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_17.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_18.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_19.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_20.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_21.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_22.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_23.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_24.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_25.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_26.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_27.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_28.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_29.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_30.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_31.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_32.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_33.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_34.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_35.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_36.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_37.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_38.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_39.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_40.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_41.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_42.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_43.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_44.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_45.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_46.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_47.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_48.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_49.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_50.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_51.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_52.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_53.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_54.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_55.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_56.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_57.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_58.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_59.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_60.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_61.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_62.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_63.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_64.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_65.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_66.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_67.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_68.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_69.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_70.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_71.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_72.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_73.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_74.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_75.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_76.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_77.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_78.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_79.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_80.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_81.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_82.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_83.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_84.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_85.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_86.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_87.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_88.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_89.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_90.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_91.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_92.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_93.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_94.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_95.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_96.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_97.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_98.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_99.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_100.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_101.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_102.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_103.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_104.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_105.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_106.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_107.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_108.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_109.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_110.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_111.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_112.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_113.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_114.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_115.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_116.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_117.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_118.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_119.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_120.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_121.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_122.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_123.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_124.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_125.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_126.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_127.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_128.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_129.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_130.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_131.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_132.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_133.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_134.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_135.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_136.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_137.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_138.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_139.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_140.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_141.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_142.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_143.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_144.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_145.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_146.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_147.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_148.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_149.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_150.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_151.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_152.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_153.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_154.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_155.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_156.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_157.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_158.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_159.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_160.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_161.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_162.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_163.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_164.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_165.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_166.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_167.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_168.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_169.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_170.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_171.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_172.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_173.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_174.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_175.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_176.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_177.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_178.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_179.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_180.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_181.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_182.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_183.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_184.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_185.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_186.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_187.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_188.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_189.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_190.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_191.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_192.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_193.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_194.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_195.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_196.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_197.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_198.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_199.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_200.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_201.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_202.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_203.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_204.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_205.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_206.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_207.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_208.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_209.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_210.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_211.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_212.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_213.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_214.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_215.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_216.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_217.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_218.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_219.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_220.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_221.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_222.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_223.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_224.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_225.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_226.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_227.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_228.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_229.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_230.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_231.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_232.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_233.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_234.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_235.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_236.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_237.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_238.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_239.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_240.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_241.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_242.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_243.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_244.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_245.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_246.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_247.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_248.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_249.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_250.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_251.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_252.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_253.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_254.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                    e16_255.setBackground(ContextCompat.getDrawable(getApplicationContext(),R.drawable.eachbox));
                }
            }
        });
    }

    void showKonfetti() {
        CommonConfetti.rainingConfetti(konfettiView, new int[]{Color.BLACK, Color.RED, Color.BLUE,
                Color.WHITE, Color.GREEN, Color.YELLOW})
                .stream(3000).setVelocityY(600);

    }
    void countemptyspaces()
    {
        for(int i=0;i<16;i++)
        {
            for(int j=0;j<16;j++)
            {
                if(sudoku[i][j]==0)
                {
                    b[point]= new BoxInfo();
                    b[point].rowno=i;
                    b[point].coloumnno=j;
                    point++;
                }
            }
        }
    }
    void fillemptyspaces()
    {
        for(int i=0;i<point;i++)
        {
            if(i<0)
            {
                correct=false;
                break;
            }
            if(sudoku[b[i].rowno][b[i].coloumnno]==16)
            {
                sudoku[b[i].rowno][b[i].coloumnno]=0;
                i-=2;
            }
            else
            {
                for(int randomno=sudoku[b[i].rowno][b[i].coloumnno]+1;randomno<=16;randomno++)
                {
                    if(checkrow(randomno,b[i].rowno)==0&&checkcoloumn(randomno,b[i].coloumnno)==0&&(checkbox(randomno,b[i].rowno,b[i].coloumnno)==0))
                    {
                        sudoku[b[i].rowno][b[i].coloumnno]=randomno;
                        break;
                    }
                    if(randomno==16)
                    {
                        sudoku[b[i].rowno][b[i].coloumnno]=0;
                        i-=2;
                    }

                }
            }
        }
    }
    int checkrow(int number,int row)
    {
        int f=0;
        for(int i=0;i<16;i++)
        {
            if(sudoku[row][i]==number)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            return 1;
        }
        else
            return 0;
    }
    int checkcoloumn(int number,int coloumn)
    {
        int f=0;
        for(int i=0;i<16;i++)
        {
            if(sudoku[i][coloumn]==number)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        {
            return 1;
        }
        else
            return 0;
    }
    int checkbox(int number,int rown,int coloumn)
    {
        int f=0;
        for(int i=(rown/4)*4;i<(rown/4)*4+4;i++)
        {
            for(int j=(coloumn/4)*4;j<(coloumn/4)*4+4;j++)
            {
                if(sudoku[i][j]==number)
                {
                    f=1;
                    break;
                }
            }
        }
        if(f==1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    int initialcheckrow(int number,int row)
    {
        int sum=0;
        for(int i=0;i<16;i++)
        {
            if(sudoku[row][i]==number)
            {
                sum++;
            }
        }
        if(sum>1)
        {
            return 1;
        }
        else
            return 0;
    }
    int initialcheckcoloumn(int number,int coloumn)
    {
        int sum=0;
        for(int i=0;i<16;i++)
        {
            if(sudoku[i][coloumn]==number)
            {
                sum++;
            }
        }
        if(sum>1)
        {
            return 1;
        }
        else
            return 0;
    }
    int initialcheckbox(int number,int rown,int coloumn)
    {
        int sum=0;
        for(int i=(rown/4)*4;i<(rown/4)*4+4;i++)
        {
            for(int j=(coloumn/4)*4;j<(coloumn/4)*4+4;j++)
            {
                if(sudoku[i][j]==number)
                {
                    sum++;
                }
            }
        }
        if(sum>1)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    boolean checkinitialsudoku()
    {
        outer:for(int k=1;k<=16;k++)
        {
            for(int i=0;i<16;i++)
            {
                for(int j=0;j<16;j++)
                {
                    if((sudoku[i][j]!=0)&&((initialcheckrow(k,i)==1)||(initialcheckcoloumn(k,j)==1)||(initialcheckbox(k,i,j)==1)))
                    {
                        correct = false;
                        break outer;
                    }
                }
            }
        }
        return correct;
    }
}

