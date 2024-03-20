package ca.uwaterloo.cs446.designpatterns.iterator;

public class RandomDataIterator extends AbstractDataIterator {
    private RandomDataGenerator generator;
    private int index;

    public RandomDataIterator(RandomDataGenerator generator) {
        this.generator = generator;
        index = 0;
    }

    public int get() {
        return generator.getData().get(generator.getOrders().get(index));
    }

    public boolean done() {
        return index >= generator.getData().size();
    }

    public void next() {
        index++;
    }
}
