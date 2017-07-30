package ru.job4j.generics;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 19.07.2017.
 */

public abstract class Base {
    /**
     * Getter for Id.
     * @return String.
     */
    abstract String getId();

    /**
     * Setter for Id.
     * @param id String.
     */
    abstract void setId(String id);

    /**
     * Getter for name.
     * @return String.
     */
    abstract String getName();
}
