package practice;

public class Switch {
	//switch is an expression 
	// break is to break the code 

	public static void main(String[] args) {
		
		
		int days = 1;
		
		switch (days) {
		
		case 1 :
		 System.out.println("Monday");
		 
		break;
		
		case 2 :
			 System.out.println("tuesday");
				break;
		case 3 :
			 System.out.println("Wednesday");
				break;
		case 4 :
			 System.out.println("thrusday");
				break;
		case 5 :
			 System.out.println("friday");
				break;
		case 6 :
			 System.out.println("saturday");
				break;
		case 7 :
			 System.out.println("sunday");
				break;
				
				default : 
					System.out.println("this is not a day");
		 
		 
		 
		}
	}

}
