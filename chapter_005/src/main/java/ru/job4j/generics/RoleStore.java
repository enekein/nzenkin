package ru.job4j.generics;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 25.07.2017.
 *
 * @param <Role> extends Base.
 */

class RoleStore<Role extends Base> extends BaseStore implements Store<Role> {

    /**
     * Constructor.
     * @param role Role.
     * @param size int.
     */
    RoleStore(final Role role, final int size) {
        super(size);
        super.add(role);
    }

    /**
     * Get element by id.
     * @param index int.
     * @return Role.
     */
    public Role getById(final int index) {
        return (Role) getSimpleArray().get(index);
    }
}
