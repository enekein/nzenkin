package ru.job4j.list;

public class Element {
    private Object container;
    private Element next;

    public Object getContainer(){
        return container;
    }

    public void setContainer(Object obj){
        container = obj;
    }

    public Element getNext() {
        return this.next;
    }

    public void setNext(Element n) {
        next = n;
    }
}
