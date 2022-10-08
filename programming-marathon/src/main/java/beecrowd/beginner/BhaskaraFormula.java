package beecrowd.beginner;



//Read 3 floating-point numbers. After, print the roots of bhaskara’s formula.
// If it's impossible to calculate the roots because a division by zero or a square root of a negative number,
// presents the message “Impossivel calcular”.
//Input
//
//Read 3 floating-point numbers (double) A, B and C.
//Output
//
//Print the result with 5 digits after the decimal point or the message if it is impossible to calculate.

import java.util.Scanner;

public class BhaskaraFormula {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var A = scanner.nextDouble();
        var B = scanner.nextDouble();
        var C = scanner.nextDouble();

        if(A <= 0){
            System.out.println("Impossivel calcular");
            return;
        }

        var delta = Math.pow(B, 2) - (4*A*C);
        var raiz = Math.sqrt(delta);

        if(delta > 0){
            var R1 = (-B + raiz)/(2*A);
            var R2 = (-B - raiz)/(2*A);

            System.out.println(String.format("R1 = %.5f", R1));
            System.out.println(String.format("R2 = %.5f", R2));
        }else{
            System.out.println("Impossivel calcular");
        }
    }
}
