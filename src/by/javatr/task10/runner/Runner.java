package by.javatr.task10.runner;

import by.javatr.scanner.DataScanner;
import by.javatr.task10.util.Util;
import by.javatr.task7.unit.Unit;

/*
Составить программу для вычисления значений функции F(x) на отрезке [а, b] с шагом h. Результат
представить в виде таблицы, первый столбец которой – значения аргумента, второй - соответствующие
значения функции.
F(x) = tg(x)
 */
public class Runner {
    public static void main(String[] args) {
        System.out.println("Please, enter a start of segment");
        double a = DataScanner.enterDoubleFromConsole();
        System.out.println("Please, enter the end of segment");
        double b = DataScanner.enterDoubleFromConsole();
        System.out.println("Please, enter a step");
        double h = DataScanner.enterDoubleFromConsole();

        Util.functionValue(a, b, h);



    }
}
