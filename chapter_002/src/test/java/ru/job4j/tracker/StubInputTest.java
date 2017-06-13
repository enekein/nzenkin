package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 07.06.2017.
 */
public class StubInputTest {
    /**
     * Test for zero point of menu.
     */
    @Test
    public void whenUserAddItemThenTrackerHasNewItemWithSameName() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name", "desc", "comment1", "6"});
        Output output = new ConsoleOutput();
        new StartUI(input, output, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name"));
    }
    /**
     * Test for first point of menu.
     */
    @Test
    public void whenUserFindAllItemsThenTrackerHasAllValues() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name1", "desc1", "comment1",  "0", "test name2", "desc2", "comment1",  "1", "6"});
        Output output = new ConsoleOutput();
        new StartUI(input, output, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name1"));
        assertThat(tracker.findAll()[1].getName(), is("test name2"));
    }
    /**
     * Test for second point of menu.
     */
    @Test
    public void whenUserUpdateItemThenTrackerUpdateSelectedItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name1", "desc1", "comment1", "0", "test name2", "desc2", "comment1",  "6"});
        Output output = new ConsoleOutput();
        new StartUI(input, output, tracker).init();
        input = new StubInput(new String[]{"2", tracker.findAll()[0].getId(), "test3", "desc3", "6"});
        new StartUI(input, output, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test3"));
    }
    /**
     * Test for third point of menu.
     */
    @Test
    public void whenUserDeleteItemThenTrackerDeleteSelectedItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name1", "desc1", "comment1",  "0", "test name2", "desc2", "comment1",  "6"});
        Output output = new ConsoleOutput();
        new StartUI(input, output, tracker).init();
        input = new StubInput(new String[]{"3", tracker.findAll()[0].getId(), "6"});
        new StartUI(input, output, tracker).init();
        assertThat(tracker.findAll()[0].getName(), is("test name2"));
    }
    /**
     * Test for forth point of menu.
     */
    @Test
    public void whenUserFindItemByIdThenTrackerSelectThatItem() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name1", "desc1", "comment1",  "0", "test name2", "desc2", "comment1", "6"});
        Output output = new ConsoleOutput();
        new StartUI(input, output, tracker).init();
        assertThat(tracker.findAll()[0], is(tracker.findById(tracker.findAll()[0].getId())));
    }
    /**
     * Test for fifth point of menu.
     */
    @Test
    public void whenUserFindItemByNameThenTrackerSelectThatItems() {
        Tracker tracker = new Tracker();
        Input input = new StubInput(new String[]{"0", "test name1", "desc1", "comment1",  "0", "test name2", "desc2", "comment1",  "6"});
        Output output = new ConsoleOutput();
        new StartUI(input, output, tracker).init();
        assertThat(new Item[]{tracker.findAll()[0]}, is(tracker.findByName(tracker.findAll()[0].getName())));
    }
}
