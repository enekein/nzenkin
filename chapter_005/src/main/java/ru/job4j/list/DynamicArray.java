package ru.job4j.list;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 19.07.2017.
 */

/**
 * @param <E> generic.
 */
public class DynamicArray<E> implements SimpleContainer<E> {
    /**
     * Array of objects.
     */
    private Object[] container;
    /**
     * Index of current element.
     */
    private int index = 0;

    /**
     * Constructor.
      * @param size int.
     */
    DynamicArray(final int size) {
        container = new Object[size];
    }

    /**
     * Add new element.
     * @param value E.
     */
    public void add(final E value) {
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
     * @param indexElement int.
     * @return E.
     */
    final E get(final int indexElement) {
        return (E) container[indexElement];
    }

    /**
     * Get element.
     * @param e E.
     * @return E.
     */
    @Override
    public E get(final E e) {
        for (Object obj : container) {
            if (obj.equals(e)) {
                return (E) obj;
            }
        }
        return null;
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
                return ((currentIndex < container.length)
                        && (container[currentIndex] != null));
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
