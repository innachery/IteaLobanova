import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    public static void main(String[] args) {
        String phoneNumber = "+380632433959";
        Pattern pattern = Pattern.compile("(\\+?380)([0-9]{9})");
        Matcher matcher = pattern.matcher(phoneNumber);
        if (matcher.matches()) {
            System.out.println("Phone number " + phoneNumber + " is correct");
        } else {
            System.out.println("Phone number " + phoneNumber + " is incorrect");
        }
    }
}
