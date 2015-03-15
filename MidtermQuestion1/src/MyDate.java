public class MyDate {

	public int mdateYear;
	public int mdateMonth;
	public int mdateDay;

	public MyDate(int year, int month, int day) {
		mdateYear = year;
		mdateMonth = month;
		mdateDay = day;
	}

	public void setYear(int newyear) {
		this.mdateYear = newyear;
	}

	public void setMonth(int newmonth) {
		this.mdateMonth = newmonth;
	}

	public void setDay(int newday) {
		this.mdateDay = newday;
	}

	public int getYear() {
		return mdateYear;
	}

	public int getMonth() {
		return mdateMonth;
	}

	public int getDay() {
		return mdateDay;
	}

}
