package ca.uwaterloo.cs446.designpatterns.iterator;

public abstract class AbstractDataIterator {
    /** Gets the current item. */
    public abstract int get();

    /** Moves to the next item. */
    public abstract void next();

    /** Checks if the container has been exhausted. */
    public abstract boolean done();
}
