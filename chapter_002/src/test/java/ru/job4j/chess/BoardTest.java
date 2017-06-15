package ru.job4j.chess;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 *@author Nikita Zenkin.
 *@since 14.06.2017.
 *@version 1.
 */
public class BoardTest {
    /**
     * Test method move with correct way.
     */
    @Test
    public void whenMoveBishopWithoutBarrierThenReturnTrueAndReplaceBishop() {
        Figure bishop = new Bishop(1, 1);
        Board board = new Board(bishop);
        Cell moveCell = new Cell(3, 3);
        boolean expected = true;
        boolean result = board.move(bishop.getPosition(), moveCell);
        assertThat(result, is(expected));
    }
    /**
     * Test method move thrown exception Occupied Way.
     */
    @Test(expected = OccupiedWayException.class)
    public void whenMoveBishopWithBarrierThenThrowOccupiedWayException() {
        Figure bishop = new Bishop(5, 5);
        Figure bishopBarrier = new Bishop(3, 3);
        Board board = new Board(bishop);
        board.addFigure(bishopBarrier);
        Cell moveCell = new Cell(2, 2);
        boolean result = board.move(bishop.getPosition(), moveCell);
    }
    /**
     * Test method move thrown exception Figure not found.
     */
    @Test(expected = FigureNotFoundException.class)
    public void whenChooseNotExistingBishopThenThrowFigureNotFoundException() {
        Board board = new Board(new Bishop(4, 4));
        Cell moveCell = new Cell(2, 2);
        boolean result = board.move(new Bishop(3, 3).getPosition(), moveCell);
    }
    /**
     * Test method move thrown exception Impossible move.
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenMoveBishopToNotExistingWayThenThrowImpossibleMoveException() {
        Figure bishop = new Bishop(1, 1);
        Board board = new Board(bishop);
        Cell moveCell = new Cell(3, 2);
        boolean result = board.move(bishop.getPosition(), moveCell);
    }
}
