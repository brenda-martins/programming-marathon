package beecrowd.beginner;




//Read an integer value, which is the duration in seconds of a certain event in a factory,
// and inform it expressed in hours:minutes:seconds.
//Input
//
//The input file contains an integer N.
//Output
//
//Print the read time in the input file (seconds) converted in hours:minutes:seconds like the following example.

import java.util.Scanner;

public class TimeConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var N = scanner.nextInt();

        int hour, minutes, seconds;
        hour = N / 3600;
        minutes = N % 3600 / 60;
        seconds = N % 60;

        System.out.println(hour + ":" + minutes + ":" + seconds);

    }
}
