package ru.job4j.chess;

/**
 *@author Nikita Zenkin.
 *@since 14.06.2017.
 *@version 1.
 */
public class Cell {
    /**
     * Letter of chess deck.
     */
    private int letter;
    /**
     * Number of chess deck.
     */
    private int number;

    /**
     * Constructor.
     * @param letter int.
     * @param number int.
     */
    public Cell(int letter, int number) {
        this.letter = letter;
        this.number = number;
    }

    /**
     * Get letter.
     * @return int.
     */
    public int getLetter() {
        return this.letter;
    }

    /**
     * Get number.
     * @return int.
     */
    public int getNumber() {
        return this.number;
    }
}
