package by.javatr.task5.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task5.util.Util;

public class Runner {
    public static void main(String[] args) {
        int number = DataScanner.enterIntegerFromConsole();
        Util.isPerfectNumber(number);

    }
}
