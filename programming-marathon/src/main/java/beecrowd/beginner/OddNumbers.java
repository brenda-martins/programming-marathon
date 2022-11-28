package beecrowd.beginner;



//Read an integer value X (1 <= X <= 1000).  Then print the odd numbers from 1 to X, each one in a line, including X if is the case.
//Input
//
//The input will be an integer value.
//Output
//
//Print all odd values between 1 and X, including X if is the case.

import java.util.Scanner;

public class OddNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var value = scanner.nextInt();

        for (int i = 0; i <= value; i++){

            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
