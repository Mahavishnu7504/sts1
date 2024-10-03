import java.util.Scanner;

public class PasswordChecker {

    public static boolean isStrongPassword(String password) {
        if (password.length() < 8) {
            return false; // Password is too short
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasDigit = false;
        boolean hasSpecialChar = false;

        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(c)) {
                hasLowerCase = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecialChar = true; // Special character
            }
        }

        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your password: ");
        String password = scanner.nextLine();

        if (isStrongPassword(password)) {
            System.out.println("Your password is strong.");
        } else {
            System.out.println("Your password is weak.");
        }

        scanner.close();
    }
}
