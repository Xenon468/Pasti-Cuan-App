package com.pasticuan.stockpredict;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Objects;

public class DashboardWatchlistActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard_watchlist);

        Objects.requireNonNull(getSupportActionBar()).hide();

        int blue[] = { 0x487FD9 };
        GradientDrawable availability = new GradientDrawable(
                GradientDrawable.Orientation.TOP_BOTTOM, blue);
        ImageView status = (ImageView) findViewById(R.id.status);
        status.setBackground(availability);

        Objects.requireNonNull(getSupportActionBar()).hide();
    }
}