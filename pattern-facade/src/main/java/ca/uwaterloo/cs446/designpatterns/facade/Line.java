package ca.uwaterloo.cs446.designpatterns.facade;

public class Line implements Shape {
    private Point start;
    private Point end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public double[] getBoundingBox() {
        double xMin = Math.min(start.getX(), end.getX());
        double xMax = Math.max(start.getX(), end.getX());
        double yMin = Math.min(start.getY(), end.getY());
        double yMax = Math.max(start.getY(), end.getY());
        return new double[] {xMin, xMax, yMin, yMax};
    }
}
