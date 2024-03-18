package ca.uwaterloo.cs446.designpatterns.abstractfactory;

public class OSXFactory implements AbstractFactory {
	@Override
	public AbstractButton createButton() {
		return new OSXButton();
	}

	@Override
	public AbstractMenuBar createMenuBar() {
		return new OSXMenuBar();
	}
}
