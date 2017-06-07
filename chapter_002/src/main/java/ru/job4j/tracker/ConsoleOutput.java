package ru.job4j.tracker;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 07.06.2017.
 */
public class ConsoleOutput implements Output{
    private String lineSeparator = System.lineSeparator();

    public void printItems(Item[] items) {
        for (Item item : items) {
            System.out.print(String.format("ID: %sName: %sDesc: %sCreated: %d%s",
                    item.getId() + lineSeparator, item.getName() + lineSeparator,
                    item.getDesc() + lineSeparator,item.getCreated(), lineSeparator));
            String[] temp = item.getComments();
            System.out.print("Comments:" + lineSeparator);
            if (temp != null) {
                for (String comment: temp) {
                    System.out.print(comment + lineSeparator);
                }
            }
        }
    }

    public void printItem(Item item) {
        System.out.print(String.format("ID: %sName: %sDesc: %sCreated: %d%s",
                item.getId() + lineSeparator, item.getName() + lineSeparator,
                item.getDesc() + lineSeparator,item.getCreated(), lineSeparator));
        String[] temp = item.getComments();
        System.out.print("Comments:" + lineSeparator);
        if (temp != null) {
            for (String comment: temp) {
                System.out.print(comment + lineSeparator);
            }
        }
    }
}
