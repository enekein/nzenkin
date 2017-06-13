package ru.job4j.tracker;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 08.06.2017.
 */

/**
 * Outer non-static class for update item.
 */
class UpdateItem extends BaseAction {
    /**
     * Constructor for BaseAction.
     * @param name String.
     * @param key int.
     */
    public UpdateItem(String name, int key) {
        super(name, key);
    }
    /**
     * Key for update item.
     * @return int.
     */
    public int key() {
        return 2;
    }

    /**
     * Execute update item.
     * @param input Input.
     * @param output Output.
     * @param tracker Tracker.
     */
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

    /**
     * Info for menu.
     * @return String.
     */
    /*public String info() {
        return String.format("%s. %s", this.key(), "Update item");
    }*/
}

/**
 * Main class of this file.
 */
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

    /**
     * Array of UserAction for menu.
     */
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

    /**
     * Get length of UserAction array.
     * @return int.
     */
    public int getUserActionsLength() {
        return actions.length;
    }

    /**
     * Fill array by actions.
     */
    public void fillActions() {
        this.actions[0] = this.new AddItem("Add Item", 0);
        this.actions[1] = new MenuTracker.ShowItems("Show Item", 1);
        this.actions[2] = new UpdateItem("Update Item", 2);
        this.actions[3] = this.new DeleteItem("Delete Item", 3);
        this.actions[4] = this.new FindById("Find By ID", 4);
        this.actions[5] = this.new FindByName("Find By Name", 5);
        this.actions[6] = this.new Exit("Exit", 6);
    }

    /**
     * Select some action in menu.
     * @param key int.
     * @return int.
     */
    public int select(int key) {
        this.actions[key].execute(this.input, this.output, this.tracker);
        return key;
    }

    /**
     * Show menu.
     */
    public void show() {
        for (UserAction action : this.actions) {
            if (action != null) {
                System.out.println(action.info());
            }
        }
    }

    /**
     * Inner non-static class for add item.
     */
    private class AddItem extends BaseAction {
        /**
         * Constructor for BaseAction.
         * @param name String.
         * @param key int.
         */
        public AddItem(String name, int key) {
            super(name, key);
        }

        /**
         * Key for add item.
         * @return int.
         */
        public int key() {
            return 0;
        }

        /**
         * Execute add item.
         * @param input Input.
         * @param output Output.
         * @param tracker Tracker.
         */
        public void execute(Input input, Output output, Tracker tracker) {
            String name = input.ask("Enter name of new item: ");
            String desc = input.ask("Enter description of new item: ");
            String comment = input.ask("Enter comment for new item: ");
            tracker.add(new Item(name, desc, comment));
            System.out.println("You added new item!");
        }

        /**
         * Info for menu.
         * @return String.
         */
        /*public String info() {
            return String.format("%s. %s", this.key(), "Add new item");
        }*/
    }

    /**
     * Inner static class for show items.
     */
    private static class ShowItems extends BaseAction{
        /**
         * Constructor for BaseAction.
         * @param name String.
         * @param key int.
         */
        public ShowItems(String name, int key) {
            super(name, key);
        }
        /**
         * Key for show items.
         * @return int.
         */
        public int key() {
            return 1;
        }

        /**
         * Execute find all items.
         * @param input Input.
         * @param output Output.
         * @param tracker Tracker.
         */
        public void execute(Input input, Output output, Tracker tracker) {
            output.printItems(tracker.findAll());
        }

        /**
         * Info for menu.
         * @return String.
         */
        /*public String info() {
            return String.format("%s. %s", this.key(), "Show all items");
        }*/
    }

    /**
     * Inner non-static class for delete item.
     */
    private class DeleteItem extends BaseAction {
        /**
         * Constructor for BaseAction.
         * @param name String.
         * @param key int.
         */
        public DeleteItem(String name, int key) {
            super(name, key);
        }
        /**
         * Key for delete item.
         * @return int.
         */
        public int key() {
            return 3;
        }

        /**
         * Execute delete item.
         * @param input Input.
         * @param output Output.
         * @param tracker Tracker.
         */
        public void execute(Input input, Output output, Tracker tracker) {
            String id = input.ask("Enter id of item that you want to delete: ");
            tracker.delete(tracker.findById(id));
            System.out.print(String.format("Item with ID %s deleted %s", id, System.lineSeparator()));
        }

        /**
         * Info for menu.
         * @return String.
         */
        /*public String info() {
            return String.format("%s. %s", this.key(), "Delete item");
        }*/
    }

    /**
     * Inner non-static class for find by id.
     */
    private class FindById extends BaseAction {
        /**
         * Constructor for BaseAction.
         * @param name String.
         * @param key int.
         */
        public FindById(String name, int key) {
            super(name, key);
        }
        /**
         * Key for find by Id.
         * @return int.
         */
        public int key() {
            return 4;
        }

        /**
         * Execute find by id.
         * @param input Input.
         * @param output Output.
         * @param tracker Tracker.
         */
        public void execute(Input input, Output output, Tracker tracker) {
            String id = input.ask("Enter id of item that you want to find: ");
            output.printItem(tracker.findById(id));
        }

        /**
         * Info for menu.
         * @return String.
         */
       /* public String info() {
            return String.format("%s. %s", this.key(), "Find item by ID");
        }*/
    }

    /**
     * Inner non-static class for find by name.
     */
    private class FindByName extends BaseAction {
        /**
         * Constructor for BaseAction.
         * @param name String.
         * @param key int.
         */
        public FindByName(String name, int key) {
            super(name, key);
        }
        /**
         * Key for find by name.
         * @return int.
         */
        public int key() {
            return 5;
        }

        /**
         * Execute find by name.
         * @param input Input.
         * @param output Output.
         * @param tracker Tracker.
         */
        public void execute(Input input, Output output, Tracker tracker) {
            String name = input.ask("Enter name of items you want to find: ");
            output.printItems(tracker.findByName(name));
        }

        /**
         * Info for menu.
         * @return String.
         */
       /* public String info() {
            return String.format("%s. %s", this.key(), "Find item by name");
        }*/
    }

    /**
     * Inner non-static class for exit.
     */
    private class Exit extends BaseAction {
        /**
         * Constructor for BaseAction.
         * @param name String.
         * @param key int.
         */
        public Exit(String name, int key) {
            super(name, key);
        }
        /**
         * Key for exit.
         * @return int.
         */
        public int key() {
            return 6;
        }

        /**
         * Execute exit. Do nothing.
         * @param input Input.
         * @param output Output.
         * @param tracker Tracker.
         */
        public void execute(Input input, Output output, Tracker tracker) {

        }

        /**
         * Info for menu.
         * @return String.
         */
/*        public String info() {
            return String.format("%s. %s", this.key(), "Exit program");
        }*/
    }

}
