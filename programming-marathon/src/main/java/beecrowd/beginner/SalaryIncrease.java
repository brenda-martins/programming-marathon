package beecrowd.beginner;

import java.util.Scanner;

//
//The company ABC decided to give a salary increase to its employees, according to the following table:
//
//        Salary 	Readjustment Rate
//
//        0 - 400.00          - 15%
//        400.01 - 800.00     - 12%
//        800.01 - 1200.00    - 10%
//        1200.01 - 2000.00   - 7%
//        Above 2000.00       - 4%
//
//Read the employee's salary, calculate and print the new employee's salary,
//as well the money earned and the increase percentual obtained by the employee,
//with corresponding messages in Portuguese, as the below example.
//
//Input
//    The input contains only a floating-point number, with 2 digits after the decimal point.
//
// Output
//    Print 3 messages followed by the corresponding numbers (see example) informing the new salary,
//    the among of money earned (both must be shown with 2 decimal places) and the percentual obtained by the employee. Note:
//    Novo salario:  means "New Salary"
//    Reajuste ganho: means "Money earned"
//    Em percentual: means "In percentage"

public class SalaryIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var salary = scanner.nextDouble();
        double newSalary, moneyEarned, percentage;

        if(salary > 0.0 && salary <= 400.00){
            percentage = 15/100.00;
            newSalary  = salary + (salary * percentage);
            moneyEarned = salary * percentage;

            System.out.println(String.format("Novo salario: %.2f", newSalary));
            System.out.println(String.format("Reajuste ganho: %.2f", moneyEarned));
            System.out.println("Em percentual: 15 %");
        }else if(salary >= 400.01 && salary <= 800){
            percentage = 12/100.00;
            newSalary  = salary + (salary * percentage);
            moneyEarned = salary * percentage;

            System.out.println(String.format("Novo salario: %.2f", newSalary));
            System.out.println(String.format("Reajuste ganho: %.2f", moneyEarned));
            System.out.println("Em percentual: 12 %");
        } else if (salary >= 800.01 && salary <= 1200) {
            percentage = 10/100.00;
            newSalary  = salary + (salary * percentage);
            moneyEarned = salary * percentage;

            System.out.println(String.format("Novo salario: %.2f", newSalary));
            System.out.println(String.format("Reajuste ganho: %.2f", moneyEarned));
            System.out.println("Em percentual: 10 %");
        }else if (salary >= 1200.01 && salary <= 2000){
            percentage = 7/100.00;
            newSalary  = salary + (salary * percentage);
            moneyEarned = salary * percentage;

            System.out.println(String.format("Novo salario: %.2f", newSalary));
            System.out.println(String.format("Reajuste ganho: %.2f", moneyEarned));
            System.out.println("Em percentual: 7 %");
        }else{
            percentage = 4/100.00;
            newSalary  = salary + (salary * percentage);
            moneyEarned = salary * percentage;

            System.out.println(String.format("Novo salario: %.2f", newSalary));
            System.out.println(String.format("Reajuste ganho: %.2f", moneyEarned));
            System.out.println("Em percentual: 4 %");
        }


    }
}
