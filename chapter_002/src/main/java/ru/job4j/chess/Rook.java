package ru.job4j.chess;

import static java.util.Arrays.copyOf;

/**
 *@author Nikita Zenkin.
 *@since 19.06.2017.
 *@version 1.
 */
public class Rook extends Figure {
    /**
     * Constructor.
     * @param letter int.
     * @param number int.
     */
    Rook(int letter, int number) {
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
     * Way for rook.
     * @param dist Cell.
     * @return Cell[].
     */
    Cell[] way(Cell dist) {
        Cell[] path = new Cell[8];
        try {
            if (this.getCell().getNumber() == dist.getNumber() && (this.getCell().getLetter() > dist.getLetter())) {
                for (int length = 1; length <= 8; length++) {
                    path[length - 1] = new Cell(this.getCell().getLetter() - length, this.getCell().getNumber());
                    if (this.getCell().getLetter() - length == dist.getLetter()) {
                        return copyOf(path, length - 1);
                    }
                }
            }
            if (this.getCell().getNumber() < dist.getNumber() && (this.getCell().getLetter() == dist.getLetter())) {
                for (int length = 1; length <= 8; length++) {
                    path[length - 1] = new Cell(this.getCell().getLetter(), this.getCell().getNumber() + length);
                    if ((this.getCell().getNumber() + length == dist.getNumber())) {
                        return copyOf(path, length - 1);
                    }
                }
            }
            if (getCell().getNumber() > dist.getNumber() && (getCell().getLetter() == dist.getLetter())) {
                for (int length = 1; length <= 8; length++) {
                    path[length - 1] = new Cell(this.getCell().getLetter(), this.getCell().getNumber() - length);
                    if ((this.getCell().getNumber() - length == dist.getNumber())) {
                        return copyOf(path, length - 1);
                    }
                }
            }
            if (getCell().getNumber() == dist.getNumber() && (getCell().getLetter() < dist.getLetter())) {
                for (int length = 1; length <= 8; length++) {
                    path[length - 1] = new Cell(this.getCell().getLetter() + length, this.getCell().getNumber());
                    if (this.getCell().getLetter() + length == dist.getLetter()) {
                        return copyOf(path, length - 1);
                    }
                }
            }
        } catch (ImpossibleMoveException ime) {
            System.out.println("Selected figure can't move that way.");
        }
        return null;
    }
}
