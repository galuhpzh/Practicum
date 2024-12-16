package Alpro1.VariableDataTyeOperator.Exercise;
import java.util.Scanner;
public class Parallelogram {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {

      System.out.print("Base (Cm): ");
      double base = scanner.nextDouble();

      System.out.print("Height (Cm): ");
      double height = scanner.nextDouble();

      double areaParallelogram = base * height;

      System.out.println("Area parallelogram: " + areaParallelogram + " Cm²");
    } catch (Exception e) {
      System.out.println("Invalid input!.");
    }
    scanner.close();
  }
}
