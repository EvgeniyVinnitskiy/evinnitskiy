package ru.job4j.max;
/**
* Package for maximum.
*
* @author Evgeniy Vinnitskiy (mailto:report-2k8@yandex.ru)
* @version $2.0$
* @since 09.05.2017
*/
public class Max {
	/**
    * Metod public.
    * @param first first number
	* @param second second number
	* @return maximum
     */
    public int max(int first, int second) {
    return first > second ? first : second;
    }
	/**
    * Metod public.
    * @param first first number
	* @param second second number
	* @param third third number
	* @return maximum
     */
	public int max(int first, int second, int third) {
	return max(first, max(second, third));
	}
}