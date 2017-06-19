package ru.job4j.chess;

/**
 *@author Nikita Zenkin.
 *@since 19.06.2017.
 *@version 1.
 */
public class Pawn extends Figure {
    /**
     * Using for define when pawn can go 2 cells.
     */
    private boolean startOfGame = false;
    /**
     * Constructor.
     * @param letter int.
     * @param number int.
     */
    Pawn(int letter, int number) {
        super(letter, number);
        startOfGame = true;
    }

    /**
     * Get cell.
     * @return Cell.
     */
    public Cell getCell() {
        return super.getPosition();
    }

    /**
     * Way for pawn. Don't supported using pawn from another side.
     * @param dist Cell.
     * @return Cell[].
     */
    Cell[] way(Cell dist) {
        Cell[] path = new Cell[2];
        try {
            if (this.startOfGame && (this.getPosition().getNumber() + 2 == dist.getNumber())) {
                path[0] = new Cell(this.getPosition().getLetter(), this.getCell().getNumber() + 1);
                path[1] = new Cell(this.getPosition().getLetter(), this.getCell().getNumber() + 2);
                this.startOfGame = false;
                return path;
            } else {
                path[0] = new Cell(this.getPosition().getLetter(), this.getCell().getNumber() + 1);
                if (this.startOfGame) {
                    this.startOfGame = false;
                }
                return new Cell[] {path[0]};
            }
        } catch (ImpossibleMoveException ime) {
            System.out.println("Selected figure can't move that way.");
        }
        return null;
    }
}
