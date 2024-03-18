package ca.uwaterloo.cs446.designpatterns.abstractfactory;

public class WindowsButton implements AbstractButton {
	@Override
	public String getDescription() {
		return "Ugly button";
	}
}
