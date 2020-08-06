package practice;

public class Encap {

	public static void main(String[] args) {
		Encaspsulation S = new Encaspsulation();

		S.setName("Mohin");
		S.setAge(30);
		S.setdateOfBirth(1986);
		S.setName2("khan");

		System.out.println(S.getName());
		System.out.println(S.getAge());
		System.out.println(S.getdateOfBirth());
		System.out.println(S.getName2());

	}
}