package ru.job4j.list;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 19.07.2017.
 */

public interface SimpleContainer<E> extends Iterable<E> {
    void add(E e);
    E get(int index);


}
