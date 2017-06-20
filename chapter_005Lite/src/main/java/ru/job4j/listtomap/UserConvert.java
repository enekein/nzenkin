package ru.job4j.listtomap;

import java.util.HashMap;
import java.util.List;

/**
 *@author Nikita Zenkin.
 *@since 20.06.2017.
 *@version 1.
 */
public class UserConvert {
    public HashMap<Integer, User> process(List<User> list) {
        HashMap<Integer, User> hashMap = new HashMap<>();
        for (User user : list) {
            hashMap.put(user.getId(), user);
        }
        return hashMap;
    }
}
