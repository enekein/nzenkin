package ru.job4j.generics;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 25.07.2017.
 */

/**
 * @param <User> extends Base.
 */
public class UserStore<User extends Base> extends Store<User> {
    /**
     * Constructor.
     * @param user User.
     */
    UserStore(User user) {
        getSimpleArray().add(user);
    }

    /**
     * Get user by id.
     * @param index int.
     * @return User.
     */
    public User getById(int index) {
        return getSimpleArray().get(index);
    }
}
