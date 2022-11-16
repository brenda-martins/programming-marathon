package beecrowd.beginner;

import java.util.Scanner;

public class Taxes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var salary = scanner.nextDouble();

        double taxes = 0;

        if(salary > 0 && salary <= 2000){
            System.out.println("Isento");
        }

        if(salary > 2000 && salary <= 3000){
            taxes = (salary - 2000) * 8/100;
        }


        if(salary > 3000 && salary <= 4500){
            var salary1 = salary - 3000;
            var salary2 = salary - salary1 - 2000;

            taxes = (salary1 * 18 /100) + (salary2 * 8/100);
        }

        if(salary > 4500){
            var salary1 = salary - 4500; //20
            var salary2 = salary - salary1 - 3000;//1500
            var salary3 = salary - salary1 - salary2 - 2000;

            taxes = (salary1 * 28/100) + (salary2 * 18/100) + (salary3 * 8/100);
        }

        System.out.println(String.format("R$ %.2f", taxes));
    }
}
