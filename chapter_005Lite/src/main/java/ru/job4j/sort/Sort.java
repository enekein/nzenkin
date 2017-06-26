package ru.job4j.sort;

import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 26.06.2017.
 */
class Sort {
    public static class User implements Comparable<User> {
        /**
         * Age for user. int
         */
        private int age;
        /**
         * Name for user. String
         */
        private String name;

        /**
         * Constructor
         * @param age int.
         * @param name String.
         */
        User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        /**
         * Override method compareTo for User.
         * @param user User.
         * @return int.
         */
        @Override
        public int compareTo(User user) {
            if(this.age > user.age)
                return 1;
            else if(this.age < user.age)
                return -1;
            else
                return 0;
        }
}
static class SortUser {
    Set<User> sort (List<User> arrayList) {
        Set<User> set = new TreeSet<>();
        set.addAll(arrayList);
        return set;
    }
}

}
