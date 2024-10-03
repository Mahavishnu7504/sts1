public class matrixmultiplication {

  public static void main(String[] args) {
      // Define two matrices
      int[][] matrix1 = {
          {1, 2, 3},
          {4, 2, 2},
          {3, 4, 2}
      };
      
      int[][] matrix2 = {
          {6, 4, 1},
          {1, 2, 3},
          {3, 2, 1}
      };
      
      // Result matrix to store the product
      int[][] result = new int[matrix1.length][matrix2[0].length];
      
      // Multiply the two matrices
      for (int i = 0; i < matrix1.length; i++) {
          for (int j = 0; j < matrix2[0].length; j++) {
              for (int k = 0; k < matrix1[0].length; k++) {
                  result[i][j] += matrix1[i][k] * matrix2[k][j];
              }
          }
      }
      
      // Display the result matrix
      System.out.println("Product of the matrices:");
      for (int i = 0; i < result.length; i++) {
          for (int j = 0; j < result[0].length; j++) {
              System.out.print(result[i][j] + " ");
          }
          System.out.println();
      }
  }
}
