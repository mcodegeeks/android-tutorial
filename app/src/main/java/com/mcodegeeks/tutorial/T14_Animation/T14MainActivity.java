package com.mcodegeeks.tutorial.T14_Animation;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.mcodegeeks.tutorial.R;

public class T14MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t14_main);
    }

    public void clockwise(View view){
        ImageView image = (ImageView)findViewById(R.id.iconImage);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.clockwise);
        image.startAnimation(animation);
    }

    public void zoom(View view){
        ImageView image = (ImageView)findViewById(R.id.iconImage);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.zoom);
        image.startAnimation(animation);
    }

    public void fade(View view){
        ImageView image = (ImageView)findViewById(R.id.iconImage);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade);
        image.startAnimation(animation);
    }

    public void blink(View view){
        ImageView image = (ImageView)findViewById(R.id.iconImage);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink);
        image.startAnimation(animation);
    }

    public void move(View view){
        ImageView image = (ImageView)findViewById(R.id.iconImage);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.move);
        image.startAnimation(animation);
    }

    public void slide(View view){
        ImageView image = (ImageView)findViewById(R.id.iconImage);
        Animation animation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.slide);
        image.startAnimation(animation);
    }
}
