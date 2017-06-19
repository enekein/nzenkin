package ru.job4j.chess;

/**
 *@author Nikita Zenkin.
 *@since 19.06.2017.
 *@version 1.
 */
public class Queen extends Figure {
    /**
     * Constructor.
     * @param letter int.
     * @param number int.
     */
    Queen(int letter, int number) {
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
     * Way for queen.
     * @param dist Cell.
     * @return Cell[].
     */
    Cell[] way(Cell dist) {
        Cell[] path = new Cell[8];
        try {
            Rook rook = new Rook(this.getCell().getLetter(), this.getCell().getNumber());
            path = rook.way(dist);
            if (path == null) {
                Bishop bishop = new Bishop(this.getCell().getLetter(), this.getCell().getNumber());
                path = bishop.way(dist);
            }
            return path;
        } catch (ImpossibleMoveException ime) {
            System.out.println("Selected figure can't move that way.");
        }
        return null;
    }
}
