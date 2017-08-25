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
    public void passwordIfAcceptable() throws Exception {
        // Test Case-1 : check that the input string "password" (upper and lower both) is not an acceptable password
        assertEquals(false, ValidateMethod("password"));
        assertEquals(false, ValidateMethod("PassWorD"));
        assertEquals(true, ValidateMethod("not_password"));
    }

    @Test
    public void passwordLength() throws Exception {
        // Test Case-2 : check that the password is at least 8 characters long
        assertEquals(false, ValidateMethod("1234567"));
        assertEquals(true, ValidateMethod("12345678"));
    }
}