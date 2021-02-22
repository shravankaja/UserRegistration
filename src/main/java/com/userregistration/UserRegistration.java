package com.userregistration;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean value;
    public boolean valueMain;
    public final String FIRSTNAMEPATTERN = "^[A-Z][a-zA-Z]{2,}$";
    public final String LASTNAMEPATTERN = "^[A-Z][a-zA-Z]{2,}$";
    public final String EMAILPATTERN = "^[a-zA-z0-9]{1,}([\\.\\_\\+\\-])?[a-zA-Z0-9]{0,}@[a-zA-z0-9]{1,}\\.[a-z]{2,3}(\\.)?([a-z]{2,3})?";
    public final String PHONEPATTERN = "^[9][1][0-9]{10}$";
    public final String PASSWORDPATTERN = "^(?=.{8,}$)(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&*])(?!.*[!@#$%^&*].*[!@#$%^&*]).*$";

    public boolean validatorMethod(String inputField, String patternMain) {
        Pattern pattern = Pattern.compile(patternMain);
        Matcher matcher = pattern.matcher(inputField);
        valueMain = matcher.find();
        return valueMain;
    }

    public String isValidFirstName(String firstName) {
        value = validatorMethod(firstName, FIRSTNAMEPATTERN);
        return validCheck(value);
    }

    public String isValidLastName(String lastName) {
        value = validatorMethod(lastName, LASTNAMEPATTERN);
        return validCheck(value);
    }

    public String isValidEmail(String email) {
        value = validatorMethod(email, EMAILPATTERN);
        return validCheck(value);
    }

    public String isValidPhone(String phone) {
        value = validatorMethod(phone, PHONEPATTERN);
        return validCheck(value);
    }

    public String isValidPassword(String password) {
        value = validatorMethod(password, PASSWORDPATTERN);
        return validCheck(value);
    }

    public String validCheck(boolean value) {
        if (value) {
            System.out.println("Valid");
            return "Valid";
        } else {
            System.out.println("Invalid");
            return "Invalid";
        }
    }

    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        UserRegistration userRegistration = new UserRegistration();
        System.out.println("Enter first name \n");
        String firstName = sc.next();
        userRegistration.isValidFirstName(firstName);
        System.out.println("Enter last name \n");
        String lastName = sc.next();
        userRegistration.isValidFirstName(lastName);
        System.out.println("Enter Email \n");
        String email = sc.next();
        userRegistration.isValidEmail(email);
        System.out.println("Enter phone \n");
        String phone = sc.next();
        userRegistration.isValidPhone(phone);
        System.out.println("Enter password \n");
        String password = sc.next();
        userRegistration.isValidPassword(password);
    }
}
