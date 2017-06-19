package ru.job4j.performance;

import java.util.*;

/**
 *@author Nikita Zenkin.
 *@since 16.06.2017.
 *@version 1.
 */
public class CheckPerformance {
    /**
     * Constant for add amount.
     */
    private final int AMOUNT_ADD = 50000;
    /**
     * Constant for del amount.
     */
    private final int AMOUNT_DEL = 10000;
    /**
     * Checking performance of add operation.
     * @param collection Collection.
     * @param amount int.
     * @return long.
     */
    private long add(Collection<String> collection, int amount) {
        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            collection.add(String.valueOf(i));
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    /**
     * Checking performance of del operation.
     * @param collection Collection.
     * @param amount int.
     * @return long.
     */
    private long del(Collection<String> collection, int amount) {
        long start = System.nanoTime();
        for (int i = 0; i < amount; i++) {
            collection.remove(String.valueOf(i));
        }
        long finish = System.nanoTime();
        return finish - start;
    }

    /**
     * Main.
     * @param args String[].
     */
    public static void main(String[] args) {
        CheckPerformance performance = new CheckPerformance();
        List<String> linkedList = new LinkedList<>();
        System.out.println(String.format("Time of addition %s new elements in LinkedList is: %s"
                , performance.AMOUNT_ADD, performance.add(linkedList, performance.AMOUNT_ADD)));
        System.out.println(String.format("Time of delete %s elements in LinkedList is: %s"
                , performance.AMOUNT_DEL, performance.del(linkedList, performance.AMOUNT_DEL)));
        List<String> arrayList = new ArrayList<>();
        System.out.println(String.format("Time of addition %s new elements in ArrayList is: %s"
                , performance.AMOUNT_ADD, performance.add(arrayList, performance.AMOUNT_ADD)));
        System.out.println(String.format("Time of delete %s elements in ArrayList is: %s"
                , performance.AMOUNT_DEL, performance.del(arrayList, performance.AMOUNT_DEL)));
        TreeSet<String> treeSet = new TreeSet<>();
        System.out.println(String.format("Time of addition %s new elements in TreeSet is: %s"
                , performance.AMOUNT_ADD, performance.add(treeSet, performance.AMOUNT_ADD)));
        System.out.println(String.format("Time of delete %s elements in TreeSet is: %s"
                , performance.AMOUNT_DEL, performance.del(treeSet, performance.AMOUNT_DEL)));
    }
}
