package oops;

public class Insurance extends Citizen {

	public int InsuranceId;

	public Insurance() {
		 super(); //default constructor of super.it willcall parent class default constructor.generally it indicates that it will call defualt const.of parent class.
		// const.
		System.out.println("inside default constructor of insurance");
	}

	public void print() {
		super.print();// super is the immediate parent.(citizen class).this is done for printiing SSN
						// in citizen class."super"should only use when u have a parent class.this is super with parenthisis and will call parent class constructor with or without value you given.
		System.out.println("Insurance Id is : " + InsuranceId);
		

	}
	public void print(String message) { // method overloading
		System.out.println("Typing some message : " + message );
	}

}
