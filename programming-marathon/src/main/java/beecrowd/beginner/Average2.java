package beecrowd.beginner;

import java.util.Scanner;

public class Average2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double MEDIA = ((A*2 ) + (B*3) + (C*5)) / (2+3+5);

        System.out.println(String.format("MEDIA = %.1f", MEDIA));
    }
}
