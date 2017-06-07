package ru.job4j.professions;
/**
 *@author Nikita Zenkin.
 *@since 05.06.2017.
 *@version 1.
 */

public class Teacher extends Profession {
    /**
     * Main subject of teacher String.
     */
    private String mainSubject;

    /**
     * Constructor.
     * @param fullName String. Full name of doctor.
     * @param degree String. Science degree.
     * @param experience int. Experience in profession.
     * @param age int. Age of doctor.
     * @param mainSubject String. Main subject of teacher.
     */
    Teacher(String fullName, String degree, int experience, int age, String mainSubject) {
        this.setFullName(fullName);
        this.setDegree(degree);
        this.setExperience(experience);
        this.setAge(age);
        this.setMainSubject(mainSubject);
    }

    /**
     * Subject lesson for class.
     * @param subject String.
     * @param schoolClass String.
     * @return String.
     */
    String lesson(String subject, String schoolClass) {
        return String.format("%s lesson is done for %s", subject, schoolClass);
    }

    /**
     * Subject practice for class.
     * @param subject String.
     * @param schoolClass String.
     * @return String.
     */
    String practice(String subject, String schoolClass) {
        return String.format("%s practice is done for %s", subject, schoolClass);
    }

    /**
     * Subject exam for student.
     * @param subject String.
     * @param student String.
     * @return String.
     */
    String exam(String subject, String student) {
        return String.format("%s exam is done by %s with mark 5.", subject, student);
    }

    /**
     * Get main subject of teacher.
     * @return String.
     */
    public String getMainSubject() {
        return this.mainSubject;
    }

    /**
     * Set main subject.
     * @param mainSubject String.
     */
    private void setMainSubject(String mainSubject) {
        this.mainSubject = mainSubject;
    }
}