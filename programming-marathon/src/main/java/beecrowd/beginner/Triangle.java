package beecrowd.beginner;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        double C = scanner.nextDouble();
        double perimeter, area;

        if(((A > Math.abs(B - C)) && (A < (B + C)))
                || ((B > Math.abs(A - C)) && (B < (A + C)))
                || ((C > Math.abs(A - B)) && (C < (A + B)))
        ){
            perimeter = A + B + C;
            System.out.println(String.format("Perimetro = %.1f", perimeter));
        }else{
            area = ((A + B) * C)/2;
            System.out.println(String.format("Area = %.1f", area));
        }
    }
}
