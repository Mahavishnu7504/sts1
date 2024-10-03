import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        try (// Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in)) {
            // Prompt the user for input
            System.out.print("Enter the number of terms in  Fibonacci series: ");
            int n = scanner.nextInt();

            int firstTerm = 0, secondTerm = 1;

            System.out.println("Fibonacci Series up to " + n + " terms:");

            for (int i = 1; i <= n; ++i) {
                System.out.print(firstTerm + " ");

                // Compute the next term
                int nextTerm = firstTerm + secondTerm;
                firstTerm = secondTerm;
                secondTerm = nextTerm;
            }
        }
    }
}
