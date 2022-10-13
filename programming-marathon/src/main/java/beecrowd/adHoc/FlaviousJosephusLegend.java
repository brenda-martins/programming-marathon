package beecrowd.adHoc;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FlaviousJosephusLegend {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        var NC = scanner.nextInt();
        List<Integer> numbers;

        for(int i = 0; i < NC; i++){
            numbers = new ArrayList<Integer>();
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            k--;

            for(int x = 1; x <= n; x++){
                numbers.add(x);
            }

            Josh(numbers, k, 0, i+1);
        }
    }

    static void Josh(List<Integer> numbers, int k, int index, int i){
        if(numbers.size() == 1){
            System.out.println("Case " + i + ": " + numbers.get(0));
            return;
        }

        index = ((index + k) % numbers.size());
        numbers.remove(index);

        Josh(numbers, k, index, i);
    }
}


