package njh.c3.calendar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.Month;

/*
	Using Date and Times the Java 8 way!

	LocalDate is just a date.
	LocalTime is just a time.
	LocalDateTime is both date and time.

	DO NOT USE CONSTRUCTORS
*/

public class UsingDatesAndTimes{
	public static void main(String[] args) {
		System.out.println(LocalDate.now()); //just today's date in yyyy-mm-dd
		System.out.println(LocalTime.now()); //current time in hh:mm:ss
		System.out.println(LocalDateTime.now()); //today's date and time using above format

		/*
			public static LocalDate of(int year, int month, int dayOfMonth)
			public static LocalDate of(int year, Month month, int dayOfMonth)
			Both return a LocalDate with the year, month, and day of the month
			set accordingly.
		*/
		LocalDate myBirthday = LocalDate.of(1990, Month.MAY, 4);
		//May is the 5th month
		LocalDate sarahsBirthday = LocalDate.of(1988, 5, 23);
		System.out.println(myBirthday);				//1990-05-04
		System.out.println(sarahsBirthday);		//1988-05-23

		/*
			public static LocalTime of(int hour, int minute)
			public static LocalTime of(int hour, int minute, int second)
			public static LocalTime of(int hour, int minute, int second, int nanos)
			You can be as specific as you want with time. At the least there must be
			a hours and minutes set.
		*/
		LocalTime morning = LocalTime.of(6, 30);
		LocalTime afternoon = LocalTime.of(14, 15, 39);
		LocalTime night = LocalTime.of(20, 43, 42, 450_000_000);
		System.out.println(morning);		//6:30
		System.out.println(afternoon);	//14:15:39
		System.out.println(night);			//20:43:42:.450

		/*
			public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute)
			public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second)
			public static LocalDateTime of(int year, int month, int dayOfMonth, int hour, int minute, int second, int nanos)
			public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute)
			public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second)
			public static LocalDateTime of(int year, Month month, int dayOfMonth, int hour, int minute, int second, int nanos)
			public static LocalDateTime of(LocalDate date, LocalTime time)
			Combine LocalDate and LocalTime to get a single object.
		*/
		LocalDateTime myBirthdayMorning = LocalDateTime.of(1990, 5, 4, 6, 30);
		LocalDateTime sarahsBirthdayAfternoon = LocalDateTime.of(1988, Month.MAY, 23, 12, 30, 15, 432_534_643);
		//1990-05-04T06:30
		//1988-05-23T12:30:15.432534643
		LocalDateTime currentDateAndTime = LocalDateTime.of(LocalDate.now(), LocalTime.now());
		System.out.println(myBirthdayMorning);
		System.out.println(sarahsBirthdayAfternoon);
		System.out.println(currentDateAndTime);

		/*
			Methods for LocalDate
			You can add or subtract days, weeks, months, or years.
		*/
		System.out.println("My birthday: " + myBirthday);
		System.out.println("Two days before my birthday: " + myBirthday.minusDays(2));
		System.out.println("Two weeks past my birthday: " + myBirthday.plusWeeks(2));
		System.out.println("Two months before my birthday: " + myBirthday.minusDays(2));
		System.out.println("Two years past my birthday: " + myBirthday.plusYears(2));

		/*
			Like LocalDate, LocalTime has similar methods that correspond to
			the different parts of LocalTime; hours, minutes, seconds, nanos
		*/
		LocalTime noon = LocalTime.of(12, 0);
		System.out.println("High Noon: " + noon);
		System.out.println("Two hours before my high noon: " + noon.minusHours(2));
		System.out.println("Two minutes past my high noon: " + noon.plusMinutes(2));
		System.out.println("Two seconds before my high noon: " + noon.minusSeconds(2));
		System.out.println("Two nanoseconds past my high noon: " + noon.plusNanos(2));

		/*
			You can use any combination of these for LocalDateTime. You can also chain them
			since all of these methods return a reference.
		*/
		LocalDateTime noonOnMyBirthday = LocalDateTime.of(myBirthday, noon);
		System.out.println("Go back in time 2 weeks, 4 years, 7 hours, and 11 nanoseconds from noon on your birthday. (" + noonOnMyBirthday + ")");
		System.out.println("Got it! " + noonOnMyBirthday.minusWeeks(2).minusYears(4).minusHours(7).minusNanos(11));
	}
}