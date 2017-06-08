package ru.job4j.tracker;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 07.06.2017.
 */
public class StubInput implements Input {
    /**
     * Array of answers. String[].
     */
    private String[] answers;
    /**
     * Length of answers array. int.
     */
    private int position = 0;

    /**
     * Constructor.
     * @param answers String[]
     */
    public StubInput(String[] answers) {
        this.answers = answers;
    }

    /**
     * @param question String.
     * @return String.
     */
    public String ask(String question) {
        return answers[position++];
    }
}
