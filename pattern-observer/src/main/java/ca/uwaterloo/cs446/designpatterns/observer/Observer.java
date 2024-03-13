package ca.uwaterloo.cs446.designpatterns.observer;

/** Common interface for observers. */
public abstract class Observer {
	protected Subject subject;

	public abstract void update();

	public abstract String getValue();
}
