package ru.job4j.list;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 12.08.2017.
 */

class Element {
    /**
     * Container.
     */
    private Object container;
    /**
     * Next element.
     */
    private Element next;

    /**
     * Get value from container.
     * @return Object.
     */
    @Getter
    Object getContainer() {
        return container;
    }

    /**
     * Set value in container.
     * @param obj Object.
     */
    @Setter
    void setContainer(final Object obj) {
        container = obj;
    }

    /**
     * Get next element.
     * @return Element.
     */
    @Getter
    Element getNext() {
        return this.next;
    }

    /**
     * Setter to next element.
     * @param n Element.
     */
    @Setter
    void setNext(final Element n) {
        next = n;
    }
}
