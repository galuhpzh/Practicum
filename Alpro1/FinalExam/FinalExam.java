package Alpro1.FinalExam;
import java.util.Scanner;
import java.text.DecimalFormat;

public class FinalExam {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("#,###.##");

    int regular = 40000000, plus = 70000000, vip = 120000000;

    System.out.println("Choose a Hajj package: ");
    System.out.println("1. Regular (Rp40.000.000)");
    System.out.println("2. Plus (Rp70.000.000)");
    System.out.println("3. VIP (Rp120.000.000)");
    System.out.print("Enter your choice (1/2/3): ");
    int packageChoice = scanner.nextInt();
    int selectedPackage = 0;
    
    switch (packageChoice) {
      case 1:
        selectedPackage = regular;
        break;
      case 2:
        selectedPackage = plus;
        break;
      case 3:
        selectedPackage = vip;
        break;
      default:
        selectedPackage = 0;
        break;
    }

    scanner.nextLine();

    System.out.println("Available optional additions: ");
    System.out.println("1. Health Insurance (Rp5.000.000)");
    System.out.println("2. Hotel Near Masjidil Haram (Rp10.000.000)");
    System.out.println("3. Catering Service Upgrade (Rp7.000.000)");
    System.out.print("Enter the additional numbers you choose (separate with commas, e.g., 1,3): ");
    String optionalChoices = scanner.nextLine();
    int optionalAdditions = 0;

    String[] choices = optionalChoices.split(",");
    for (String p : choices) {
        if (p.trim().equals("1")) {
            optionalAdditions += 5000000;
        } else if (p.trim().equals("2")) {
            optionalAdditions += 10000000;
        } else if (p.trim().equals("3")) {
            optionalAdditions += 7000000;
        }
    }

    System.out.print("Enter the age of the prospective pilgrim: ");
    int age = scanner.nextInt();
    System.out.print("Enter the amount of down payment already made: ");
    int downPayment = scanner.nextInt();
    System.out.print("Enter the number of years until departure: ");
    int yearsUntilDeparture = scanner.nextInt();
    System.out.print("Enter initial savings: ");
    int initialSavings = scanner.nextInt();
    System.out.print("Enter monthly savings: ");
    int monthlySavings = scanner.nextInt();

    double totalCost = selectedPackage + optionalAdditions;
    for (int i = 0; i < yearsUntilDeparture; i++) {
      totalCost += totalCost * 0.05;
    }

    double totalCostInflation = totalCost, ageSubsidy = 0, downPaymentSubsidy = 0, totalSubsidy = 0, subsidyCost = 0;

    if (age >= 60) {
      ageSubsidy = totalCost * 0.10;
    }

    if (downPayment > 10000000) {
      downPaymentSubsidy = 2000000;
    }

    totalSubsidy = downPaymentSubsidy + ageSubsidy;
    subsidyCost = totalCost - totalSubsidy;

    int savingMonths = 0, months = 0, years = 0;
    int totalSavings = initialSavings;
    totalCost = totalCost - totalSubsidy - downPayment;

    while (totalSavings < totalCost) {
        totalSavings += monthlySavings;
        savingMonths++;
    }

    years = savingMonths / 12;
    months = savingMonths % 12;

    System.out.println("\n### HAJJ COST SIMULATION ###");
    System.out.println("Selected package cost: Rp. " + df.format(selectedPackage));
    System.out.println("Additional cost: Rp. " + df.format(optionalAdditions));
    System.out.println("Total initial cost: Rp. " + df.format(optionalAdditions + selectedPackage));
    System.out.println("Total cost after inflation: Rp. " + df.format(totalCostInflation));
    System.out.println("Total discount/subsidy: Rp. " + df.format(totalSubsidy));
    System.out.println("Total final cost after discount/subsidy: Rp. " + df.format(subsidyCost));

    System.out.println("\n### SAVINGS SIMULATION ###");
    System.out.println("Initial savings: Rp. " + df.format(initialSavings));
    System.out.println("Monthly savings: Rp. " + df.format(monthlySavings));
    System.out.println("Down payment: Rp. " + df.format(downPayment));
    System.out.println("Saving time: Rp. " + savingMonths + " Months (" + years + " years " + months + " months)");

    scanner.close();
  }
}