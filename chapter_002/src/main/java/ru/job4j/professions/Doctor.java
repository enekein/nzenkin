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
        this.setFullName(fullName);
        this.setDegree(degree);
        this.setExperience(experience);
        this.setAge(age);
        this.setSpeciality(speciality);
    }

    /**
     * Get speciality of doctor.
     * @return String.
     */
    public String getSpeciality() {
        return this.speciality;
    }

    /**
     * Set speciality.
     * @param speciality String.
     */
    private void setSpeciality(String speciality) { this.speciality = speciality; }

    /**
     * this method define health of patient.
     * @param patient String. Full name of patient.
     * @return String.
     */
    String diagnosis(String patient) {
        return String.format("The doctor %s says that %s is sick.", this.getFullName(), patient);
    }

    /**
     * This method define is done consilium or not.
     * @param patient String. Full name of patient.
     * @return String.
     */
    String consilium(String patient) {
        return String.format("Consilium with %s is done.", patient);
    }

    /**
     * This method define was filled blank or not.
     * @param patient String. Full name of patient.
     * @return String.
     */
    String fillBlank(String patient) {
        return String.format("Blank of %s was filled by %s", patient, this.getFullName());
    }
}