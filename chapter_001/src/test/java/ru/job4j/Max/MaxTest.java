package ru.job4j.Max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Nikita Zenkin
 *@since 19.05.2017
 *@version 1
*/

public class MaxTest {

	/**
	* Test method max when first int > second int.
	*/

	@Test
	public void whenTwoGreaterOneThenReturnTwo() {
		Max maximum = new Max();
		int result = maximum.max(2, 1);
		int expected = 2;
		assertThat(result, is(expected));
	}

	/**
	* Test method max when first int < second int.
	*/

	@Test
	public void whenOneLowerTwoThenReturnTwo() {
		Max maximum = new Max();
		int result = maximum.max(1, 2);
		int expected = 2;
		assertThat(result, is(expected));
	}

	/**
	* Test method max when first int = second int.
	*/

	@Test
	public void whenOneEqualOneThenReturnOne() {
		Max maximum = new Max();
		int result = maximum.max(1, 1);
		int expected = 1;
		assertThat(result, is(expected));
	}
}