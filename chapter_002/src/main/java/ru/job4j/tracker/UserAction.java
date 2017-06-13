package ru.job4j.tracker;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 08.06.2017.
 */
public interface UserAction {
    /**
     * Return key of action.
     * @return int.
     */
    int key();

    /**
     * Execute action.
     * @param input Input.
     * @param output Output.
     * @param tracker Tracker.
     */
    void execute(Input input, Output output, Tracker tracker);

    /**
     * Info for menu.
     * @return String.
     */
    String info();
}
