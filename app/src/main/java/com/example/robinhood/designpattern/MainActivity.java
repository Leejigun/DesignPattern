package com.example.robinhood.designpattern;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.robinhood.designpattern.domain.Human;

public class MainActivity extends AppCompatActivity {
    private Human me;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
