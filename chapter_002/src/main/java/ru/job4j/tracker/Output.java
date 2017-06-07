package ru.job4j.tracker;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 07.06.2017.
 */
public interface Output {
    void printItems(Item[] items);

    void printItem(Item item);
}
