package ru.job4j.list;

import org.junit.Test;
import java.util.Iterator;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 01.08.2017.
 */

public class CustomLinkedListTest {
    /**
     * Test method get(int).
     */
    @Test
    public void whenGetFirstElement() {
        CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>(10);
        assertThat(customLinkedList.get(4), is(4));
    }

    /**
     * Test method add(int).
     */
    @Test
    public void whenAddNewElement() {
        CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>(10);
        customLinkedList.add(5);
        assertThat(customLinkedList.get(5), is(5));
    }

    /**
     * Test method next().
     */
    @Test
    public void whenChooseNextElement() {
        CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>(10);
        customLinkedList.add(5);
        customLinkedList.add(6);
        Iterator<Integer> it = customLinkedList.iterator();
        it.next();
        assertThat(it.next(), is(5));
    }

    /**
     * Test method hasNext().
     */
    @Test
    public void whenCheckNextElement() {
        CustomLinkedList<Integer> customLinkedList = new CustomLinkedList<>(10);
        customLinkedList.add(5);
        Iterator<Integer> it = customLinkedList.iterator();
        assertThat(it.hasNext(), is(true));
    }
}
