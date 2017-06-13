package ru.job4j.tracker;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 08.06.2017.
 */

class UpdateItem implements UserAction {
    public int key() {
        return 2;
    }

    public void execute(Input input, Output output, Tracker tracker) {
        String id = input.ask("Enter id of item that you want to update: ");
        String name = input.ask("Enter new name of item: ");
        String desc = input.ask("Enter new description of item: ");
        Item newItem = tracker.findById(id);
        newItem.setName(name);
        newItem.setDesc(desc);
        tracker.update(newItem);
        System.out.println(String.format("Item with ID %s updated", id));
    }

    public String info() {
        return String.format("%s. %s", this.key(), "Update item");
    }
}

public class MenuTracker {
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

    private UserAction[] actions = new UserAction[7];
    /**
     * Constructor.
     * @param input Input.
     * @param output Output.
     * @param tracker Tracker.
     */
    public MenuTracker(Input input, Output output, Tracker tracker) {
        this.input = input;
        this.output = output;
        this.tracker = tracker;
    }

    public int getUserActionsLength() {
        return actions.length;
    }

    public void fillActions() {
        this.actions[0] = this.new AddItem();
        this.actions[1] = new MenuTracker.ShowItems();
        this.actions[2] = new UpdateItem();
        this.actions[3] = this.new DeleteItem();
        this.actions[4] = this.new FindById();
        this.actions[5] = this.new FindByName();
        this.actions[6] = this.new Exit();
    }

    public int select(int key) {
        this.actions[key].execute(this.input, this.output, this.tracker);
        return key;
    }

    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    private class AddItem implements UserAction {
        public int key() {
            return 0;
        }

        public void execute(Input input, Output output, Tracker tracker) {
            String name = input.ask("Enter name of new item: ");
            String desc = input.ask("Enter description of new item: ");
            String comment = input.ask("Enter comment for new item: ");
            tracker.add(new Item(name, desc, comment));
            System.out.println("You added new item!");
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Add new item");
        }
    }

    private static class ShowItems implements UserAction{
        public int key() {
            return 1;
        }

        public void execute(Input input, Output output, Tracker tracker) {
            output.printItems(tracker.findAll());
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Show all items");
        }
    }
    private class DeleteItem implements UserAction{
        public int key() {
            return 3;
        }

        public void execute(Input input, Output output, Tracker tracker) {
            String id = input.ask("Enter id of item that you want to delete: ");
            tracker.delete(tracker.findById(id));
            System.out.print(String.format("Item with ID %s deleted %s", id, System.lineSeparator()));
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Delete item");
        }
    }

    private class FindById implements UserAction{
        public int key() {
            return 4;
        }

        public void execute(Input input, Output output, Tracker tracker) {
            String id = input.ask("Enter id of item that you want to find: ");
            output.printItem(tracker.findById(id));
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Find item by ID");
        }
    }

    private class FindByName implements UserAction{
        public int key() {
            return 5;
        }

        public void execute(Input input, Output output, Tracker tracker) {
            String name = input.ask("Enter name of items you want to find: ");
            output.printItems(tracker.findByName(name));
        }

        public String info() {
            return String.format("%s. %s", this.key(), "Find item by name");
        }
    }

    private class Exit implements UserAction{
        public int key() {
            return 6;
        }

        public void execute(Input input, Output output, Tracker tracker) {

        }

        public String info() {
            return String.format("%s. %s", this.key(), "Exit program");
        }
    }

}
