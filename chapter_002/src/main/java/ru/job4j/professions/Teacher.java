package ru.job4j.professions;
/**
 *@author Nikita Zenkin.
 *@since 05.06.2017.
 *@version 1.
 */

public class Teacher extends Profession {
    private String mainSubject;

    /**
     * Constructor.
     * @param fullName String. Full name of doctor.
     * @param degree String. Science degree.
     * @param experience int. Experience in profession.
     * @param age int. Age of doctor.
     * @param mainSubject String. Main subject of teacher.
     */
    Teacher (String fullName, String degree, int experience, int age, String mainSubject) {
        this.fullName = fullName;
        this.degree = degree;
        this.experience = experience;
        this.age = age;
        this.mainSubject = mainSubject;
    }

    /**
     * Subject lesson for class.
     * @param subject String.
     * @param schoolClass String.
     * @return String.
     */
    public String lesson(String subject, String schoolClass) {
        return subject + " lesson is done for " + schoolClass;
    }

    /**
     * Subject practice for class.
     * @param subject String.
     * @param schoolClass String.
     * @return String.
     */
    public String practice(String subject, String schoolClass) {
        return subject + " practice is done for " + schoolClass;
    }

    /**
     * Subject exam for student.
     * @param subject String.
     * @param student String.
     * @return String.
     */
    public String exam(String subject, String student) {
        return subject + " exam is done by " + student + " with mark 5.";
    }

    /**
     * Get main subject of teacher.
     * @return String.
     */
    public String getMainSubject() {
        return this.mainSubject;
    }
}