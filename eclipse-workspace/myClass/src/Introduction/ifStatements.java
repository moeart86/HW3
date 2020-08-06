package Introduction;

public class ifStatements {

	/*Different types of statements in Java:
		 if statement  = In Java if statements evaluates the condition and if the condition is true
		then it will execute the if block.
		
		 if-else statement = In Java if else statements evaluates the condition and if the
		condition is true then it will execute the if block otherwise it will execute the else block.

		 if-else-if statement = When you have multiple conditions and you want to chain them
		together and evaluate them one after another if they are false then you will have to use if-else-if statement.
		
		 nested if statement = IF STATEMENT WITHIN ANOTHER IF STATEMENT- when you
		have multiple true scenarios that you want to evaluate that are depended on each
		other   */
	
	
	public void ifState() {
		
		int grade = 65; //Actual grade.//
		
		if (grade < 95)	// if statement
			
		System.out.println("John failed the test" );
		}
	//if else statement
		public void ifElseStatement (int x, int y) {
			int Add = x+y;// 5+7
			if (Add<20) {
			System.out.println("Error");	
		}
		else 
		{
		  System.out.println("This is Addition  " +Add);
		    	}
		}
		//if else if statement 
		public void ifElseIf () {
			int grade = 65; 
			
			if (grade > 95) {
				
				System.out.println("Bhai got an A+");
		}
				
			else if (grade > 90 && grade <= 95) {
				System.out.println("Bhai got  A");
		}
			
			else if (grade > 85 && grade <  90) {
				System.out.println("Bhai got  A-");
					
		}
			
			else if (grade < 85 && grade > 80) {
				System.out.println("Bhai got  B+");
			
		}
			
			else if (grade < 80 && grade > 79.5) {
				System.out.println("Bhai got  B");
		}
			
			else if (grade < 79.5 && grade > 74) {
				System.out.println("Bhai got  B-");
		}
			
			else if (grade > 74 && grade >= 65) {
				System.out.println("Bhai got  C");
		}
			
			else {
				System.out.println("I failed And got a F");}
			}
		
		/*if Bob does all his homework, gets over 65
		 * attend all the classes and behave the he passes the class
		 * 
		 * 
		 * 
		 */
		public void nestedIf () {
			
			int hw = 9; // had total of 9 homework and did all 9.
			int exam = 79;
			int attendance = 10; // he had total of 10 classes and he attended all the 10 classes.
			int be = 10;
			
			if ( hw== 9 && exam >65 && attendance == 9 && be == 10 ) {
				
				//if(exam > 65) {
					
					//if (attendance == 9) {
						
						//if (be == 10) {
							
							System.out.println("Bob passed the class");
					}
						else {
							System.out.println("Bob failed the class");
						}
						
				}
				
	
	public static void main(String[] args) {
		ifStatements ab = new ifStatements();
		ab.ifState();// if statement 
		ab.ifElseStatement(5,7);
		ab.ifElseIf();
		ab.nestedIf();
		
		
		

	}

}
