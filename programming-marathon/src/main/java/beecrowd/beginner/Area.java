package beecrowd.beginner;

import java.util.Scanner;

public class Area {

    private static final  double pi = 3.14159;


    public static void main(String[] args){
        Scanner scanner =  new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double TRIANGULO = (A*C)/2;
        double CIRCULO = pi * Math.pow(C, 2);
        double TRAPEZIO = ((A+B)/2) * C;
        double QUADRADO = Math.pow(B, 2);
        double RETANGULO = A * B;

        System.out.println(String.format("TRIANGULO: %.3f", TRIANGULO));
        System.out.println(String.format("CIRCULO: %.3f", CIRCULO));
        System.out.println(String.format("TRAPEZIO: %.3f", TRAPEZIO));
        System.out.println(String.format("QUADRADO: %.3f", QUADRADO));
        System.out.println(String.format("RETANGULO: %.3f", RETANGULO));


    }
}
