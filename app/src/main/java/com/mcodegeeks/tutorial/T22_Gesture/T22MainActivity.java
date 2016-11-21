package com.mcodegeeks.tutorial.T22_Gesture;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import android.graphics.Matrix;

import com.mcodegeeks.tutorial.R;

public class T22MainActivity extends Activity {

    private ImageView iv;
    private ScaleGestureDetector SGD;
    private Matrix matrix = new Matrix();
    private float scale = 1f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t22_main);

        iv = (ImageView) findViewById(R.id.imageView);
        SGD = new ScaleGestureDetector(this,new ScaleListener());
    }

    public boolean onTouchEvent(MotionEvent ev) {
        SGD.onTouchEvent(ev);
        return true;
    }

    private class ScaleListener extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        @Override
        public boolean onScale(ScaleGestureDetector detector) {
            scale *= detector.getScaleFactor();
            scale = Math.max(0.1f, Math.min(scale, 5.0f));
            matrix.setScale(scale, scale);
            iv.setImageMatrix(matrix);
            return true;
        }
    }

}
