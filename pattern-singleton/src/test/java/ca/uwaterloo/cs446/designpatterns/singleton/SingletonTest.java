package ca.uwaterloo.cs446.designpatterns.singleton;

import org.junit.Test;
import org.junit.Assert;

public class SingletonTest {

    @Test
    public void testSingleton() {
        Assert.assertEquals(0, Singleton.getCreationCount());

        Singleton singleton1 = Singleton.getInstance();
        Assert.assertEquals(1, Singleton.getCreationCount());

        Singleton singleton2 = Singleton.getInstance();
        Assert.assertEquals(1, Singleton.getCreationCount());
        Assert.assertSame(singleton1, singleton2);
    }
}
