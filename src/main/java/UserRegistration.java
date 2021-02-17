import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static void isValidFirstName(String firstName) {

        Pattern pattern = Pattern.compile("^[A-Z][a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.find()) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }

    }

    public static void main(String Args[]) {
        System.out.println("Enter First Name");
        Scanner sc = new Scanner(System.in);
        String firstName = sc.next();
        isValidFirstName(firstName);

    }
}
