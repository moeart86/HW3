package Introduction;

public class Encapsulation1 {
	// Encapsulation, is to make sure that "sensitive" data is hidden from users.
	
	
	private int age;
	private String name;
	
	
	
	public void setName(String newName) {
		name = newName;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAge(int newAge) {
		age = newAge;
		
	}

	public int getAge() {
		return age;
	}
	
	
	
	
		public static void main(String[] args) {
		
		Encapsulation1 abc = new Encapsulation1();
		
		abc.setAge(34);
		abc.setName("Mohin");
				
		
		System.out.println(abc.getAge());
		System.out.println(abc.getName());
		
		
	}

}
