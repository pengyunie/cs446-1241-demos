package ca.uwaterloo.cs446.designpatterns.iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class IteratorTest {
    @Test
    public void testSequentialIterator() {
        List<Integer> data = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        AbstractDataGenerator generator = new SequentialDataGenerator(data);
        AbstractDataIterator iterator = generator.getIterator();

        for (int i = 1; i <= 5; i++) {
            Assert.assertFalse(iterator.done());
            Assert.assertEquals(i, iterator.get());
            iterator.next();
        }
        Assert.assertTrue(iterator.done());
    }

    @Test
    public void testRandomIterator() {
        List<Integer> data = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        AbstractDataGenerator generator = new RandomDataGenerator(data);
        AbstractDataIterator iterator = generator.getIterator();

        List<Integer> seenData = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            Assert.assertFalse(iterator.done());
            seenData.add(iterator.get());
            iterator.next();
        }
        Assert.assertTrue(iterator.done());
        Collections.sort(data);
        Collections.sort(seenData);
        Assert.assertArrayEquals(data.toArray(), seenData.toArray());
    }

    @Test
    @Ignore("This test is expected to fail. Comment out this line to run the test and see what's happening.")
    public void whatCouldHappenWithoutIterator() {
        List<Integer> data = new ArrayList(Arrays.asList(1, 2, 3, 4, 5));
        SequentialDataGenerator generator = new SequentialDataGenerator(data);

        // the internal data may be modified accidentally or maliciously by client code
        generator.getData().clear();

        // these assertions will fail
        int index = 0;
        for (int i = 1; i <= 5; i++) {
            Assert.assertEquals(i, generator.getData().get(index).intValue());
            index++;
        }
    }
}
