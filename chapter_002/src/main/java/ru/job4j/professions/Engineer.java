package ru.job4j.professions;
/**
 *@author Nikita Zenkin.
 *@since 05.06.2017.
 *@version 1.
 */

public class Engineer extends Profession {

    private String speciality;

    /**
     * Constructor.
     * @param fullName String. Full name of doctor.
     * @param degree String. Science degree.
     * @param experience int. Experience in profession.
     * @param age int. Age of doctor.
     * @param speciality String. Speciality of engineer.
     */
    Engineer (String fullName, String degree, int experience, int age, String speciality) {
        this.fullName = fullName;
        this.degree = degree;
        this.experience = experience;
        this.age = age;
        this.speciality = speciality;
    }

    /**
     * Repair a part.
     * @param something String.
     * @return String.
     */
    public String repair(String something) {
        return something + " is repaired by " + this.getFullName();
    }

    /**
     * Diagnosis a part.
     * @param something String.
     * @return String.
     */
    public String diagnosis(String something) {
        return something + " isn't working correctly. Diagnosis by " + this.fullName +" "+ this.degree;
    }

    /**
     * Instruct a worker.
     * @param worker String.
     * @return String.
     */
    public String instructWorker(String worker) {
        return worker + " is instructed.";
    }

    /**
     * Get speciality of engineer.
     * @return String.
     */
    public String getSpeciality() {
        return this.speciality;
    }
}