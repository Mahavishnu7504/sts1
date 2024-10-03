import java.util.Scanner;

public class arm{
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            int originalNumber = number;
            int sum = 0;
            int digits = 0;

            // Calculate the number of digits
            while (originalNumber != 0) {
                digits++;
                originalNumber /= 10;
            }

            originalNumber = number;

            // Calculate the sum of digits raised to the power of number of digits
            while (originalNumber != 0) {
                int digit = originalNumber % 10;
                sum += Math.pow(digit, digits);
                originalNumber /= 10;
            }

            // Check if the sum is equal to the original number
            if (sum == number) {
                System.out.println(number + " is an Armstrong number.");
            } else {
                System.out.println(number + " is not an Armstrong number.");
            }
        }
    }
}
