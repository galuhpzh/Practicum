package Alpro1.VariableDataTyeOperator.Exercise;
import java.util.Scanner;

public class Square {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {
      
      System.out.print("Side (Cm): ");
      double side = scanner.nextDouble();

      double areaSquare = side * side;
      
      System.out.println("Area square: " + areaSquare + " Cm²");
      
    } catch (Exception e) {
      System.out.println("Invalid input!.");
    }

    scanner.close();
  }
}
