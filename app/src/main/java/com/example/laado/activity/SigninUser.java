package com.example.laado.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
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
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        toolbar.setBackgroundResource(R.drawable.toolbar_background);
        toolbar.setNavigationIcon(R.drawable.bt_back);

        /*toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();

            }
        });*/

        SigninWithLaado = (Button) findViewById(R.id.bt_signin_laado);
        SigninWithFacebook = (Button) findViewById(R.id.bt_signin_facebook);

    }

    public void SigninWithLaado(View view) {

        startActivity(new Intent(this,MainActivity.class));
        this.overridePendingTransition(R.anim.right_in,
                R.anim.left_out);
    }


    public void SigninWithFacebook(View view) {

        startActivity(new Intent(this,MainActivity.class));
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
                this.overridePendingTransition(R.anim.slide_in_left,
                        R.anim.slide_out_right);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
