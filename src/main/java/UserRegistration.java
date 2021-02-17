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
    }
}
