package ru.job4j.array;
import java.util.Arrays;
/**
 *@author Nikita Zenkin.
 *@since 01.06.2017.
 *@version 1.
*/

public class ArrayDuplicate {
	/**
	 * method for deleting duplicates from string[].
	 * @return String[]. array of strings with  deleted duplicates.
	 * @param array String[]. source array.
	*/
	public String[] remove(String[] array) {
		String temp;
		int count = array.length - 1;
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = i; j < count; j++) {
				if ((array[i] == array[j]) && (i != j)) {
					temp = array[j];
					array[j] = array[count];
					array[count] = temp;
					count--;
				}
			}
		}
		return Arrays.copyOf(array, count + 1);
	}
}