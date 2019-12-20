package com.example.queen;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

public class John extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.john);
    }
    @Override
    public void onBackPressed() {
        ActivityCompat.finishAfterTransition(this);
    }
}
