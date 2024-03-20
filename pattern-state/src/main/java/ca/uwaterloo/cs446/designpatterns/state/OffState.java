package ca.uwaterloo.cs446.designpatterns.state;

public class OffState implements State {
    public void click(FancyButton button) {
        button.setState(new OnState(1));
    }
}
