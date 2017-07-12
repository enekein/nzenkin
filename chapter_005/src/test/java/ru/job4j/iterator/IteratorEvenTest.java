package ru.job4j.iterator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 12.07.2017.
 */
public class IteratorEvenTest {
    /**
     * Test method boolean hasNext().
     */
    @Test
    public void whenUseHasNextForArrayWithNextValueThenReturnTrue() {
        IteratorEven it = new IteratorEven(
                new int[] {1, 2, 3}
        );
        assertThat(it.hasNext(), is(true));
    }

    /**
     * Test method Object next().
     */
    @Test
    public void whenUseNextThenReturnValueAndPushFlagToNextValue() {
        IteratorEven it = new IteratorEven(
                new int[] {1, 2, 3}
        );
        int result = (int) it.next();
        int expected = 2;
        assertThat(result, is(expected));
    }
}
