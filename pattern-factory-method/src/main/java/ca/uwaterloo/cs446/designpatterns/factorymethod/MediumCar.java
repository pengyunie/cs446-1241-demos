package ca.uwaterloo.cs446.designpatterns.factorymethod;

public class MediumCar implements Car {
    private String color;

    public MediumCar(String color) {
        this.color = color;
    }

    @Override
    public String honk() {
        return "toot toot";
    }
}
