package ca.uwaterloo.cs446.designpatterns.abstractfactory;

public class OSXButton implements AbstractButton {
	@Override
	public String getDescription() {
		return "Nice looking button";
	}
}
