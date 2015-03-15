public class Faculty extends Employee {

	private String officeHours;
	private String rank;

	// Faculty adds two new fields, office hours and rank
	// writing both arg and no-arg construcots

	public Faculty(String Name, String Address, double PhoneNumber,
			String Email, String Office, double Salary, MyDate DateHired,
			String OfficeHours, String Rank) {
		super(Name, Address, PhoneNumber, Email, Office, Salary, DateHired);
		officeHours = OfficeHours;
		rank = Rank;
		}

	public Faculty(){
		name = "noname";
		address = "noaddress";
		phonen = 000000000;
		email = "noemail";
		office = "nooffice";
		salary = 0;
		dateHired = stockdate;
		officeHours = "0:00 - 0:00";
		rank = "norank";
	}
	
	//Faculty adds getters and setters for office hours and rank
	
	public void setOfficeHours(String newhours){
		this.officeHours = newhours;
	}
	
	public void setRank(String newrank){
		this.rank = newrank;
	}
	
	public String getOfficeHours(){
		return officeHours;
	}
	
	public String getRank(){
		return rank;
	}
	
	@Override
	public String toString(){
		return (this.name + " is a " + ClassName);
	}
	
	
}
