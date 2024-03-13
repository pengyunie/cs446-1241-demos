package ca.uwaterloo.cs446.designpatterns.strategy;

import org.junit.Assert;
import org.junit.Test;

public class StrategyTest {
	@Test
	public void testFlatRateDiscount() {
		Discount discount = new FlatRateDiscount(5);
		Assert.assertEquals(95, discount.compute(100), 0.001);
	}

	@Test
	public void testPercentDiscount() {
		Discount discount = new PercentDiscount(25);
		Assert.assertEquals(75, discount.compute(100), 0.001);
	}

	@Test
	public void testRandomPercentDiscount() {
		Discount discount = new RandomPercentDiscount(1, 50);
		double price = discount.compute(100);
		Assert.assertTrue(price >= 50 && price <= 99);
	}
}
