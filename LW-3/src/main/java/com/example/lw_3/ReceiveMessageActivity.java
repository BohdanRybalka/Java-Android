package com.example.lw_3;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiveMessageActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_receive_message);

        textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();

        String getMessage = intent.getStringExtra(Intent.EXTRA_TEXT);
        textView.setText(getMessage);

    }
}