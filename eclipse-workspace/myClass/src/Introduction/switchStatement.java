package Introduction;

public class switchStatement {

	public static void main(String[] args) {
		int day = 11;
		switch(day) {// switch statement is an expression
		
		case 1 :
			System.out.println("Today is sunday");
		break; // break the statement, in other word stop the program when match is found...
		
		
		case 2:
			System.out.println("Today is monday");
		break;
		
		
		case 3:
			System.out.println("Today is tuesday");
		break;
		
		
		case 4:
			System.out.println("Today is wednesday");
		break;
		
		
		case 5:
			System.out.println("Today is Thrusday");
		break;
		
		
		case 6:
			System.out.println("Today is Friday");
		break;
		
		
		case 10:
			System.out.println("Today is Saturday");
		break;
		
		
		// if all case fail then do default.
		default : System.out.println("that's not a day of the week");
			
		
			
		
		
		
		
		
		
	}

}}
