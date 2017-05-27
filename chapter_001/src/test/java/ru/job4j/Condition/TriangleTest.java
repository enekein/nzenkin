package ru.job4j.Condition;

import static org.hamcrest.number.IsCloseTo.closeTo;
import org.junit.Test;
import static org.junit.Assert.assertThat;

/**
  *@author Nikita Zenkin.
  *@since 21.05.2017.
  *@version 1.
 */

public class TriangleTest {

	/**
	 * Testing the situation when triangle is exists.
	*/

	@Test
	public void whenTriangleIsExistsThenReturnArea() {
		Point a = new Point(1, 1);
		Point b = new Point(2, 1);
		Point c = new Point(3, 4);
		Triangle triangle = new Triangle(a, b, c);
		double result = triangle.area();
		double expected = 1.5D;
		assertThat(result, closeTo(expected, 0.01));
	}

	/**
	 * Testing the situation when triangle is not exists.
	*/

	@Test
	public void whenOneSideGreaterThenSummOfTwoOtherSidesThenReturnMinusOne() {
		Point a = new Point(0, 0);
		Point b = new Point(0, 1);
		Point c = new Point(0, 3);
		Triangle triangle = new Triangle(a, b, c);
		double result = triangle.area();
		double expected = -1D;
		assertThat(result, closeTo(expected, 0.01));
	}
}

