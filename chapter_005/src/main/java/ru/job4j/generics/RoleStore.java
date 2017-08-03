package ru.job4j.generics;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 25.07.2017.
 */

/**
 * @param <Role> extends Base.
 */

public class RoleStore<Role extends Base> extends Store<Role> {

    /**
     * Constructor.
     * @param role Role.
     */
    RoleStore(Role role) {
        getSimpleArray().add(role);
    }

    /**
     * Get element by id.
     * @param index int.
     * @return Role.
     */
    public Role getById(int index) {
        return getSimpleArray().get(index);
    }
}
