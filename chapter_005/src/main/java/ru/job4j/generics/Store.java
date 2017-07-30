package ru.job4j.generics;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 25.07.2017.
 */

/**
 * @param <T> extends Base. generic.
 */
public interface Store<T extends Base> {
    /**
     * Get element by id.
     * @param position int.
     * @return T.
     */
    T getById(int position);

    /**
     * Add new element.
     * @param t T.
     */
    void add(T t);

    /**
     * Update existing element.
     * @param t T.
     */
    void update(T t);

    /**
     * Delete existing element.
     * @param t T.
     */
    void delete(T t);
}
