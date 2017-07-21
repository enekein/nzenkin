package ru.job4j.list;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 19.07.2017.
 */

public class DynamicArray<E> implements SimpleContainer<E>{
    /**
     * Array of objects.
     */
    private Object[] container;
    /**
     * Index of current element.
     */
    private int index = 0;

    /**
     * Cinstructor.
      * @param size int.
     */
    DynamicArray(int size) {
        container = new Object[size];
    }

    /**
     * Add new element.
     * @param value E.
     */
    public void add(E value) {
        if (container.length == index) {
            extendContainer();
        }
        container[index++] = value;
    }

    /**
     * Extend length of container.
     */
    private void extendContainer() {
        container = Arrays.copyOf(container, container.length * 2);
    }

    /**
     * Get element.
     * @param index int.
     * @return E.
     */
    public E get(int index) {
        return (E) container[index];
    }

    /**
     * Iterator for DynamicArray.
     * @return Iterator E.
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            /**
             * Index of iterator.
             */
            private int currentIndex = 0;

            /**
             * Checking is next element exist?
             * @return boolean.
             */
            @Override
            public boolean hasNext() {
                return ((currentIndex < container.length) && (container[currentIndex] != null));
            }

            /**
             * Return element and move flag to next elem.
             * @return E.
             */
            @Override
            public E next() {
                return (E) container[currentIndex++];
            }
        };
    }
}
