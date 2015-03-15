public class Staff extends Employee {

	private String staffTitle;

	// Staff adds a staff title constructor field.
	//writing both arg and no-arg constructors
	public Staff(String Name, String Address, double PhoneNumber, String Email,
			String Office, double Salary, MyDate DateHired, String StaffTitle) {
		super(Name, Address, PhoneNumber, Email, Office, Salary, DateHired);
		staffTitle = StaffTitle;
	}
	
	public Staff(){
		name = "noname";
		address = "noaddress";
		phonen = 000000000;
		email = "noemail";
		office = "nooffice";
		salary = 0;
		dateHired = stockdate;
		staffTitle = "notitle";
	}
	
	//Staff adds a getter and setter for Title.
	
	public void setTitle(String newtitle){
		this.staffTitle = newtitle;
	}
	
	public String getTitle(){
		return staffTitle;
	}
	
	public String toString(){
		return (this.name + " is a " + ClassName);
	}
}
