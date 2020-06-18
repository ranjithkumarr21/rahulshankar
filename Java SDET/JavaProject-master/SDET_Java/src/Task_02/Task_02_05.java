package Task_02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Task_02_05 {

	public static void main(String[] args) throws ParseException {
		String time1 = "16:00:00";
		String time2 = "19:00:00";

		SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
		Date date1 = format.parse(time1);
		Date date2 = format.parse(time2);
		long difference = date2.getTime() - date1.getTime(); 
		long differnceInSecond=difference/1000;
		System.out.println("Difference in Seconds : "+differnceInSecond);


	}

}
