package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 06.06.2017.
 */
public class TrackerTest {
    /**
     * test method add(Item) in Tracker.
     */
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","testDescription",123L);
        tracker.add(item);
        assertThat(tracker.findAll()[0], is(item));
    }
    /**
     * test method update(Item) in Tracker.
     */
    @Test
    public void whenUpdateItemThenTrackerHasUpdatedItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","testDescription",123L);
        tracker.add(item);
        Item item2 = new Item("test2","testDescription2",124L);
        item2.setId(item.getId());
        tracker.update(item2);
        assertThat(tracker.findAll()[0], is(item2));
    }
    /**
     * test method delete(Item) in Tracker.
     */
    @Test
    public void whenDeleteItemThenTrackerHasNoItems() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","testDescription",123L);
        Item item2 = new Item("test2","testDescription2",124L);
        tracker.add(item);
        tracker.add(item2);
        tracker.delete(item);
        assertThat(tracker.findAll()[0], is(item2));
    }
    /**
     * test method findAll() in Tracker.
     */
    @Test
    public void whenFindAllItemsThenTrackerReturnAllContainItems() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","testDescription",123L);
        Item item2 = new Item("test2","testDescription2",124L);
        tracker.add(item);
        tracker.add(item2);
        Item[] expected = new Item[]{item, item2};
        assertThat(tracker.findAll(), is(expected));
    }
    /**
     * test method findById(String) in Tracker.
     */
    @Test
    public void whenFindByIdThenTrackerReturnOneItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1","testDescription",123L);
        Item item2 = new Item("test2","testDescription2",124L);
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
        Item item = new Item("test1","testDescription",123L);
        Item item2 = new Item("test2","testDescription2",124L);
        tracker.add(item);
        tracker.add(item2);
        assertThat(tracker.findByName(item.getName())[0], is(item));
    }
}
