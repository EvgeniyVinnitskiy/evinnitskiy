package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Package for desk test.
*
* @author Evgeniy Vinnitskiy (mailto:report-2k8@yandex.ru)
* @version $1.0$
* @since 11.05.2017
*/
public class BoardTest {
   /**
	* Test Board.
	*/
   @Test
    public void whenPaintBoardWithWidthThreeAndHeightThreeThenStringWithThreeColsAndThreeRows() {
        Board board = new Board();
        String result = board.paint(3, 3);
        final String line = System.getProperty("line.separator");
        String expected = String.format("x x%s x %sx x%s", line, line, line);
        assertThat(result, is(expected));
 }
    /**
	* Test Board.
	*/
    @Test
    public void whenPaintBoardWithWidthFiveAndHeightFourThenStringWithFiveColsAndFourRows() {
        Board board = new Board();
        String result = board.paint(5, 4);
        final String line = System.getProperty("line.separator");
        String expected = String.format("x x x%s x x %sx x x%s x x %s", line, line, line, line);
        assertThat(result, is(expected));
  }
}