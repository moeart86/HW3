package practice;

public class Overloading {
	//method overloading is when you have multiple same method name but different parameters. 
	//three types of methods overloading 
	//1 different number of parameter 
	// 2 same number of parameter but different datatypes
	//3 different sequence and order datatype 

	
	public void add(int x , int y) {
		int sum = x+y;
		System.out.println(sum);
	}
	public void add(double x , double y) {
		double sum = x+y;
		System.out.println(sum);
	}
	public void add(int x , double y) {
		double additional = x+y;
		System.out.println(additional);
	
		
		
	}
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		Overloading ab = new Overloading();
		ab.add(10, 20);
		ab.add(20, 30);
		ab.add(30, 40);
		

	}

}
