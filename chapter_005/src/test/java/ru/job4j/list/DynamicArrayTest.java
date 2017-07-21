package ru.job4j.list;

import org.junit.Test;
import java.util.Iterator;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 21.07.2017.
 */

public class DynamicArrayTest {
    /**
     * Checking methods void add(E) and E get(int).
     */
    @Test
    public void whenAddNewElementToDynamicArray() {
        DynamicArray<String> dynamicArray = new DynamicArray<>(2);
        dynamicArray.add("test");
        assertThat(dynamicArray.get(0), is("test"));
    }

    /**
     * Checking method boolean nasNext().
     */
    @Test
    public void whenCheckHasNextWithExistingNextElementThenReturnTrue() {
        DynamicArray<String> dynamicArray = new DynamicArray<>(2);
        dynamicArray.add("test");
        dynamicArray.add("test2");
        assertThat(dynamicArray.iterator().hasNext(), is(true));
    }

    /**
     * Checking methods void extendContainer() and E next().
     */
    @Test
    public void whenUseNextThenReturnCurrentElementAndMoveCursorToNext() {
        DynamicArray<String> dynamicArray = new DynamicArray<>(2);
        dynamicArray.add("test");
        dynamicArray.add("test2");
        dynamicArray.add("test3");
        Iterator<String> it = dynamicArray.iterator();
        it.next();
        assertThat(it.next(), is("test2"));
    }
}
