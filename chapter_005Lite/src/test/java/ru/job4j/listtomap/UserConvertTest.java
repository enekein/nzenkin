package ru.job4j.listtomap;

import org.junit.Test;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *@author Nikita Zenkin.
 *@since 20.06.2017.
 *@version 1.
 */
public class UserConvertTest {
    /**
     * Test method process with correct values.
     */
    @Test
    public void whenUsingMethodProcessWithCorrectDataThenConvertListOfUsersToHashMap() {
        UserConvert userConvert = new UserConvert();
        List<User> userList = new ArrayList<>();
        User vasya = new User(0, "Vasya", "Saratov");
        User danil = new User(1, "Danil", "Moscow");
        userList.add(vasya);
        userList.add(danil);
        HashMap<Integer, User> result = userConvert.process(userList);
        HashMap<Integer, User> expected = new HashMap<>();
        expected.put(0, vasya);
        expected.put(1, danil);
        assertThat(result, is(expected));
    }
}
