package oops;

public abstract class BankExample {

	public int AccountNo;

	// an abstract method
	public abstract void getBalance();// by using "abstract" you dont need a full body({).bcz this implemention will
										// done by child class.
	// and if u make a methos abstract,you should make the class also abstract.

	// an non abstract method
	public void print() {

	}

}
