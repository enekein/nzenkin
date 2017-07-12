package ru.job4j.iterator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 12.07.2017.
 */
public class IteratorArrayTest {
    /**
     * Test method boolean hasNext().
     */
    @Test
    public void whenUseHasNextForArrayWithNextValueThenReturnTrue() {
        IteratorArray it = new IteratorArray(
                new int[][] {
                        new int[] {1, 2, 3},
                        new int[] {4, 5, 6},
                }
        );
        assertThat(it.hasNext(), is(true));
    }

    /**
     * Test method Object next().
     */
    @Test
    public void whenUseNextThenReturnValueAndPushFlagToNextValue() {
        IteratorArray it = new IteratorArray(
                new int[][] {
                        new int[] {1, 2, 3},
                        new int[] {4, 5, 6},
                }
        );
        it.next();
        int result = (int) it.next();
        int expected = 2;
        assertThat(result, is(expected));
    }
}
