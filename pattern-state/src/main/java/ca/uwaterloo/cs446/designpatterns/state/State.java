package ca.uwaterloo.cs446.designpatterns.state;

public interface State {
    public void click(FancyButton button);

    public void disable(FancyButton button);

    public void enable(FancyButton button);
}
