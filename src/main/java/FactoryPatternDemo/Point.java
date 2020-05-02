package FactoryPatternDemo;

public class Point {

    private double x, y;

    private Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    //demonstrate inner class - explain why outter class would be bad


    // built in factory methods
    private static Point newPolarPoint(double rho, double theta) {
        return new Point(rho * Math.cos(theta), rho * Math.sin(theta));
    }

    // built in factory methods
    private static Point newCartesianPoint(double x, double y) {
        return new Point(x, y);
    }
}
