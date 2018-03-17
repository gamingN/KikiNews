package com.kiki.kikinews.ui.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.TextView;

import com.kiki.kikinews.R;
import com.kiki.kikinews.utils.PerUtils;

public class SplashActivity extends AppCompatActivity {

    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        imageView=(ImageView) findViewById(R.id.bg_splash);
        initAnimation();

    }

    private void initAnimation() {
        Animation animation=new AlphaAnimation(1.0f,0.0f);
        animation.setDuration(3000);
        animation.setFillAfter(true);
        animation.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                jumpToNextpage();
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });
        imageView.startAnimation(animation);
    }

    private void jumpToNextpage() {
        boolean isfrist= PerUtils.getBoolean(SplashActivity.this,"isfrist",true);
        Intent intent=new Intent();
        if(isfrist){
            intent.setClass(SplashActivity.this,GuideActivity.class);
            startActivity(intent);
        }else{
            intent.setClass(SplashActivity.this,MainActivity.class);
            startActivity(intent);
        }
        finish();
    }

}
