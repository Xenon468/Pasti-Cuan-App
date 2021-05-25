package com.pasticuan.stockpredict;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.pasticuan.stockpredict.ui.login.LoginActivity;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Objects.requireNonNull(getSupportActionBar()).hide();

        Thread thread = new Thread() {
            @Override
            public void run() {
                // thread will sleep for 2 seconds
                try {
                    sleep(2000);

                    // after 2 sec redirect to another intent
                    Intent i = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(i);
                    finish(); // to make pressing back not to MainActivity
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
}