package com.mcodegeeks.tutorial.T15_AutoComplete;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

import com.mcodegeeks.tutorial.R;

public class T15MainActivity extends Activity {

    final static String[] languages={"Android ","java","IOS","SQL","JDBC","Web services"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t15_main);

        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1, languages);

        AutoCompleteTextView text1 = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        text1.setAdapter(adapter);
        text1.setThreshold(1);

        MultiAutoCompleteTextView text2 = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView);
        text2.setAdapter(adapter);
        text2.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
