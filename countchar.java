
  import java.util.Scanner;

public class countchar {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");

        // Read the input string
        String input = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Calculate the length of the string
        int length = input.length();

        // Print the result
        System.out.println("No. of characters in the string: " + length);
    }
}


