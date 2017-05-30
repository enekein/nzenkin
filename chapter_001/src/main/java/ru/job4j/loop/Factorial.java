package ru.job4j.loop;

/**
 *@author Nikita Zenkin.
 *@since 30.05.2017.
 *@version 1.
*/

public class Factorial {
	/**
	 * method for calc factorial.
	 * @param n int. factorial of n.
	 * @return int.
	*/
	public int calc(int n) {
		int result = 1;
		if (n == 0) {
			return result;
		}

		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}
}