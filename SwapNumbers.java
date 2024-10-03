import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        // Swap using bitwise XOR
        a = a ^ b;  // a now becomes the XOR of a and b
        b = a ^ b;  // b becomes the original value of a
        a = a ^ b;  // a becomes the original value of b

        System.out.println("After swapping: a = " + a + ", b = " + b);

        // Close the scanner
        scanner.close();
    }
}
