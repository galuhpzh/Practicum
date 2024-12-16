package Alpro1.VariableDataTyeOperator.Exercise;
import java.util.Scanner;

public class Trapezium {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      double firstParallel, secondParallel, height;

      System.out.print("First parallel side (Cm): ");
      firstParallel = scanner.nextDouble();

      System.out.print("Second parallel side (Cm): ");
      secondParallel = scanner.nextDouble();

      System.out.print("height (Cm): ");
      height = scanner.nextDouble();

      double areaTrapezium = 0.5 * (firstParallel + secondParallel) * height;

      System.out.println("Area trapezium: " + areaTrapezium + " Cm²");
    } catch (Exception e) {
      System.out.println("Invalid input!.");
    }
    scanner.close();
  }  
}
