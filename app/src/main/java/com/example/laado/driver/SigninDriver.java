package com.example.laado.driver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.laado.R;

public class SigninDriver extends AppCompatActivity {

    Button SigninDriver;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_driver);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolbar.setBackgroundResource(R.drawable.toolbar_background);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.bt_back);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



    }

    public void SigninDriver(View view) {


    }
}
