package by.javatr.task2.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task2.exception.NoMonthException;
import by.javatr.task2.util.Util;

public class Runner {
    public static void main(String[] args) throws NoMonthException {
        int year = DataScanner.enterIntegerFromConsole();
        int month = DataScanner.enterIntegerFromConsole();
        boolean leapYear = Util.isLeapYear(year);
        System.out.println(leapYear);
        String monthS = Util.determineMonth(month);
        System.out.println(monthS);


    }
}
