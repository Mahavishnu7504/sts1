 import java.util.Scanner;

public class Trim {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");

        // Read the input string
        String input = sc.nextLine();

        // Close the scanner
        sc.close();

        // Remove leading and trailing spaces
        String trimmedInput = input.trim();

        // Print the result
        System.out.println("String after trimming: " + trimmedInput);
    }
}
