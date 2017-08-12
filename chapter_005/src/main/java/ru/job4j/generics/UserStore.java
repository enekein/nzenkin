package ru.job4j.generics;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 25.07.2017.
 *
 * @param <User> extends Base.
 */
class UserStore<User extends Base> extends BaseStore implements Store<User> {
    /**
     * Constructor.
     * @param user User.
     * @param size int.
     */
    UserStore(final User user, final int size) {
        super(size);
        super.add(user);
    }

    /**
     * Get user by id.
     * @param index int.
     * @return User.
     */
    public User getById(final int index) {
        return (User) getSimpleArray().get(index);
    }
}
