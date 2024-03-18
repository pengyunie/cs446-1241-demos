package ca.uwaterloo.cs446.designpatterns.abstractfactory;

public interface AbstractFactory {
	public AbstractButton createButton();
	public AbstractMenuBar createMenuBar();
}
