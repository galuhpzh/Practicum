package Alpro1.Condition.Exercise;
import java.util.Scanner;

public class Exercise2 {
  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
    try {
      double totalPurchase, totalDiscount, amountToPay;
      int transactionNumber;
      double discount10 = 0;
      double discount5 = 0;

      System.out.print("Enter total purchase: ");
      totalPurchase = scanner.nextDouble();

      System.out.print("Enter transaction number: ");
      transactionNumber = scanner.nextInt();

      if (totalPurchase > 50000) {
        discount10 = totalPurchase * 0.10;
      }

      if (transactionNumber <= 50 && totalPurchase > 50000) {
        discount5 = totalPurchase * 0.05;
      }

      totalDiscount = discount10 + discount5;
      amountToPay = totalPurchase - totalDiscount;

      System.out.println("Total discount: Rp." + totalDiscount);
      System.out.println("Total amount to pay: Rp." + amountToPay);
    } catch (Exception e) {
      System.out.println("Input not valid!.");
    }
    scanner.close();
  }
}
