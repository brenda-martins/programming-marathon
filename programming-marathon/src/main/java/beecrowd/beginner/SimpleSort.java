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

        int[] vector = new int[]{6,3,4,5,2,7,1,9,8,0};

        System.out.println("Simple Sort: ");
        simpleSort(numbers.clone());
        System.out.println();
        print(numbers);

        int[] clone = numbers.clone();
        quickSort(clone, 0, clone.length-1);
        System.out.println();
        System.out.println("Quick Sort: ");
        print(clone);
    }

    private static void simpleSort(int[] numbers) {
        int aux;
        for(int i = 0; i < numbers.length; i++){
            for(int x = i+1; x < numbers.length; x++){
                if(numbers[i] > numbers[x]){
                    aux = numbers[i];
                    numbers[i] = numbers[x];
                    numbers[x] = aux;
                }
            }
        }
        print(numbers);

    }

    private static void quickSort(int[] vector, int left, int rigth){
        if(left < rigth){
            int pivot = partition(vector, left, rigth); // 6
            quickSort(vector, left, pivot-1); // v, 0, 5
            quickSort(vector, pivot+1, rigth);

        }
    }
    private static int partition(int[] vector, int left, int rigth) {
        int i = left + 1;
        int j = rigth;
        int pivot = vector[left];

        while(i <= j){
            if(vector[i] <= pivot) i++;
            else if (vector[j] > pivot) j--;
            else if (i <= j) {
                trocar(vector, i, j);
                i++;
                j--;
            }
        }
        trocar(vector, left, j);
        return j;
    }

    private static void trocar(int[] vector, int i, int j) {
        int aux = vector[i];
        vector[i] = vector[j];
        vector[j] = aux;
    }

    private static void print(int[] vector){
        for(int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
    }
}
