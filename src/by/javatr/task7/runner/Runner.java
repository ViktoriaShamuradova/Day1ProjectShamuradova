package by.javatr.task7.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task7.unit.Unit;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Please, enter x1 ");
        double x1 = DataScanner.enterDoubleFromConsole();
        System.out.println("Please, enter y1 ");
        double y1 = DataScanner.enterDoubleFromConsole();
        System.out.println("Please, enter x2 ");
        double x2 = DataScanner.enterDoubleFromConsole();
        System.out.println("Please, enter y2 ");
        double y2 = DataScanner.enterDoubleFromConsole();


        Unit.whichOfThePointsIsCloserToTheOrigin(x1, y1, x2, y2);

    }
}
