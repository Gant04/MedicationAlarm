package com.meag.medicationalarm;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {
    private TextView appName;
    private ImageView appPic;
    private Typeface typeface_cwg, typeface_nozstudio, typeface_beech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        appName = findViewById(R.id.appName);
        appPic = findViewById(R.id.appPic);
        typeface_beech = Typeface.createFromAsset(getAssets(), "fonts/beech.ttf");
        typeface_cwg = Typeface.createFromAsset(getAssets(), "fonts/CWG Sans.ttf");
        typeface_nozstudio = Typeface.createFromAsset(getAssets(), "fonts/NOZSTUDIO.ttf");
        appName.setTypeface(typeface_nozstudio);

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.transition);
        appName.startAnimation(anim);
        appPic.startAnimation(anim);
        final Intent intent = new Intent(this, MainActivity.class);
        Thread timer = new Thread() {
            public void run() {
                try {
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(intent);
                    finish();
                }
            }
        };
        timer.start();
    }
}
