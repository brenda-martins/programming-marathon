package beecrowd.beginner;



//Make a program that reads five integer values.
// Count how many of these values ​​are even and  print this information like the following example.
//Input
//
//The input will be 5 integer values.
//Output
//
//Print a message like the following example with all letters in lowercase, indicating how many even numbers were typed.

import java.util.Scanner;

public class EvenBetweenFiveNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var N1 = scanner.nextInt();
        var N2 = scanner.nextInt();
        var N3 = scanner.nextInt();
        var N4 = scanner.nextInt();
        var N5 = scanner.nextInt();

        var numbers = new int[]{N1, N2, N3, N4, N5};
        var count = 0;

        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                count++;
            }
        }

        System.out.println(count + " valores pares");
    }
}
