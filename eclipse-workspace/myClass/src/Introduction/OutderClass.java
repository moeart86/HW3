package Introduction;


class OuterClass{
	
	int x = 10;
	
	
	
	   class  InnerClass {
		   public int myInnerMethod() {
			      return x;
		
		   
	}
	
	
}
}

public class OutderClass {
	
// it is  a class that define inside the body of another class. 
// outer class this class is not nested but maybe has a nested class as a member 
//outer class can be public or package private 
// 4 types of nested class 
// static nested class 
//non-static nested class( inner class)
//Local Inner class(non static nested class
//Anonymous class (local inner class without a name
	
	
	
		public static void main(String[] args) {
		OuterClass a = new OuterClass(); // access print outer class create an object 	
		OuterClass.InnerClass b = a.new InnerClass();//To access the inner class, create an object of outer class 
		System.out.println(b.myInnerMethod() );
			//and then create an object of the inner class:
			//System.out.println(a.x + b.y);
			
			//System.out.println(c.y);// statci 
			
			
			
		
		
		
		}}
		// TODO Auto-generated method stub

	


