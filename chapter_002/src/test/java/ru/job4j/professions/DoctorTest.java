package ru.job4j.professions;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Nikita Zenkin.
 *@since 05.06.2017.
 *@version 1.
 */

public class DoctorTest {

    /**
     * test method diagnosis(String). Input Ivanov A.A..
     */
    @Test
    public void whenDiagnosisThePatientIvanovThenReturnStringThatIvanovIsSick() {
        Doctor doctor = new Doctor("Petrov I.A.", "PhD", 15, 35, "Pediatrics");
        String result = doctor.diagnosis("Ivanov A.A.");
        String expected = "The doctor Petrov I.A. says that Ivanov A.A. is sick.";
        assertThat(result, is(expected));
    }

    /**
     * test method consilium(String). Input Ivanov A.A..
     */
    @Test
    public void whenConsiliumThePatientIvanovThenReturnStringThatConsiliumIsDone() {
        Doctor doctor = new Doctor("Petrov I.A.", "PhD", 15, 35, "Pediatrics");
        String result = doctor.consilium("Ivanov A.A.");
        String expected = "Consilium with Ivanov A.A. is done.";
        assertThat(result, is(expected));
    }

    /**
     * test method fillBlank(String). Input Ivanov A.A..
     */
    @Test
    public void whenFillBlankThePatientIvanovThenReturnStringThatBlankWasFilled() {
        Doctor doctor = new Doctor("Petrov I.A.", "PhD", 15, 35, "Pediatrics");
        String result = doctor.fillBlank("Ivanov A.A.");
        String expected = "Blank of Ivanov A.A. was filled by Petrov I.A.";
        assertThat(result, is(expected));
    }
}