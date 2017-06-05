package ru.job4j.professions;
/**
 *@author Nikita Zenkin.
 *@since 05.06.2017.
 *@version 1.
 */

public class Profession {
    protected String fullName;
    protected String degree;
    protected int experience;
    protected int age;

    /**
     * Get full name of doctor.
     * @return String.
     */
    public String getFullName() {
        return this.fullName;
    }

    /**
     * Get degree of doctor.
     * @return String.
     */
    public String getDegree() {
        return this.degree;
    }

    /**
     * Get experience of doctor.
     * @return String.
     */
    public int getExperience() {
        return this.experience;
    }

    /**
     * Get age of doctor.
     * @return String.
     */
    public int getAge() {
        return this.age;
    }
}