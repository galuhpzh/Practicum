package Alpro1.VariableDataTyeOperator.Exercise;
import java.util.Scanner;

public class Circle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {

      double radius, areaCircle;

      System.out.print("Radius (r² Cm): ");
      radius = scanner.nextDouble();

      final double PHI = 3.14159;

      areaCircle = PHI * radius * radius;

      System.out.println("Area circle: " + areaCircle + " Cm²");

    } catch (Exception e) {
      System.out.println("Invalid input!.");
    }
    
    scanner.close();
  }
}
