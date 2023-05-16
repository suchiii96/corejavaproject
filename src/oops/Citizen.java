package oops;

public class Citizen extends Person {
	public int SSN;

	public Citizen() {
		super();// you cant put super in normalmethod,only inside a  constructor.
		System.out.println("inside defualt cons of citizen");

	}

	public Citizen(String Name, String CountryName, int age, int SSN) {
		super();
		System.out.println("inside para cons of citizen");

		this.Name = Name;
		this.CountryName = CountryName;
		this.age = age;
		this.SSN = SSN;

		// System.out.println("Name is : " + Name);
		// System.out.println("CountryName : " + CountryName);
		// System.out.println("age : " + age);
		// System.out.println("SSN: " + SSN);

	}

	public void print() {
		System.out.println("SSN is : " + SSN);

	}
}
