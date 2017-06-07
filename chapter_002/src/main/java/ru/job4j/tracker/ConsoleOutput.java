package ru.job4j.tracker;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 07.06.2017.
 */
public class ConsoleOutput implements Output {
    /**
     * Line separator for output.
     */
    private String lineSeparator = System.lineSeparator();

    /**
     * Print array of items.
     * @param items Item[].
     */
    public void printItems(Item[] items) {
        for (Item item : items) {
            System.out.print(String.format("ID: %sName: %sDesc: %sCreated: %d%s",
                    item.getId() + lineSeparator, item.getName() + lineSeparator,
                    item.getDesc() + lineSeparator, item.getCreated(), lineSeparator));
            String[] temp = item.getComments();
            System.out.print("Comments:" + lineSeparator);
            if (temp != null) {
                for (String comment: temp) {
                    System.out.print(comment + lineSeparator);
                }
            }
        }
    }

    /**
     * Print one item.
     * @param item Item.
     */
    public void printItem(Item item) {
        System.out.print(String.format("ID: %sName: %sDesc: %sCreated: %d%s",
                item.getId() + lineSeparator, item.getName() + lineSeparator,
                item.getDesc() + lineSeparator, item.getCreated(), lineSeparator));
        String[] temp = item.getComments();
        System.out.print("Comments:" + lineSeparator);
        if (temp != null) {
            for (String comment: temp) {
                System.out.print(comment + lineSeparator);
            }
        }
    }
}
