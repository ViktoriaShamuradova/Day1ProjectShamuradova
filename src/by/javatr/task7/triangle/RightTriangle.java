package by.javatr.task7.triangle;

import by.javatr.common.figure.Figure;

public class RightTriangle extends Figure {
    private double cathet1;
    private double cathet2;
    private double hypotenuse;
    private final int rightCorner = 90;

    public RightTriangle() {
    }

    public RightTriangle(double cathet1, double cathet2) {
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
    }

    public RightTriangle(double cathet1, double cathet2, double hypotenuse) {
        this.cathet1 = cathet1;
        this.cathet2 = cathet2;
        this.hypotenuse = hypotenuse;
    }

    public RightTriangle(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    public double getCathet1() {
        return cathet1;
    }

    public void setCathet1(double cathet1) {
        this.cathet1 = cathet1;
    }

    public double getCathet2() {
        return cathet2;
    }

    public void setCathet2(double cathet2) {
        this.cathet2 = cathet2;
    }

    public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

    @Override
    protected double square() {
        return 0.5 * cathet2 * cathet1;
    }

    public double findHypotenuse() {
        return (cathet1 * cathet1) + (cathet2 * cathet2);
    }


}
