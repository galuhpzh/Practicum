package Alpro1.Loop.Exercise;
import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      
      System.out.print("Enter the initial cost of Hajj (Rp): ");
      double initialCost = scanner.nextDouble();

      System.out.print("Enter the monthly saving amount (Rp): ");
      double monthlySaving = scanner.nextDouble();

      System.out.print("Enter the average annual increase in cost (%): ");
      double annualIncreaseRate = scanner.nextDouble();

      double currentCost = initialCost;
      double totalSavings = 0;
      int months = 0;

      while (totalSavings < currentCost) {
        totalSavings += monthlySaving;
        months++;

        if (months % 12 == 0) {
          currentCost += currentCost * (annualIncreaseRate / 100);
        }
      }

      System.out.println("The time required to save for Hajj is " + months + " months.");
      scanner.close();

    } catch (Exception e) {
      System.out.println("Invalid input!.");
    }
  }
}
