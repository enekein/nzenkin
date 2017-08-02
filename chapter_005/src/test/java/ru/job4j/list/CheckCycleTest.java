package ru.job4j.list;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 02.08.2017.
 */

public class CheckCycleTest {
    /**
     * Checking method boolean hasCycle(Node).
     */
    @Test
    public void whenHasCycleInLinkedListedThenReturnTrue() {
        CheckCycle checkCycle = new CheckCycle();
        CheckCycle.Node<Integer> first = checkCycle.new Node<>(1);
        CheckCycle.Node<Integer> two = checkCycle.new Node<>(2);
        CheckCycle.Node<Integer> third = checkCycle.new Node<>(3);
        CheckCycle.Node<Integer> four = checkCycle.new Node<>(4);

        first.next = two;
        two.next = third;
        third.next = four;
        four.next = first;

        assertThat(checkCycle.hasCycle(first), is(true));
    }
}
