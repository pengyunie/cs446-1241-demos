package ca.uwaterloo.cs446.designpatterns.facade;

public class Point implements Shape {
    double x;
    double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double[] getBoundingBox() {
        return new double[] { x, x, y, y };
    }
}
