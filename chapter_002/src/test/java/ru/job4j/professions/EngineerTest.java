package ru.job4j.professions;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Nikita Zenkin.
 *@since 05.06.2017.
 *@version 1.
 */

public class EngineerTest {

    /**
     * test method diagnosis(String). Input Part.
     */
    @Test
    public void whenDiagnosisThePartThenReturnStringThatPartIsNotWorkCorrectly() {
        Engineer engineer = new Engineer("Petrov I.A.", "Chief engineer", 10, 45, "Electricity");
        String result = engineer.diagnosis("Part");
        String expected = "Part isn't working correctly. Diagnosis by Petrov I.A. Chief engineer";
        assertThat(result, is(expected));
    }

    /**
     * test method repair(String). Input Part.
     */
    @Test
    public void whenRepairThePartThenReturnStringThatPartIsRepaired() {
        Engineer engineer = new Engineer("Petrov I.A.", "Chief engineer", 10, 45, "Electricity");
        String result = engineer.repair("Part");
        String expected = "Part is repaired by Petrov I.A.";
        assertThat(result, is(expected));
    }

    /**
     * test method instructWorker(String). Input Ivanov A.A..
     */
    @Test
    public void whenInstructWorkerIvanovThenReturnStringThatIvanovIsInstructed() {
        Engineer engineer = new Engineer("Petrov I.A.", "Chief engineer", 10, 45, "Electricity");
        String result = engineer.instructWorker("Ivanov A.A.");
        String expected = "Ivanov A.A. is instructed.";
        assertThat(result, is(expected));
    }
}