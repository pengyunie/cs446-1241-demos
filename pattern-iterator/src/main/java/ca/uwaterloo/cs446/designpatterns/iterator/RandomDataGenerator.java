package ca.uwaterloo.cs446.designpatterns.iterator;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomDataGenerator extends AbstractDataGenerator {
    private List<Integer> data;
    private List<Integer> orders;

    public RandomDataGenerator(List<Integer> data) {
        this.data = data;
        this.orders = IntStream.range(0, data.size()).boxed().collect(Collectors.toList());
        Collections.shuffle(this.orders);
    }

    public List<Integer> getData() {
        return data;
    }

    public List<Integer> getOrders() {
        return orders;
    }

    public AbstractDataIterator getIterator() {
        return new RandomDataIterator(this);
    }
}
