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
     * Constructor.
     * @param input Input class.
     * @param output Output class.
     */
    private StartUI(Input input, Output output) {
        this.input = input;
        this.output = output;
    }

    /**
     * initial method.
     */
    private void init() {
        String action = "";
        String lineSeparator = System.lineSeparator();
        String id, name, desc;
        Tracker tracker = new Tracker();
        while (!action.equals("6")) {
            action = input.ask(
                    "0.Add new item" + lineSeparator
                            + "1.Show all items" + lineSeparator
                            + "2.Edit item" + lineSeparator
                            + "3.Delete item" + lineSeparator
                            + "4.Find item by ID" + lineSeparator
                            + "5.Find items by name" + lineSeparator
                            + "6.Exit program" + lineSeparator
                            + "Select:" + lineSeparator);
            switch (action) {
                case "0":
                    name = input.ask("Enter name of new item: ");
                    desc = input.ask("Enter description of new item: ");
                    tracker.add(new Item(name, desc, 123));
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
        }
    }

    /**
     * Main.
     * @param args String[].
     */
    public static void main(String[] args) {
        Input input = new ConsoleInput();
        Output output = new ConsoleOutput();
        new StartUI(input, output).init();
    }
}
