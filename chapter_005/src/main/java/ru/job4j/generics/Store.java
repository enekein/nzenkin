package ru.job4j.generics;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 25.07.2017.
 *
 * @param <T> extends Base. generic.
 */
interface Store<T extends Base> {
    /**
     * Get element by id.
     * @param position int.
     * @return T.
     */
    T getById(int position);


}
