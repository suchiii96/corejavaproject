package oops;

public class EncapsulationExample {
	
	private int Salary; // by making private you are hiding the variables ,its types etc by accesing it from another classes.
	private String Company;
	private int EmpId;
	
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public String getCompany() {
		return Company;
	}
	public void setCompany(String company) {
		Company = company;
	}
	public int getEmpId() {
		return EmpId;
	}
	public void setEmpId(int empId) {
		EmpId = empId;
	}
	
	

}
