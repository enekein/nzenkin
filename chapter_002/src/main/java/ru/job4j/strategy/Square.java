package ru.job4j.strategy;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 08.06.2017.
 */
public class Square implements Shape {
    /**
     * String of square.
     * @return String.
     */
    public String pic() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                s.append("X");
            }
            s.append(System.lineSeparator());
        }
        return s.toString();
    }
}
