package datetime;
import java.time.*;
import java.time.format.DateTimeFormatter;

// this is available after java 8 Earlier the package was gregorian calender 
public class dateTimeEx {
public static void main(String[]args) {
	LocalDate d = LocalDate.now();
	System.out.println(d);
	
	LocalTime t = LocalTime.now();
	System.out.println(t);
	
	LocalDateTime dt = LocalDateTime.now();
	System.out.println(dt);
	
	
	
	System.out.println(dt.getDayOfMonth());
	System.out.println(dt.getHour());
	System.out.println(dt.getDayOfWeek().name());
	System.out.println(dt.getDayOfWeek().ordinal());
	
	DayOfWeek day = dt.getDayOfWeek();
	System.out.println(day == DayOfWeek.WEDNESDAY);
	
//	Date timeformatter is used to convert dat to stringin different formats
	DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM//yyyy");
	System.out.println(dt.format(df));
	String strdate = dt.format(df);
	
	System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE));
	
	
//	strdate (date in string format) into LocalDate,LocalDateTime
//	String to date ,string to datetime
	
	System.out.println("Convert a Date in iso-standard format to String for that pattern not needed:");
	LocalDate dt1 = LocalDate.parse("2022-11-09");
	
	System.out.println("after converting to date:"+dt1);
	
	System.out.println("Date in non-iso-standard string format is:"+strdate);
	DateTimeFormatter patt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	System.out.println(LocalDate.parse(strdate,patt));
	
	String strdtime = "11/09/2022 03:10";
	System.out.println("DateTime in non-iso-standard string format is:"+strdtime);
	patt = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm");
	System.out.println(LocalDateTime.parse(strdtime,patt));
	// LocalDateTime ob = LocalDateTime.parse(strdtime,patt);
}
}
