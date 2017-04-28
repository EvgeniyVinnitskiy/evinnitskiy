package ru.job4j.calculator;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
* Package for calculate test.
*
* @author Evgeniy Vinnitskiy (mailto:report-2k8@yandex.ru)
* @version $1.0$
* @since 28.04.2017
*/
public class CalculatorTest {
	/**
	* Test Add.
	*/
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	/**
	* Test Substruct.
	*/
	 @Test
    public void whenSubstructTwoMinusOneThenOne() {
        Calculator calc = new Calculator();
        calc.add(2D, 1D);
        double result = calc.getResult();
        double expected = 1D;
        assertThat(result, is(expected));
    }
	/**
	* Test Divide.
	*/
	 @Test
    public void whenDivFourDivideTwoThenTwo() {
        Calculator calc = new Calculator();
        calc.add(4D, 2D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
	/**
	* Test Multiple.
	*/
	 @Test
    public void whenMultipleTwoMultipleOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(2D, 1D);
        double result = calc.getResult();
        double expected = 2D;
        assertThat(result, is(expected));
    }
}