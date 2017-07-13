package ru.job4j.iterator;

import java.util.Iterator;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 12.07.2017.
 */
public class IteratorEven implements Iterator {
    /**
     * Variable for array.
     */
    private final int[] values;
    /**
     * Variable for flag.
     */
    private int index = 0;

    /**
     * Constructor.
     * @param values int[].
     */
    IteratorEven(final int[] values) {
        this.values = values;
    }

    /**
     * Check is next element exist?
     * @return boolean.
     */
    public boolean hasNext() {
        return (values.length > index && values[index] % 2 == 0);
    }

    /**
     * Return existing element and increment flag.
     * @return Object.
     */
    public Object next() {
        if (values[index] % 2 == 0) {
            return values[index++];
        } else {
            index++;
            return values[index++];
        }
    }
}

