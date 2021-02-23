package com.userregistration;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface validateUserEntry {
    boolean validate(String userInput, String pattern);
}

public class UserRegistration {
    public boolean value;
    public static boolean resultValue;
    public static final String FIRSTNAMEPATTERN = "^[A-Z][a-zA-Z]{2,}$";
    public static final String LASTNAMEPATTERN = "^[A-Z][a-zA-Z]{2,}$";
    public static final String EMAILPATTERN = "^[a-zA-z0-9]{1,}([\\.\\_\\+\\-])?[a-zA-Z0-9]{0,}@[a-zA-z0-9]{1,}\\.[a-z]{2,3}(\\.)?([a-z]{2,3})?";
    public static final String PHONEPATTERN = "^[9][1][0-9]{10}$";
    public static final String PASSWORDPATTERN = "^(?=.{8,}$)(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&*])(?!.*[!@#$%^&*].*[!@#$%^&*]).*$";
    static String userInput;

    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        validateUserEntry validator = (String userInput, String pattern) -> {
            Pattern pattern1 = Pattern.compile(pattern);
            Matcher matcher = pattern1.matcher(userInput);
            resultValue = matcher.find();
            return resultValue;
        };
        System.out.println("Enter first name : ");
        String enteredFirstName = sc.next();
        System.out.println("Resullt is " + validator.validate(enteredFirstName, FIRSTNAMEPATTERN));
        System.out.println("Enter last name : ");
        String enteredLastName = sc.next();
        System.out.println("Resullt is " + validator.validate(enteredLastName, LASTNAMEPATTERN));
        System.out.println("Enter email  : ");
        String enteredEmail = sc.next();
        System.out.println("Resullt is " + validator.validate(enteredEmail, EMAILPATTERN));
        System.out.println("Enter Phone : ");
        String enteredPhone = sc.next();
        System.out.println("Resullt is " + validator.validate(enteredPhone, PHONEPATTERN));
        System.out.println("Enter Password : ");
        String enteredPassword = sc.next();
        System.out.println("Resullt is " + validator.validate(enteredPassword, PASSWORDPATTERN));
    }
}
