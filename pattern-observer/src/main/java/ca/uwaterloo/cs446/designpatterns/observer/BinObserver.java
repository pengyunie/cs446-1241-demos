package ca.uwaterloo.cs446.designpatterns.observer;

/** A concrete observer that represents numbers with a radix of 2. */
public class BinObserver extends Observer {
	private String binValue;

	public BinObserver(Subject subject) {
		super(subject);
		// binValue is implicitly initialized to null
	}

	@Override
	public void update() {
		binValue = Integer.toBinaryString(subject.getState());
	}

	@Override
	public String getValue() {
		return binValue;
	}
}
