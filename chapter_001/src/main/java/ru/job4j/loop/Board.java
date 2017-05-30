package ru.job4j.loop;

/**
 *@author Nikita Zenkin.
 *@since 30.05.2017.
 *@version 1.
*/

public class Board {
	/**
	 * method for draw chess field of n width and n height.
	 * @param width int. width of chess field.
	 * @param height int. height of chess field.
	 * @return String.
	*/
	public String paint(int width, int height) {
		StringBuilder s = new StringBuilder();
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				if ((i + j) % 2 == 0) {
					s.append("x");
				} else {
					s.append(" ");
				}
			}
			s.append(System.getProperty("line.separator"));
		}
		return s.toString();
	}
}