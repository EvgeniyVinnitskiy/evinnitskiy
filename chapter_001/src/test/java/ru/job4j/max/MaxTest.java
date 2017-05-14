package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Package for maximum test.
*
* @author Evgeniy Vinnitskiy (mailto:report-2k8@yandex.ru)
* @version $2.0$
* @since 09.05.2017
*/
public class MaxTest {
	/**
	* Test Max.
	*/
    @Test
    public void whenMaxSevenAndTreeThenSeven() {
        Max maximum = new Max();
        int result =  maximum.max(7, 3);
        int expected = 7;
        assertThat(result, is(expected));
    }
	/**
	* Test Maximum of three numbers.
	*/
    @Test
    public void whenMaxThreeAndFiveAndNineThenNine() {
        Max maximum = new Max();
        int result = maximum.max(3, 5, 9);
        int expected = 9;
        assertThat(result, is(expected));
    }
}