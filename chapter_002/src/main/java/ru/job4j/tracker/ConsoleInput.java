package ru.job4j.tracker;

import java.util.*;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 07.06.2017.
 */
public class ConsoleInput implements Input{
    private Scanner scanner = new Scanner(System.in);

    public String ask(String question) {
        System.out.print(question);
        return scanner.nextLine();
    }
}
