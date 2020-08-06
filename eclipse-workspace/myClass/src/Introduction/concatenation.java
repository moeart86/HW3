package Introduction;

public class concatenation {
	/*
	 * String concatenation = Any time you are using the (+) operate to connect 2 or
	 * more string into single string. plus(+) minus (-) mult (*) Division (/)
	 * Reminder(%) ex 5/2 = 1
	 */

	public static void main(String[] args) {
		String bb = "I am from Bangladesh"; // the size of the code after variable value is 20;

		int size = bb.length();// this code will give you the length of the string (bb) in other word how many
								// character.

		String fname = "Mohin";
		String mname = "Art";
		String lname = "Khan";

		System.out.println("The length of the string bb is:  " + size + " and  " + bb);// this will print the total size
																						// of bb and result.

		// concat() = this is a concat() method
		System.out.println("My name is ".concat(fname).concat(" ").concat(mname).concat(" ").concat(lname));
		String A ="my name is mohin";

		int length = A.length();
		System.out.println( length + "   "+ A );
		
		String Fname = "U";
		String Mname = "D";
		String Lname = "I";
		
		
		
		
		String Dc = " I live in Germantwon";

			int live = Dc.length();
			System.out.println(live+ "   "+ Dc);
			System.out.println("My name is ".concat(Fname).concat(" ").concat(Mname).concat(" ").concat(Lname));
			
			
			
			
			
			String USA = "I am from USA";
			int  size1 = USA.length();
			System.out.println("The length of the string:  " + size1 +   " and "+ USA);
			
			
	}
	
	

}
 