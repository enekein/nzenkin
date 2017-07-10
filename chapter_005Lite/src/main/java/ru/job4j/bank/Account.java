package ru.job4j.bank;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 05.07.2017.
 */
public class Account {
    /**
     * Value of money on account. double.
     */
    private double value;
    /**
     * Requisites of account. long.
     */
    private long requisites;

    /**
     * Constructor.
     * @param value double.
     * @param requisites long.
     */
    Account(double value, long requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    /**
     * Get value.
     * @return double.
     */
    double getValue() {
        return this.value;
    }

    /**
     * Method for transferring money between accounts.
     * @param amount double.
     */
    void transfer(double amount) {
        this.value += amount;
    }
}
