import java.util.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit; 
public class StudentInfo {

	String firstName; 
	String lastName;
	String middleInitial; 
	int dob_day;  
	int dob_month; 
	int dob_year;
	
	StudentInfo(String fName, String lName, String mInitial, int bMonth, int bDay, int bYear){
		
		this.firstName = fName;
		this.lastName = lName;
		this.middleInitial = mInitial;
		this.dob_month = bMonth;
		this.dob_day = bDay;
		this.dob_year = bYear;
}
	public String getFullName () {
		String fullName = this.firstName + " " + this.lastName;
		return fullName;
}
	public int age () {
		int age = 0;
		LocalDate pdate = LocalDate.of(dob_year, dob_month, dob_day);
		LocalDate now = LocalDate.now();
		
		Period diff = Period.between(pdate, now);
		age = diff.getYears();
		return age;
		
}
	public long elapsedDays ( int y, int m, int d) {
		long days = 0;
		
		LocalDate pdate = LocalDate.of(dob_year, dob_month, dob_day);
		LocalDate now = LocalDate.of(y, m, d);
		days = ChronoUnit.DAYS.between(pdate, now);
		return days;
}
}