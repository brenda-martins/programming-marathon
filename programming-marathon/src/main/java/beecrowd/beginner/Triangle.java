package beecrowd.beginner;
import java.util.Scanner;

//Read three point floating values (A, B and C) and verify if is possible to make a triangle with them.
// If it is possible, calculate the perimeter of the triangle and print the message:
//
//Perimetro = XX.X
//
//
//If it is not possible, calculate the area of the trapezium which basis A and B and C as height,
// and print the message:
//
//Area = XX.X
//Input
//
//The input file has tree floating point numbers.
//Output
//
//Print the result with one digit after the decimal point.


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
