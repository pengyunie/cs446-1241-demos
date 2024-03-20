package ca.uwaterloo.cs446.designpatterns.facade;

import java.util.ArrayList;
import java.util.List;

/** The facade class for the plotting subsystem */
public class Plot {
    private Axis axis = new Axis();
    private List<Shape> shapes = new ArrayList<>();

    /** 
     * Adds a scatter plot.
     * @param data - an array of points to plot, each point is an array of 2 doubles (x, y).
     */
    public void scatterPlot(double[][] data) {
        for (double[] point : data) {
            shapes.add(new Point(point[0], point[1]));
        }
    }

    /** 
     * Adds a line plot.
     * @param data - an array of points to plot, each point is an array of 2 doubles (x, y).
     */
    public void linePlot(double[][] data) {
        // TODO: implement
        throw new UnsupportedOperationException("Not implemented.");
    }

    /**
     * Adjusts the axis to fit all existing plots.
     */
    public void ensureFit() {
        if (shapes.isEmpty()) {
            // does nothing if there are no existing plot
            return;
        }
        double xMin = Double.POSITIVE_INFINITY;
        double xMax = Double.NEGATIVE_INFINITY;
        double yMin = Double.POSITIVE_INFINITY;
        double yMax = Double.NEGATIVE_INFINITY;

        for (Shape shape : shapes) {
            double[] boundingBox = shape.getBoundingBox();
            xMin = Math.min(xMin, boundingBox[0]);
            xMax = Math.max(xMax, boundingBox[1]);
            yMin = Math.min(yMin, boundingBox[2]);
            yMax = Math.max(yMax, boundingBox[3]);
        }

        axis.setXMin(xMin);
        axis.setXMax(xMax);
        axis.setYMin(yMin);
        axis.setYMax(yMax);
    }

    protected Axis getAxis() {
        return axis;
    }

    protected List<Shape> getShapes() {
        return shapes;
    }
}
