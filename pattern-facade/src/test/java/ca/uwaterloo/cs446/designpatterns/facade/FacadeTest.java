package ca.uwaterloo.cs446.designpatterns.facade;

import org.junit.Assert;
import org.junit.Test;

public class FacadeTest {
    @Test
    public void testScatterPlot() {
        Plot plot = new Plot();
        double[][] data = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        plot.scatterPlot(data);

        Assert.assertEquals(3, plot.getShapes().size());
        for (Shape shape : plot.getShapes()) {
            Assert.assertTrue(shape instanceof Point);
        }

        plot.ensureFit();
        Axis axis = plot.getAxis();
        Assert.assertEquals(1, axis.getXMin(), 0.01);
        Assert.assertEquals(5, axis.getXMax(), 0.01);
        Assert.assertEquals(2, axis.getYMin(), 0.01);
        Assert.assertEquals(6, axis.getYMax(), 0.01);
    }

    @Test
    public void testLinePlot() {
        Plot plot = new Plot();
        double[][] data = { { 1, 2 }, { 3, 4 }, { 5, 6 } };
        plot.linePlot(data);

        Assert.assertEquals(2, plot.getShapes().size());
        for (Shape shape : plot.getShapes()) {
            Assert.assertTrue(shape instanceof Line);
        }

        plot.ensureFit();
        Axis axis = plot.getAxis();
        Assert.assertEquals(1, axis.getXMin(), 0.01);
        Assert.assertEquals(5, axis.getXMax(), 0.01);
        Assert.assertEquals(2, axis.getYMin(), 0.01);
        Assert.assertEquals(6, axis.getYMax(), 0.01);
    }
}
