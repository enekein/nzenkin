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

    /**
     * Overload ask.
     * @param question String.
     * @param range int[].
     * @return int.
     */
    int ask(String question, int[] range);
}
