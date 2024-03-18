package ca.uwaterloo.cs446.designpatterns.abstractfactory;

public class AndroidFactory implements AbstractFactory {
    
    @Override
    public AbstractButton createButton() {
        return new AndroidButton();
    }

    @Override
    public AbstractMenuBar createMenuBar() {
        return new AndroidMenuBar();
    }
}
