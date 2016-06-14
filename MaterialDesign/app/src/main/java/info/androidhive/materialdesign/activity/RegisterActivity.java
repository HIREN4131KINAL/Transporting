package com.example.laado.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.laado.R;

public class RegisterActivity extends Activity {

    TextView BackToSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        loadui();

    }

    private void loadui() {
        BackToSignIn= (TextView)findViewById(R.id.tv_backto_singin);
    }

    public void BackToSignIn(View view) {

        Intent intent = new Intent(getApplicationContext(),LoginActivity.class);
        startActivity(intent);

    }
}
