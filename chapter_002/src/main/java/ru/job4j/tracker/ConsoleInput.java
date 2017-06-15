package ru.job4j.tracker;

import java.util.Scanner;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 07.06.2017.
 */
public class ConsoleInput implements Input {
    /**
     * Scanner for input.
     */
    private Scanner scanner = new Scanner(System.in);

    /**
     * Ask question and return answer.
     * @param question String.
     * @return String.
     */
    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }

    /**
     * Overload ask.
     * @param question String.
     * @param range int[].
     * @return int.
     */
    public int ask(String question, int[] range) {
        int key = -1;
        try {
            key = Integer.valueOf(this.ask(question));
        } catch (NumberFormatException nfe) {
            System.out.println("Please enter valid data next time.");
        }
        return key;
    }
}
