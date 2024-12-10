package Alpro1.Introduction.Exercise;
import java.util.Scanner;

public class Exercise {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    try {

      System.out.print("First name: "); // ex First name: Galuh
      String firstName = scanner.nextLine();

      System.out.print("Second name: "); // ex Second name: Perdana
      String secondName = scanner.nextLine();

      System.out.print("Addres: "); // ex Addres: Indonesia
      String addres = scanner.nextLine();

      System.out.print("Place of birth: "); // Place of birth: ex Indonesia
      String placeOfBirth = scanner.nextLine();

      System.out.print("Date of birth: "); //ex Date of birth: 30 February 2024
      String dateOfBirth = scanner.nextLine();

      System.out.print("Age: "); // ex Age: 69
      int age = scanner.nextInt();

      System.out.println("Full name: " + firstName + " " + secondName);
      System.out.println("Addres: " + addres);
      System.out.println("Place and Date of Birth: " + placeOfBirth + ", " + dateOfBirth);
      System.out.println("Age: " + age + " y.o");

      /*
       output: 

       Full name: Galuh Perdana
       Addres: Indonesia
       Place and Date of Birth: Indonesia, 30 February 2024
       Age: 69 y.o

       */

    } catch (Exception e) {
      System.out.println("Invalid input!.");
    }
    scanner.close();
  }
}
