package by.javatr.scanner;

import by.javatr.task1.exception.LastElementNotIntegerException;

import java.util.Scanner;

public class DataScanner {
    static Scanner sc = new Scanner(System.in);
    public static double enterDoubleFromConsole() {
        double a = 0.0;
        while (!sc.hasNextDouble()) {
            sc.next();
        }
        a = sc.nextDouble();
        return a;
    }
    public static int enterIntegerFromConsole() {
        int a = 0;
        while (!sc.hasNextInt()) {
            sc.next();
        }
        a = sc.nextInt();
        return a;
    }

}
