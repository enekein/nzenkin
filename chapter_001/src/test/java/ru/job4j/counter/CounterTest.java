package ru.job4j.counter;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Nikita Zenkin
 *@since 28.05.2017
 *@version 1
*/

public class CounterTest {

	/**
	* Test method add when count 1 to 10.
	*/

	@Test
	public void whenSumEvenNumbersFromOneToTenThenReturnThirty() {
		Counter count = new Counter();
		int result = count.add(1, 10);
		int expected = 30;
		assertThat(result, is(expected));
	}
}

