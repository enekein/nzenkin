package ru.job4j.chess;

/**
 *@author Nikita Zenkin.
 *@since 14.06.2017.
 *@version 1.
 */
public class OccupiedWayException extends RuntimeException {
    /**
     * Exception for unexpected move.
     * @param msg String.
     */
    public OccupiedWayException(String msg) {
        super(msg);
    }
}
