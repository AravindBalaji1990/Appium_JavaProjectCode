package Demo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateAndTime {

	public static void main(String[] args) throws ParseException {
		String sample = "05/08/2018";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
		Date test = simpleDateFormat.parse(sample);
		System.out.println(test);

		Calendar cal = Calendar.getInstance();
		cal.setTime(test);
		cal.add(Calendar.DATE, 330);

		Date newdate = cal.getTime();
		System.out.println(newdate);

	}

}
