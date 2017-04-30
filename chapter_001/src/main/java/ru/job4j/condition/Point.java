package ru.job4j.condition;

 /**
* ����� Point.
* @author Evgeniy Vinnitskiy (mailto:report-2k8@yandex.ru)
* @version $1.0$
* @since 30.04.2017
*/
public class Point {
	/**
	*Set int x.
	*/
   private int x;
   /**
	*Set int y.
	*/
   private int y;
  /**
	* Set value for Point.
    * @param x first.
	* @param y second.
	*/
  public Point(int x, int y) {
      this.x = x;
      this.y = y;
  }
   /**
	* ����� getX.
	* @return x.
	*/
  public int getX() {
      return this.x;
  }
  /**
	* ����� getY.
	* @return y.
	*/
  public int getY() {
     return this.y;
  }
   /**
	* ����� is.
	* @param a first coordinat.
	* @param b second coordinat.
	* @return true or false.
	*/
  public boolean is(int a, int b) {
    return this.y == a * this.x + b;
}
}