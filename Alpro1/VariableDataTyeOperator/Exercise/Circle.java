package Alpro1.VariableDataTyeOperator.Exercise;
import java.util.Scanner;

public class Circle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {

      System.out.print("Radius (r² Cm): ");
      double radius = scanner.nextDouble();

      double areaCircle = 3.14 * radius;

      System.out.println("Area circle: " + areaCircle);

    } catch (Exception e) {
      System.out.println("Invalid input!.");
    }
    
    scanner.close();
  }
}
