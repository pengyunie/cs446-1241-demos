package ca.uwaterloo.cs446.designpatterns.composite;

import org.junit.Assert;
import org.junit.Test;

public class CompositeMainTest {
    @Test
    public void testLsDirectoryEmpty() {
        Directory photos = new Directory("PHOTOS");
        Assert.assertEquals("PHOTOS", photos.ls());
    }

    @Test
    public void testLsDirectoryNonEmpty() {
        Directory photos = new Directory("PHOTOS");
        Directory shanghai = new Directory("SHANGHAI");
        Directory kyoto = new Directory("KYOTO");
        File opt = new File("Oriental Pearl Tower");
        File bund = new File("The Bund");
        File kiyomizu = new File("Kiyomizu Dera");

        shanghai.add(opt);
        shanghai.add(bund);
        kyoto.add(kiyomizu);

        photos.add(shanghai);
        photos.add(kyoto);

        Assert.assertEquals("PHOTOS\nSHANGHAI\nOriental Pearl Tower\nThe Bund\nKYOTO\nKiyomizu Dera", photos.ls());
    }

    @Test
    public void testLsFile() {
        File file = new File("Important Document");
        Assert.assertEquals("Important Document", file.ls());
    }

    @Test
    public void testLsHiddenFile() {
        HiddenFile file = new HiddenFile("Hidden Document");
        Assert.assertEquals("", file.ls());
    }

    @Test
    public void testLsHiddenFileInDirectory() {
        Directory dir = new Directory("DIR");
        File file = new File("Visible");
        HiddenFile hFile = new HiddenFile("Invisible");

        dir.add(file);
        dir.add(hFile);

        Assert.assertEquals("DIR\nVisible", dir.ls());
    }
}
