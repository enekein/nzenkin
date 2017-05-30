package ru.job4j.array;

/**
 *@author Nikita Zenkin.
 *@since 30.05.2017.
 *@version 1.
*/

public class Turn {
	/**
	 * Class for reverse array of integer.
	 * @return int[].
	 * @param array int[]. source array.
	*/
	public int[] back(int[] array) {
		int temp;
		for (int i = 0; i < array.length / 2; i++) {
			temp = array[i];
			array[i] = array[array.length - i - 1];
			array[array.length - i - 1] = temp;
		}
		return array;
	}
}
