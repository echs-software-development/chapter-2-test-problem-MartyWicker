import java.util.Scanner;

public class Chapter2Test {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
  
  System.out.println("Please type an integer.");

  int num1 = scan.nextInt();

  System.out.println("Please type a second integer.");

  int num2 = scan.nextInt();

  System.out.println("You chose:" + " " + num1 + " " + "and" + " " + num2 + ".");

  double num3 = (num1+num2)/2.0;

  System.out.println(num3);
  }
}