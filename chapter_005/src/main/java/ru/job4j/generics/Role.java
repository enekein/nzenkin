package ru.job4j.generics;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 19.07.2017.
 */

public class Role extends Base {
    /**
     * Name of role.
     */
    private String name;
    /**
     * Id of role.
     */
    private String id;

    /**
     * Constructor.
     * @param name String.
     * @param id String.
     */
    Role(String name, String id) {
        this.name = name;
        setId(id);
    }

    /**
     * Setter for Id.
     * @param id String.
     */
    @Override
    public void setId(String id) {
        this.id = id;
    }

    /**
     * Getter for Id.
     * @return String.
     */
    @Override
    public String getId() {
        return this.id;
    }

    /**
     * Getter for name.
     * @return String.
     */
    String getName() {
        return this.name;
    }
}
