package com.pasticuan.stockpredict;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.Objects;

public class activity_changemembership extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_membership_confirmation);

        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}