package ru.job4j.tracker;
/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 13.06.2017.
 */
public class MenuOutException extends RuntimeException {
    /**
     * Exception for unexpected menu value.
     * @param msg String.
     */
    public MenuOutException(String msg) {
        super(msg);
    }
}
