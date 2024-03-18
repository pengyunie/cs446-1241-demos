package ca.uwaterloo.cs446.designpatterns.abstractfactory;

public class OSXMenuBar implements AbstractMenuBar {
	@Override
	public String getType() {
		return "Cocoa";
	}
}
