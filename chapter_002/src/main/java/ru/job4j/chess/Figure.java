package ru.job4j.chess;

/**
 *@author Nikita Zenkin.
 *@since 14.06.2017.
 *@version 1.
 */
public abstract class Figure {
    /**
     * Cell of figure on chess deck.
     */
    private final Cell position;

    /**
     * Constructor.
     * @param letter int.
     * @param number int.
     */
    public Figure(int letter, int number) {
        this.position = new Cell(letter, number);
    }

    /**
     * Abstract method for defining way.
     * @param dist Cell.
     * @return Cell[].
     * @throws ImpossibleMoveException for Cells which we can't reach from source Cell.
     */
    abstract Cell[] way(Cell dist) throws ImpossibleMoveException;

    /**
     * Get position.
     * @return Cell.
     */
    public Cell getPosition() {
        return this.position;
    }

    /**
     * Check equality of cells.
     * @param cell Cell.
     * @return boolean.
     */
    public boolean checkEquality(Cell cell) {
        if ((this.getPosition().getLetter() == cell.getLetter())
                && (this.getPosition().getNumber() == cell.getNumber())) {
            return true;
        }
        return false;
    }
}
