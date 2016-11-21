package com.mcodegeeks.tutorial.T26_InternalStorage;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.mcodegeeks.tutorial.R;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import static android.R.attr.data;

public class T26MainActivity extends Activity {

    private EditText ed1;
    private EditText ed2;
    private String file = "mydata";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t26_main);

        ed1 = (EditText) findViewById(R.id.editText);
        ed2 = (EditText) findViewById(R.id.editText2);
    }

    public void load(View view) {
        try {
            FileInputStream fin = openFileInput(file);
            int c;
            String temp = "";
            while( (c = fin.read()) != -1) {
                temp = temp + Character.toString((char)c);
            }
            ed2.setText(temp);
            Toast.makeText(getBaseContext(),"file read",Toast.LENGTH_SHORT).show();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    public void save(View view) {
        String data = ed1.getText().toString();
        try {
            FileOutputStream fOut = openFileOutput(file, MODE_PRIVATE);
            fOut.write(data.getBytes());
            fOut.close();
            Toast.makeText(getBaseContext(),"file saved",Toast.LENGTH_SHORT).show();
        }
        catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
