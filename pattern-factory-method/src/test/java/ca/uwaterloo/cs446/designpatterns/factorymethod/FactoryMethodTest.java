package ca.uwaterloo.cs446.designpatterns.factorymethod;

import org.junit.Assert;
import org.junit.Test;

public class FactoryMethodTest {
	@Test
	public void test() {
		CarFactory factory = new SmallCarFactory();
		Assert.assertEquals("beep beep", factory.testHonk());

		factory = new BigCarFactory();
		Assert.assertEquals("honk honk", factory.testHonk());

		factory = new MediumCarFactory();
		Assert.assertEquals("toot toot", factory.testHonk());
	}
}
