package beginner;

import java.util.Scanner;

public class TheGreatest {
    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();

        int maiorAB = (A + B + Math.abs(A - B))/2;
        int maior = (maiorAB + C + Math.abs(maiorAB - C)) / 2;

        System.out.println(maior + " eh o maior");

    }
}
