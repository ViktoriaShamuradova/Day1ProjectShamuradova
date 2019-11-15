package by.javatr.task7.unit;

import by.javatr.task7.triangle.RightTriangle;

public class Unit {
    public static void whichOfThePointsIsCloserToTheOrigin(double x1, double y1, double x2, double y2){
        RightTriangle triangle1 = new RightTriangle(x1, y1);
        RightTriangle triangle2 = new RightTriangle(x2, y2);

        double hypotenuse1 = triangle1.findHypotenuse();
        double hypotenuse2 = triangle2.findHypotenuse();

        if(hypotenuse1<hypotenuse2){
            System.out.println("Point A closer to the origin");
        }
        else if(hypotenuse1>hypotenuse2){
            System.out.println("Point B closer to the origin");
        }
        else System.out.println("Points are at the same distance");

    }
}
