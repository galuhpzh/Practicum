package Alpro1.VariableDataTyeOperator.Exercise;
import java.util.Scanner;

public class Rectangle {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {

      System.out.print("Length (Cm): ");
      double length = scanner.nextDouble();

      System.out.print("Width (Cm): ");
      double width = scanner.nextDouble();

      double areaRectangle = length * width;

      System.out.println("Area rectangle: " + areaRectangle + " Cm²");

    } catch (Exception e) {
      System.out.println("Ivalid input!.");
    }
    
    scanner.close();
  }
}
