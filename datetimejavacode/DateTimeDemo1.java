package datetimejavacode;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.TimeZone;

public class DateTimeDemo1 {

	public static void main(String[] args) {
		// Instant instant = Instant.now();
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now.format(dtf));
		ZonedDateTime zdt = now.atZone(ZoneId.systemDefault());
		System.out.println(zdt.format(dtf));
	}

}
