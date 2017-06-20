package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Nikita Zenkin.
 * @version 2.
 * @since 06.06.2017.
 */
public class Tracker {
    /**
     * ArrayList of items.
     */
    private List<Item> items = new ArrayList<>();

    /**
     * Get Items.
     * @return List Item.
     */
    public List<Item> getItems() {
        return this.items;
    }

    /**
     * Add new item.
     * @param item Item. Item that you want to add.
     * @return Item. Return added item.
     */
    Item add(Item item) {
        this.items.add(item);
        return items.get(items.size() - 1);
    }

    /**
     * Update existing item.
     * @param item Item. Item that you want to update.
     */
    void update(Item item) {
        for (int index = 0; index < items.size(); index++) {
            if (items.get(index).getId().equals(item.getId())) {
                items.set(index, item);
            }
        }
    }

    /**
     * Delete existing item.
     * @param item Item. Item that you want ot delete.
     */
    void delete(Item item) {
        items.remove(item);
    }

    /**
     * Find item by id.
     * @param id String.
     * @return Item.
     */
    Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }

    /**
     * Find items by name.
     * @param name String.
     * @return Item[].
     */
    List<Item> findByName(String name) {
        List<Item> result = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().equals(name)) {
                result.add(item);
            }
        }
        return result;
    }

    /**
     * Find all items.
     * @return Item[]
     */
    List<Item> findAll() {
        List<Item> result = new ArrayList<>();
        result.addAll(items);
        return result;
    }
}
