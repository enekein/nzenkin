package ru.job4j.max;

/**
 *@author Nikita Zenkin.
 *@since 19.05.2017.
 *@version 1.
*/

/**
 Class is compare 2 int variables and returm which one with max value.
 28.05.2017 Extended with method max for 3 int variables and return which one with max value.
*/

public class Max {

	/**
	 *@param first - first int digit.
     *@param second - second int digit.
	 *@return integer.
	*/

	public int max(int first, int second) {
		return (first > second ? first : second);
	}

	/**
	 *@param first - first int digit.
     *@param second - second int digit.
	 *@param third - third int digit.
	 *@return integer.
	*/

	public int max(int first, int second, int third) {
		return max(max(first, second), max(second, third));
	}
}