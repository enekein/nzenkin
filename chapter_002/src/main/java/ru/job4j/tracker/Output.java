package ru.job4j.tracker;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 07.06.2017.
 */
public interface Output {
    /**
     * Print array of items.
     * @param items Item[].
     */
    void printItems(Item[] items);

    /**
     * Print one item.
     * @param item Item.
     */
    void printItem(Item item);
}
