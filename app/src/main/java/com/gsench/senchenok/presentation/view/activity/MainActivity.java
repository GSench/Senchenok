package com.gsench.senchenok.presentation.view.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.gsench.senchenok.R;
import com.gsench.senchenok.presentation.view.Main;

public class MainActivity extends AppCompatActivity implements Main {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

}