package Task_03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task_02_07 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  String string = "2017-07-25";
	        LocalDate date = LocalDate.parse(string, DateTimeFormatter.ISO_DATE);

	        System.out.println(date);

	}

}
