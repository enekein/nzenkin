package ru.job4j.strategy;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author Nikita Zenkin.
 * @version 1.
 * @since 08.06.2017.
 */
public class PaintTest {
    /**
     * Test method paint for triangle.
     */
    @Test
    public void whenCreateNewTriangleThenPrintTriangle() {
        String lineSeparator = System.lineSeparator();
        Paint paint = new Paint(new Triangle());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        paint.draw();
        System.out.flush();
        System.setOut(old);
        StringBuilder expected = new StringBuilder();
        expected.append("         ^         ")
                .append(lineSeparator)
                .append("        ^^^        ")
                .append(lineSeparator)
                .append("       ^^^^^       ")
                .append(lineSeparator)
                .append("      ^^^^^^^      ")
                .append(lineSeparator)
                .append("     ^^^^^^^^^     ")
                .append(lineSeparator)
                .append("    ^^^^^^^^^^^    ")
                .append(lineSeparator)
                .append("   ^^^^^^^^^^^^^   ")
                .append(lineSeparator)
                .append("  ^^^^^^^^^^^^^^^  ")
                .append(lineSeparator)
                .append(" ^^^^^^^^^^^^^^^^^ ")
                .append(lineSeparator)
                .append("^^^^^^^^^^^^^^^^^^^")
                .append(lineSeparator);
        assertThat(baos.toString(), is(expected.toString()));
    }
    /**
     * Test method paint for square.
     */
    @Test
    public void whenCreateNewSquareThenPrintSquare() {
        String lineSeparator = System.lineSeparator();
        Paint paint = new Paint(new Square());
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream ps = new PrintStream(baos);
        PrintStream old = System.out;
        System.setOut(ps);
        paint.draw();
        System.out.flush();
        System.setOut(old);
        StringBuilder expected = new StringBuilder();
        expected.append("XXXXXXXXXX")
                .append(lineSeparator)
                .append("XXXXXXXXXX")
                .append(lineSeparator)
                .append("XXXXXXXXXX")
                .append(lineSeparator)
                .append("XXXXXXXXXX")
                .append(lineSeparator)
                .append("XXXXXXXXXX")
                .append(lineSeparator)
                .append("XXXXXXXXXX")
                .append(lineSeparator)
                .append("XXXXXXXXXX")
                .append(lineSeparator)
                .append("XXXXXXXXXX")
                .append(lineSeparator)
                .append("XXXXXXXXXX")
                .append(lineSeparator)
                .append("XXXXXXXXXX")
                .append(lineSeparator);
        assertThat(baos.toString(), is(expected.toString()));
    }
}
