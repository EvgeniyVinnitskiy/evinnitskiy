package ru.job4j.condition;

import org.junit.Test;
import static org.junit.Assert.assertThat;
import static org.hamcrest.number.IsCloseTo.closeTo;
 /**
* Task for TriangleTest.
* @author Evgeniy Vinnitskiy (mailto:report-2k8@yandex.ru)
* @version $1.0$
* @since 09.05.2017
*/
public class TriangleTest {
    /**
     *Test for method "area".
     *Tested the result of the  method "area" for the triangle by three Point(x,y): a(2,2), b(1,1), c(3,1).
     *The exepted result is 1.
     */
    @Test
    public void whenAreaThenOne() {
    Point a = new Point(2, 2);
	Point b = new Point(1, 1);
	Point c = new Point(3, 1);
	Triangle triangle = new Triangle(a, b, c);
    double result = triangle.area();
    double expected = 1D;
	assertThat(result, closeTo(expected, 0.01));
    }
     /**
     *Test for method "area".
     *Tested the result of the  method "area"  for the triangle by three Point(x,y): a(1,0), b(0, 0), c(2, 0).
     *Triangle does not exist.
     *The exepted result is -1.
     */
    @Test
    public void whenAreaThenMinusOne() {
    Point a = new Point(1, 0);
	Point b = new Point(0, 0);
	Point c = new Point(2, 0);
	Triangle triangle = new Triangle(a, b, c);
    double result = triangle.area();
    double expected = -1D;
	assertThat(result, closeTo(expected, 0.01));
    }
    /**
     *Test for method "lengthSide".
     *Tested the result of the  method "lengthSide"  by two Point(x,y): a(0,0), b(4, 0).
     *The exepted result is 4.
     */
    @Test
    public void whenLengthSideFirstPointZeroAndZeroSecondPointFourAndZeroThenFour() {
    Point a = new Point(0, 0);
	Point b = new Point(4, 0);
	double result = Triangle.lengthSide(a, b);
    double expected = 4D;
	assertThat(result, closeTo(expected, 0.01));
    }
}