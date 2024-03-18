package ca.uwaterloo.cs446.designpatterns.factorymethod;

public class BigCarFactory extends CarFactory {
	@Override
	public Car makeCar() {
		return new BigCar();
	}
}
