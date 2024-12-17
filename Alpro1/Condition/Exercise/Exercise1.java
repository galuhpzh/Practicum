package Alpro1.Condition.Exercise;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int hoursPerWeek, wage, deduction, bonus;
        
            try {
               System.out.print("Name: ");
               name = scanner.nextLine();
               
               System.out.print("Hours per week: ");
               hoursPerWeek = scanner.nextInt();
               
               if (hoursPerWeek >= 50 && hoursPerWeek <= 60) {
                   wage = hoursPerWeek * 5000;
               } else if (hoursPerWeek > 60) {
                   bonus = (hoursPerWeek - 60) * 7500;
                   wage =  (60 * 5000) + bonus;
               } else {
                   deduction = (50 - hoursPerWeek) * 2500;
                   wage = (50 * 5000) - deduction;
               }
               
               System.out.println("Name: " + name);
               System.out.println("Wage: Rp. " + wage);
            } catch (Exception e) {
                System.out.println("Harap masukkan pilihan yang valid!.");
            }
            
        scanner.close();
        
    }
}
