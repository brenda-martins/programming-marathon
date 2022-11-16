package beecrowd.beginner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Read an integer number that is the code number for phone dialing. Then, print the destination according to the following table:
//      DDD     Destination
//      61       Brasilia
//      71       Salvador
//      11       Sao Paulo
//      21       Rio de Janeiro
//      32       Juiz de Fora
//      19       Campinas
//      27       Vitoria
//      31       Belo Horizonte

//If the input number isn’t found in the above table, the output must be:
//DDD nao cadastrado
//That means “DDD not found” in Portuguese language.

//Input
//The input consists in a unique integer number.

//Output
//
//Print the city name corresponding to the input DDD.
// Print DDD nao cadastrado if doesn't exist corresponding DDD to the typed number.

public class DDD {

    private static final Map<Integer, String> ddd = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        addInMap();

        var DDD = scanner.nextInt();

        System.out.println(ddd.get(DDD));
    }

    private static void addInMap(){
        ddd.put(61, "Brasilia");
        ddd.put(71, "Salvador");
        ddd.put(11, "Sao Paulo");
        ddd.put(21, "Rio de Janeiro");
        ddd.put(32, "Juiz de Fora");
        ddd.put(19, "Campinas");
        ddd.put(27, "Vitoria");
        ddd.put(31, "Belo Horizonte");
    }
}
