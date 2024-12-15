package Alpro1.Introduction.Input;
import java.util.Scanner; // import scanner form libary

public class ScannerInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Name: "); // ex Name: Galuh
    String name = scanner.nextLine();

    System.out.println("Age: "); // ex Age: 69
    int age = scanner.nextInt();

    System.out.println("My name is " + name); // print name
    System.out.println("Age " + age); // print age

    /*
     output:
     My name is Galuh
     Age: 69
     */

    scanner.close();
  }
}
