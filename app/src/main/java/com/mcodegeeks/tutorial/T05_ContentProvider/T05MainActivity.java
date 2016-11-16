package com.mcodegeeks.tutorial.T05_ContentProvider;

import android.app.Activity;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.mcodegeeks.tutorial.R;

public class T05MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_t05_main);
    }

    public void onClickAddName(View view) {

        // Add a new student record
        ContentValues values = new ContentValues();
        values.put(StudentContentProvider.NAME, ((EditText)findViewById(R.id.nameEditText)).getText().toString());
        values.put(StudentContentProvider.GRADE, ((EditText)findViewById(R.id.gradeEditText)).getText().toString());

        Uri uri = getContentResolver().insert(StudentContentProvider.CONTENT_URI, values);

        Toast.makeText(getBaseContext(), uri.toString(), Toast.LENGTH_LONG).show();
    }

    public void onClickRetrieveStudent(View view) {

        // Retrieve student records
        String URL = "content://com.mcodegeeks.tutorial.StudentContentProvider";

        Uri students = Uri.parse(URL);
        Cursor c = managedQuery(students, null, null, null, "name");

        if (c.moveToFirst()) {
            do{
                Toast.makeText(this,
                        c.getString(c.getColumnIndex(StudentContentProvider.ID)) +
                                ", " +  c.getString(c.getColumnIndex( StudentContentProvider.NAME)) +
                                ", " + c.getString(c.getColumnIndex( StudentContentProvider.GRADE)),
                        Toast.LENGTH_SHORT).show();
            } while (c.moveToNext());
        }
    }
}
