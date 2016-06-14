package com.example.laado.driver;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

import com.example.laado.R;

/**
 * Created by Android Developer on 08-Jun-16.
 */
public class RegistrationVehicle extends AppCompatActivity{

    EditText et_one,et_two,et_three,et_four,et_five,et_six,et_seven;
    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_vehicle_activity);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolbar.setBackgroundResource(R.drawable.toolbar_background);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.bt_back);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        et_one = (EditText) findViewById(R.id.et_one);
        et_two = (EditText) findViewById(R.id.et_two);
        et_three = (EditText) findViewById(R.id.et_three);
        et_four = (EditText) findViewById(R.id.et_four);
        et_five = (EditText) findViewById(R.id.et_five);
        et_six = (EditText) findViewById(R.id.et_six);
        et_seven = (EditText) findViewById(R.id.et_seven);

        focusChange();

    }

    private void focusChange() {

        et_two.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                // TODO Auto-generated method stub
                if(et_two.getText().toString().length()==1)     //size as per your requirement
                {
                    et_three.requestFocus();
                }
            }
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {
            }

            public void afterTextChanged(Editable s) {
            }

        });

        et_one.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                if(et_one.getText().toString().length()==1)     //size as per your requirement
                {
                    et_two.requestFocus();
                }
            }
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {

            }

            public void afterTextChanged(Editable s) {
            }

        });

        et_three.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                if(et_three.getText().toString().length()==1)     //size as per your requirement
                {
                    et_four.requestFocus();
                }
            }
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {

            }

            public void afterTextChanged(Editable s) {
            }

        });

        et_four.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                if(et_four.getText().toString().length()==1)     //size as per your requirement
                {
                    et_five.requestFocus();
                }
            }
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {

            }

            public void afterTextChanged(Editable s) {
            }

        });


        et_five.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                if(et_five.getText().toString().length()==1)     //size as per your requirement
                {
                    et_six.requestFocus();
                }
            }
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {

            }

            public void afterTextChanged(Editable s) {
            }

        });

        et_six.addTextChangedListener(new TextWatcher() {

            public void onTextChanged(CharSequence s, int start,int before, int count)
            {
                if(et_six.getText().toString().length()==1)     //size as per your requirement
                {
                    et_seven.requestFocus();
                }
            }
            public void beforeTextChanged(CharSequence s, int start,
                                          int count, int after) {

            }

            public void afterTextChanged(Editable s) {
            }

        });


        // clear edittext and jump to next edittext using clear button

        et_seven.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //You can identify which key pressed buy checking keyCode value with KeyEvent.KEYCODE_
                if(keyCode == KeyEvent.KEYCODE_DEL && et_seven.length()==0){
                    //this is for backspace
                    et_six.requestFocus();
                }
                return false;
            }
        });

        et_six.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //You can identify which key pressed buy checking keyCode value with KeyEvent.KEYCODE_
                if(keyCode == KeyEvent.KEYCODE_DEL && et_six.length()==0){
                    //this is for backspace
                    et_five.requestFocus();
                }
                return false;
            }
        });

        et_five.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //You can identify which key pressed buy checking keyCode value with KeyEvent.KEYCODE_
                if(keyCode == KeyEvent.KEYCODE_DEL && et_five.length()==0){
                    //this is for backspace
                    et_four.requestFocus();
                }
                return false;
            }
        });


        et_four.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //You can identify which key pressed buy checking keyCode value with KeyEvent.KEYCODE_
                if(keyCode == KeyEvent.KEYCODE_DEL && et_four.length()==0){
                    //this is for backspace
                    et_three.requestFocus();
                }
                return false;
            }
        });

        et_three.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //You can identify which key pressed buy checking keyCode value with KeyEvent.KEYCODE_
                if(keyCode == KeyEvent.KEYCODE_DEL && et_three.length()==0){
                    //this is for backspace
                    et_two.requestFocus();
                }
                return false;
            }
        });

        et_two.setOnKeyListener(new View.OnKeyListener() {
            @Override
            public boolean onKey(View v, int keyCode, KeyEvent event) {
                //You can identify which key pressed buy checking keyCode value with KeyEvent.KEYCODE_
                if(keyCode == KeyEvent.KEYCODE_DEL && et_two.length()==0){
                    //this is for backspace
                    et_one.requestFocus();
                }
                return false;
            }
        });



    }

}
