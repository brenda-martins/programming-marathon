package beecrowd.beginner;
import java.util.Scanner;

public class Animal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var A = scanner.next();
        var B = scanner.next();
        var C = scanner.next();


        if(A.equalsIgnoreCase("vertebrado")){
            verifyVertebrados(B, C);
        }else if(A.equalsIgnoreCase("invertebrado")){
            verifyInvertebrados(B, C);
        }
    }

    private static void verifyInvertebrados(String B, String C) {
        if(B.equalsIgnoreCase("inseto")){
            if(C.equalsIgnoreCase("hematofago")){
                System.out.println("pulga");
            }else if(C.equalsIgnoreCase("herbivoro")){
                System.out.println("lagarta");
            }
        } else if (B.equalsIgnoreCase("anelideo")) {
            if(C.equalsIgnoreCase("hematofago")){
                System.out.println("sanguessuga");
            }else if(C.equalsIgnoreCase("onivoro")){
                System.out.println("minhoca");
            }
        }
    }

    private static void verifyVertebrados(String B, String C) {
        if(B.equalsIgnoreCase("ave")){
            if(C.equalsIgnoreCase("carnivoro")){
                System.out.println("aguia");
            } else if (C.equalsIgnoreCase("onivoro")) {
                System.out.println("pomba");
            }
        }else if(B.equalsIgnoreCase("mamifero")){
            if(C.equalsIgnoreCase("onivoro")){
                System.out.println("homem");
            } else if (C.equalsIgnoreCase("herbivoro")) {
                System.out.println("vaca");
            }
        }
    }


}


