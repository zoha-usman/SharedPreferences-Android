package com.zohausman.sharedpreferenceandroid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                SharedPreferences Pref = getSharedPreferences("login",MODE_PRIVATE);

                Boolean check = Pref.getBoolean("flag",false);


                Intent iNext;
                if(check){// for True (User is Logged In)
                    iNext = new Intent(MainActivity.this, HomeActivity.class);

                }else{  //for  false (either First Time or User is Logged out
                    iNext = new Intent(MainActivity.this,LoginActivity.class);
                }
                startActivity(iNext);

            }
        },4000);




    }
}