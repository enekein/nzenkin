package ru.job4j.counter;

/**
 *@author Nikita Zenkin.
 *@since 28.05.2017.
 *@version 1.
*/

/**
 *Class for count summ of even numbers in loop.
*/

public class Counter {
	/**
	 * Method for summ even numbers.
	 * @return int.
	 * @param start int, start number of loop.
	 * @param finish int, finish number of loop.
	*/
	public int add(int start, int finish) {
		int result = 0;

		for (int i = start; i <= finish; i++) {
			if (i % 2 == 0) {
				result += i;
			}
		}

		return result;
	}
}