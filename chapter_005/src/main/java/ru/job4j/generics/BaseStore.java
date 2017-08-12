package ru.job4j.generics;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 12.08.2017.
 *
 * @param <T> generic.
 */
class BaseStore<T> {

    /**
     * Array for storage objects.
     */
    private SimpleArray<T> simpleArray;

    /**
     * Constructor.
     * @param size int.
     */
    BaseStore(final int size) {
        simpleArray = new SimpleArray<>(size);
    }

    /**
     * Add new element.
     * @param t T.
     */
    void add(final T t) {
        simpleArray.add(t);
    }

    /**
     * Update existing user or role.
     * @param t T.
     */
    void update(final T t) {
        for (int i = 0; i < simpleArray.getIndex(); i++) {
            if (simpleArray.get(i).equals(t)) {
                simpleArray.update(t, i);
            }
        }
    }

    /**
     * Delete existing user or role.
     * @param t T.
     */
    void delete(final T t) {
        for (int i = 0; i < simpleArray.getIndex(); i++) {
            if (simpleArray.get(i).equals(t))  {
                simpleArray.delete(simpleArray.get(i));
            }
        }
    }

    /**
     * Getter for simple array.
     * @return SimpleArray T.
     */
    SimpleArray<T> getSimpleArray() {
        return simpleArray;
    }
}
