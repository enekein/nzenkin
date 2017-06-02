package ru.job4j.substring;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Nikita Zenkin.
 *@since 02.06.2017.
 *@version 1.
*/

public class FinalTest {
	/**
	 * This method tests method contains which one must check is string contains substring.
	 * Expected boolean value true if string contains substring.
	*/
    @Test
	public void whenStringContainsSubStringThenTrue() {
		Final finalTask = new Final();
		boolean result = finalTask.contains("That is my final task for first chapter", "task for");
		boolean expected = true;
		assertThat(result, is(expected));
	}
	/**
	 * This method tests method contains which one must check is string contains substring.
	 * Expected boolean value false if string isn't contains substring.
	*/
    @Test
	public void whenStringIsNotContainsSubStringThenFalse() {
		Final finalTask = new Final();
		boolean result = finalTask.contains("That is my final task for first chapter", "task foe");
		boolean expected = false;
		assertThat(result, is(expected));
	}
}