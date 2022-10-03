package beecrowd.beginner;

import java.util.Scanner;

public class DistanceBetweenTwoPoints {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        var x1 = scanner.nextDouble();
        var y1 =  scanner.nextDouble();
        var x2 = scanner.nextDouble();
        var y2 = scanner.nextDouble();


        var distance  = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(String.format("%.4f", distance));

    }
}
