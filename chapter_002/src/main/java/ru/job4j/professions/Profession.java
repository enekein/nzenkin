package ru.job4j.professions;
/**
 *@author Nikita Zenkin.
 *@since 05.06.2017.
 *@version 1.
 */

public class Profession {
    /**
     * Full name of worker String.
     */
    private String fullName;
    /**
     * Degree of worker String.
     */
    private String degree;
    /**
     * Experience of worker int.
     */
    private int experience;
    /**
     * Age of worker int.
     */
    private int age;

    /**
     * Get full name of doctor.
     * @return String.
     */
    String getFullName() {
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

    /**
     * Set full name.
     * @param fullName String.
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * Set degree.
     * @param degree String.
     */
    public void setDegree(String degree) {
        this.degree = degree;
    }

    /**
     * Set experience.
     * @param experience int.
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     * Set age.
     * @param age int.
     */
    public void setAge(int age) {
        this.age = age;
    }
}