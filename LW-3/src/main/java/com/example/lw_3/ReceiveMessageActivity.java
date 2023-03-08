package com.example.lw_3;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ReceiveMessageActivity extends AppCompatActivity {

    TextView textView;

    final String TAG = "States";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_receive_message);

        textView = (TextView) findViewById(R.id.textView);

        Intent intent = getIntent();

        String getMessage = intent.getStringExtra(Intent.EXTRA_TEXT);
        textView.setText(getMessage);

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "ReceiveMessageActivity: onStart()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "ReceiveMessageActivity: onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "ReceiveMessageActivity: onResume()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "ReceiveMessageActivity: onPause()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "ReceiveMessageActivity: onStop()");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "ReceiveMessageActivity: onDestroy()");
    }

}