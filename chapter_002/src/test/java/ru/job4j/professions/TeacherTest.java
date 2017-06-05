package ru.job4j.professions;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 *@author Nikita Zenkin.
 *@since 05.06.2017.
 *@version 1.
 */

public class TeacherTest {

    /**
     * test method lesson(String, String). Input "Physics" "Eight class".
     */
    @Test
    public void whenTeachPhysicsLessonToEightClassThenReturnStringThatEightClassListenedLesson() {
        Teacher teacher = new Teacher("Petrov I.A.", "PhD", 5, 30, "Physics");
        String result = teacher.lesson("Physics", "Eight class");
        String expected = "Physics lesson is done for Eight class";
        assertThat(result, is(expected));
    }

    /**
     * test method practice(String, String). Input "Physics" "Eight class".
     */
    @Test
    public void whenTeachPhysicsPracticeToEightClassThenReturnStringThatEightClassDoPractice() {
        Teacher teacher = new Teacher("Petrov I.A.", "PhD", 5, 30, "Physics");
        String result = teacher.practice("Physics", "Eight class");
        String expected = "Physics practice is done for Eight class";
        assertThat(result, is(expected));
    }

    /**
     * test method exam(String, String). Input "Physics" "Ivanov".
     */
    @Test
    public void whenDoPhysicsExamToIvanovThenReturnStringThatIvanovCompleteExamWithMarkFive() {
        Teacher teacher = new Teacher("Petrov I.A.", "PhD", 5, 30, "Physics");
        String result = teacher.exam("Physics", "Ivanov");
        String expected = "Physics exam is done by Ivanov with mark 5.";
        assertThat(result, is(expected));
    }
}