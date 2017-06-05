package ru.job4j.substring;
import java.io.*;
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
		for (int i = 0; i < arrayOfSourceChar.length; i++) {
			if (arrayOfSourceChar[i] == arrayOfSubStringChar[0]) {
				for (int j = 0; j < arrayOfSubStringChar.length; j++) {
					if (arrayOfSourceChar[i + j] == arrayOfSubStringChar[j]) {
						if (j == arrayOfSubStringChar.length - 1) {
						return true;
						}
					} else {
						i += j - 1;
						break;
					}
				}
			}
		}
		return false;
	}
}