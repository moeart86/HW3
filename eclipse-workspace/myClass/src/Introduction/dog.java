package Introduction;

public class dog extends polymorphsim{
	
	

	public void animalsound() {
		
		System.out.println("the pig say bow bow");
	
	

	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		polymorphsim myAnimal = new polymorphsim();
		polymorphsim myPig = new pig();
		polymorphsim myDog = new dog();
		
		myAnimal.animalsound();
		myPig.animalsound();
		myDog.animalsound();
	}

}
