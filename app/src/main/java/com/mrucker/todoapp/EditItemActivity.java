package com.mrucker.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class EditItemActivity extends ActionBarActivity {

    private int position;
    private EditText etEditExistingText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        String text = getIntent().getStringExtra("itemName");

        etEditExistingText = (EditText) findViewById(R.id.etEditExistingText);
        etEditExistingText.setText(text, TextView.BufferType.EDITABLE);
        etEditExistingText.setSelection(text.length());
    }

    public void onSaveItem(View view) {
        Intent data = new Intent();

        data.putExtra("itemName", etEditExistingText.getText().toString());
        data.putExtra("itemPosition", getIntent().getIntExtra("itemPosition", 0));

        setResult(RESULT_OK, data);
        finish();
    }
}
