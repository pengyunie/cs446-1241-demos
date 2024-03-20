package ca.uwaterloo.cs446.designpatterns.state;

/**
 * A fancy switch which iterates through off - level 1 - ... - level X - off on click.
 */
public class FancyButton {
    private int maxLevel;
    private State currentState;

    public FancyButton(int maxLevel) {
        if (maxLevel < 1) {
            throw new IllegalArgumentException("maxLevel must be at least 1");
        }
        this.maxLevel = maxLevel;
        currentState = new OffState();
    }

    public void click() {
        currentState.click(this);
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public State getState() {
        return currentState;
    }

    public int getMaxLevel() {
        return maxLevel;
    }
}
