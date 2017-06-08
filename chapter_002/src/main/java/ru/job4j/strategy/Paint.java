package ru.job4j.strategy;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 08.06.2017.
 */
public class Paint {
    /**
     * Instance of Shape.
     */
    private Shape shape;

    /**
     * Constructor.
     * @param shape Shape.
     */
    public Paint(Shape shape) {
        this.shape = shape;
    }

    /**
     * Paint figure.
     */
    public void draw() {
        System.out.print(shape.pic());
    }
}
