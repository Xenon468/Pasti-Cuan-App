package com.pasticuan.stockpredict;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class activity_sell_recommend extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sell_notrecommend);

        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}