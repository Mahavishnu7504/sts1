import java.util.Scanner;

public class PN {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int number = scanner.nextInt();
            scanner.close();

            if (number > 0) {
                System.out.println(number + " positive number.");
            } else if (number < 0) {
                System.out.println(number + " negative number.");
            } else {
                System.out.println(number + "  neither positive nor negative (it's zero).");
            }
        }
    }
}
