package ru.job4j.generics;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 19.07.2017.
 */

public class SimpleArrayTest {
    /**
     * Check methods get(int) and add(Object).
     */
    @Test
    public void whenAddNewObjectToArray() {
        SimpleArray<Integer> simpleArray = new SimpleArray<>(5);
        simpleArray.add(6);
        assertThat(simpleArray.get(0), is(6));
    }

    /**
     * Check method update(Object, int).
     */
    @Test
    public void whenUpdateObjectThenChangeObjectInArrayWithSelected() {
        SimpleArray<Integer> simpleArray = new SimpleArray<>(5);
        simpleArray.add(6);
        simpleArray.update(7, 0);
        assertThat(simpleArray.get(0), is(7));
    }

    /**
     * Check method delete(Object).
     */
    @Test
    public void whenDeleteObjectFromObjectsArrayWithOneElementThenReturnNull() {
        SimpleArray<Integer> simpleArray = new SimpleArray<>(5);
        simpleArray.add(6);
        simpleArray.add(7);
        simpleArray.add(8);
        simpleArray.delete(6);
        assertThat(simpleArray.get(0), is(7));
    }
}
