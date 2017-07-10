package ru.job4j.bank;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 05.07.2017.
 */
public class User {
    /**
     * Name of user. String.
     */
    private String name;
    /**
     * Number of passport. long.
     */
    private long passport;

    /**
     * Constructor.
     * @param name String.
     * @param passport long.
     */
    User(String name, long passport) {
        this.name = name;
        this.passport = passport;
    }

    /**
     * Override equals for user.
     * @param obj Object.
     * @return boolean.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        User user = (User) obj;
        return ((this.name.equals(user.name)) && (this.passport == user.passport));
    }

    /**
     * Override HashCode for user.
     * @return int.
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + (int) passport;
        return result;
    }
}
