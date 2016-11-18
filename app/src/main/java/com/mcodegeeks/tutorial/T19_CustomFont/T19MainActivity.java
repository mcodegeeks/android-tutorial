package com.mcodegeeks.tutorial.T19_CustomFont;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.widget.TextView;

import com.mcodegeeks.tutorial.R;

public class T19MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t19_main);

        TextView tv1 = (TextView) findViewById(R.id.textView1);
        TextView tv2 = (TextView) findViewById(R.id.textView2);

        Typeface face = Typeface.createFromAsset(getAssets(), "font/A Damn Mess.ttf");
        tv1.setTypeface(face);

        Typeface face1= Typeface.createFromAsset(getAssets(), "font/Abduction.ttf");
        tv2.setTypeface(face1);
    }
}
