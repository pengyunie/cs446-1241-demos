package ca.uwaterloo.cs446.designpatterns.adapter;

import ca.uwaterloo.cs446.designpatterns.otherlib.Circle;

public class CircleAdapter implements Shape {
    private Circle adaptee;

    public CircleAdapter(Circle circle) {
        this.adaptee = circle;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        int xc = (x1 + x2) / 2;
        int yc = (y1 + y2) / 2;
        int radius = Math.min(xc - x1, yc - y1);
        adaptee.draw(xc, yc, radius);
    }
}
