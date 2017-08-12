package ru.job4j.generics;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 19.07.2017.
 *
 * @param <E> generic.
 */
class SimpleArray<E> {
    /**
     * Array of objects.
     */
    private Object[] objects;
    /**
     * Index of array.
     */
    private int index = 0;

    /**
     * Constructor.
     * @param size int.
     */
    SimpleArray(final int size) {
        this.objects = new Object[size];
    }

    /**
     * Add new element to array.
     * @param value E.
     */
    void add(final E value) {
        this.objects[index++] = value;
    }

    /**
     * Get position in array.
     * @param position int.
     * @return E.
     */
    E get(final int position) {
        return (E) this.objects[position];
    }

    /**
     * Delete element from array.
     * @param value E.
     */
    void delete(final E value) {
        for (int i = 0; i < index; i++) {
            if (objects[i].equals(value)) {
                Object[] newObjects = new Object[--index];
                if (index > 0) {
                    if (i == 0) {
                        System.arraycopy(objects, i + 1, newObjects, 0, index);
                    } else if (i == objects.length - 1) {
                        System.arraycopy(objects, 0, newObjects, 0, index - 1);
                    } else {
                        System.arraycopy(objects, 0, newObjects, 0, i - 1);
                        System.arraycopy(objects, i + 1, newObjects, i, index);
                    }
                } else {
                    objects = null;
                }
                objects = newObjects;
            }
        }
    }

    /**
     * Update element in array.
     * @param value E
     * @param position int.
     */
    void update(final E value, final int position) {
        objects[position] = value;
    }

    /**
     * Get index.
     * @return int.
     */
    int getIndex() {
        return this.index;
    }
}
