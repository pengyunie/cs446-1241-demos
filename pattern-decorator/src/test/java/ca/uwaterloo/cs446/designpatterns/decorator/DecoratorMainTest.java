package ca.uwaterloo.cs446.designpatterns.decorator;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class DecoratorMainTest {

	@Test
	public void testBlackCoffee() {
		HotBeverage blackCoffee = new BlackCoffee();
		Assert.assertEquals(2.0, blackCoffee.getCost(), 0.001);
		Assert.assertEquals(Arrays.asList("Coffee"), blackCoffee.getIngredients());
	}

	@Test
	public void testBlackCoffeeWMilk() {
		HotBeverage beverage = new AddMilk(new BlackCoffee());
		Assert.assertEquals(2.5, beverage.getCost(), 0.001);
		Assert.assertEquals(Arrays.asList("Coffee", "Milk"), beverage.getIngredients());
	}

	@Test
	public void testBlackCoffeeWSugar() {
		HotBeverage beverage = new AddSugar(new BlackCoffee());
		Assert.assertEquals(2.25, beverage.getCost(), 0.001);
		Assert.assertEquals(Arrays.asList("Coffee", "Sugar"), beverage.getIngredients());
	}

	@Test
	public void testBlackCoffeeWMilkSugar() {
		HotBeverage beverage = new AddSugar(new AddMilk(new BlackCoffee()));
		Assert.assertEquals(2.75, beverage.getCost(), 0.001);
		Assert.assertEquals(Arrays.asList("Coffee", "Milk", "Sugar"), beverage.getIngredients());
	}

	@Test
	public void testBlackTea() {
		HotBeverage blackTea = new BlackTea();
		Assert.assertEquals(1.5, blackTea.getCost(), 0.001);
		Assert.assertEquals(Arrays.asList("Tea"), blackTea.getIngredients());
	}

	@Test
	public void testBlackTeaWMilk() {
		HotBeverage beverage = new AddMilk(new BlackTea());
		Assert.assertEquals(2.0, beverage.getCost(), 0.001);
		Assert.assertEquals(Arrays.asList("Tea", "Milk"), beverage.getIngredients());
	}

	@Test
	public void testBlackTeaWSugar() {
		HotBeverage beverage = new AddSugar(new BlackTea());
		Assert.assertEquals(1.75, beverage.getCost(), 0.001);
		Assert.assertEquals(Arrays.asList("Tea", "Sugar"), beverage.getIngredients());
	}

	@Test
	public void testBlackTeaWMilkSugar() {
		HotBeverage beverage = new AddSugar(new AddMilk(new BlackTea()));
		Assert.assertEquals(2.25, beverage.getCost(), 0.001);
		Assert.assertEquals(Arrays.asList("Tea", "Milk", "Sugar"), beverage.getIngredients());
	}
}
