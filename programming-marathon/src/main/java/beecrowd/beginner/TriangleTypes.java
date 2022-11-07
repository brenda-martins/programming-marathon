package beecrowd.beginner;

import java.util.Scanner;

public class TriangleTypes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();

        double[] array = new double[]{A, B, C};

        sort(array);

        verifyTriangleType(array[0], array[1], array[2]);

    }

    private static void sort(double[] array){
        double aux = 0;

        for(int i = 0; i < array.length; i++){ // 2
            for(int x = i + 1; x < array.length; x++){ // 2
                if(array[i] < array[x]){
                    aux = array[i];
                    array[i] = array[x];
                    array[x] = aux;
                }
            }
        }
    }

    private static void verifyTriangleType(double A, double B, double C){
        if(A >= (B + C)){
            System.out.println("NAO FORMA TRIANGULO");
            return;
        }

        if(Math.pow(A, 2) == (Math.pow(B, 2) + Math.pow(C, 2))){
            System.out.println("TRIANGULO RETANGULO");
        }

        //49 > 25 + 4
        if(Math.pow(A, 2) > (Math.pow(B, 2) + Math.pow(C, 2))){
            System.out.println("TRIANGULO OBTUSANGULO");
        }

        if(Math.pow(A, 2) < (Math.pow(B, 2) + Math.pow(C, 2))){
            System.out.println("TRIANGULO ACUTANGULO");
        }


        if(A == B && B == C){
            System.out.println("TRIANGULO EQUILATERO");
        }

        if((A == B && B != C) || (A == C & C != B) || (B == C && C != A)){
            System.out.println("TRIANGULO ISOSCELES");
        }
    }
}
