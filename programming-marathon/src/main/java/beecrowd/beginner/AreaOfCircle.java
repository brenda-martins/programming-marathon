package beecrowd.beginner;

import java.util.Scanner;


public class AreaOfCircle {

    private static final Double n = 3.14159;

    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        var R = scanner.nextDouble();
        var A = n * Math.pow(R, 2);

        System.out.println(String.format("A=%.4f", A));

    }
}
