package ca.uwaterloo.cs446.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class DecoratorMain {

    public static void main(String... args) {
        HotBeverage coffee = new BlackCoffee();
        HotBeverage coffeeWMilk = new AddMilk(coffee);
        HotBeverage coffeeWMilkSugar = new AddSugar(coffeeWMilk);

        List<HotBeverage> beverages = new ArrayList<>();
        beverages.add(coffee);
        beverages.add(coffeeWMilkSugar);

        for (HotBeverage beverage : beverages) {
            System.out.println(
                    String.format("Beverage %s: $%.2f", beverage.getIngredients().toString(), beverage.getCost()));
        }
    }
}
