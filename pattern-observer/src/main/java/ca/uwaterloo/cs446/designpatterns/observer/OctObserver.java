package ca.uwaterloo.cs446.designpatterns.observer;

/** A concrete observer that represents numbers with a radix of 8. */
public class OctObserver extends Observer {
	private String octValue;
	
	public OctObserver(Subject subject) {
		super(subject);
		// octValue is implicitly initialized to null
	}
	
	@Override
	public void update() {
		octValue = Integer.toOctalString(subject.getState());
	}

	@Override
	public String getValue() {
		return octValue;
	}
}
