package com.userregistration;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public boolean value;

    public String isValidFirstName(String firstName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        value = matcher.find();
        return validCheck(value);
    }

    public String isValidLastName(String lastName) {
        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        value = matcher.find();
        return validCheck(value);
    }


    public String isValidEmail(String email) {
        Pattern pattern = Pattern.compile(
                "^[a-zA-z0-9]{1,}([\\.\\_\\+\\-])?[a-zA-Z0-9]{0,}@[a-zA-z0-9]{1,}\\.[a-z]{2,3}(\\.)?([a-z]{2,3})?");
        Matcher matcher = pattern.matcher(email);
        value = matcher.find();
        return validCheck(value);
    }


    public String isValidPhone(String phone) {
        String regexPhone = "^[9][1][0-9]{10}$";
        Pattern pattern = Pattern.compile(regexPhone);
        Matcher matcher = pattern.matcher(phone);
        value = matcher.matches();
        return validCheck(value);
    }


    public String isValidPassword(String password) {
        Pattern pattern = Pattern.compile("^(?=.{8,}$)(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&*])(?!.*[!@#$%^&*].*[!@#$%^&*]).*$");
        Matcher matcher = pattern.matcher(password);
        value = matcher.find();
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
