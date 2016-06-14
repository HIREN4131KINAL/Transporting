package com.example.laado.driver;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.laado.R;
import com.example.laado.activity.MainActivity;

public class VehicleIdentify extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.vehicle_identify);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolbar.setBackgroundResource(R.drawable.toolbar_background);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.bt_back);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }


    public void ButtonNo(View view) {

        startActivity(new Intent(this,RegistrationVehicle.class));
    }

    public void ButtonYes(View view) {

        startActivity(new Intent(this,MainActivity.class));
    }


}
