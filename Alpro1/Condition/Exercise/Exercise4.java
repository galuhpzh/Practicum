package Alpro1.Condition.Exercise;
import java.util.Scanner;

public class Exercise4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String vehicleType, accidentHistory;
    int vehicleYear, driverAge, vehicleAge, premiumRate;
    int baseRate = 0;
    int vehicleAgeRate = 0;
    int ageRate = 0;
    int accidentRate = 0;

    try {
      System.out.print("Enter vehicle type: ");
      vehicleType = scanner.nextLine().toLowerCase();

      System.out.print("Enter vehicle manufacturing year: ");
      vehicleYear = scanner.nextInt();

      System.out.print("Enter driver age: ");
      driverAge = scanner.nextInt();

      scanner.nextLine();

      System.out.print("Do you have a history of accidents? (yes/no): ");
      accidentHistory = scanner.nextLine().toLowerCase();

      if (vehicleType.equalsIgnoreCase("motorcycle")) {
        baseRate = 100000;
      } else if (vehicleType.equalsIgnoreCase("car")) {
        baseRate = 200000;
      }

      vehicleAge = 2024 - vehicleYear;

      if (vehicleAge > 10) {
        vehicleAgeRate = 50000;
      }

      if (driverAge < 25) {
        ageRate = 100000;
      }

      if (accidentHistory.equalsIgnoreCase("yes")) {
        accidentRate = 150000;
      }

      premiumRate = baseRate + vehicleAgeRate + ageRate + accidentRate; 

      System.out.println("== Insurance Rate Details ==");
      System.out.println("Base rate: Rp" + baseRate);
      System.out.println("Additional cost for old vehicle: Rp" + vehicleAgeRate);
      System.out.println("Additional cost for driver age: Rp" + ageRate);
      System.out.println("Additional cost if there is a history of accidents: Rp" + accidentRate);
      System.out.println("Total premium rate: Rp" + premiumRate);
    } catch (Exception e) {
      System.out.println("Invalid input!.");
    }
    scanner.close();
  }
}