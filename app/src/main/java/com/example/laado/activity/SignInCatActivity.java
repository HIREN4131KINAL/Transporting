package com.example.laado.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import com.example.laado.R;
import com.example.laado.driver.SigninDriver;

/**
 * Created by Android Developer on 09-Jun-16.
 */
public class SignInCatActivity extends AppCompatActivity {

//    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin_cat_activity);

     /*   toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setBackgroundResource(R.drawable.toolbar_background);
        toolbar.setNavigationIcon(R.drawable.bt_back); */

    }

    public void RegisterUser(View view) {

    }

    public void RegisterDriver(View view) {

    }

    public void SigninUser(View view) {

        Intent intent = new Intent(getApplicationContext(), SigninUser.class);
        startActivity(intent);
//        this.overridePendingTransition(R.anim.right_in,
//                R.anim.left_out);
        this.overridePendingTransition(R.anim.slide_in_right,
                R.anim.slide_out_left);
    }

    public void SigninDriver(View view) {

        startActivity(new Intent(this, SigninDriver.class));
        this.overridePendingTransition(R.anim.right_in,
                R.anim.left_out);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
