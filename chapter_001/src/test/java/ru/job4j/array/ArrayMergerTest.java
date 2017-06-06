package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Nikita Zenkin.
 *@since 06.06.2017.
 *@version 1.
*/

public class ArrayMergerTest {
	/**
	 * This method tests method merger(int[]).
	 * Expected merger sorted array.
	 */
	@Test
	public void whenMergerTwoSortedArraysThenReturnOneSortedMergeredArray() {
		ArrayMerger array = new ArrayMerger();
		int[] firstArray = new int[]{3, 5, 6, 8};
		int[] secondArray = new int[]{4, 7, 9};
		int[] result = array.merger(firstArray, secondArray);
		int[] expected = {3, 4, 5, 6, 7, 8, 9};
		assertThat(result, is(expected));
	}
}