package ru.job4j.changer;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 26.06.2017.
 */
class Coins {
    /**
     * Value of coin.
     */
    private int value;

    /**
     * Constructor.
     * @param value int.
     */
    Coins(int value) {
        this.value = value;
    }

    /**
     * Getter for value.
     * @return int.
     */
    int getValue() {
        return this.value;
    }

}
