package ru.job4j.tracker;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 07.06.2017.
 */
public class StartUI {
    /**
     * Input variable.
     */
    private Input input;
    /**
     * Output variable.
     */
    private Output output;
    /**
     * Tracker variable.
     */
    private Tracker tracker;
    /**
     * Code for exit from menu.
     */
    private static final int EXIT = 6;

    /**
     * Constructor.
     * @param input Input class.
     * @param output Output class.
     * @param tracker Tracker class.
     */
    StartUI(Input input, Output output, Tracker tracker) {
        this.input = input;
        this.output = output;
        this.tracker = tracker;
    }

    /**
     * initial method.
     */
    void init() {
        MenuTracker menu = new MenuTracker(this.input, this.output, this.tracker);
        int[] ranges = new int[menu.getUserActionsLength()];
        for (int index = 0; index < ranges.length; index++) {
            ranges[index] = index;
        }
        int key;
        menu.fillActions();
        do {
            menu.show();
            key = menu.select(input.ask("Select: ", ranges));
        } while (key != EXIT);
        /*String action = "";
        String lineSeparator = System.lineSeparator();
        String id, name, desc;
        while (!action.equals("6")) {
            action = input.ask(
                    new StringBuilder()
                            .append("0.Add new item").append(lineSeparator)
                            .append("1.Show all items").append(lineSeparator)
                            .append("2.Edit item").append(lineSeparator)
                            .append("3.Delete item").append(lineSeparator)
                            .append("4.Find item by ID").append(lineSeparator)
                            .append("5.Find items by name").append(lineSeparator)
                            .append("6.Exit program").append(lineSeparator)
                            .append("Select:").append(lineSeparator).toString());
           switch (action) {
                case "0":
                    name = input.ask("Enter name of new item: ");
                    desc = input.ask("Enter description of new item: ");
                    tracker.add(new Item(name, desc));
                    System.out.print("You added new item!" + lineSeparator);
                    break;
                case "1":
                    output.printItems(tracker.findAll());
                    break;
                case "2":
                    id = input.ask("Enter id of item that you want to update: ");
                    name = input.ask("Enter new name of item: ");
                    desc = input.ask("Enter new description of item: ");
                    Item newItem = tracker.findById(id);
                    newItem.setName(name);
                    newItem.setDesc(desc);
                    tracker.update(newItem);
                    System.out.print(String.format("Item with ID %s updated %s", id, lineSeparator));
                    break;
                case "3":
                    id = input.ask("Enter id of item that you want to delete: ");
                    tracker.delete(tracker.findById(id));
                    System.out.print(String.format("Item with ID %s deleted %s", id, lineSeparator));
                    break;
                case "4":
                    id = input.ask("Enter id of item that you want to find: ");
                    output.printItem(tracker.findById(id));
                    break;
                case "5":
                    name = input.ask("Enter name of items you want to find: ");
                    output.printItems(tracker.findByName(name));
                    break;
                case "6":
                    break;
                default:
                    System.out.print("Please enter correct menu number!" + lineSeparator);
            }
        }*/
    }

    /**
     * Main.
     * @param args String[].
     */
    public static void main(String[] args) {
        Input input = new ValidateInput();
        Output output = new ConsoleOutput();
        Tracker tracker = new Tracker();
        new StartUI(input, output, tracker).init();
    }
}
