import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static boolean value;

    public static void isValidFirstName(String firstName) {

        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        value = matcher.find();
        validCheck(value);
    }

    public static void isValidLastName(String lastName) {

        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(lastName);
        value = matcher.find();
        validCheck(value);
    }

    public static void isValidEmail(String email) {

        Pattern pattern = Pattern.compile(
                "^[a-zA-z0-9]{1,}([\\.\\_\\+\\-])?[a-zA-Z0-9]{0,}@[a-zA-z0-9]{1,}\\.[a-z]{2,3}(\\.)?([a-z]{2,3})?");
        Matcher matcher = pattern.matcher(email);
        value = matcher.find();
        validCheck(value);
    }

    public static void isValidPhone(String phone) {

        String regexPhone = "^[9][1][0-9]{10}$";
        Pattern pattern = Pattern.compile(regexPhone);
        Matcher matcher = pattern.matcher(phone);
        value = matcher.matches();
        validCheck(value);

    }
    public static void isValidPassword(String password) {

        Pattern pattern = Pattern.compile("^(?=.{8,}$)(?=.*?[a-z])(?=.*?[A-Z])(?=.*?[0-9])(?=.*?[!@#$%^&*])(?!.*[!@#$%^&*].*[!@#$%^&*]).*$");
        Matcher matcher = pattern.matcher(password);
        value = matcher.find();
        validCheck(value);
    }

    public static void validCheck(boolean value) {
        if (value) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }

    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first name \n");
        String firstName = sc.next();
        isValidFirstName(firstName);
        System.out.println("Enter last name \n");
        String lastName = sc.next();
        isValidFirstName(lastName);
        System.out.println("Enter Email \n");
        String email = sc.next();
        isValidEmail(email);
        System.out.println("Enter phone \n");
        String phone = sc.next();
        isValidPhone(phone);
        System.out.println("Enter password \n");
        String password = sc.next();
        isValidPassword(password);
    }
}
