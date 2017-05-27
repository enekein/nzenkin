package ru.job4j.Calculator;

/**
 *@author Nikita Zenkin
 *@since 14.05.2017
 *@version 1
*/

public class Calculator {

    /**
     *Variable for result value.
    */

    private double result;

    /**
     * Method may you add 2 double digits.
     *@param first - first double digit.
     *@param second - second double digit.
    */

    public void add(double first, double second) {
        this.result = first + second;
    }

    /**
     * Method may you substruct 2 double digits.
     *@param first - first double digit.
     *@param second - second double digit.
    */

    public void substruct(double first, double second) {
        this.result = first - second;
    }

    /**
     * Method may you multyply 2 double digits.
     *@param first - first double digit.
     *@param second - second double digit.
    */

    public void multyply(double first, double second) {
        this.result = first * second;
    }

    /**
     * Method may you div 2 double digits.
     *@param first - first double digit.
     *@param second - second double digit.
    */

    public void div(double first, double second) {
        this.result = first / second;
    }

    /**
     * Method returns variable result from instance of Calculator class.
     * @param none.
     * @return - double.
    */

    public double getResult() {
        return this.result;
    }
}