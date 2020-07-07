package com.example.sudokusolver.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.sudokusolver.Utilities.AppPreference;
import com.example.sudokusolver.R;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdCallback;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

public class MainActivity extends AppCompatActivity {
    private RewardedAd rewardedAd;
    Button banana;
    Button btn4,btn6,btn9,btn16,btnAd;


    @Override
    protected void onResume() {
        super.onResume();
         banana = findViewById(R.id.banana);
        banana.setText("CREDITS : " + AppPreference.getInstance().getBananas());

            rewardedAd = new RewardedAd(MainActivity.this, "ca-app-pub-3940256099942544/5224354917");
            RewardedAdLoadCallback adLoadCallback = new RewardedAdLoadCallback() {
                @Override
                public void onRewardedAdLoaded() {
                    // Ad successfully loaded.
                }

                @Override
                public void onRewardedAdFailedToLoad(int errorCode) {
                    // Ad failed to load.
                    Toast.makeText(getApplicationContext(),"Try again later :(",Toast.LENGTH_SHORT).show();
                }
            };
            rewardedAd.loadAd(new AdRequest.Builder().build(), adLoadCallback);
        if (AppPreference.getInstance().getIs4X4()) {
            btn6.setBackground(ContextCompat.getDrawable(this,R.drawable.button2));
        } else
            btn6.setBackground(ContextCompat.getDrawable(this,R.drawable.buttonlock));

        if (AppPreference.getInstance().getIs6x6()) {
            btn9.setBackground(ContextCompat.getDrawable(this,R.drawable.button2));
        } else
            btn9.setBackground(ContextCompat.getDrawable(this,R.drawable.buttonlock));
        if(AppPreference.getInstance().getBananas()==0)
        {
            btn4.setBackground(ContextCompat.getDrawable(this,R.drawable.buttonlock));
            if(!AppPreference.getInstance().getIs4X4()||AppPreference.getInstance().getBananas()==0) {
                btn6.setBackground(ContextCompat.getDrawable(this, R.drawable.buttonlock));
            }
            else
            {
                btn6.setBackground(ContextCompat.getDrawable(this, R.drawable.button2));
            }
            if(!AppPreference.getInstance().getIs6x6()||AppPreference.getInstance().getBananas()==0) {
                btn9.setBackground(ContextCompat.getDrawable(this, R.drawable.buttonlock));
            }
            else
            {
                btn9.setBackground(ContextCompat.getDrawable(this, R.drawable.button2));
            }
            Toast.makeText(getApplicationContext(),"Watch an AD to get credits!",Toast.LENGTH_SHORT).show();
        }
        else
        {
            btn4.setEnabled(true);
            btn6.setEnabled(true);
            btn9.setEnabled(true);
            btn16.setEnabled(true);
            btn4.setBackground(ContextCompat.getDrawable(this,R.drawable.button2));
            if(!AppPreference.getInstance().getIs4X4()) {
                btn6.setBackground(ContextCompat.getDrawable(this, R.drawable.buttonlock));
            }
            else
            {
                btn6.setBackground(ContextCompat.getDrawable(this, R.drawable.button2));
            }
            if(!AppPreference.getInstance().getIs6x6()) {
                btn9.setBackground(ContextCompat.getDrawable(this, R.drawable.buttonlock));
            }
            else
            {
                btn9.setBackground(ContextCompat.getDrawable(this, R.drawable.button2));
            }
            btn16.setBackground(ContextCompat.getDrawable(this,R.drawable.button2));
        }


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn4 = findViewById(R.id.btn4);
        btn6 = findViewById(R.id.btn6);
        btn9 = findViewById(R.id.btn9);
        btn16 = findViewById(R.id.btn16);
        btnAd = findViewById(R.id.Ad);
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
                if(AppPreference.getInstance().getBananas()==0)
                {
                    Toast.makeText(getApplicationContext(),
                            "Insufficent CREDITS ",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent Intent = new Intent(MainActivity.this, Activity4.class);
                    startActivity(Intent);
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(AppPreference.getInstance().getBananas()==0)
                {
                    Toast.makeText(getApplicationContext(),
                            "Insufficent CREDITS ",
                            Toast.LENGTH_SHORT).show();
                }
                else {
                    if (AppPreference.getInstance().getIs4X4()) {
                        Intent Intent = new Intent(MainActivity.this, Activity6.class);
                        startActivity(Intent);
                    } else
                        Toast.makeText(getApplicationContext(),
                                "First Use 4X4 ",
                                Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (AppPreference.getInstance().getBananas() == 0) {
                    Toast.makeText(getApplicationContext(),
                            "Insufficent CREDITS ",
                            Toast.LENGTH_SHORT).show();
                } else {
                    if (AppPreference.getInstance().getIs6x6()) {
                        Intent Intent = new Intent(MainActivity.this, Activity9.class);
                        startActivity(Intent);
                    } else
                        Toast.makeText(getApplicationContext(),
                                "First Use 4X4 And 6x6 ",
                                Toast.LENGTH_SHORT).show();
                }
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
        btnAd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rewardedAd.isLoaded()) {
                    Activity activityContext = MainActivity.this;
                    RewardedAdCallback adCallback = new RewardedAdCallback() {
                        @Override
                        public void onRewardedAdOpened() {
                            // Ad opened.
                        }

                        @Override
                        public void onRewardedAdClosed() {
                            // Ad closed.
                        }

                        @Override
                        public void onUserEarnedReward(@NonNull com.google.android.gms.ads.rewarded.RewardItem rewardItem) {
                            AppPreference.getInstance().setBananas(AppPreference.getInstance().getBananas()+2);
                            banana.setText("BANANA : " + AppPreference.getInstance().getBananas());
                            Toast.makeText(getApplicationContext(),
                                    "YOU GOT 2 CREDITS",
                                    Toast.LENGTH_SHORT).show();

                        }

                        @Override
                        public void onRewardedAdFailedToShow(int errorCode) {
                            // Ad failed to display.
                        }
                    };
                    rewardedAd.show(activityContext, adCallback);
                } else {
                    Log.d("TAG", "The rewarded ad wasn't loaded yet.");
                }
            }
        });
    }
}

