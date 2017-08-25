package com.example.priyagosain.password_validator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * MainActivity class has a Validate method that checks whether a string is sufficiently strong password according to 2 rules
     * @param password
     * Rule-1 : it is not password (case insensitive)
     * Rule-2 : it is at least 8 characters long
     */
    public static boolean ValidateMethod(String password) {
        // Rule-1
        if (password.equalsIgnoreCase("password"))
            return false;

        // Rule-2
        if (password.length() < 8)
            return false;

        return true;
    }
}
