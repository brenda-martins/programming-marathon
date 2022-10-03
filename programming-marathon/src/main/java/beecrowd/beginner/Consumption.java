package beecrowd.beginner;

import java.util.Scanner;

public class Consumption {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        var distance = scanner.nextInt();
        var spentFuel = scanner.nextDouble();
        var consumption = distance / spentFuel;


        System.out.println(String.format("%.3f km/l", consumption));
    }
}
