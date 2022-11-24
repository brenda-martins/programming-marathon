package beecrowd.beginner;

import java.util.Scanner;

//Read an integer number between 1 and 12, including.
// Corresponding to this number, you must print the month of the year, in english, with the first letter in uppercase.
//Input
//
//The input contains only an integer number.
//Output
//
//Print the name of the month according to the input number, with the first letter in uppercase.

public class Month {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var monthNumber = scanner.nextInt();

        switch (monthNumber) {
            case 1 -> System.out.println("January");
            case 2 -> System.out.println("February");
            case 3 -> System.out.println("March");
            case 4 -> System.out.println("April");
            case 5 -> System.out.println("May");
            case 6 -> System.out.println("June");
            case 7 -> System.out.println("July");
            case 8 -> System.out.println("August");
            case 9 -> System.out.println("September");
            case 10 -> System.out.println("October");
            case 11 -> System.out.println("November");
            case 12 -> System.out.println("December");
        }
    }
}
