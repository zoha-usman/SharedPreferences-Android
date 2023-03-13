package com.zohausman.sharedpreferenceandroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {
Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // code for Verification

                SharedPreferences pref = getSharedPreferences("login", MODE_PRIVATE);
                 SharedPreferences.Editor editor = pref.edit();// for insert we must have to  use edit
                 editor.putBoolean("flag",true);
                 editor.apply();

                Intent iNext = new Intent(LoginActivity.this, HomeActivity.class);
                startActivity(iNext);
            }
        });
    }
}