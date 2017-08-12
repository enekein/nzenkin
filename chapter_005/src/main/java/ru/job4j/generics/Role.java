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
     * @param nameOfRole String.
     * @param idOfRole String.
     */
    Role(final String nameOfRole, final String idOfRole) {
        this.name = nameOfRole;
        setId(idOfRole);
    }

    /**
     * Setter for Id.
     * @param idOfRole String.
     */
    @Override
    public void setId(final String idOfRole) {
        this.id = idOfRole;
    }

    /**
     * Getter for Id.
     * @return String.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Getter for name.
     * @return String.
     */
    @Override
    String getName() {
        return this.name;
    }
}
