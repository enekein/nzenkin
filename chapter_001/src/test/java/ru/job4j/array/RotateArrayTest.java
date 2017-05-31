package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Nikita Zenkin.
 *@since 31.05.2017.
 *@version 1.
*/

public class RotateArrayTest {
	/**
	 * This method tests method rotate with 2 dimensional array with 3 rows and 3 cols.
	 * Expected 2 dimensional array with rotated outer sides upon cloclwise.
	*/
	@Test
    public void whenRotateThreeRowThreeColArrayThenRotatedArray() {
        RotateArray rotateArray = new RotateArray();
		int[][] arrayForResult = new int[][] {
			new int[] {1, 2, 3},
			new int[] {4, 5, 6},
			new int[] {7, 8, 9},
		};
		int[][] result = rotateArray.rotate(arrayForResult);
		int[][] expected = new int[][] {
			new int[] {7, 4, 1},
			new int[] {8, 5, 2},
			new int[] {9, 6, 3},
		};
		assertThat(result, is(expected));
    }
	/**
	 * This method tests method rotate with 2 dimensional array with 2 rows and 2 cols.
	 * Expected 2 dimensional array with rotated outer sides upon cloclwise.
	*/
	@Test
    public void whenRotateTwoRowTwoColArrayThenRotatedArray() {
        RotateArray rotateArray = new RotateArray();
		int[][] arrayForResult = new int[][] {
			new int[] {1, 2},
			new int[] {4, 5},
		};
		int[][] result = rotateArray.rotate(arrayForResult);
		int[][] expected = new int[][] {
			new int[] {4, 1},
			new int[] {5, 2},
		};
		assertThat(result, is(expected));
    }
}