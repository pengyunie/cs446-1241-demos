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

    @Test
    public void testDisable() {
        FancyButton button = new FancyButton(3);
        Assert.assertTrue(button.getState() instanceof OffState);
        button.disable();
        Assert.assertTrue(button.getState() instanceof DisabledState);
        button.click();
        Assert.assertTrue(button.getState() instanceof DisabledState);
        button.enable();
        Assert.assertTrue(button.getState() instanceof OffState);
        button.click();
        Assert.assertTrue(button.getState() instanceof OnState);
    }
}
