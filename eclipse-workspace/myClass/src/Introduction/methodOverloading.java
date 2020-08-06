package Introduction;

public class methodOverloading {
	
	//MethodOverloading - when you have multiple methods with same name but different parameters.
	//There are three different way to do overloading 
	
	
	// 1. different number of parameters   

	public void addition(int p )  {//this one has 1 parameter
		int Add = p;
		System.out.println("This is Addition  " + Add);	
	}
	
	
	public void addition(int x, int y) {// this one has 2 parameters
		int Add = x+y;
		System.out.println("This is Addition  " +Add);	
	}
	
	//2. same numbers of parameters but different datatype
		public void addition(double a, double b) {
		double  Add = a+b;
		System.out.println("This is Addition  " + Add);	
		
	
	}
		//3. difference in Sequence and order datatype
		public void addition(int a, double b) {
		double  Add = a+b;
		System.out.println("This is Addition  " + Add);

	}
	
		public void addition(double  a, int b) {
			double  Add = a+b;
			System.out.println("This is Addition  " + Add);	
				
	}
	

		public static void main(String[] args) {
				
				
			methodOverloading abc = new methodOverloading();
			abc.addition(10);
			abc.addition(10, 20);
			abc.addition(20, 30);
			abc.addition(40, 50);
			abc.addition(60, 70);
			
				
				
			}}
