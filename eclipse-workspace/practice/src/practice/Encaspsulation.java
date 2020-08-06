package practice;

// Encapsulation =  is mechanism  of  binding code and data together in a single unit. 
// to access hidden data which is in private you use setter and getter methods.
public class Encaspsulation {

	private String name;

	private int age;

	private int dateOfBirth;

	private String lastName;

	public void setName(String Newname) {
		name = Newname;
	}

	public String getName() {
		return name;
	}

	public void setAge(int Newage) {
		age = Newage;
	}

	public int getAge() {
		return age;
	}

	public void setdateOfBirth(int Birth) {

		dateOfBirth = Birth;
	}

	public int getdateOfBirth() {
		return dateOfBirth;


	}

	public void setName2(String Newlastname) {
		lastName = Newlastname;
	}

	public String getName2() {
		return lastName;
	}
}
