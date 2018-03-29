package com.example.ghummanjeee.splashscreen;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
 private  static  int Splash=10000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     new Handler().postDelayed(new Runnable() {
         @Override
         public void run() {
             Intent is=new Intent(MainActivity.this,blank.class);
             startActivity(is);
         }         },Splash);

    }
}





