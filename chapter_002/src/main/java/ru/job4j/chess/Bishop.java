package ru.job4j.chess;

import static java.util.Arrays.copyOf;

/**
 *@author Nikita Zenkin.
 *@since 14.06.2017.
 *@version 1.
 */
public class Bishop extends Figure {
    /**
     * Constructor.
     * @param letter int.
     * @param number int.
     */
    Bishop(int letter, int number) {
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
     * Way for bishop.
     * @param dist Cell.
     * @return Cell[].
     */
    Cell[] way(Cell dist) {
        Cell[] path = new Cell[8];
        try {
            if (getCell().getNumber() > dist.getNumber() && (getCell().getLetter() > dist.getLetter())) {
                int numberLength = 1;
                int letterLength = 1;
                for (; numberLength < 8; numberLength++, letterLength++) {
                    path[numberLength - 1] = new Cell(this.getCell().getLetter() - letterLength, this.getCell().getNumber() - numberLength);
                    if ((this.getCell().getNumber() - numberLength == dist.getLetter()) && (this.getCell().getLetter() - letterLength == dist.getNumber())) {
                        return copyOf(path, numberLength - 1);
                    }
                }
            }
            if (getCell().getNumber() < dist.getNumber() && (getCell().getLetter() > dist.getLetter())) {
                int numberLength = 1;
                int letterLength = 1;
                for (; numberLength < 8; numberLength++, letterLength++) {
                    path[numberLength - 1] = new Cell(this.getCell().getLetter() + letterLength, this.getCell().getNumber() - numberLength);
                    if ((this.getCell().getNumber() + numberLength == dist.getLetter()) && (this.getCell().getLetter() - letterLength == dist.getNumber())) {
                        return copyOf(path, numberLength - 1);
                    }
                }
            }
            if (getCell().getNumber() > dist.getNumber() && (getCell().getLetter() < dist.getLetter())) {
                int numberLength = 1;
                int letterLength = 1;
                for (; numberLength < 8; numberLength++, letterLength++) {
                    path[numberLength - 1] = new Cell(this.getCell().getLetter() - letterLength, this.getCell().getNumber() + numberLength);
                    if ((this.getCell().getNumber() - numberLength == dist.getLetter()) && (this.getCell().getLetter() + letterLength == dist.getNumber())) {
                        return copyOf(path, numberLength - 1);
                    }
                }
            }
            if (getCell().getNumber() < dist.getNumber() && (getCell().getLetter() < dist.getLetter())) {
                int numberLength = 1;
                int letterLength = 1;
                for (; numberLength < 8; numberLength++, letterLength++) {
                    path[numberLength - 1] = new Cell(this.getCell().getLetter() + letterLength, this.getCell().getNumber() + numberLength);
                    if ((this.getCell().getNumber() + numberLength == dist.getLetter()) && (this.getCell().getLetter() + letterLength == dist.getNumber())) {
                        return copyOf(path, numberLength - 1);
                    }
                }
            }
        } catch (ImpossibleMoveException ime) {
            System.out.println("Selected figure can't move that way.");
        }
        return null;
    }
}
