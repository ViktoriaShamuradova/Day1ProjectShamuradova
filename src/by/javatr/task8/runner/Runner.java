package by.javatr.task8.runner;

import by.javatr.scanner.DataScanner;

public class Runner {

    private static double calculateFunctionValue(double x) {
        double functionValue;
        if (x >= 3) {
            return functionValue = -(x * x) + 3 * x + 9;
        } else {
            return functionValue = 1 / (Math.pow(x, 3) - 6);
        }
    }

    public static void main(String[] args) {
        double x = DataScanner.enterDoubleFromConsole();
        System.out.println(calculateFunctionValue(x));

    }
}
