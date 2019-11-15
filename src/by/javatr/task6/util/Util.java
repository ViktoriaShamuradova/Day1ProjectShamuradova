package by.javatr.task6.util;


import by.javatr.task6.exception.IncorrecteSecondsInDaysException;

import java.util.Date;

public class Util {
    public static void howMuchHoursMinSecToThisMoment() {
        Date date = new Date();
        System.out.printf("%4$tk %1$s %4$tM %2$s %4$tS %3$s", " hours, ", " minutes, ", " seconds ", date);
        System.out.println();
    }

    public static void howMuchHoursMinSecToThisMoment(int seconds) throws IncorrecteSecondsInDaysException {
        if (seconds > 86400 || seconds < 0) {
            throw new IncorrecteSecondsInDaysException();
        }
        int hours = seconds / 3600;
        seconds = seconds - hours * 3600;
        int minutes = seconds / 60;
        seconds = seconds - minutes * 60;
        int seconds2 = seconds;
        System.out.println("В " + seconds + " секундах: " + hours + " часов " + minutes + " минут " + seconds2 + " секунд");
    }
}
