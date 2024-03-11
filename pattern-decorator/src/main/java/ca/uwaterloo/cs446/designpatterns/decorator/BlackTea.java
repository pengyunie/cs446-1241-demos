package ca.uwaterloo.cs446.designpatterns.decorator;

import java.util.List;

public class BlackTea implements HotBeverage {
    // TODO: implement; default price: $1.50 (otherwise modify DecoratorMainTest.java)
    @Override
    public double getCost() {
        throw new UnsupportedOperationException("Not implemented.");
    }

    @Override
    public List<String> getIngredients() {
        throw new UnsupportedOperationException("Not implemented.");
    }
}
