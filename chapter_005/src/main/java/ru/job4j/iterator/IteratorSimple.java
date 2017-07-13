package ru.job4j.iterator;

import java.util.Iterator;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 12.07.2017.
 */
public class IteratorSimple implements Iterator {
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
    IteratorSimple(final int[] values) {
        this.values = values;
    }

    /**
     * Check is next element exist?
     * @return boolean.
     */
    public boolean hasNext() {
        return values.length > index;
    }

    /**
     * Return existing element and increment flag.
     * @return Object.
     */
    public Object next() {
        while (index < values.length) {
            if (values[index] > 1) {
                for (int i = 2; i <= values[index]; i++) {
                    if (values[index] == i) {
                        return values[index++];
                    }
                    if (values[index] % i == 0) {
                        break;
                    }

                }
            } else if (values[index] == 1) {
                return values[index++];
            } else if (values[index] == 0) {
                return values[index++];
            }
            index++;
        }
        return -1;
    }
}
