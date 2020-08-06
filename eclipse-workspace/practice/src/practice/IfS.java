package practice;




//if statement when you evaluate the if statement and if the statement is true will execute

//if else statement when you evaluate the if statement and if the condition is true it will execute the if statement or it execute the else.

//if else if statement is when you have multiple condition and you chained them together and evaluate them one after another if they are
//false then you use if else if statement. 


//nested statement is when you have multiples true scenarios that you want to evaluate which are depends of each other

public class IfS {

	public static void main(String[] args) {
		String fname = "mohin";
		String  lname = "uddin";
		int age = 34;
		
		if(fname == "mohin") {
			if(lname == "uddin") {
				if(age==34) {
					System.out.println("this is the right person");
				}
				else {
					System.out.println("this is the wrong person");
				}
			}
		}
		
		
		
		
	
}}