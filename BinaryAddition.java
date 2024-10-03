import java.util.Scanner;

public class BinaryAddition {

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i--) - '0';
            }

            if (j >= 0) {
                sum += b.charAt(j--) - '0';
            }

            // Compute current bit (0 or 1)
            result.append(sum % 2);

            // Compute carry (0 or 1)
            carry = sum / 2;
        }

        // If there's a carry left, add it
        if (carry != 0) {
            result.append(carry);
        }

        // Since we've built the result string in reverse order, reverse it back
        return result.reverse().toString();
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the first binary number: ");
        String a = scanner.nextLine();

        System.out.print("Enter the second binary number: ");
        String b = scanner.nextLine();

        // Add the binary numbers
        String sum = addBinary(a, b);

        // Display the result
        System.out.println("The sum is: " + sum);
    }
}
