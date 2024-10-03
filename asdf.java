import java.util.Scanner;

public class asdf {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i = 0; i < n; i++) {
      int stars = n - i;
      for(int j = 0; j < stars; j++) {
        System.out.print("*");
      }
      System.out.print("\n");
    }
  }


}
