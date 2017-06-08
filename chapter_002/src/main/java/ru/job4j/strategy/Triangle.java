package ru.job4j.strategy;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 08.06.2017.
 */
public class Triangle implements Shape{
    public String pic() {
        StringBuilder s = new StringBuilder();
        int h = 10;
        for (int i = 0; i < h; i++) {
            for (int j = 0; j < (2 * h) - 1; j++) {
                if ((j >= h - i - 1) && (j < h + i)) {
                    s.append("^");
                } else {
                    s.append(" ");
                }
            }
            s.append(System.getProperty("line.separator"));
        }
        return s.toString();
    }
}
