package ca.uwaterloo.cs446.designpatterns.state;

public class DisabledState implements State {
    State originalState;

    public DisabledState(State originalState) {
        this.originalState = originalState;
    }

    public void click(FancyButton button) {
        // do nothing
    }

    public void disable(FancyButton button) {
        // do nothing
    }

    public void enable(FancyButton button) {
        button.setState(originalState);
    }
}
