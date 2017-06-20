package ru.job4j.tracker;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Nikita Zenkin.
 * @version 2.
 * @since 06.06.2017.
 */
public class TrackerTest {
    /**
     * test method add(Item) in Tracker.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", "Comment");
        tracker.add(item);
        assertThat(tracker.findAll().get(0), is(item));
    }
    /**
     * test method update(Item) in Tracker.
     */
    @Test
    public void whenUpdateItemThenTrackerHasUpdatedItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", "Comment");
        tracker.add(item);
        Item item2 = new Item("test2", "testDescription2", "Comment");
        item2.setId(item.getId());
        tracker.update(item2);
        assertThat(tracker.findAll().get(0) , is(item2));
    }
    /**
     * test method delete(Item) in Tracker.
     */
    @Test
    public void whenDeleteItemThenTrackerHasNoItems() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", "Comment");
        Item item2 = new Item("test2", "testDescription2", "Comment");
        tracker.add(item);
        tracker.add(item2);
        tracker.delete(item);
        assertThat(tracker.findAll().get(0), is(item2));
    }
    /**
     * test method findAll() in Tracker.
     */
    @Test
    public void whenFindAllItemsThenTrackerReturnAllContainItems() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", "Comment");
        Item item2 = new Item("test2", "testDescription2", "Comment");
        tracker.add(item);
        tracker.add(item2);
        List<Item> expected = new ArrayList<>();
        expected.add(item);
        expected.add(item2);
        assertThat(tracker.findAll(), is(expected));
    }
    /**
     * test method findById(String) in Tracker.
     */
    @Test
    public void whenFindByIdThenTrackerReturnOneItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", "Comment");
        Item item2 = new Item("test2", "testDescription2", "Comment");
        tracker.add(item);
        tracker.add(item2);
        assertThat(tracker.findById(item.getId()), is(item));
    }
    /**
     * test method findByName(String) in Tracker.
     */
    @Test
    public void whenFindByNameThenTrackerReturnOneItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1", "testDescription", "Comment");
        Item item2 = new Item("test2", "testDescription2", "Comment");
        tracker.add(item);
        tracker.add(item2);
        assertThat(tracker.findByName(item.getName()).get(0), is(item));
    }
}
