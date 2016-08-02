package com.tinytinybites.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void projectClicked(View v) {
        //Double check
        if(!(v instanceof TextView)){
            //Do nothing
            return;
        }

        String appName = ((TextView)v).getText().toString();
        if(appName != null){
            Toast.makeText(MainActivity.this, String.format(getString(R.string.application_listing_button_toast), appName), Toast.LENGTH_SHORT).show();
        }
    }
}
