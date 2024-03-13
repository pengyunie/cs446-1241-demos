package ca.uwaterloo.cs446.designpatterns.observer;

/** A concrete observer that represents numbers with a radix of 16. */
public class HexObserver extends Observer {
	private String hexValue;

	public HexObserver(Subject subject) {
		this.subject = subject;
		this.subject.attach(this);
		hexValue = null;
	}

	@Override
	public void update() {
		hexValue = Integer.toHexString(subject.getState());
	}

	@Override
	public String getValue() {
		return hexValue;
	}
}
