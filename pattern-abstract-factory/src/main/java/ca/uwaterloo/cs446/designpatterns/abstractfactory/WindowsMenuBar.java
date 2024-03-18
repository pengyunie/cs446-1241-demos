package ca.uwaterloo.cs446.designpatterns.abstractfactory;

public class WindowsMenuBar implements AbstractMenuBar {
	@Override
	public String getType() {
		return "Qt";
	}
}
