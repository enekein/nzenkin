package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Nikita Zenkin.
 *@since 30.05.2017.
 *@version 1.
*/

public class PaintTest {
	/**
	 * test method pyramid with height 2. Expected 2 rows
	*/
    @Test
    public void whenPiramidWithHeightTwoThenStringWithTwoRows() {
        Paint paint = new Paint();
        String result = paint.pyramid(2);
		final String line = System.getProperty("line.separator");
        String expected = String.format(" ^ %s^^^%s", line, line);
        assertThat(result, is(expected));
    }
	/**
	 * test method pyramid with height 3. Expected 3 rows.
	*/
    @Test
    public void whenPiramidWithHeightThreeThenStringWithThreeRows() {
       Paint paint = new Paint();
        String result = paint.pyramid(3);
		final String line = System.getProperty("line.separator");
        String expected = String.format("  ^  %s ^^^ %s^^^^^%s", line, line, line);
        assertThat(result, is(expected));
    }
}