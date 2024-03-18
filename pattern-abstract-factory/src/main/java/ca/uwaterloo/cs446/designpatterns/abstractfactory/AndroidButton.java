package ca.uwaterloo.cs446.designpatterns.abstractfactory;

public class AndroidButton implements AbstractButton {
    @Override
    public String getDescription() {
        return "Touch button";
    }
}
