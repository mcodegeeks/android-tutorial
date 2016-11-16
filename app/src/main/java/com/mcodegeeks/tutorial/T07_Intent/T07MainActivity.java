package com.mcodegeeks.tutorial.T07_Intent;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.mcodegeeks.tutorial.R;

public class T07MainActivity extends Activity {

    public static String EXTRA_HELLO_ANDROID = "com.mcodegeeks.tutorial.HELLO_ANDROID";
    public static String EXTRA_RATING = "com.mcodegeeks.tutorial.RATING";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t07_main);
    }

    public void startBrowser(View view) {
        Intent indent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("https://google.com"));
        startActivity(indent);
    }

    public void startPhone(View view) {
        Intent indent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("tel:1234567890"));
        startActivity(indent);
    }

    public void showRating(View view) {
        // explicit intent
        Intent intent = new Intent(getApplicationContext(), RatingActivity.class);
        intent.putExtra(EXTRA_HELLO_ANDROID, "Hello Android!");
        intent.putExtra(EXTRA_RATING, 3);
        startActivity(intent);
    }

    public void sendText(View view) {
        // implicit intent
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT, "Hello this is an implicit intent.");

        // ensure we have an application that can handle this type of data
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
