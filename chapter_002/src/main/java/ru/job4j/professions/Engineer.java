package ru.job4j.professions;
/**
 *@author Nikita Zenkin.
 *@since 05.06.2017.
 *@version 1.
 */

public class Engineer extends Profession {
    /**
     * Speciality of engineer String.
     */
    private String speciality;

    /**
     * Constructor.
     * @param fullName String. Full name of doctor.
     * @param degree String. Science degree.
     * @param experience int. Experience in profession.
     * @param age int. Age of doctor.
     * @param speciality String. Speciality of engineer.
     */
    Engineer(String fullName, String degree, int experience, int age, String speciality) {
        this.setFullName(fullName);
        this.setDegree(degree);
        this.setExperience(experience);
        this.setAge(age);
        this.setSpeciality(speciality);
    }

    /**
     * Repair a part.
     * @param something String.
     * @return String.
     */
    String repair(String something) {
        return String.format("%s is repaired by %s", something, this.getFullName());
    }

    /**
     * Diagnosis a part.
     * @param something String.
     * @return String.
     */
    String diagnosis(String something) {
        return String.format("%s isn't working correctly. Diagnosis by %s %s", something, this.getFullName(), this.getDegree());
    }

    /**
     * Instruct a worker.
     * @param worker String.
     * @return String.
     */
    String instructWorker(String worker) {
        return String.format("%s is instructed.", worker);
    }

    /**
     * Get speciality of engineer.
     * @return String.
     */
    public String getSpeciality() {
        return this.speciality;
    }

    /**
     * Set speciality.
     * @param speciality String.
     */
    private void setSpeciality(String speciality) {
        this.speciality = speciality;
    }
}