package ru.job4j.generics;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 30.07.2017.
 */

public class UserStoreTest {
    /**
     * Test methods add(Role) and getById(int).
     */
    @Test
    public void whenTestAddNewUserAndGetByIdMethods() {
        User user = new User("123", "123", "123");
        UserStore userStore = new UserStore(user);
        User user2 = new User("321", "321", "321");
        userStore.add(user2);
        assertThat(userStore.getById(1).getId(), is(user2.getId()));
    }
    /**
     * Test method update(Role).
     */
    @Test
    public void whenUpdateExistingUser() {
        User user = new User("123", "123", "123");
        UserStore userStore = new UserStore(user);
        User user2 = new User("321", "321", "123");
        userStore.update(user2);
        assertThat(userStore.getById(0).getName(), is(user2.getName()));
    }

    /**
     * Test method delete(Role).
     */
    @Test
    public void whenDeleteExistingUser() {
        User user = new User("123", "123", "123");
        UserStore userStore = new UserStore(user);
        User user2 = new User("321", "321", "321");
        userStore.add(user2);
        userStore.delete(user);
        assertThat(userStore.getById(0).getName(), is(user2.getName()));
    }
}

