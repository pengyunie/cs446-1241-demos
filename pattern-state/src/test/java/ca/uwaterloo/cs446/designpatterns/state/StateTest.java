package ca.uwaterloo.cs446.designpatterns.state;

import org.junit.Assert;
import org.junit.Test;

public class StateTest {
    @Test
    public void testClick() {
        FancyButton button = new FancyButton(3);
        Assert.assertTrue(button.getState() instanceof OffState);
        button.click();
        Assert.assertTrue(button.getState() instanceof OnState);
        button.click();
        Assert.assertTrue(button.getState() instanceof OnState);
        button.click();
        Assert.assertTrue(button.getState() instanceof OnState);
        button.click();
        Assert.assertTrue(button.getState() instanceof OffState);
    }
}
