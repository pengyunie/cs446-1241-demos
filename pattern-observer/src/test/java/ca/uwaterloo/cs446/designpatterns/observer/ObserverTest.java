package ca.uwaterloo.cs446.designpatterns.observer;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ObserverTest {
	private Subject sub;

	@Before
	public void setup() {
		sub = new NumberSubject(0);
	}

	@Test
	public void testOctObserver() {
		OctObserver observer = new OctObserver(sub);

		sub.setState(8);
		Assert.assertEquals(observer.getValue(), "10");

		sub.setState(10);
		Assert.assertEquals(observer.getValue(), "12");
	}

	@Test
	public void testHexObserver() {
		HexObserver observer = new HexObserver(sub);
		sub.setState(8);
		Assert.assertEquals(observer.getValue(), "8");

		sub.setState(10);
		Assert.assertEquals(observer.getValue(), "a");
	}

	@Test
	public void testBinObserver() {
		BinObserver observer = new BinObserver(sub);
		sub.setState(8);
		Assert.assertEquals(observer.getValue(), "1000");

		sub.setState(10);
		Assert.assertEquals(observer.getValue(), "1010");
	}
}
