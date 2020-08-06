
public class Calculator_1st_project {

public void Add(int x, int y) {
	int Add = x+y;
	System.out.println("This is Addition  " +Add);	
}
public void  Subtract(int x, int y) {
	int Subtract = x-y;
	System.out.println("This is Subtraction   "  +Subtract);	
}
public void Multi(int x, int y) {
	int Multi = x*y;
	System.out.println("This is Multificaiton  " +Multi);
	
}

public void Divided(double x , double y) {
	
	double Divided = x/y;
	System.out.println("This is Divide   "+Divided);
	
}

public static void main(String[] args) {
	Calculator_1st_project abc = new Calculator_1st_project();
	
	abc.Add(10,20);
	abc.Add(30,40);
	abc.Add(100, 200);
	abc.Subtract(10,20);
	abc.Subtract(30, 50);
	abc.Subtract(5,3);
	abc.Multi(10,20);
	abc.Multi(5,2);
	abc.Multi(6,2);
	abc.Divided(10,10);
	abc.Divided(20,7);
	
}
}
