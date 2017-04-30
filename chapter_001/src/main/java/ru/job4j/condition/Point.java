package ru.job4j.condition;

 /**
* Класс Point.
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
	* Метод getX.
	* @return x.
	*/
  public int getX() {
      return this.x;
  }
  /**
	* Метод getY.
	* @return y.
	*/
  public int getY() {
     return this.y;
  }
   /**
	* Метод is.
	* @param a first coordinat.
	* @param b second coordinat.
	* @return true or false.
	*/
  public boolean is(int a, int b) {
    return this.y == a * this.x + b;
}
}