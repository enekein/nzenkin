package ru.job4j.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 01.11.2017.
 */

class Converter {
    /**
     * Iterator for iterator Integer.
     * @param it Iterator<Iterator<Integer>>.
     * @return Iterator<Integer>.
     */
    final Iterator<Integer> convert(final Iterator<Iterator<Integer>> it) {
        return new Iterator<Integer>() {
            /**
             * Variable for iterator of iterator.
             */
            private final Iterator<Iterator<Integer>> iteratorOfIterator = it;

            /**
             * Variable for current iterator.
             */
            private Iterator<Integer> currentIterator;

            /**
             * Override for hasNext() method.
             * @return boolean;
             */
            @Override
            public boolean hasNext() {
                while (currentIterator == null || !currentIterator.hasNext()) {
                    if (!iteratorOfIterator.hasNext()) {
                        return false;
                    }
                    currentIterator = iteratorOfIterator.next();
                }
                return true;
            }

            /**
             * Override for next() method.
             * @return Integer.
             */
            @Override
            public Integer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException("Element can't be NULL.");
                }
                return currentIterator.next();
            }

            /**
             * Override for remove() method.
             * This method isn't supported then throw an exception.
             */
            @Override
            public void remove() {
                throw new UnsupportedOperationException(
                        "This operation isn't supported.");
            }
        };
    }
}
