package cse222.proje;

public class Date implements Comparable<Date>{
	/**
	 * Holds the day
	 */
	private int day;
	/**
	 * Holds the month
	 */
	private int month;
	/**
	 * Holds the year
	 */
	private int year;
	/**
	 * Holds time
	 */
	private double time;
	
	
	
	public Date(int day, int month, int year, double time) {
		this.day = day;
		this.month = month;
		this.year = year;
		this.time = time;
	}

	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}

	/**
	 * Compare two date according to year, month, day, time in order
	 * @param o will be compared
	 * @return if given date is less return 1,  if given date is greater return -1, otherwise 0
	 */
	@Override
	public int compareTo(Date o) {

		if (this.year > o.year)
			return 1;
		else if (this.year < o.year)
			return -1;

		if (this.month > o.month)
			return 1;
		else if (this.month < o.month)
			return -1;

		if (this.day > o.day)
			return 1;
		else if (this.day < o.day)
			return -1;

		if (this.time > o.time)
			return 1;
		else if (this.time < o.time)
			return -1;

		return 0;
	}

	/**
	 * Return Date Information as a String
	 * @return Date Information as a String
	 */
	@Override
	public String toString() {
		return "Date: " + day + "." + month + "." + year + " Time: " + time;
	}

}
