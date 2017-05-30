package ru.job4j.loop;

/**
 *@author Nikita Zenkin.
 *@since 30.05.2017.
 *@version 1.
*/

public class Paint {
	/**
	 * @param h int. height of pyramid
	 * @return String.
	*/
	 public String pyramid(int h) {
		 StringBuilder s = new StringBuilder();
		 for (int i = 0; i < h; i++) {
			 for (int j = 0; j < h - i - 1; j++) {
				 s.append(" ");
			 }
			 for (int j = h - i - 1; j < h + i; j++) {
				 s.append("^");
			 }
			 for (int j = 0; j < h - i - 1; j++) {
				 s.append(" ");
			 }
			 s.append(System.getProperty("line.separator"));
		 }
		 return s.toString();
	 }
}