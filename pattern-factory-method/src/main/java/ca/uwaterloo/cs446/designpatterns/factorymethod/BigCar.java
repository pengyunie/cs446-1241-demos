package ca.uwaterloo.cs446.designpatterns.factorymethod;

public class BigCar implements Car {
	@Override
	public String honk() {
		return "honk honk";
	}
}
