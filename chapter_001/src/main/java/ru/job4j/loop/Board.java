package ru.job4j.loop;

 /**
* Класс Board.
* @author Evgeniy Vinnitskiy (mailto:report-2k8@yandex.ru)
* @version $1.0$
* @since 11.05.2017
*/
public class Board {
/**
    * Metod public.
    * @param width - width
	* @param height - height
	* @return desk
    */
   public String paint(int width, int height) {
      StringBuilder builder = new StringBuilder();
      for (int i = 0; i < height; i++) {
        for (int j = 0; j < width; j++) {
          if ((i + j) % 2 == 0) {
	        builder.append("x");
		  } else {
            builder.append(" ");
        builder.append("\r\n");
	  }
    }
	return builder.toString();
   }
  }
}