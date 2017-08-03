package ru.job4j.generics;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 25.07.2017.
 */

/**
 * @param <T> extends Base. generic.
 */
abstract class Store<T extends Base> {
    /**
     * Array for storage objects.
     */
    private SimpleArray<T> simpleArray = new SimpleArray<>(10);

    /**
     * Get element by id.
     * @param position int.
     * @return T.
     */
    abstract T getById(int position);

    /**
     * Add new element.
     * @param t T.
     */
    void add(T t) {
        simpleArray.add(t);
    }

    /**
     * Update existing user or role.
     * @param t T.
     */
    void update(T t) {
        for (int i = 0; i < simpleArray.getIndex(); i++) {
            if (simpleArray.get(i).getId().equals(t.getId()))  {
                simpleArray.update(t, i);
            }
        }
    }

    /**
     * Delete existing user or role.
     * @param t T.
     */
    void delete(T t) {
        for (int i = 0; i < simpleArray.getIndex(); i++) {
            if (simpleArray.get(i).equals(t))  {
                simpleArray.delete(simpleArray.get(i));
            }
        }
    }

    SimpleArray<T> getSimpleArray() {
        return simpleArray;
    }
}
