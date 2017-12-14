package com.daffaalam.hurufhijaiyah;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

public class SplashActivity extends AppCompatActivity {

    protected boolean _active = true;
    protected int _splashTime = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        RelativeLayout splash = findViewById(R.id.splash);
        splash.setBackgroundColor(Color.TRANSPARENT);

        StartAnimations();

        Thread splashThread = new Thread() {
            public void run() {
                try {
                    int waited = 0;
                    while (_active && (waited < _splashTime)) {
                        sleep(100);
                        if (_active) {
                            waited += 50;
                        }
                    }
                } catch (InterruptedException ignored) {
                } finally {
                    finish();
                    Intent newIntent = new Intent(SplashActivity.this, HomeActivity.class);
                    startActivityForResult(newIntent, 0);
                }
            }
        };
        splashThread.start();
    }

    private void StartAnimations() {
        Animation anim = AnimationUtils.loadAnimation(this, R.anim.fade);
        anim.reset();
        FrameLayout l = findViewById(R.id.FrameLayout1);
        l.clearAnimation();
        l.startAnimation(anim);

        Animation anim1 = AnimationUtils.loadAnimation(this, R.anim.fade);
        anim1.reset();
        ProgressBar l1 = findViewById(R.id.progressBar1);
        l1.clearAnimation();
        l1.startAnimation(anim);

        anim = AnimationUtils.loadAnimation(this, R.anim.translate);
        anim.reset();
        ImageView iv = findViewById(R.id.logos);
        iv.clearAnimation();
        iv.startAnimation(anim);
    }
}
