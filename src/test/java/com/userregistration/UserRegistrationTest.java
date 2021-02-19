package com.userregistration;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

public class UserRegistrationTest {
    @ParameterizedTest
    @ValueSource(strings = {"Shrvaankaja", "DghDui"})
    public void firstNameTest(String name) throws Exception {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertEquals("Valid", userRegistration.isValidFirstName(name));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Shrvaan.kaja@gmiil.com", "abc.xyz@gmail.com"})
    public void emailTest(String email) throws Exception {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertEquals("Valid", userRegistration.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {"Shrvaankaja", "DghDui"})
    public void lastNameTest(String name) throws Exception {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertEquals("Valid", userRegistration.isValidLastName(name));
    }

    @ParameterizedTest
    @ValueSource(strings = {"shravK24$sasa", "Ksddq23%dasd"})
    public void passwordTest(String password) throws Exception {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertEquals("Valid", userRegistration.isValidPassword(password));
    }

    @ParameterizedTest
    @ValueSource(strings = {"919740216522", "919999999999"})
    public void phoneTest(String phone) throws Exception {
        UserRegistration userRegistration = new UserRegistration();
        Assertions.assertEquals("Valid", userRegistration.isValidPhone(phone));
    }

}