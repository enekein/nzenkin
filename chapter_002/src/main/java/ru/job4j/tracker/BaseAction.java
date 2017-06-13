package ru.job4j.tracker;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 13.06.2017.
 */
public abstract class BaseAction  implements UserAction {
    /**
     * Name of action.
     */
    private String name;

    /**
     * Key of action.
     */
    private int key;

    public BaseAction(String name, int key) {
        this.name = name;
        this.key = key;
    }
    /**
     * Info for menu.
     * @return String.
     */
    public String info() {
        return String.format("%s. %s", this.key, this.name);
    }
}
