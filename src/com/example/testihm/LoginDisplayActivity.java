package com.example.testihm;

import java.util.Calendar;

import android.app.Activity;
import android.os.Bundle;

public class LoginDisplayActivity extends Activity {
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_display);
        Calendar c=Calendar.getInstance();
    } 
}

