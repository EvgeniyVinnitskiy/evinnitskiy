package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Package for maximum test.
*
* @author Evgeniy Vinnitskiy (mailto:report-2k8@yandex.ru)
* @version $1.0$
* @since 29.04.2017
*/
public class Max {
	/**
	* Test Max.
	*/
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Max maxi = new Max();
        maxi.max(7, 3);
        int result = maxi.getResult();
        int expected = 7;
        assertThat(result, is(expected));
    }
}