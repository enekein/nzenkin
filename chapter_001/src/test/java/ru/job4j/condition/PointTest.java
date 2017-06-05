package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Nikita Zenkin
 *@since 19.05.2017
 *@version 1
*/

public class PointTest {

	/**
	 * Testing the situation when point is on line.
	*/

	@Test
	public void whenPointIsOnLineWhenTrue() {
		Point pointTrue = new Point(1, 2);
		boolean result = pointTrue.is(1, 1);
		boolean expected = true;
		assertThat(result, is(expected));
	}

	/**
	 * Testing the situation when point is NOT on line.
	*/

	@Test
	public void whenPointIsNotOnLineWhenFalse() {
		Point pointTrue = new Point(1, 4);
		boolean result = pointTrue.is(1, 1);
		boolean expected = false;
		assertThat(result, is(expected));
	}
}
