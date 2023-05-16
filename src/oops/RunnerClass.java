package oops;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Employee emp1 = new Employee(); // here we created object "emp1"of the class
		 * "employee" and new instance of // class is created. emp1.Name = "sweta";
		 * emp1.EmpId = 1000;
		 * 
		 * emp1.DisplayName();
		 * 
		 * Employee emp2 = new Employee(); emp2.Name = "david"; emp2.EmpId = 1001;
		 * 
		 * emp2.DisplayName();
		 * 
		 * Employee emp3 = new Employee("Rohan", 1002); emp3.DisplayName();
		 * 
		 * Employee.DisplaySalary();
		 */

		Citizen ct1 = new Citizen(); // created object of class"citizen" and fetching values from both citizen class
										// and perzson class,as person is child class of citizen.
		ct1.Name = "mike";
		ct1.age = 25;
		ct1.SSN = 12345;
		ct1.CountryName = "India";
		ct1.print();// in this case first it will go to defult cons of parent class person,then
					// defualt of citizen (child of person),then print ssn value.
		// as country name is protected it can only accesible by its mothercalss citizen
		// an its own class person.but as we have created object of citizen it is also
		// acessed in runner class.

		// or person p1= new person(); // you can also create obj of child class
		// person,but yiu can only acess age and name.
		// the fact is that a child class can acess everything parentclass,but an
		// parentclass cant acess what a child class have.
		// p1.age;
		// p1.name;

		Citizen ct2 = new Citizen("rahul", "usa", 29, 12367);
		ct2.print();// here even it is a param const,it will check if there is a defualt const of
					// person(motherclass)and then print param const of citizen class.

		Insurance obj1 = new Insurance();
		obj1.InsuranceId = 3000;
		obj1.SSN = 5678;
		obj1.print();// if even print() method is given in both citizen and insurance class,it will
						// print only method of insurance class. bcz here object is created from
						// insurance class,hence it give perference to its corresponding class.
		obj1.print("hello class");

		HDFC bank = new HDFC();// abstract method example
		bank.print();
		
		EncapsulationExample emp = new EncapsulationExample(); //encaPsulation
		emp.setSalary(5000);               // here we are setting salary ,as our runner class do not know the variables and their datatypes.
		System.out.println("The salary is:" +emp.getSalary());


	}

}
