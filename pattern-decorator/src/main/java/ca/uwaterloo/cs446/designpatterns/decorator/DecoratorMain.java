package ca.uwaterloo.cs446.designpatterns.decorator;

import java.util.ArrayList;
import java.util.List;

public class DecoratorMain {

    public static void main(String... args) {
        HotBeverage coffee = new BlackCoffee();
        HotBeverage coffeeWMilk = new AddMilk(coffee);
        HotBeverage coffeeWMilkSugar = new AddSugar(coffeeWMilk);

        HotBeverage tea = new BlackTea();
        HotBeverage teaWSugar = new AddSugar(tea);
        HotBeverage teaWSugarMilk = new AddMilk(teaWSugar);

        List<HotBeverage> beverages = new ArrayList<>();
        beverages.add(coffee);
        beverages.add(coffeeWMilkSugar);
        beverages.add(tea);
        beverages.add(teaWSugarMilk);

        for (HotBeverage beverage : beverages) {
            System.out.println(
                    String.format("Beverage %s: $%.2f", beverage.getIngredients().toString(), beverage.getCost()));
        }
    }
}
