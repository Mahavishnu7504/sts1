import java.util.Scanner;

public class Factorial {

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        try (// Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in)) {
            // Prompt the user for input
            System.out.print("Enter a number to calculate its factorial: ");
            int number = scanner.nextInt();

            // Calculate the factorial
            long fact = factorial(number);

            // Display the result
            System.out.println("The factorial of " + number + " is: " + fact);
        }
    }
}
