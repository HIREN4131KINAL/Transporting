package com.example.laado.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.laado.R;
import com.example.laado.driver.SigninDriver;

/**
 * Created by Android Developer on 09-Jun-16.
 */
public class SignInCatActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_cat_activity);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolbar.setBackgroundResource(R.drawable.toolbar_background);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.bt_back);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }

    public void RegisterUser(View view) {

    }

    public void RegisterDriver(View view) {

    }

    public void SigninUser(View view) {

       Intent intent = new Intent(getApplicationContext(),SigninUser.class);
        startActivity(intent);
    }

    public void SigninDriver(View view) {

        startActivity(new Intent(this,SigninDriver.class));

    }


}
