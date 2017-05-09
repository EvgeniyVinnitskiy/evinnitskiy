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
public class Max {
	/**
	* Test Max.
	*/
    @Test
    public void whenMaxSevenAndTreeThenSeven() {
        Max maxi = new Max();
        maxi.max(7, 3);
        int result = maxi.getResult();
        int expected = 7;
        assertThat(result, is(expected));
    }
	/**
	* Test Maximum of three numbers.
	*/
    @Test
    public void whenMaxThreeAndFiveAndNineThenNine() {
        Max maxi = new Max();
        maxi.max(3, 5, 9);
        int result = maxi.getResult();
        int expected = 9;
        assertThat(result, is(expected));
    }
}