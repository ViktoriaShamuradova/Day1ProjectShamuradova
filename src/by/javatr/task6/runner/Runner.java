package by.javatr.task6.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task6.exception.IncorrecteSecondsInDaysException;
import by.javatr.task6.util.Util;

public class Runner {
    public static void main(String[] args) throws IncorrecteSecondsInDaysException {
        int sec = DataScanner.enterIntegerFromConsole();
        Util.howMuchHoursMinSecToThisMoment(sec);
        Util.howMuchHoursMinSecToThisMoment();


    }

}
