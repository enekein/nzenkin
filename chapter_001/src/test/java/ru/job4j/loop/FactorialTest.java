package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Nikita Zenkin
 *@since 30.05.2017
 *@version 1
*/

public class FactorialTest {
	/**
	 * test method calc for factorial 5. result must be 120.
	*/
	@Test
	public void whenCalculateFactorialForFiveThenOneHundredTwentry() {
		Factorial fact = new Factorial();
		int result = fact.calc(5);
		int expected = 120;
		assertThat(result, is(expected));
	}

	/**
	 * test method calc for factorial 0. result must be 1.
	*/
	@Test
	public void whenCalculateFactorialForZeroThenOne() {
		Factorial fact = new Factorial();
		int result = fact.calc(0);
		int expected = 1;
		assertThat(result, is(expected));
	}
}