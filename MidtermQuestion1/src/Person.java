
public class Person {
	
	public String name;
	public String address;
	public double phonen;
	public String email;
	
	//writing both arg and no-arg constructors
	public Person(String Name, String Address, double PhoneNumber, String Email){
		name = Name;
		address = Address;
		phonen = PhoneNumber;
		email = Email;
	}
	
	public Person(){
		name = "noname";
		address = "noaddress";
		phonen = 000000000;
		email = "noemail";
	}
	
	public void setName(String newname){
		this.name = newname;
	}
	
	public String getName(){
		return name;
	}
	
	public void setAddress(String newaddress){
		this.address = newaddress;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setPhoneNumber(double newphonen){
		this.phonen = newphonen;
	}
	
	public double getPhoneNumber(){
		return phonen;
	}
	
	public void setEmail(String newemail){
		this.email = newemail;
	}
	
	public String getEmail(){
		return email;
	}
	
	public String ClassName = this.getClass().getSimpleName();
	
	public String toString(){
		return (this.name + " is a " + ClassName);
	}
	
}
