import java.util.Scanner;

 public class Countstring {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt user to enter a string
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        
        // Call the method to count words and display the result
        int wordCount = countWords(input);
        System.out.println("Number of words: " + wordCount);
        
        // Close the scanner
        scanner.close();
    }

    // Method to count words in a string
    public static int countWords(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        // Split the string by spaces and count the resulting parts
        String[] words = str.trim().split("\\s+");
        return words.length;
    }
}
