package Alpro1.Loop.Exercise;
import java.util.Scanner;

public class Exercise3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int bilangan = 0, hitung = 0, total = 0;
    String jawab;

    while(true) {
      try {
        System.out.print("Masukkan bilangan ke-"+ (hitung + 1) + ": ");
        bilangan = scanner.nextInt();

        scanner.nextLine();

        total += bilangan;
        hitung++;

        System.out.print("Mau lanjut (y/n): ");
        jawab = scanner.nextLine().toLowerCase();

        if (jawab.equalsIgnoreCase("t")) {
          System.out.println("Program berhenti!.");
          scanner.close();
          break;
        } else if (jawab.equalsIgnoreCase("y")) {
          System.out.println("Program berlanjut!.");
          continue;
        } else {
          System.out.println("Harap masukkan pilihan yang valid!.");
        }
      } catch (Exception e) {
        System.out.println("Harap masukkan pilihan yang valid!.");
        scanner.next();
      }  
    }
    System.out.println("Total bilangan: " + total);
  }
}