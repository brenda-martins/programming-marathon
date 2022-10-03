package beecrowd.beginner;

//In this problem you have to read an integer value and calculate the smallest possible number of banknotes
// in which the value may be decomposed. The possible banknotes are 100, 50, 20, 10, 5, 2 e 1.
// Print the read value and the list of banknotes.
//
// Input
//
//The input file contains an integer value N (0 < N < 1000000).
//Output
//
//Print the read number and the minimum quantity of each necessary banknotes in Portuguese language, as the given example.
// Do not forget to print the end of line after each line, otherwise you will receive “Presentation Error”.

import java.util.List;
import java.util.Scanner;

public class BankNotes {


    private static List<Integer> notes = List.of(100, 50, 20, 10, 5, 2, 1);

    public static void main(String args[]){

        Scanner scanner = new Scanner(System.in);

        var value = scanner.nextInt();



    }

    private static void output(int quantity, int value){
        System.out.println(quantity + " nota(s) de R$ "+ value +",00");
    }
}
