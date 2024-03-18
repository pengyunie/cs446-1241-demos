package ca.uwaterloo.cs446.designpatterns.factorymethod;

public class SmallCarFactory extends CarFactory {
	@Override
	public Car makeCar() {
		return new SmallCar();
	}
}
