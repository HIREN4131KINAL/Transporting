package com.example.laado.activity;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.laado.R;

public class LoginActivity extends Activity {

    TextView ForgotPassword,BackToSignIn;
    Button SignIn;

    //Give your SharedPreferences file a name and save it to a static variable
    public static final String PREFS_NAME = "LoginActivity";
    public static SharedPreferences settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        For one time open this screen using sharedpreference
        settings = getSharedPreferences(LoginActivity.PREFS_NAME, 0);
        boolean hasLoggedIn = settings.getBoolean("hasLoggedIn", false);

        if (hasLoggedIn) {
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
        }
        setContentView(R.layout.login_activity);

        loadui();

    }

    private void loadui() {

        ForgotPassword=(TextView)findViewById(R.id.tv_forgot_password);
        BackToSignIn= (TextView)findViewById(R.id.tv_singn_up);
        SignIn=(Button)findViewById(R.id.bt_signin);


    }

    //    Button click for Signin
    public void Signin(View view) {

        Intent intent = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(intent);

        // not showing this screen after login
        SharedPreferences settings = getSharedPreferences(LoginActivity.PREFS_NAME, 0); // 0 - for private mode
        SharedPreferences.Editor editor = settings.edit();

        editor.putBoolean("hasLoggedIn", true);

        editor.commit();
    }

    // Forgot password click textview
    public void ForgotPassword(View view) {

        Toast.makeText(LoginActivity.this, "Forgot Password Click", Toast.LENGTH_SHORT).show();
    }

    //this is textview sign in click event
    public void SignUp(View view) {
        Intent intent= new Intent(getApplicationContext(),RegisterActivity.class);
        startActivity(intent);

    }
}
