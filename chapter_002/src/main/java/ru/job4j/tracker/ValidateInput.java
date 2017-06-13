package ru.job4j.tracker;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 13.06.2017.
 */
public class ValidateInput extends ConsoleInput{
    public int ask(String question, int[] range){
        boolean invalid = true;
        int value = -1;
        do {
            try {
                value = super.ask(question, range);
                invalid = false;
            } catch (MenuOutException moe) {
                System.out.println("Please select key for menu.");
            } catch (NumberFormatException nfe) {
                System.out.println("Please enter valid data next time.");
            }
        } while (invalid);
        return value;
    }
}
