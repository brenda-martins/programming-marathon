package beecrowd.beginner;

import java.util.Scanner;

public class CoordinatesOfAPoint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        var value = scanner.nextLine();
//        var newValue = value.split(" ");
//        var x =  Double.parseDouble(newValue[0]);
//        var y = Double.parseDouble(newValue[1]);

        var x =  scanner.nextDouble();
        var y = scanner.nextDouble();

        if(x == 0 && y == 0){
            System.out.println("Origem");
            return;
        }

        if(x == 0){
            System.out.println("Eixo X");
            return;
        }

        if(y == 0){
            System.out.println("Eixo Y");
            return;
        }

        if(x > 0 && y > 0){
            System.out.println("Q1");
            return;
        }

        if(x < 0 && y > 0){
            System.out.println("Q2");
            return;
        }

        if(x < 0 && y < 0){
            System.out.println("Q3");
            return;
        }

        if(x > 0 && y < 0){
            System.out.println("Q4");
        }


    }
}
