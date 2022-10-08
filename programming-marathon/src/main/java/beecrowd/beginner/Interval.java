package beecrowd.beginner;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var number = scanner.nextDouble();
        if(number < 0 || number > 100){
            System.out.println("Fora de intervalo");
        }else if(number >= 0 && number <= 25){
            System.out.println("Intervalo [0,25]");
        }else if(number > 25 && number <= 50){
            System.out.println("Intervalo (25,50]");
        }else if(number > 75 && number <= 100){
            System.out.println("Intervalo (75,100]");
        }
    }
}
