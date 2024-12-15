package Alpro1.VariableDataTyeOperator.Exercise;
import java.util.Scanner;

public class Triangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {

      System.out.print("Base (Cm): ");
      double base = scanner.nextInt();

      System.out.print("Height (Cm): ");
      double height = scanner.nextDouble();

      double areaTriangle = 0.5 * base * height;

      System.out.println("Area triangle: " + areaTriangle + " Cm");

    } catch (Exception e) {
      System.out.println("Invalid input!.");
    }

    scanner.close();
  }  
}
