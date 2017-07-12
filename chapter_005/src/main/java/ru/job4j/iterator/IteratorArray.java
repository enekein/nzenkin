package ru.job4j.iterator;

import java.util.Iterator;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 11.07.2017.
 */
public class IteratorArray implements Iterator {
    /**
     * Variable for 2d array.
     */
    private final int[][] values;
    /**
     * Variable for flag.
     */
    private int index = 0;

    /**
     * Constructor.
     * @param values int[][].
     */
    IteratorArray(final int[][] values) {
        this.values = values;
    }

    /**
     * Check is next element exist?
     * @return boolean.
     */
    public boolean hasNext() {
        return (values[0].length * values.length) > index;
    }

    /**
     * Return existing element and increment flag.
     * @return Object.
     */
    public Object next() {
        int column = index / values[0].length;
        int row = index % values[0].length;
        index++;
        return values[column][row];
    }
}
