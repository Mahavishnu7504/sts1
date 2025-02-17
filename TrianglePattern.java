public class TrianglePattern {
    public static void main(String[] args) {
        int rows = 6; // Number of rows

        for (int i = 1; i <= rows; i++) {
            // Print spaces before stars in each row
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            // Print stars for the current row
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // Move to the next line after printing each row
            System.out.println();
        }
    }
}
