package ru.job4j.listtomap;

/**
 *@author Nikita Zenkin.
 *@since 20.06.2017.
 *@version 1.
 */
public class User {
    /**
     * Id of User.
     */
    private int id;
    /**
     * Name of User.
     */
    private String name;
    /**
     * City where living User.
     */
    private String city;

    /**
     * Construcot.
     *
     * @param id   int.
     * @param name String.
     * @param city String.
     */
    User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    /**
     * Get id.
     * @return int.
     */
    public int getId() {
        return this.id;
    }
}
