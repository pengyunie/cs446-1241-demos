package ca.uwaterloo.cs446.designpatterns.factorymethod;

public abstract class CarFactory {
	
	public String testHonk() {
		Car car = this.makeCar();
		return car.honk();
	}
	
	public abstract Car makeCar();
}
