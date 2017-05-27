package ru.job4j.Calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Nikita Zenkin
 *@since 14.05.2017
 *@version 1
*/


public class CalculatorTest {

   /**
     * Method tests method add.
     * If add 1 + 1 the result must be 2.
   */


    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }

    /**
     * Method tests method multyply.
     * If multyply 2 * 2 the result must be 4.
    */

    @Test
    public void whenMultyplyTwoByTwoThenFour() {
        Calculator calc = new Calculator();
        calc.multyply(2D, 2D);
        double result = calc.getResult();
        double expected = 4D;
        assertThat(result, is(expected));
    }

    /**
     * Method tests method substruct.
     * If 2 - 1 the result must be 1.
    */

    @Test
    public void whenSubstructTwoMinusOneThenOne() {
        Calculator calc = new Calculator();
        calc.substruct(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }

    /**
     * Method tests method div.
     * If 4 / 2 the result must be 2.
    */

    @Test
    public void whenDivFourByTwoThenTwo() {
        Calculator calc = new Calculator();
        calc.div(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}