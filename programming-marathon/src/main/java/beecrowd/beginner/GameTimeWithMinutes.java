package beecrowd.beginner;

//Read the start time and end time of a game, in hours and minutes (initial hour, initial minute, final hour, final minute).
// Then print the duration of the game, knowing that the game can begin in a day and finish in another day,
//
//Obs.: With a maximum game time of 24 hours and the minimum game time of 1 minute.
//Input
//
//Four integer numbers representing the start and end time of the game.
//Output
//
//Print the duration of the game in hours and minutes, in this format: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
// Which means: the game lasted XXX hour(s) and YYY minutes.

import java.util.Scanner;

public class GameTimeWithMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var initalHour = scanner.nextInt();
        var initalMinute = scanner.nextInt();
        var finalHour = scanner.nextInt();
        var finalMinute = scanner.nextInt();
        int hours, minutes;

        var time = (initalHour * 60 + initalMinute + (finalHour * 60 + finalMinute));
        System.out.println("Time: " + time);
        System.out.println("Hours: " + time / 60);
        System.out.println("Minutes: " + time % 60);

//        var gameTimeInMinutes = ((finalHour - initalHour) * 60) + (finalMinute - initalMinute);
//
//        if(gameTimeInMinutes < 60 && gameTimeInMinutes > 0){
//            hours = 0;
//            minutes = gameTimeInMinutes;
//        }else{
//            hours = gameTimeInMinutes / 60;
//            minutes = gameTimeInMinutes % 60;
//
//            if(hours <= 0){
//                hours = hours + 24;
//            }
//
//            if(minutes <= 0){
//                minutes = minutes + 60;
//            }
//        }
//
//        System.out.println(" O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)");

    }
}
