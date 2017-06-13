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
        int key = Integer.valueOf(this.ask(question));
        boolean exist = false;
        for (int value : range) {
            if (value == key) {
                exist = true;
                break;
            }
        }
        if (exist) {
            return key;
        } else {
            throw new MenuOutException("Out of menu range.");
        }
    }
}
