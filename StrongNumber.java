import java.util.Scanner;

public class StrongNumber {
  
    public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.println("Enter the number to Check: ");
      int n = scan.nextInt();
      scan.close();
      
      int m = n;
      int result = 0;
  
      while (n>0) {
        int x = n%10;
        int y = 1;
  
        while (x >0) {
          y *= x;
          x--;
        }
  
        result += y;
        n /=10;
        
      }
      System.out.println(m==result? "Yes it is strong number": "The given number is not strong number");
    }
  }

