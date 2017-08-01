package ru.job4j.list;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 22.07.2017.
 */

public class CustomLinkedList<E> implements SimpleContainer<E>{

    private Element headerElement;

    private Element[] elements;

    /**
     * Index of current element.
     */
    private int index = 0;

    /**
     * Constructor.
     */
    CustomLinkedList(E e, int size) {
        headerElement = new Element();
        headerElement.setContainer(e);
        elements = new Element[size];
        elements[index++] = headerElement;
    }

    /**
     * Add new element.
     * @param value E.
     */
    public void add(E value) {
        if (elements.length == index) {
            extendContainer();
        }
        for (Element element : elements) {
            if (element.getNext() == null) {
                element.setNext(elements[index]);
                break;
            }
        }
        elements[index++].setContainer(value);
    }

    /**
     * Extend length of container.
     */
    private void extendContainer() {
        elements = Arrays.copyOf(elements, elements.length * 2);
    }

    /**
     * Get element.
     * @param e E.
     * @return E.
     */
    public E get(E e) {
        for (int i = 0; i < index; i++) {
            if (e.equals(elements[i])) {
                return (E) elements[i].getContainer();
            }
        }
        return null;
    }

    private int getIndex(E e) {
        for (int i = 0; i < index; i++) {
            if (e.equals(elements[i])) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Iterator for DynamicArray.
     * @return Iterator E.
     */
    @Override
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            /**
             * Index of iterator.
             */
            private int currentIndex = 0;

            /**
             * Checking is next element exist?
             * @return boolean.
             */
            @Override
            public boolean hasNext() {
                return (elements[currentIndex].getNext() != null);
            }

            /**
             * Return element and move flag to next elem.
             * @return E.
             */
            @Override
            public E next() {
                Element element = elements[currentIndex].getNext();
                currentIndex = getIndex((E) element.getContainer());
                return (E) element.getContainer();
            }
        };
    }
}
