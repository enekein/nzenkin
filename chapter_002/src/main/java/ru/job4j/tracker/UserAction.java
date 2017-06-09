package ru.job4j.tracker;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 08.06.2017.
 */
public interface UserAction {
    int key();

    void execute(Input input, Output output,Tracker tracker);

    String info();
}
