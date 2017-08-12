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
     * @param nameOfUser String.
     * @param passwordOfUser String.
     * @param idOfUser String.
     */
    User(final String nameOfUser, final String passwordOfUser,
         final String idOfUser) {
        this.name = nameOfUser;
        this.password = passwordOfUser;
        setId(idOfUser);
    }

    /**
     * Setter for Id.
     * @param idOfUser String.
     */
    @Override
    public void setId(final String idOfUser) {
        this.id = idOfUser;
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
