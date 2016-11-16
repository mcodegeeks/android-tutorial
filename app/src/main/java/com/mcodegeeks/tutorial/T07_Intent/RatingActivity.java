package com.mcodegeeks.tutorial.T07_Intent;

import android.app.Activity;
import android.media.Rating;
import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.TextView;

import com.mcodegeeks.tutorial.R;

public class RatingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        String receivedText = getIntent().getStringExtra(T07MainActivity.EXTRA_HELLO_ANDROID);
        int receivedRating = getIntent().getIntExtra(T07MainActivity.EXTRA_RATING, 0);

        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        ratingBar.setRating(receivedRating);

        TextView textView = (TextView) findViewById(R.id.greetingText);
        textView.setText(receivedText);
    }
}
