package by.javatr.task3.ciracle;

import by.javatr.common.figure.Figure;
import by.javatr.task3.quadrate.Quadrate;

public class Ciracle extends Figure {
    private double radius;
    private double square;

    public Ciracle() {
    }

    public Ciracle(double square) {
        this.square = square;
    }

    public Ciracle(double radius, double square) {
        this.radius = radius;
        this.square = square;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double square() {
        square = Math.PI * (radius * radius);
        return this.square;
    }

    public double square(double radius) {
        square = Math.PI * (radius * radius);
        return square;
    }

    public double findTheSquareThroughTheSquareOfTheDescribedQuadrate(Quadrate quadrate) {
        double squareOfTheQuadrate = quadrate.getSquare();
        double sideOfTheQuadrate = Math.sqrt(squareOfTheQuadrate);
        this.radius = sideOfTheQuadrate / 2;
        double squareOfTheCiracle = square(this.radius);
        return squareOfTheCiracle;
    }

    public double circumference() {
        return Math.PI * (radius * 2);
    }

}
