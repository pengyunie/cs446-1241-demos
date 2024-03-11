package ca.uwaterloo.cs446.designpatterns.composite;

public class File implements Component {
	private String name;

	public File(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String ls() {
		return name;
	}
}
