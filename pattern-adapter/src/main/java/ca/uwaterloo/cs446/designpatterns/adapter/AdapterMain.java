package ca.uwaterloo.cs446.designpatterns.adapter;

import java.util.ArrayList;
import java.util.List;

import ca.uwaterloo.cs446.designpatterns.otherlib.Circle;
import ca.uwaterloo.cs446.designpatterns.otherlib.Line;
import ca.uwaterloo.cs446.designpatterns.otherlib.Rectangle;

public class AdapterMain {
	public static void main(String[] args) {
		// Old objects
		Line line = new Line();
		Rectangle rectangle = new Rectangle();
		Circle circle = new Circle();

		// Adapt them with adapters
		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new LineAdapter(line));
		shapes.add(new RectangleAdapter(rectangle));
		shapes.add(new CircleAdapter(circle));

		// Code can now operate using common interface
		int x1 = 7;
		int y1 = 23;
		int x2 = 37;
		int y2 = 70;
		for (Shape shape : shapes) {
			shape.draw(x1, y1, x2, y2);
		}
	}
}
