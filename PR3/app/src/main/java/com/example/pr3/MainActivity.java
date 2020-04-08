package com.example.pr3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new CountDownTimer(30000,3000){

            @Override
            public void onTick(long l) {
                Toast.makeText(getApplicationContext(),"Hello World!!",Toast.LENGTH_SHORT).show();
            }
            @Override
            public void onFinish() {}
        }.start();
    }
}
