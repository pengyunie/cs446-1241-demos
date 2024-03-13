package ca.uwaterloo.cs446.designpatterns.templatemethod;

import org.junit.Assert;
import org.junit.Test;

public class TemplateMethodTest {
    @Test
    public void testAndroidCompiler() {
        AndroidCompiler compiler = new AndroidCompiler();
        compiler.crossCompile();
        Assert.assertEquals("sources", compiler.getSources());
        Assert.assertEquals("android", compiler.getDependencies());
        Assert.assertEquals("android", compiler.getTarget());
    }

    @Test
    public void testBlackBerryCompiler() {
        BlackBerryCompiler compiler = new BlackBerryCompiler();
        compiler.crossCompile();
        Assert.assertEquals("sources", compiler.getSources());
        Assert.assertEquals("blackberry", compiler.getDependencies());
        Assert.assertEquals("blackberry", compiler.getTarget());
    }

    @Test
    public void testIPhoneCompiler() {
        IPhoneCompiler compiler = new IPhoneCompiler();
        compiler.crossCompile();
        Assert.assertEquals("sources", compiler.getSources());
        Assert.assertEquals("iphone", compiler.getDependencies());
        Assert.assertEquals("iphone", compiler.getTarget());
    }
}
