package beecrowd.beginner;

import java.util.List;
import java.util.Scanner;



//Read 6 values that can be floating point numbers. After, print how many of them were positive.
// In the next line, print the average of all positive values typed, with one digit after the decimal point.
//Input
//
//The input consist in 6 numbers that can be integer or floating point values. At least one number will be positive.
//Output
//
//The first output value is the amount of positive numbers. The next line should show the average of the positive values ​typed.


public class PositivesAndAverage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N1 = scanner.nextDouble();
        var N2 = scanner.nextDouble();
        var N3 = scanner.nextDouble();
        var N4 = scanner.nextDouble();
        var N5 = scanner.nextDouble();
        var N6 = scanner.nextDouble();

        final var numbers = List.of(N1, N2, N3, N4, N5, N6);
        var totalOfPositivesNumbers = 0;
        var sumOfPositivesNumbers = 0.0;
        var media = 0.0;

        for (Double number: numbers) {
            if(number >= 0){
                totalOfPositivesNumbers++;
                sumOfPositivesNumbers = sumOfPositivesNumbers + number;
            }
        }

        media = sumOfPositivesNumbers / totalOfPositivesNumbers;

        System.out.println(totalOfPositivesNumbers + " valores positivos");
        System.out.println(String.format("%.1f", media));
    }
}
