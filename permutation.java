import java.util.Scanner;

public class permutation {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a string: ");
    String str = sc.nextLine();
    permute(str, "");
    sc.close();
  }

  public static void permute(String str, String answer) {
    if (str.length() == 0) {
      System.out.println(answer);
      return;
    }

    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      String remaining = str.substring(0, i) + str.substring(i + 1);
      permute(remaining, answer + ch);
    }
  }
}
