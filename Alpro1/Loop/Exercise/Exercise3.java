package Alpro1.Loop.Exercise;
import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = 0, count = 0, total = 0;
    String answer;

    while (true) {
      try {
        System.out.print("Enter number " + (count + 1) + ": ");
        number = scanner.nextInt();

        scanner.nextLine();

        total += number;
        count++;

        System.out.print("Do you want to continue (y/n): ");
        answer = scanner.nextLine().toLowerCase();

        if (answer.equalsIgnoreCase("n")) {
          System.out.println("Program stopped.");
          scanner.close();
          break;
        } else if (answer.equalsIgnoreCase("y")) {
          System.out.println("Program continues.");
          continue;
        } else {
          System.out.println("Please enter a valid option.");
        }
      } catch (Exception e) {
        System.out.println("Please enter a valid input.");
        scanner.next();
      }
    }
    System.out.println("Total sum: " + total);
  }
}
