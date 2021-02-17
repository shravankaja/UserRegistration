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
        isValidLastName(lastName);
        System.out.println("Enter Email \n");
        String email = sc.next();
        isValidEmail(email);
    }
}
