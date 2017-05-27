package ru.job4j.Max;

/**
 *@author Nikita Zenkin.
 *@since 19.05.2017.
 *@version 1.
*/

/**
 Class is compare 2 int variables and returm which one with max value.
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
}