package Alpro1.Introduction.Try;
import java.util.Scanner;

public class Try {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    try {

      System.out.println("Age: "); // ex 69
      int age = scanner.nextInt(); // if input not number, computer will print "Invalid input!.", ex Sixty nine.

      scanner.nextLine(); // for clear scanner

      System.out.println("Name: "); // but if your input is number in String, computer will print your number as string 
      String name = scanner.nextLine(); // ex Galuh72

      System.out.println(age);
      System.out.println(name);

      /*
       output: 
       69
       Galuh72
       */

    } catch (Exception e) {
      System.out.println("Invalid input!.");
    }
    scanner.close(); // close the scanner
  }
}
