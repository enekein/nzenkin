package ru.job4j.generics;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 25.07.2017.
 */

public class RoleStoreTest {
    /**
     * Test methods add(Role) and getById(int).
     */
    @Test
    public void whenTestAddNewRoleAndGetByIdMethods() {
        Role role = new Role("123", "123");
        RoleStore roleStore = new RoleStore(role, 10);
        Role role2 = new Role("321", "321");
        roleStore.add(role2);
        assertThat(roleStore.getById(1), is(role2));
    }
    /**
     * Test method update(Role).
     */
    @Test
    public void whenUpdateExistingRole() {
        Role role = new Role("123", "123");
        RoleStore roleStore = new RoleStore(role, 10);
        Role role2 = new Role("321", "123");
        roleStore.update(role2);
        assertThat(roleStore.getById(0).getName(), is(role2.getName()));
    }

    /**
     * Test method delete(Role).
     */
    @Test
    public void whenDeleteExistingRole() {
        Role role = new Role("123", "123");
        RoleStore roleStore = new RoleStore(role, 10);
        Role role2 = new Role("321", "223");
        roleStore.add(role2);
        roleStore.delete(role);
        assertThat(roleStore.getById(0).getName(), is(role2.getName()));
    }
}
