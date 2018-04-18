/*
 * @project Exercise8
 * @author  Osbardo Rodriguez
 * Date:    4/3/18
 */
package Exercise6;

public class Date {
	private int month; // 1-12
	private int day; // 1-31
	private int year; // any year

	private static final int[] daysPerMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public Date( int month, int day, int year ) {

		// check if the month is in range
		if ( month <= 0 || month > 12 ) {
			throw new IllegalArgumentException( "Month (" + month + ") must be 1-12." );
		}

		// check if day in range for months
		if ( day <= 0 || ( day > daysPerMonth[month] && !( month == 2 && day == 29 ) ) ) {
			throw new IllegalArgumentException( "Day (" + day + ") out of range for the specified month and year." );
		}

		// check for leap year if month is 2 and day is 29
		if ( month == 2 && day == 29 && ! ( year % 400 == 0 || ( year % 4 == 0 && year % 100 != 0 ) ) ) {
			throw new IllegalArgumentException( "Day (" + day + ") out of range for the specified month and year." );
		}

		this.month = month;
		this.day   = day;
		this.year  = year;
	}

	public String toString() {
		return String.format( "%d/%d/%d", month, day, year );
	}
}
