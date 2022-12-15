package beecrowd.beginner;

import java.util.Scanner;


//Read an integer value X and print the 6 consecutive odd numbers from X, a value per line, including X if it is the case.
//        Input
//
//        The input will be a positive integer value.
//        Output
//
//        The output will be a sequence of six odd numbers.

public class SixOddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var number = scanner.nextInt();
        var count = 0;

        while (count < 6){
            if(number % 2 != 0){
                System.out.println(number);
                count++;
            }

            number++;
        }

    }
}
