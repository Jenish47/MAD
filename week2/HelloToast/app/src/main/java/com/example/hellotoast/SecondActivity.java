package com.example.hellotoast;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        TextView textView = findViewById(R.id.text_header);
        TextView countView = findViewById(R.id.textView_count);
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        countView.setText(message);
//       TextView mShowCount = (TextView) findViewById(R.id.show_count);
  }
}
