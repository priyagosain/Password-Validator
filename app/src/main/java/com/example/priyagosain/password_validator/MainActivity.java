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
        if (password.equalsIgnoreCase("password")) {
            return false;
        }

        // Rule-2
        if (password.length() < 8) {
            return false;
        }

        // Rule-3 : it contains a digit
        if (!(password.matches(".*\\d+.*"))) {
            return false;
        }

        // Rule-4 - it contains upper and lower case
        if (password.equals(password.toLowerCase()) || password.equals(password.toUpperCase())) {
            return false;
        }

        // Rule-5 - it contains a special character # or $ or *
        if (!(password.indexOf('#') != -1 || password.indexOf('$') != -1 || password.indexOf('*') != -1)) {
            return false;
        }

        return true;
    }
}
