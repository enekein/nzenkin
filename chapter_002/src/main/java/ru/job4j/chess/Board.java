package ru.job4j.chess;

/**
 *@author Nikita Zenkin.
 *@since 14.06.2017.
 *@version 1.
 */
public class Board {
    /**
     * Array of figures.
     */
    private Figure[] figures = new Figure[2];
    /**
     * Position in array of figures.
     */
    private int positionInArray = 0;
    /**
     * Constant for chess deck.
     */
    private static final int LENGTH_OF_LETTER_SIDE = 8;
    /**
     * Constant for chess deck.
     */
    private static final int LENGTH_OF_NUMBER_SIDE = 8;

    /**
     * Constructor.
     * @param figure Figure.
     */
    public Board(Figure figure) {
        this.figures[positionInArray++] = figure;
    }

    /**
     * Add figure. This method isn't using.
     * @param figure Figure.
     */
    void addFigure(Figure figure) {
        this.figures[positionInArray++] = figure;
    }

    /**
     * Delete figure. This method isn't using.
     * @param figure Figure.
     */
    void deleteFigure(Figure figure) {
        try {
            for (int index = 0; index < positionInArray; index++) {
                if ((figure.getPosition().getNumber() == figures[index].getPosition().getNumber())
                        && (figure.getPosition().getLetter() == this.figures[index].getPosition().getLetter())) {
                    if (index != positionInArray) {
                        System.arraycopy(this.figures, index + 1, this.figures, index, positionInArray - index - 1);
                        positionInArray--;
                        break;
                    } else {
                        this.figures[positionInArray] = null;
                        positionInArray--;
                    }
                }
            }
        } catch (FigureNotFoundException fnfe) {
            System.out.println("Figure that you select didn't exist. Please choose another figure.");
        }
    }

    /**
     * Boolean method to define can figure move or not.
     * @param source Cell.
     * @param dist Cell.
     * @return boolean.
     * @throws ImpossibleMoveException for Cells which we can't reach from source Cell.
     * @throws OccupiedWayException blocked way by another figure.
     * @throws FigureNotFoundException Chosen figure don't exist.
     */
    boolean move(Cell source, Cell dist) throws ImpossibleMoveException,
            OccupiedWayException, FigureNotFoundException {
        int index;
        for (index = 0; index < positionInArray; index++) {
            if ((figures[index].checkEquality(source))) {
                break;
            }
            if (index == positionInArray - 1) {
                throw new FigureNotFoundException("Figure that you select didn't exist. Please choose another figure.");
            }
        }
        Cell[] arrayOfMoves = figures[index].way(dist);
        if (arrayOfMoves == null) {
            throw new ImpossibleMoveException("Selected figure can't move that way.");
        }
        for (int indexMoves = 0; indexMoves < arrayOfMoves.length; indexMoves++) {
            for (int indexFigures = 0; indexFigures < positionInArray; indexFigures++) {
                if ((figures[indexFigures].checkEquality(arrayOfMoves[indexMoves]))) {
                    throw new OccupiedWayException("Way of selected figure is blocked.");
                }
            }
        }
        return true;
    }
}
