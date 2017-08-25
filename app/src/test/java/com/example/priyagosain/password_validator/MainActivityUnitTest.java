package com.example.priyagosain.password_validator;

import org.junit.Test;

import static org.junit.Assert.*;
import static com.example.priyagosain.password_validator.MainActivity.ValidateMethod;
/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class MainActivityUnitTest {
    @Test
    public void passwordIfAcceptable() {
        // Test Case-1 : check that the input string "password" (upper and lower both) is not an acceptable password
        assertEquals(false, ValidateMethod("password"));
        assertEquals(false, ValidateMethod("PassWorD"));
        assertEquals(true, ValidateMethod("not_password"));
    }

    @Test
    public void passwordLength() {
        // Test Case-2 : check that the password is at least 8 characters long
        assertEquals(false, ValidateMethod("1234567"));

    }

    @Test
    public void passwordContainsDigit() {
        // Test Case-3 : check that the password contains a digit
        assertEquals(false, ValidateMethod("priyapriya"));
    }

    @Test
    public void passwordContainsUpperLower() {
        // Test Case-4 : check that the password contains a lower/upper case
        assertEquals(false, ValidateMethod("priyapriya1"));
        assertEquals(false, ValidateMethod("PRIYAPRIYA1"));
    }

    @Test
    public void passwordContainsSpecialCharacter() {
        // Test Case-5 : check that the password contains a special character
        assertEquals(false, ValidateMethod("PriyaPriya1"));
    }

    @Test
    public void passwordIsValid() {
        // True Test Case : An example of valid password that passes 5 set of rules
        assertEquals(true, ValidateMethod("PriyaPriya1#"));
    }
}