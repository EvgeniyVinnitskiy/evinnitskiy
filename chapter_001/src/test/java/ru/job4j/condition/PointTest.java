package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Package for poin test.
*
* @author Evgeniy Vinnitskiy (mailto:report-2k8@yandex.ru)
* @version $1.0$
* @since 30.04.2017
*/
public class PointTest {
	/**
	* Test Point.
	*/
    @Test
    public void whenXOneAndYFourThenTrue() {
        Point point = new Point(1, 4);
        assertThat(point.is(3, 1), is(true));
    }
}