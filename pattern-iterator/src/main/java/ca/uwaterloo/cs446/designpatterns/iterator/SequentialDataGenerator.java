package ca.uwaterloo.cs446.designpatterns.iterator;

import java.util.List;

public class SequentialDataGenerator extends AbstractDataGenerator {
    private List<Integer> data;

    public SequentialDataGenerator(List<Integer> data) {
        this.data = data;
    }

    public List<Integer> getData() {
        return data;
    }

    public AbstractDataIterator getIterator() {
        return new SequentialDataIterator(this);
    }
}
