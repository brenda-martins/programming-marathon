package beecrowd.beginner;

//Make a program that reads five integer values. Count how many   of these values are even, odd, positive and negative.
// Print these information like following example.
//Input
//
//The input will be 5 integer values.
//Output
//
//Print a message like the following example with all letters in lowercase,
// indicating how many of these values ​​are even, odd, positive and negative.

import java.util.Scanner;

public class EvenOddPositiveAndNegative {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N1 = scanner.nextInt();
        var N2 = scanner.nextInt();
        var N3 = scanner.nextInt();
        var N4 = scanner.nextInt();
        var N5 = scanner.nextInt();

        var numbers = new int[]{N1, N2, N3, N4, N5};

        var even = 0;
        var odd = 0;
        var positives = 0;
        var negatives = 0;


        for (int i = 0; i < numbers.length; i++){
            if(numbers[i] % 2 == 0){
                even ++;
            }

            if (numbers[i] % 2 != 0){
                odd++;
            }

            if(numbers[i] > 0){
                positives++;
            }

            if(numbers[i] < 0){
                negatives++;
            }
        }

        System.out.println(even + " valor(es) par(es)");
        System.out.println(odd + " valor(es) impar(es)");
        System.out.println(positives + " valor(es) positivo(s)");
        System.out.println(negatives + " valor(es) negativo(s)");
    }
}
