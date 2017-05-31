package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Nikita Zenkin.
 *@since 31.05.2017.
 *@version 1.
*/

public class BubbleSortTest {
	/**
	 * This method tests method sort with unsorted array with ten elements.
	 * Expected sorted array with ten values.
	*/
    @Test
    public void whenSortArrayWithTenElementsThenSortedArray() {
        BubbleSort bubbleSort = new BubbleSort();
		int[] result = bubbleSort.sort(new int[]{1, 5, 4, 2, 3, 1, 7, 8, 0, 5});
		int[] expected = new int[]{0, 1, 1, 2, 3, 4, 5, 5, 7, 8};
		assertThat(result, is(expected));
    }
}