package ca.uwaterloo.cs446.designpatterns.factorymethod;

public class MediumCarFactory extends CarFactory {
    @Override
    public Car makeCar() {
        return new MediumCar("black");
    }
}
