package ca.uwaterloo.cs446.designpatterns.facade;

public interface Shape {
    /** Returns a bounding box in an array of 4 values (xMin, xMax, yMin, yMax) */
    public double[] getBoundingBox();
}
