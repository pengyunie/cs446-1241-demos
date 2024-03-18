package ca.uwaterloo.cs446.designpatterns.abstractfactory;

public class AndroidMenuBar implements AbstractMenuBar {
    @Override
    public String getType() {
        return "MaterialDesign";
    }
}
