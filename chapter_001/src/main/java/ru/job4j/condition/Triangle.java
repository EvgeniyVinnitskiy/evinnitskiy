package ru.job4j.condition;

 /**
* Класс Triangle.
* @author Evgeniy Vinnitskiy (mailto:report-2k8@yandex.ru)
* @version $1.1$
* @since 09.05.2017
*/
public class Triangle {
    /**
     *Point a - the first point of the triangle.
     */
    private Point a;
    /**
    *Point b - the second point of the triangle.
     */
    private Point b;
    /**
     *Point c - the third point of the triangle..
     */
    private Point c;
	 /**
     *Constructor create Triangle(ABC).
     *@param a - the first the triangle point.
     *@param b - the second triangle point.
     *@param c - the third triangle point.
     */
    public Triangle(Point a, Point b, Point c) {
	this.a = a;
	this.b = b;
	this.c = c;
    }
    /**
     *Calculates the length.
     *@param firstPoint - the first point of the side triangle
     *@param secondPoint - the second point of the side triangle
     *@return the length of a side of the triangle.
     */
    public static double lengthSide(Point firstPoint, Point secondPoint) {
	return Math.sqrt(Math.pow(firstPoint.getX() - secondPoint.getX(), 2)
			+ Math.pow(firstPoint.getY() - secondPoint.getY(), 2));
    }
    /**
     *Method calculates the area of a trangle.
     *@return - the area triangle, if triangle does not exist then return -1.
     */
    public double area() {
	double areaTriangle = 0;
	double lengtABSide = Triangle.lengthSide(this.a, this.b);
	double lengtBCSide = Triangle.lengthSide(this.b, this.c);
	double lengtCASide = Triangle.lengthSide(this.c, this.a);
	double halfPerimeter = (lengtABSide + lengtBCSide + lengtCASide) / 2;
	if (lengtABSide < lengtBCSide +  lengtCASide && lengtBCSide < lengtABSide + lengtCASide
		&& lengtCASide < lengtABSide + lengtBCSide) {
	    areaTriangle = Math.sqrt(halfPerimeter * (halfPerimeter - lengtABSide)
				    * (halfPerimeter - lengtBCSide)
				    * (halfPerimeter - lengtCASide));
	} else {
	    areaTriangle = -1;
	}
	return areaTriangle;
    }
}