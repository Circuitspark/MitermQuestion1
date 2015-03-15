public class Student extends Person {

	private final String Freshman = "Freshman";
	private final String Sophomore = "Sophomore";
	private final String Junior = "Juior";
	private final String Senior = "Senior";
	
	public String gradeyear;
	
	//Student adds gradeyear constructor field
	//writing both arg and no-arg constructors
	public Student(String Name, String Address, double PhoneNumber, String Email, String YearStatus){
		super(Name, Address, PhoneNumber, Email);
		gradeyear = YearStatus;
	}
	
	public Student(){
		name = "noname";
		address = "noaddress";
		phonen = 000000000;
		email = "noemail";
		gradeyear = Freshman;
	}
	
	//Student adds one set of getters/setters for new field
	public void setGradeYear(String newyear){
		this.gradeyear = newyear;
	}
	
	public String getGradeYear(){
		return gradeyear;
	}
	
	public String toString(){
		return (this.name + " is a " + ClassName);
	}

}