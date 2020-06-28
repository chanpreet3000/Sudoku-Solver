package com.example.sudokusolver.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.Toast;

import com.example.sudokusolver.Utilities.AppPreference;
import com.example.sudokusolver.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn4 = findViewById(R.id.btn4);
        Button btn6 = findViewById(R.id.btn6);
        Button btn9 = findViewById(R.id.btn9);
        Button btn16 = findViewById(R.id.btn16);
        Animation mmbtn4 = AnimationUtils.loadAnimation(this, R.anim.lefttoright4);
        Animation mmbtn6 = AnimationUtils.loadAnimation(this, R.anim.righttoleft6);
        Animation mmbtn9 = AnimationUtils.loadAnimation(this, R.anim.lefttoright9);
        Animation mmbtn16 = AnimationUtils.loadAnimation(this, R.anim.righttoleft16);
        btn4.startAnimation(mmbtn4);
        btn6.startAnimation(mmbtn6);
        btn9.startAnimation(mmbtn9);
        btn16.startAnimation(mmbtn16);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Intent = new Intent(MainActivity.this, Activity4.class);
                startActivity(Intent);
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (AppPreference.getInstance().getIs4X4()) {
                    Intent Intent = new Intent(MainActivity.this, Activity6.class);
                    startActivity(Intent);
                } else
                    Toast.makeText(getApplicationContext(),
                            "First Use 4X4 ",
                            Toast.LENGTH_SHORT).show();
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (AppPreference.getInstance().getIs6x6()) {
                    Intent Intent = new Intent(MainActivity.this, Activity9.class);
                    startActivity(Intent);
                } else
                    Toast.makeText(getApplicationContext(),
                            "First Use 4X4 And 6x6 ",
                            Toast.LENGTH_SHORT).show();
            }
        });
        btn16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "16x16 will be available soon.",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
