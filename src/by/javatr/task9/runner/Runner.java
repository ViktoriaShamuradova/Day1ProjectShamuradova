package by.javatr.task9.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task3.ciracle.Ciracle;

public class Runner {
    public static void main(String[] args) {
        double radius = DataScanner.enterDoubleFromConsole();
        Ciracle ciracle = new Ciracle();
        ciracle.setRadius(radius);
        double square = ciracle.square();
        double circumference = ciracle.circumference();
        System.out.println(square);
        System.out.println(circumference);

    }
}
