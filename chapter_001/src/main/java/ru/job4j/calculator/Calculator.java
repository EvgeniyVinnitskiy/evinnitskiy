package ru.job4j.calculator;
/**
* Package for calculate task.
*
* @author Evgeniy Vinnitskiy (mailto:report-2k8@yandex.ru)
* @version $1.0$
* @since 28.04.2017
*/
public class Calculator {
	/**
     * Metod private.
     * @param result result.
     */
    private double result;
    /**
	* Add.
	* @param first first number
	* @param second second number
	*/
    public void add(double first, double second) {
        this.result = first + second;
    }
	  /**
	* Substruct.
	* @param first first number
	* @param second second number
	*/
	 public void substruct(double first, double second) {
        this.result = first - second;
    }
      /**
	* Divide.
	* @param first first number
	* @param second second number
	*/
	public void div(double first, double second) {
        this.result = first / second;
    }
	  /**
	* Multiple.
	* @param first first number
	* @param second second number
	*/
	public void multiple(double first, double second) {
        this.result = first * second;
    }
	/**
     * Metod private.
     * @return this.result result.
     */
	public double getResult() {
        return this.result;
    }
}