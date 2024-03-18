package ca.uwaterloo.cs446.designpatterns.factorymethod;

public class SmallCar implements Car {
	@Override
	public String honk() {
		return "beep beep";
	}
}
