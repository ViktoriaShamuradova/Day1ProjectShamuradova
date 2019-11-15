package by.javatr.task3.quadrate;

import by.javatr.common.figure.Figure;
import by.javatr.task3.ciracle.Ciracle;

public class Quadrate extends Figure {
    private double square;
    private double side;

    public Quadrate() {
    }

    public Quadrate(double square) {
        this.square = square;
    }

    public Quadrate(double square, double side) {
        this.square = square;
        this.side = side;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double square() {
        return this.square = this.side * this.side;
    }

    public double findSide(double square) {
        return this.side = Math.sqrt(square);
    }

    public double findSquareThroughTheRadiusOfTheCircledCircle(Ciracle ciracle) {
        double radius = ciracle.getRadius();
        double diameter = radius + radius;
        return this.square = (diameter * diameter) / 2;

    }

}
