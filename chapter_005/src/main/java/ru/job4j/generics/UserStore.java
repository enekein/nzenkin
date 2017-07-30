package ru.job4j.generics;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 25.07.2017.
 */

/**
 * @param <User> extends Base.
 */
public class UserStore<User extends Base> implements Store<User> {
    /**
     * Array for storage objects.
     */
    private SimpleArray<User> userSimpleArray = new SimpleArray<>(10);

    /**
     * Constructor.
     * @param user User.
     */
    UserStore(User user) {
        userSimpleArray.add(user);
    }

    /**
     * Get user by id.
     * @param index int.
     * @return User.
     */
    public User getById(int index) {
        return userSimpleArray.get(index);
    }

    /**
     * Add new user.
     * @param user User.
     */
    public void add(User user) {
        userSimpleArray.add(user);
    }

    /**
     * Update existing user.
     * @param user User.
     */
    public void update(User user) {
        for (int i = 0; i < userSimpleArray.getIndex(); i++) {
            if (userSimpleArray.get(i).getId().equals(user.getId()))  {
                userSimpleArray.update(user, i);
            }
        }
    }

    /**
     * Delete existing user.
     * @param user User.
     */
    public void delete(User user) {
        for (int i = 0; i < userSimpleArray.getIndex(); i++) {
            if (userSimpleArray.get(i).equals(user))  {
                userSimpleArray.delete(userSimpleArray.get(i));
            }
        }
    }
}
