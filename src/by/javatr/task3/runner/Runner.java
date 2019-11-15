package by.javatr.task3.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task3.ciracle.Ciracle;
import by.javatr.task3.quadrate.Quadrate;

public class Runner {
    public static void main(String[] args) {
        int squareOfTheDescribedQuadrate = DataScanner.enterIntegerFromConsole();
        Quadrate describedQuadrate = new Quadrate(squareOfTheDescribedQuadrate);

        Ciracle ciracle = new Ciracle();
        double squareCiracle = ciracle.findTheSquareThroughTheSquareOfTheDescribedQuadrate(describedQuadrate);
        System.out.println(squareCiracle);

        Quadrate inscribedQuadrate = new Quadrate();
        double squareThroughTheRadiusOfTheCircledCircle = inscribedQuadrate.findSquareThroughTheRadiusOfTheCircledCircle(ciracle);
        System.out.println(squareThroughTheRadiusOfTheCircledCircle);

        double howMuch = describedQuadrate.getSquare() / inscribedQuadrate.getSquare();
        System.out.println(howMuch);
    }
}
