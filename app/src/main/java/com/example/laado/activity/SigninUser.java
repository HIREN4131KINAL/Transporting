package com.example.laado.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.example.laado.R;

/**
 * Created by Android Developer on 09-Jun-16.
 */
public class SigninUser extends AppCompatActivity {

    Button SigninWithLaado,SigninWithFacebook;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_user);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolbar.setBackgroundResource(R.drawable.toolbar_background);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.bt_back);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        SigninWithLaado = (Button) findViewById(R.id.bt_signin_laado);
        SigninWithFacebook = (Button) findViewById(R.id.bt_signin_facebook);

    }

    public void SigninWithLaado(View view) {

        startActivity(new Intent(this,MainActivity.class));

    }


    public void SigninWithFacebook(View view) {

        startActivity(new Intent(this,MainActivity.class));

    }


}
