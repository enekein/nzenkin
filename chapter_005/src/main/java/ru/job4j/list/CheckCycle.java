package ru.job4j.list;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 02.08.2017.
 */

public class CheckCycle {
    /**
     * Class for linked list.
     * @param <T> type of value to store.
     */
    class Node<T> {
        /**
         * Value to store.
         */
        private T value;
        /**
         * Next Node.
         */
        Node<T> next;

        /**
         * Constructor.
         * @param value T.
         */
        Node(T value) {
            this.value = value;
        }
    }

    /**
     * Checking for cycles.
     * @param first Node.
     * @return boolean.
     */
    boolean hasCycle(Node first) {
        Node temp = first.next;

        while (temp.next != null) {
            if (temp.next.equals(first.next)) {
                return true;
            } else {
                temp = temp.next;
            }
        }
        return false;
    }
}
