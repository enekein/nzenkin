package ru.job4j.set;

import org.junit.Test;
import java.util.Iterator;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 01.11.2017.
 */

public class SimpleSetTest {
    /**
     * Test for method add(E e).
     */
    @Test
    public void whenAddNewItemThenAddItToInnerArray() {
        SimpleSet<Integer> simpleSet = new SimpleSet<>();
        simpleSet.add(33);
        simpleSet.add(23);
        simpleSet.add(43);
        Iterator<Integer> it = simpleSet.iterator();
        it.next();
        assertThat(it.next(), is(23));
    }
}
