package ru.job4j.generics;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 19.07.2017.
 */

public class User extends Base {
    /**
     * Name of user.
     */
    private String name;
    /**
     * Password of user.
     */
    private String password;
    /**
     * Id of user.
     */
    private String id;

    /**
     * Constructor.
     * @param name String.
     * @param password String.
     * @param id String.
     */
    User(String name, String password, String id) {
        this.name = name;
        this.password = password;
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
     * Getter for id.
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
    @Override
    public String getName() {
        return this.name;
    }
}
