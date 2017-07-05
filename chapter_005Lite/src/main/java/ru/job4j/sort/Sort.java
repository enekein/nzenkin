package ru.job4j.sort;

import java.util.List;
import java.util.Set;
import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author Nikita Zenkin.
 * @version 2.
 * @since 26.06.2017.
 */
class Sort {
    /**
     * Static class for user.
     */
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
         * Constructor.
         * @param age int.
         * @param name String.
         */
        User(int age, String name) {
            this.age = age;
            this.name = name;
        }

        /**
         * Get name.
         * @return String.
         */
        String getName() {
            return this.name;
        }

        /**
         * Get age.
         * @return int.
         */
        int getAge() {
            return this.age;
        }

        /**
         * Override method compareTo for User.
         * @param user User.
         * @return int.
         */
        @Override
        public int compareTo(User user) {
            if (this.age > user.age) {
                return 1;
            } else if (this.age < user.age) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    /**
     * Static class for sorting users.
     */
    static class SortUser {
        /**
         * TreeSet.
         * @param arrayList List User.
         * @return Set User.
         */
        Set<User> sort(List<User> arrayList) {
            Set<User> set = new TreeSet<>();
            set.addAll(arrayList);
            return set;
        }

        /**
         * Sort by name.
         * @param arrayList List User.
         * @return List User.
         */
        List<User> sortNameLength(List<User> arrayList) {
            arrayList.sort(
                    new Comparator<User>() {
                        @Override
                        public int compare(User o1, User o2) {
                            if (o1.name.length() > o2.name.length()) {
                                return 1;
                            } else if (o1.name.length() < o2.name.length()) {
                                return -1;
                            } else {
                                return 0;
                            }
                        }
                    }
            );
            return arrayList;
        }

        /**
         * Sort by all fields.
         * @param arrayList List User.
         * @return List User.
         */
        List<User> sortByAllFields(List<User> arrayList) {
            arrayList.sort(new SortByAllFields());
            return arrayList;
        }
    }

    /**
     * Static class with comparator.
     */
    static class SortByAllFields implements Comparator<User> {
        /**
         * Method compare for sorting in list.
         * @param o1 User.
         * @param o2 User.
         * @return int.
         */
        @Override
        public int compare(User o1, User o2) {
            int temp = o1.name.compareTo(o2.name);
            if (temp == 0) {
                if (o1.age > o2.age) {
                    return 1;
                } else {
                    return -1;
                }
            } else {
              return temp;
            }
        }
    }
}
