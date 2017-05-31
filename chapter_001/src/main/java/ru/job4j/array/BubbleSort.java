package ru.job4j.array;

/**
 *@author Nikita Zenkin.
 *@since 31.05.2017.
 *@version 1.
*/

public class BubbleSort {
	/**
	 * @return array int[]. sorted array of integer values.
	 * @param array int[]. unsorted array of integer values.
	*/
	public int[] sort(int[] array) {
		int temp;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
		return array;
	}
}