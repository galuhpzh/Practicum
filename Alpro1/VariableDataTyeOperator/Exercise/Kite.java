package Alpro1.VariableDataTyeOperator.Exercise;
import java.util.Scanner;

public class Kite {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      double diagonal1, diagonal2;

      System.out.print("Diagonal 1 (Cm): ");
      diagonal1 = scanner.nextDouble();

      System.out.print("Diagonal 2 (Cm): ");
      diagonal2 = scanner.nextDouble();

      double areaKite = 0.5 * diagonal1 * diagonal2;

      System.out.println("Area kite: " + areaKite + " Cm²");
    } catch (Exception e) {
      System.out.println("Invalid input!.");
    }
    scanner.close();
  }
}
