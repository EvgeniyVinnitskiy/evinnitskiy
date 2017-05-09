package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Package for counter test.
*
* @author Evgeniy Vinnitskiy (mailto:report-2k8@yandex.ru)
* @version $1.0$
* @since 09.05.2017
*/
public class CounterTest {
	/**
	* Test Sum.
	*/
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
       Counter counter = new Counter();
	   counter.add(1, 10);
	   int result = counter.add();
       int expected = 30;
       assertThat(result, is(expected));
    }
}