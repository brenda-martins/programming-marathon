package beecrowd.beginner;




// Two cars (X and Y) leave in the same direction. The car X leaves with a constant speed of 60 km/h
// and the car Y leaves with a constant speed of 90 km / h.
//
// In one hour (60 minutes) the car Y can get a distance of 30 kilometers from the X car,
// in other words, it can get away one kilometer for each 2 minutes.
//
//  Read the distance (in km) and calculate how long it takes (in minutes) for the car Y
//  to take this distance in relation to the other car.
//
//  Input
//  The input file contains 1 integer value.
//
//   Output
//   Print the necessary time followed by the message "minutos" that means minutes in Portuguese.

import java.util.Scanner;

public class Distance {

    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        var distance = scanner.nextInt();

        var time = distance * 2;

        System.out.println(time + " minutos");
    }
}
