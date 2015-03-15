public class Employee extends Person {

	public String office;
	public double salary;
	public MyDate dateHired;

	// Employee adds three new fields Office Salary and DateHired
	// writing both arg and no-arg constructors
	public Employee(String Name, String Address, double PhoneNumber,
			String Email, String Office, double Salary, MyDate DateHired) {
		super(Name, Address, PhoneNumber, Email);
		office = Office;
		salary = Salary;
		dateHired = DateHired;
	}

	public MyDate stockdate = new MyDate(0000, 00, 00);

	public Employee() {
		name = "noname";
		address = "noaddress";
		phonen = 000000000;
		email = "noemail";
		office = "nooffice";
		salary = 0;
		dateHired = stockdate;
	}

	// Employee adds getters and setters for office salary and date hired

	public void setOffice(String newoffice) {
		this.office = newoffice;
	}

	public void setSalary(double newsalary) {
		this.salary = newsalary;
	}

	public void setHireDate(MyDate newdate) {
		this.dateHired = newdate;
	}

	public String getOffice() {
		return office;
	}

	public double getSalary() {
		return salary;
	}

	public MyDate getHireDate() {
		return dateHired;
	}
	
	public String toString(){
		return (this.name + " is a " + ClassName);
	}
	
}
