package beecrowd.beginner;
import java.util.Scanner;


//Read two nteger values (A and B). After, the program should print the message "Sao Multiplos" (are multiples) or
// "Nao sao Multiplos" (aren’t multiples), corresponding to the read values.
//Input
//
//The input has two integer numbers.
//Output
//
//Print the relative message to the input as stated above.


public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        if(A % B == 0){
            System.out.println("Sao Multiplos");
        }else if(B % A == 0){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
