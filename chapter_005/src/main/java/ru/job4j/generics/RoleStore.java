package ru.job4j.generics;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 25.07.2017.
 */

/**
 * @param <Role> extends Base.
 */

public class RoleStore<Role extends Base> implements Store<Role> {
    /**
     * Array for storage roles.
     */
    private SimpleArray<Role> roleSimpleArray = new SimpleArray<>(10);

    /**
     * Constructor.
     * @param role Role.
     */
    RoleStore(Role role) {
        roleSimpleArray.add(role);
    }

    /**
     * Get element by id.
     * @param index int.
     * @return Role.
     */
    public Role getById(int index) {
        return roleSimpleArray.get(index);
    }

    /**
     * Add new role.
     * @param role Role.
     */
    public void add(Role role) {
        roleSimpleArray.add(role);
    }

    /**
     * Update existing role.
     * @param role Role.
     */
    public void update(Role role) {
        for (int i = 0; i < roleSimpleArray.getIndex(); i++) {
            if (roleSimpleArray.get(i).getId().equals(role.getId()))  {
                roleSimpleArray.update(role, i);
            }
        }
    }

    /**
     * Delete existing role.
     * @param role Role.
     */
    public void delete(Role role) {
        for (int i = 0; i < roleSimpleArray.getIndex(); i++) {
            if (roleSimpleArray.get(i).equals(role))  {
                roleSimpleArray.delete(roleSimpleArray.get(i));
            }
        }
    }
}
