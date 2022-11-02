package beecrowd.beginner;
import java.util.Scanner;



//Read three integers and sort them in ascending order.
// After, print these values in ascending order, a blank line and then the values in the sequence as they were readed.
//Input
//
//The input contains three integer numbers.
//Output
//
//Present the output as requested above.


public class SimpleSort {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N1 = scanner.nextInt();
        int N2 = scanner.nextInt();
        int N3 = scanner.nextInt();

        int[] numbers = new int[]{N1, N2, N3};
        int[] numbersClone = numbers.clone();
        int aux;

        for(int i = 0; i < numbersClone.length; i++){
            for(int x = i+1; x < numbersClone.length; x++){
                if(numbersClone[i] > numbersClone[x]){
                    aux = numbersClone[i];
                    numbersClone[i] = numbersClone[x];
                    numbersClone[x] = aux;
                }
            }
        }

        for(int i = 0; i < numbersClone.length; i++) {
            System.out.println(numbersClone[i]);
        }
        System.out.println();

        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }
}
