package com.tejas_kumar.labexp_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.con);
        TextView textView = findViewById(R.id.textView5);
        textView.setText(message);

    }
}