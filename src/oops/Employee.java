package oops;

public class Employee {

	public String Name; // these are the properties of class "employee"
	public int EmpId;
	private static int Salary = 50000; // as value is made private it is accesible only inside the class,but making it
										// as "private static" it is avialble across all class.
// public static int salary=5000;// if you make this as public you can directly change your salry from amin class by "employee.salary=6000;"
	// default constructor

	public Employee() {

		System.out.println("inside default cons");
	}

//parametrized constructor
	public Employee(String Name, int EmpId) {// this is constructor. it have same name as class name and doesnt return
												// any value.
		System.out.println("inside parameter cons");
		this.Name = Name; // "this" refers the class which you are belong.
		this.EmpId = EmpId;// "this.empid" refers to class and "empid" refers to the argument.

		// or in simple way //public Employee(String var1 , int var2) {
		// System.out.println("inside parameter cons");
		// Name = var1; //
		// EmpId = var2;
	}

	public void DisplayName() { // this is the functionality of the class.
		
		System.out.println("Name of the employee is " + Name);
		
	
	}

	public static void DisplaySalary() {// since displaysalary is static methods you can simply call this method by
										// class name.method in main class (ie,employee.displaysalary)
		System.out.println("Salary of all employee  is " + Salary);
	}

}
