package ru.job4j.professions;
/**
 *@author Nikita Zenkin.
 *@since 05.06.2017.
 *@version 1.
 */

public class Doctor extends Profession {
    private String speciality;

    /**
     * Constructor.
     * @param fullName String. Full name of doctor.
     * @param degree String. Science degree.
     * @param experience int. Experience in profession.
     * @param age int. Age of doctor.
     * @param speciality String. Speciality of doctor.
     */
    Doctor (String fullName, String degree, int experience, int age, String speciality) {
        this.fullName = fullName;
        this.degree = degree;
        this.experience = experience;
        this.age = age;
        this.speciality = speciality;
    }

    /**
     * Get speciality of doctor.
     * @return String.
     */
    public String getSpeciality() {
        return this.speciality;
    }

    /**
     * this method define health of patient.
     * @param patient String. Full name of patient.
     * @return String.
     */
    public String diagnosis(String patient) {
        return "The doctor " + this.getFullName() + " says that " + patient + " is sick.";
    }

    /**
     * This method define is done consilium or not.
     * @param patient String. Full name of patient.
     * @return String.
     */
    public String consilium(String patient) {
        return "Consilium with " + patient + " is done.";
    }

    /**
     * This method define was filled blank or not.
     * @param patient String. Full name of patient.
     * @return String.
     */
    public String fillBlank(String patient) {
        return "Blank of " + patient + " was filled by " + this.getFullName();
    }
}