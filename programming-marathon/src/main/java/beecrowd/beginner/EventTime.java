package beecrowd.beginner;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


//Peter is organizing an event in his University. The event will be in April month, beginning and finishing within April month.
// The problem is: Peter wants to calculate the event duration in seconds, knowing obviously the begin and the end time of the event.
//
//You know that the event can take from few seconds to some days, so, you must help Peter to compute
// the total time corresponding to duration of the event.
//Input
//
//The first line of the input contains information about the beginning day of the event in the format: “Dia xx”.
// The next line contains the start time of the event in the format presented in the sample input.
// Follow 2 input lines with same format, corresponding to the end of the event.
//Output
//
//Your program must print the following output, one information by line, considering that if any information is null for example,
// the number 0 must be printed in place of W, X, Y or Z:
//
//W dia(s)
//X hora(s)
//Y minuto(s)
//Z segundo(s)
//
//Obs: Consider that the event of the test case have the minimum duration of one minute.
// “dia” means day, “hora” means hour, “minuto” means minute and “Segundo” means second in Portuguese.


public class EventTime {

    static final int MILLISECOND  = 1;
    static final int SECOND = 1000 * MILLISECOND;
    static final int MINUTE = 60 * SECOND;
    static final int HOUR =  60 * MINUTE;
    static final int DAY = 24 * HOUR;


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        var startDate = scanner.nextLine();
        var startHour = scanner.nextLine();
        var endDate = scanner.nextLine();
        var endHour = scanner.nextLine();

        var startDateInt = getStartDateInt(startDate);
        var startHourInt =   getHours(startHour);

        var endDateInt = Integer.parseInt(endDate.substring(4, startDate.length()));
        var endHourInt = getHours(endHour);


        int resolvedTimeInMilliseconds =
                getResolvedTimeInMilliseconds(startDateInt, startHourInt, endDateInt, endHourInt);


        var days =  (int) Math.floor(resolvedTimeInMilliseconds / DAY);
        var hours = (int) Math.floor((resolvedTimeInMilliseconds % DAY) / HOUR);
        var minutes = (int) Math.floor((resolvedTimeInMilliseconds % HOUR) / MINUTE);
	    var seconds = (int) Math.floor((resolvedTimeInMilliseconds % MINUTE) / SECOND);

        System.out.println(days + " dia(s)");
        System.out.println(hours + " hora(s)");
        System.out.println(minutes + " minuto(s)");
        System.out.println(seconds + " segundo(s)");


    }

    private static int getResolvedTimeInMilliseconds(
            final int startDateInt,
            final List<Integer> startHourInt,
            final int endDateInt,
            final List<Integer> endHourInt
    ) {
        return DAY * (endDateInt - startDateInt) +
                HOUR * (endHourInt.get(0) - startHourInt.get(0)) +
                MINUTE * (endHourInt.get(1) - startHourInt.get(1)) +
                SECOND * (endHourInt.get(2) - startHourInt.get(2)) ;
    }

    private static int getStartDateInt(final String startDate) {
        return Integer.parseInt(startDate.substring(4, startDate.length()));
    }

    private static List<Integer> getHours(final String startHour) {
        return Arrays.stream(startHour.split(":"))
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
