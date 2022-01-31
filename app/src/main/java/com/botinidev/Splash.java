package com.botinidev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;

public class Splash extends AppCompatActivity {

    int tempo = 1000 * 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
             trocartela();
            }
        },tempo);





    }

    private void trocartela() {
       Intent intent = new Intent(Splash.this,MainActivity.class);
       startActivity(intent);
       finish();

    }

}