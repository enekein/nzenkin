package ru.job4j.tracker;

import java.util.List;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 07.06.2017.
 */
public class ConsoleOutput implements Output {
    /**
     * Line separator for output.
     */
    private String lineSeparator = System.lineSeparator();

    /**
     * Print array of items.
     * @param items Item[].
     */
    public void printItems(List<Item> items) {
        for (Item item : items) {
            System.out.println(item);
            String[] temp = item.getComments();
            System.out.println("Comments:");
            if (temp != null) {
                for (String comment : temp) {
                    if (comment != null) {
                        System.out.println(comment);
                    }
                }
            }
        }
    }

    /**
     * Print one item.
     * @param item Item.
     */
    public void printItem(Item item) {
        if (item.getId() != null) {
            System.out.println(item);
            String[] temp = item.getComments();
            System.out.println("Comments:");
            if (temp != null) {
                for (String comment : temp) {
                    if (comment != null) {
                        System.out.println(comment);
                    }
                }
                }
            } else {
            throw new RuntimeException("Empty item!");
        }
    }
}
