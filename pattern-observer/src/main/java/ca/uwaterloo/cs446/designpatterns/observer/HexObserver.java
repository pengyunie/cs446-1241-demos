package ca.uwaterloo.cs446.designpatterns.observer;

/** A concrete observer that represents numbers with a radix of 16. */
public class HexObserver extends Observer {
	private String hexValue;

	public HexObserver(Subject subject) {
		super(subject);
		// hexValue is implicitly initialized to null
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
