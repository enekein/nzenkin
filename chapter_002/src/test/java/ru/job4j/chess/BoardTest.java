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
     * Test method move for bishop with correct way.
     */
    @Test
    public void whenMoveBishopWithoutBarrierThenReturnTrueAndReplaceBishop() {
        Figure bishop = new Bishop(1, 1);
        Board board = new Board(bishop);
        Cell moveCell = new Cell(3, 3);
        boolean result = board.move(bishop.getPosition(), moveCell);
        assertThat(result, is(true));
    }
    /**
     * Test method move for bishop thrown exception Occupied Way.
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
     * Test method move for bishop thrown exception Figure not found.
     */
    @Test(expected = FigureNotFoundException.class)
    public void whenChooseNotExistingBishopThenThrowFigureNotFoundException() {
        Board board = new Board(new Bishop(4, 4));
        Cell moveCell = new Cell(2, 2);
        boolean result = board.move(new Bishop(3, 3).getPosition(), moveCell);
    }
    /**
     * Test method move for bishop thrown exception Impossible move.
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenMoveBishopToNotExistingWayThenThrowImpossibleMoveException() {
        Figure bishop = new Bishop(1, 1);
        Board board = new Board(bishop);
        Cell moveCell = new Cell(3, 2);
        boolean result = board.move(bishop.getPosition(), moveCell);
    }

    /**
     * Test method move for knight with correct way.
     */
    @Test
    public void whenMoveKnightWithoutBarrierThenReturnTrueAndReplaceKnight() {
        Figure knight = new Knight(1, 1);
        Board board = new Board(knight);
        Cell moveCell = new Cell(3, 2);
        boolean result = board.move(knight.getPosition(), moveCell);
        assertThat(result, is(true));
    }
    /**
     * Test method move for knight thrown exception Occupied Way.
     */
    @Test(expected = OccupiedWayException.class)
    public void whenMoveKnightWithBarrierThenThrowOccupiedWayException() {
        Figure knight = new Knight(1, 1);
        Figure bishopBarrier = new Bishop(3, 2);
        Board board = new Board(knight);
        board.addFigure(bishopBarrier);
        Cell moveCell = new Cell(3, 2);
        boolean result = board.move(knight.getPosition(), moveCell);
    }
    /**
     * Test method move for bishop thrown exception Impossible move.
     */
    @Test(expected = ImpossibleMoveException.class)
    public void whenMoveKnightToNotExistingWayThenThrowImpossibleMoveException() {
        Figure knight = new Knight(1, 1);
        Board board = new Board(knight);
        Cell moveCell = new Cell(4, 2);
        boolean result = board.move(knight.getPosition(), moveCell);
    }

    /**
     * Test method move for pawn with correct way.
     */
    @Test
    public void whenMovePawnWithoutBarrierThenReturnTrueAndReplacePawn() {
        Figure pawn = new Pawn(1, 1);
        Board board = new Board(pawn);
        Cell moveCell = new Cell(1, 2);
        boolean result = board.move(pawn.getPosition(), moveCell);
        assertThat(result, is(true));
    }

    /**
     * Test method move for king with correct way.
     */
    @Test
    public void whenMoveKingWithoutBarrierThenReturnTrueAndReplaceKing() {
        Figure king = new King(1, 1);
        Board board = new Board(king);
        Cell moveCell = new Cell(2, 1);
        boolean result = board.move(king.getPosition(), moveCell);
        assertThat(result, is(true));
    }

    /**
     * Test method move for queen with correct way.
     */
    @Test
    public void whenMoveQueenWithoutBarrierThenReturnTrueAndReplaceQueen() {
        Figure queen = new Queen(1, 1);
        Board board = new Board(queen);
        Cell moveCell = new Cell(7, 7);
        boolean result = board.move(queen.getPosition(), moveCell);
        assertThat(result, is(true));
    }
    /**
     * Test method move for rook with correct way.
     */
    @Test
    public void whenMoveRookWithoutBarrierThenReturnTrueAndReplaceRook() {
        Figure rook = new Rook(1, 1);
        Board board = new Board(rook);
        Cell moveCell = new Cell(7, 1);
        boolean result = board.move(rook.getPosition(), moveCell);
        assertThat(result, is(true));
    }
}
