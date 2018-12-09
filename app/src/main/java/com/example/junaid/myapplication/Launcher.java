package com.example.junaid.myapplication;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class Launcher extends AppCompatActivity {

    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launcher);

        logo=(ImageView)findViewById(R.id.uplift);
        logo.animate().start();

        // Add code to print out the key hash
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent i = new Intent(Launcher.this, MainActivity.class);
                startActivity(i);
                finish();

            }
        },3000);
    }
}
