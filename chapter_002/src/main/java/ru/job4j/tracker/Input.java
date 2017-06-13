package ru.job4j.tracker;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 07.06.2017.
 */
public interface Input {
    /**
     * Ask question to user.
     * @param question String.
     * @return String.
     */
    String ask(String question);

    int ask(String question, int[] range);
}
