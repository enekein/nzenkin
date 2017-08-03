package ru.job4j.list;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 19.07.2017.
 */

/**
 * @param <E> generic.
 */
public interface SimpleContainer<E> extends Iterable<E> {
    /**
     * Add new element.
     * @param e E.
     */
    void add(E e);

    /**
     * Get element.
     * @param e E.
     * @return E.
     */
    E get(E e);
}
