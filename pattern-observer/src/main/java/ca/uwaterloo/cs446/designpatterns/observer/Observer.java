package ca.uwaterloo.cs446.designpatterns.observer;

/** Common interface for observers. */
public abstract class Observer {
	protected Subject subject;

	// the common part of the constructor can be extracted to the superclass
	protected Observer(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	public abstract void update();

	public abstract String getValue();
}
