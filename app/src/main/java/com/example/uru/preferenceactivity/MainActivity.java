package com.example.uru.preferenceactivity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.text_view);
    }

    public void kickPrefActivity(View view) {
        Log.d("TAG", "Pref button clicked");
        if (mTextView.getText() == "Hello World!") {
            mTextView.setText("Pref Clicked!");
        } else {
            mTextView.setText("Hello World!");
        }
    }
}
