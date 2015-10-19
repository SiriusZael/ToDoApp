package com.mrucker.todoapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

public class EditItemActivity extends ActionBarActivity {

    private int position;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_item);

        String text = getIntent().getStringExtra("itemName");
        position = getIntent().getIntExtra("itemPosition", 0);
    }

    public void onSaveItem(View view) {
        EditText etEditExistingText = (EditText) findViewById(R.id.etEditExistingText);

        Intent data = new Intent();

        data.putExtra("itemName", etEditExistingText.getText().toString());
        data.putExtra("itemPosition", position);

        setResult(RESULT_OK, data);
        finish();
    }
}
