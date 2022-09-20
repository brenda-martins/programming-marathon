package beginner;

import java.util.Scanner;

public class SalaryWithBonus {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        double salary = scanner.nextDouble();
        double totalSold = scanner.nextDouble();

        double commission = 15/100.0;
        double totalCommissionAmount = totalSold * commission;
        double totalSalary = salary + totalCommissionAmount;

        System.out.println(String.format("TOTAL = R$ %.2f", totalSalary));

    }
}
