
import java.util.Scanner;

public class p2 {
  public static void main(String[] args) {
    int count =0;
    Scanner scanner = new Scanner(System.in);
    System.out.println("enter a number");
    int number = scanner.nextInt();
    scanner.close();

    while (count<=number){
      String pattern = "*".repeat(count);
      System.out.println(pattern);
      count++;
  }  
}
}
