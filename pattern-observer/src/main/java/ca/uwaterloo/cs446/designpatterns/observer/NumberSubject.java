package ca.uwaterloo.cs446.designpatterns.observer;

/** A concrete subject that has a number as state. */
public class NumberSubject extends Subject {
	private int state;

	public NumberSubject(int state) {
		this.state = state;
	}

	@Override
	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
		super.sendNotice();
	}
}
