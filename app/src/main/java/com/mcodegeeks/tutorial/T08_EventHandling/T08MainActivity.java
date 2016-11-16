package com.mcodegeeks.tutorial.T08_EventHandling;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.mcodegeeks.tutorial.R;

public class T08MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t08_main);


        Button b1 = (Button) findViewById(R.id.smallFontButton);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtView = (TextView) findViewById(R.id.textExample);
                txtView.setTextSize(10);
            }
        });

        Button b2 = (Button) findViewById(R.id.largeFontButton);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtView = (TextView) findViewById(R.id.textExample);
                txtView.setTextSize(50);
            }
        });
    }
}
