package ca.uwaterloo.cs446.designpatterns.iterator;

public class SequentialDataIterator extends AbstractDataIterator {
    private SequentialDataGenerator generator;
    private int index = 0;

    public SequentialDataIterator(SequentialDataGenerator generator) {
        this.generator = generator;
    }

    public int get() {
        return generator.getData().get(index);
    }

    public void next() {
        index++;
    }

    public boolean done() {
        return index >= generator.getData().size();
    }
}
