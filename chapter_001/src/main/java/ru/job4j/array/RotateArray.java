package ru.job4j.array;

/**
 *@author Nikita Zenkin.
 *@since 31.05.2017.
 *@version 1.
*/

public class RotateArray {
	/**
	 * @param array int[][]. source 2-dimensional array.
	 * @return array int[][] . rotated 2-dimensional array.
	*/
	public int[][] rotate(int[][] array) {
		int[][] rotatedArray = new int[array.length][array.length];
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				rotatedArray[j][array.length - i - 1] = array[i][j];
			}
			/*
			temp = array[index][i];
			array[index][i] = array[array.length - i - 1][index];
			array[array.length - i - 1][index] = array[array.length - 1][array.length - i - 1];
			array[array.length - 1][array.length - i - 1] = array[i][array.length - 1];
			array[i][array.length - 1] = temp;
			*/
		}
		return rotatedArray;
	}
}