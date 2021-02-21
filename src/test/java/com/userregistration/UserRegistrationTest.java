package com.userregistration;

import junit.framework.*;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import org.junit.rules.*;
import org.opentest4j.AssertionFailedError;

public class UserRegistrationTest {

    @Test
    public void firstNameTest() throws UserRegistrationException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            ExpectedException exception = ExpectedException.none();
            exception.expect(UserRegistrationException.class);
            Assertions.assertEquals("Valid", userRegistration.isValidFirstName(" "));
        } catch (AssertionFailedError e) {
            throw new UserRegistrationException("Please enter valid input");
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"Shrvaan.kaja@gmiil.com", "abc.xyz@gmail.com", "ab@gmail.com"})
    public void emailTest(String email) throws UserRegistrationException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            ExpectedException exception = ExpectedException.none();
            exception.expect(UserRegistrationException.class);
            Assertions.assertEquals("Valid", userRegistration.isValidEmail(email));
        } catch (AssertionFailedError e) {
            throw new UserRegistrationException("Please enter valid input");
        }
    }

    @Test
    public void lastNameTest() throws UserRegistrationException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            ExpectedException exception = ExpectedException.none();
            exception.expect(UserRegistrationException.class);
            Assertions.assertEquals("Valid", userRegistration.isValidLastName("Kaja"));
        } catch (AssertionFailedError e) {
            throw new UserRegistrationException("Please enter valid input");
        }
    }

    @Test
    public void passwordTest() throws UserRegistrationException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            ExpectedException exception = ExpectedException.none();
            exception.expect(UserRegistrationException.class);
            Assertions.assertEquals("Valid", userRegistration.isValidPassword("Shravank25$"));
        } catch (AssertionFailedError e) {
            throw new UserRegistrationException("Please enter valid input");
        }
    }

    @Test
    public void phoneTest() throws UserRegistrationException {
        try {
            UserRegistration userRegistration = new UserRegistration();
            ExpectedException exception = ExpectedException.none();
            exception.expect(UserRegistrationException.class);
            Assertions.assertEquals("Valid", userRegistration.isValidPhone("919740216522"));
        } catch (AssertionFailedError e) {
            throw new UserRegistrationException("Please enter valid input");
        }
    }

}