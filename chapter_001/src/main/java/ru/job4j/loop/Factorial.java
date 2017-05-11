package ru.job4j.loop;

 /**
* Класс Factorial.
* @author Evgeniy Vinnitskiy (mailto:report-2k8@yandex.ru)
* @version $1.0$
* @since 11.05.2017
*/
public class Factorial {
/**
    * Metod public.
    * @param n number
	* @return factorial
    */
	public int calc(int n) {
	int factor = 1;
	if (n == 0) {
		return 1;
		} else {
	for (i = 1; i <= n; i++) {
		factor *= i;
		}
	}
	return factor;
  }
}