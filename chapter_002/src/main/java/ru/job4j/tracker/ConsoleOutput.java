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
            if (item.getId() != null) {
                System.out.print(String.format("ID: %sName: %sDesc: %sCreated: %d%s",
                        item.getId() + lineSeparator, item.getName() + lineSeparator,
                        item.getDesc() + lineSeparator, item.getCreated(), lineSeparator));
                String[] temp = item.getComments();
                System.out.println("Comments:");
                if (temp != null) {
                    for (String comment : temp) {
                        if (comment != null) {
                            System.out.println(comment);
                        }
                    }
                }
            }
        }
    }

    /**
     * Print one item.
     * @param item Item.
     */
    public void printItem(Item item) {
        if (item.getId() != null) {
            System.out.print(String.format("ID: %sName: %sDesc: %sCreated: %d%s",
                    item.getId() + lineSeparator, item.getName() + lineSeparator,
                    item.getDesc() + lineSeparator, item.getCreated(), lineSeparator));
            String[] temp = item.getComments();
            System.out.println("Comments:");
            if (temp != null) {
                for (String comment : temp) {
                    if (comment != null) {
                        System.out.println(comment);
                    }
                }
                }
            } else {
            System.out.println("Empty item!");
        }
    }
}
