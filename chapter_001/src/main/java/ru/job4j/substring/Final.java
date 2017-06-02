package ru.job4j.substring;

/**
 *@author Nikita Zenkin.
 *@since 02.06.2017.
 *@version 1.
*/

public class Final {
	/**
	 * method for checking substring in string.
	 * @return boolean.
	 * @param origin String. source string
	 * @param sub String. substring
	*/
	public boolean contains(String origin, String sub) {
		char[] arrayOfSourceChar = origin.toCharArray();
		char[] arrayOfSubStringChar = sub.toCharArray();
		int count = 0;
		for (int i = 0; i < arrayOfSourceChar.length; i++) {
			if (arrayOfSourceChar[i] == arrayOfSubStringChar[count]) {
				if (count == arrayOfSubStringChar.length - 1) {
					return true;
				}
				count++;
			} else {
				count = 0;
			}
		}
		return false;
	}
}