package com.example.implicite_intent;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    Button share;
    TextView yuvi;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        share=findViewById(R.id.btnshare);
        yuvi=findViewById(R.id.textView3);

        getSupportActionBar().hide();

        share.setOnClickListener(v -> {
            String sharetxt=yuvi.getText().toString();
            Intent sendIntent= new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.setType("text/plain");
            sendIntent.putExtra(Intent.EXTRA_TEXT, sharetxt);
            startActivity(sendIntent);
        });
    }
}