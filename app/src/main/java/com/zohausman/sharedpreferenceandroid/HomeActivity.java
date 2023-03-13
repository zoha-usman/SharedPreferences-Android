package com.zohausman.sharedpreferenceandroid;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnLogout= findViewById(R.id.btnLogout);

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences Pref = getSharedPreferences("login", MODE_PRIVATE);
                SharedPreferences.Editor editor = Pref.edit();
                editor.putBoolean("flag", false);
                editor.apply();
            }
        });

    }
}