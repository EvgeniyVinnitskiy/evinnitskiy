package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Package for factorial test.
*
* @author Evgeniy Vinnitskiy (mailto:report-2k8@yandex.ru)
* @version $1.0$
* @since 11.05.2017
*/
public class FactorialTest {
	/**
	* Test factorial 5.
	*/
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
       Factorial factorial = new Factorial();
	   int result = factorial.calc(5);
       int expected = 120;
       assertThat(result, is(expected));
    }
	/**
	* Test factorial 0.
	*/
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
       Factorial factorial = new Factorial();
	   int result = factorial.calc(0);
       int expected = 1;
       assertThat(result, is(expected));
    }
}