package ru.job4j.chess;

/**
 *@author Nikita Zenkin.
 *@since 19.06.2017.
 *@version 1.
 */
public class Knight extends Figure {
    /**
     * Array of moves by numbers.
     */
    private final int[] arrayOfMovesNumbers =  {2, 2, -2, -2, 1, -1, 1, -1};
    /**
     * Array of moves by letters.
     */
    private final int[] arrayOfMovesLetters = {1, -1, -1, 1, -2, -2, 2, 2};
    /**
     * Constructor.
     * @param letter int.
     * @param number int.
     */
    Knight(int letter, int number) {
        super(letter, number);
    }

    /**
     * Get cell.
     * @return Cell.
     */
    public Cell getCell() {
        return super.getPosition();
    }

    /**
     * Way for knight.
     * @param dist Cell.
     * @return Cell[].
     */
    Cell[] way(Cell dist) {
        try {
            for (int index = 0; index < 8; index++) {
                if ((dist.getLetter() == this.getCell().getLetter() + this.arrayOfMovesLetters[index])
                    && (dist.getNumber() == this.getCell().getNumber() + this.arrayOfMovesNumbers[index])) {
                    return new Cell[] {dist};
                }
            }
        } catch (ImpossibleMoveException ime) {
            System.out.println("Selected figure can't move that way.");
        }
        return null;
    }
}

