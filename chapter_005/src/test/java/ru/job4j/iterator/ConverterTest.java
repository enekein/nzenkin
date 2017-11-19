package ru.job4j.iterator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import static org.junit.Assert.assertArrayEquals;


/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 13.07.2017.
 */
public class ConverterTest {
    /**
     * Test iterator of iterator.
     */
    @Test
    public void whenCreateNewIteratorOfIteratorThenReturnOneIterator() {
        List<Integer> list1 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4)
        );
        List<Integer> list2 = new ArrayList<>(
                Arrays.asList(1, 2, 3, 4)
        );
        List<Iterator<Integer>> iterators = new ArrayList<>(
                Arrays.asList(list1.iterator(), null, list2.iterator())
        );
        Converter converter = new Converter();
        Iterator<Integer> result = converter.convert(iterators.iterator());
        int[] expected = {1, 2, 3, 4, 1, 2, 3, 4};
        int[] actual = new int[8];
        int index = 0;
        while (result.hasNext()) {
            actual[index++] = result.next();
        }
        assertArrayEquals(expected, actual);
    }
}
