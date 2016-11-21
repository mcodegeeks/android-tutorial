package com.mcodegeeks.tutorial.T25_ImageSwitcher;

import android.app.Activity;
import android.app.ActionBar.LayoutParams;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.ImageSwitcher;
import android.widget.Toast;
import android.widget.ViewSwitcher.ViewFactory;

import com.mcodegeeks.tutorial.R;

public class T25MainActivity extends Activity {

    private ImageSwitcher sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t25_main);

        sw = (ImageSwitcher) findViewById(R.id.imageSwitcher);
        sw.setFactory(new ViewFactory() {
            @Override
            public View makeView() {
                ImageView view = new ImageView(getApplicationContext());
                view.setScaleType(ImageView.ScaleType.FIT_CENTER);
                view.setLayoutParams(new ImageSwitcher.LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT));
                return view;
            }
        });
    }

    public void prev(View view) {
        Toast.makeText(getApplicationContext(), "Previous Image", Toast.LENGTH_LONG).show();
        sw.setImageResource(R.drawable.bg1);
    }

    public void next(View view) {
        Toast.makeText(getApplicationContext(), "Next Image", Toast.LENGTH_LONG).show();
        sw.setImageResource(R.drawable.bg2);
    }
}
