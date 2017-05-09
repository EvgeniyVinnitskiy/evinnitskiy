package ru.job4j.loop;

 /**
* КЉласс Counter.
* @author Evgeniy Vinnitskiy (mailto:report-2k8@yandex.ru)
* @version $1.0$
* @since 09.05.2017
*/
public class Counter {
/**
    * Metod public.
    * @param start first number
	* @param finish second number
	* @return sum
    */
	public int add(int start, int finish) {
	int sumChet = 0;
	for (i = start; i <= finish; i++) {
		if (i % 2 == 0) {
		sumChet = sumChet + i;
		}
	}
	return sumChet;
  }
}