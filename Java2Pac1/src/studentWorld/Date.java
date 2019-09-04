package studentWorld;

import java.util.Calendar;
import java.util.TimeZone;

public class Date {
private int day;
private int month;
private int year;
	
public Date (int d, int m, int y) {
	this.day = d;
	this.month = m;
	this.year = y;
}

public Date (int year) {
	this.day = 1;
	this.month = 1;
	this.year = year;
}

public int calculateAge() {
	Calendar localTime = Calendar.getInstance(TimeZone.getDefault());
	
	int currentDay = localTime.get(Calendar.DATE);
	int currentMonth = localTime.get(Calendar.MONTH);
	int currentYear = localTime.get(Calendar.YEAR);
	
	int age = currentYear - this.year;
	if (currentMonth < this.month) {
		age--;
	} else if (currentMonth == this.month) {
		if (currentDay < this.day) {
			age--;
		}
	}
	return age;
}

public int getDay() {
	return day;
}

public int getMonth() {
	return month;
}

public int getYear() {
	return year;
}

@Override
public String toString() {
	return this.day + dayTermination(this.day) + " of " + writtenMonth(this.month) + " of " + this.year;
}

public String dayTermination(int number) {
	if (this.day == 1) {
		return "st";
	} else if (this.day == 2) {
		return "nd";
	} else if (this.day == 3) {
		return "rd";
	} else if (this.day == 21) {
		return "st";
	} else if (this.day == 22) {
		return "nd";
	} else if (this.day == 23) {
		return "rd";
	} else if (this.day == 31) {
		return "st";
	} else {
		return "th";
	}
}

public String writtenMonth (int number) {
	if (this.month == 1) {
		return "January";
	} else if (this.month == 2) {
		return "February";
	} else if (this.month == 3) {
		return "March";
	} else if (this.month == 4) {
		return "April";
	} else if (this.month == 5) {
		return "May";
	} else if (this.month == 6) {
		return "June";
	} else if (this.month == 7) {
		return "July";
	} else if (this.month == 8) {
		return "August";
	} else if (this.month == 9) {
		return "September";
	} else if (this.month == 10) {
		return "October";
	} else if (this.month == 11) {
		return "November";
	} else if (this.month == 12) {
		return "December";
	} else {
		return "month error";
	}
}

}
