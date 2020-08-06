package practice;

public class test1 {
	
	
	
	
	public void add(int x, int y) {
		int sum = x+y;
		
		
		if (sum >= 20) {
		boolean x2 = true;
			System.out.println("this is wrong calculation " + sum+" "+  x2);
		}
			else {
				
				System.out.println("this is error ");
				
			}
		}
		
		
	
	
	
	public void sub(int x, int y) {
		int minus = x-y;
		System.out.println(minus);
		
		
	}
	
	public void mult(int x, int y) {
		int mult = x*y;
		System.out.println(mult);
			
	}
	public void did(int x, int y) {
		int div = x/y;
		System.out.println(div);
			
	}
	
	
	
	
	

	public static void main(String[] args) {
		
		test1 b = new test1();
		b.add(10, 20);
		b.sub(10, 20);
		b.mult(2, 5);
		b.did(10, 10);

	}

}
