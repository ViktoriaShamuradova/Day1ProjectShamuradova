package by.javatr.task1.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task1.exception.LastElementNotIntegerException;
import by.javatr.task1.util.Util;

public class Runner {
    public static void main(String[] args) throws LastElementNotIntegerException {

        int number = DataScanner.enterIntegerFromConsole();
        int i = Util.lastNumberOfNumberSquare(number);
        System.out.println(i);

        double numberDouble = DataScanner.enterDoubleFromConsole();
        int i2 = Util.lastNumberOfNumberSquare(numberDouble);
        System.out.println(i2);


    }
}
