package beecrowd.beginner;




//Write a program that reads 6 numbers. These numbers will only be positive or negative (disregard null values).
// Print the total number of positive numbers.
//Input
//
//Six numbers, positive and/or negative.
//Output
//
//Print a message with the total number of positive numbers.

import java.util.Scanner;

public class PositiveNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var N1 = scanner.nextDouble();
        var N2 = scanner.nextDouble();
        var N3 = scanner.nextDouble();
        var N4 = scanner.nextDouble();
        var N5 = scanner.nextDouble();
        var N6 = scanner.nextDouble();

        var array = new double[]{N1, N2, N3, N4, N5, N6};

        int count = 0;
        for (int i = 0; i < 6; i++){
            if (array[i] >= 0){
                count++;
            }
        }

        System.out.println(count + " valores positivos");
    }
}
