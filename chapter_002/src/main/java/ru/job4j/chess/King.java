package ru.job4j.chess;

/**
 *@author Nikita Zenkin.
 *@since 19.06.2017.
 *@version 1.
 */
public class King extends Figure {
    /**
     * Constructor.
     * @param letter int.
     * @param number int.
     */
    King(int letter, int number) {
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
     * Way for king. Don't supported castling.
     * @param dist Cell.
     * @return Cell[].
     */
    Cell[] way(Cell dist) {
        Cell[] path = new Cell[1];
        try {
            if (this.getCell().getNumber() > dist.getNumber() && (this.getCell().getLetter() > dist.getLetter())) {
                path[0] = new Cell(this.getCell().getLetter() - 1, this.getCell().getNumber() - 1);
                return path;
            }
            if (getCell().getNumber() < dist.getNumber() && (getCell().getLetter() > dist.getLetter())) {
                path[0] = new Cell(this.getCell().getLetter() + 1, this.getCell().getNumber() - 1);
                return path;
            }
            if (getCell().getNumber() > dist.getNumber() && (getCell().getLetter() < dist.getLetter())) {
                path[0] = new Cell(this.getCell().getLetter() - 1, this.getCell().getNumber() + 1);
                return path;
            }
            if (getCell().getNumber() < dist.getNumber() && (getCell().getLetter() < dist.getLetter())) {
                path[0] = new Cell(this.getCell().getLetter() + 1, this.getCell().getNumber() + 1);
                return path;
            }
            if (this.getCell().getNumber() == dist.getNumber() && (this.getCell().getLetter() > dist.getLetter())) {
                path[0] = new Cell(this.getCell().getLetter(), this.getCell().getNumber() - 1);
                return path;
            }
            if (getCell().getNumber() < dist.getNumber() && (getCell().getLetter() == dist.getLetter())) {
                path[0] = new Cell(this.getCell().getLetter() + 1, this.getCell().getNumber());
                return path;
            }
            if (getCell().getNumber() > dist.getNumber() && (getCell().getLetter() == dist.getLetter())) {
                path[0] = new Cell(this.getCell().getLetter() - 1, this.getCell().getNumber());
                return path;
            }
            if (getCell().getNumber() == dist.getNumber() && (getCell().getLetter() < dist.getLetter())) {
                path[0] = new Cell(this.getCell().getLetter(), this.getCell().getNumber() + 1);
                return path;
            }
        } catch (ImpossibleMoveException ime) {
            System.out.println("Selected figure can't move that way.");
        }
        return null;
    }
}

