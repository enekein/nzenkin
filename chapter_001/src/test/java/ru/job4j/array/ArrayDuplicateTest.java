package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Nikita Zenkin.
 *@since 02.06.2017.
 *@version 1.
*/

public class ArrayDuplicateTest {
	/**
	 * This method tests method remove which one must delete all duplicates in array of string.
	 * Expected array of strings without duplicates.
	*/
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate arrDupl = new ArrayDuplicate();
		String[] result = arrDupl.remove(new String[]{"Привет", "Мир", "Привет", "Супер", "Мир"});
		String[] expected = new String[]{"Привет", "Мир", "Супер"};
		assertThat(result, is(expected));
    }
}