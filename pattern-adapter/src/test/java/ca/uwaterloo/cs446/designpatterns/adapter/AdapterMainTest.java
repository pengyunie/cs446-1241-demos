package ca.uwaterloo.cs446.designpatterns.adapter;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import ca.uwaterloo.cs446.designpatterns.otherlib.Circle;
import ca.uwaterloo.cs446.designpatterns.otherlib.Line;
import ca.uwaterloo.cs446.designpatterns.otherlib.Rectangle;

public class AdapterMainTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testDrawLine() {
        Line line = new Line();
        Shape lineShape = new LineAdapter(line);
        lineShape.draw(7, 23, 37, 70);
        Assert.assertEquals("Line from point A(7;23), to point B(37;70)\n", outContent.toString());
    }

    @Test
    public void testDrawRectangle() {
        Rectangle rectangle = new Rectangle();
        Shape rectangleShape = new RectangleAdapter(rectangle);
        rectangleShape.draw(7, 23, 37, 70);
        Assert.assertEquals("Rectangle with coordinate left-down point (7;23), width: 30, height: 47\n",
                outContent.toString());
    }

    @Test
    public void testDrawCircle() {
        Circle circle = new Circle();
        Shape circleShape = new CircleAdapter(circle);
        circleShape.draw(7, 23, 37, 70);
        Assert.assertEquals("Circle with centre at (22;46), with a radius of 15\n", outContent.toString());
    }
}
