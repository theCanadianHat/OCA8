package njh.c3.calendar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/*
	DateTimeFormatter is used to control how dates and times are
	printed. (formatted -- duh)
	There is just one class to use, and you use static methods.
	Both the formatter and the date/time/dateTime objects have a method
	format. Either order will produce the same output given the objects
	don't change.
*/

public class FormattingAndParsingDatesAndTimes {
	public static void main(String[] args) {
		LocalDate date1 = LocalDate.of(2022, 3, 17);
		LocalTime time1 = LocalTime.of(13, 30);
		LocalDateTime dateTime1 = LocalDateTime.of(date1, time1);

		DateTimeFormatter shortDate = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
		DateTimeFormatter shortTime = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
		DateTimeFormatter shortDateTime = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT);

		//these have the same output, since the formatter only cares about dates
		System.out.println(date1.format(shortDate));
		// System.out.println(time1.format(shortDate)); //Throws runtime exception
		System.out.println(shortDate.format(dateTime1));

		// System.out.println(shortTime.format(date1)); //Throws runtime exception
		//same as above, they both print the same due to the formatter only caring about time
		System.out.println(time1.format(shortTime));
		System.out.println(shortTime.format(dateTime1));

		// System.out.println(date1.format(shortDateTime));	//Throws runtime exception
		// System.out.println(shortDateTime.format(time1));	//Throws runtime exception
		System.out.println(dateTime1.format(shortDateTime));

		/*
			FormatStyle is an enum and there a some predefined standards.
			You can make your own formatter.
			M - months
				M - no leading 0 for single digit months
				MM - leading 0 present
				MMM - short month name: Jan, Feb, etc.
				MMMM - long month name: January, February, etc.
			d - days
				d - no leading 0 for single digit days
				dd - leading 0 present
			, - whether a comma is present, sometimes comes after years
			y - years
				yy - two digit year
				yyyy - four digit year
			h - hours
				h - no leading 0 for single digit hours
				hh - leading 0 present
			: - whether a colon is present 
			mm - minutes
				m - no leading 0 for single digit minutes
				mm - leading 0 present
		*/

		DateTimeFormatter custom1 = DateTimeFormatter.ofPattern("MMMM d yy, h:m");
		DateTimeFormatter custom2 = DateTimeFormatter.ofPattern("MMM dd yyyy, hh:mm");

		LocalDateTime myBirthday = LocalDateTime.of(1990, 5, 4, 6, 5);
		System.out.println(custom1.format(myBirthday));
		System.out.println(custom2.format(myBirthday));

		//This is not common but legal
		LocalDate date2 = LocalDate.parse("January 1 00, 4:5", custom1);
		LocalTime time2 = LocalTime.parse("04:05");
		System.out.println(date2);
		System.out.println(time2);
	}
}