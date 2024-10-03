import java.util.regex.*;

public class RegexExample {

    public static void main(String[] args) {
        // Define a regular expression pattern for an email
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        // Create a pattern object
        Pattern pattern = Pattern.compile(emailRegex);

        // Define a test string (email) to match the pattern
        String email = "example@example.com";

        // Match the input string (email) with the pattern
        Matcher matcher = pattern.matcher(email);

        // Check if the email matches the pattern
        if (matcher.matches()) {
            System.out.println(email + " is a valid email address.");
        } else {
            System.out.println(email + " is not a valid email address.");
        }
    }
}
