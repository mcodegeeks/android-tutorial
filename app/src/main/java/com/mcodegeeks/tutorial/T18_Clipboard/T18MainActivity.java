package com.mcodegeeks.tutorial.T18_Clipboard;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.mcodegeeks.tutorial.R;

public class T18MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t18_main);
    }

    public void copyText(View view) {
        EditText editText = (EditText) findViewById(R.id.copyEditText);

        String text = editText.getText().toString();

        ClipData clipData = ClipData.newPlainText("text", text);
        ClipboardManager clipBoard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
        clipBoard.setPrimaryClip(clipData);

        Toast.makeText(getApplicationContext(), "Text Copied", Toast.LENGTH_SHORT).show();
    }

    public void pasteText(View view) {
        EditText editText = (EditText) findViewById(R.id.pasteEditText);
        ClipboardManager clipBoard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);

        ClipData clipData = clipBoard.getPrimaryClip();
        ClipData.Item item = clipData.getItemAt(0);

        String text = item.getText().toString();
        editText.setText(text);

        Toast.makeText(getApplicationContext(), "Text Pasted", Toast.LENGTH_SHORT).show();
    }
}
