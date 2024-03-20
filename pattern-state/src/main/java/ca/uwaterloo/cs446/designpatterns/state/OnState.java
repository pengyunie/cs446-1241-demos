package ca.uwaterloo.cs446.designpatterns.state;

public class OnState implements State {
    int level;

    public OnState(int level) {
        this.level = level;
    }

    public void click(FancyButton button) {
        if (level < button.getMaxLevel()) {
            button.setState(new OnState(level + 1));
        } else {
            button.setState(new OffState());
        }
    }
}
