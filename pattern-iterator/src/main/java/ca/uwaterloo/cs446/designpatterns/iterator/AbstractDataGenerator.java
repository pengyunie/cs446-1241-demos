package ca.uwaterloo.cs446.designpatterns.iterator;

public abstract class AbstractDataGenerator {
    /** Gets an iterator for accessing and traversing the data generator. */
    public abstract AbstractDataIterator getIterator();
}
