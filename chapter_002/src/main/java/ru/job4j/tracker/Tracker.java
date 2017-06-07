package ru.job4j.tracker;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 06.06.2017.
 */
public class Tracker {
    /**
     * Array of items.
     */
    private Item[] items = new Item[100];
    /**
     * Number items in array.
     */
    private int position = 0;

    /**
     * Get Items.
     * @return Item[].
     */
    public Item[] getItems() {
        return this.items;
    }

    /**
     * Add new item.
     * @param item Item. Item that you want to add.
     * @return Item. Return added item.
     */
    Item add(Item item) {
        this.items[position++] = item;
        return items[position];
    }

    /**
     * update existing item.
     * @param item Item. Item that you want to update.
     */
    void update(Item item) {
        for (int index = 0; index < this.position; index++) {
            if (item.getId().equals(items[index].getId())) {
                items[index] = item;
                break;
            }
        }
    }

    /**
     * Delete existing item.
     * @param item Item. Item that you want ot delete.
     */
    void delete(Item item) {
        Item[] newItems = new Item[position];
        for (int index = 0; index < this.position; index++) {
            if (item.getId().equals(items[index].getId())) {
                if (index == 0) {
                    System.arraycopy(items, index + 1, newItems, index, position - 1);
                    position--;
                } else {
                    System.arraycopy(items, 0, newItems, 0, index - 1);
                    System.arraycopy(items, index + 1, newItems, index, position - 1);
                    position--;
                }
                break;
            }
        }
        this.items = newItems;
    }

    /**
     * Find item by id.
     * @param id String.
     * @return Utem.
     */
    Item findById(String id) {
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
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
    Item[] findByName(String name) {
        Item[] result = new Item[position];
        int temp = 0;
        for (Item item : items) {
            if (item != null && item.getName().equals(name)) {
                result[temp] = item;
                temp++;
            }
        }
        Item[] resultWithZenLength = new Item[temp];
        System.arraycopy(result, 0, resultWithZenLength, 0, temp);
        return resultWithZenLength;
    }

    /**
     * Find all items.
     * @return Item[]
     */
    Item[] findAll() {
        Item[] result = new Item[this.position];
        for (int index = 0; index != this.position; index++) {
            result[index] = this.items[index];
        }
        return result;
    }
}
