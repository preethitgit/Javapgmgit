package org.demo;

public class Employee {

	private void empId() {
		System.out.println("Employee Id is 01");

	}
	private void empName() {
		System.out.println("Employee Name is Preethi");

	}
	
	private void empDob() {
		System.out.println("Employee dob is 23/01/1997");

	}
	private void empPhone() {
		System.out.println("Employee ph no is 123456789");

	}
	public static void main(String[] args) {
		Employee a=new Employee();
		a.empId();
		a.empName();
		a.empDob();
		a.empPhone();
	}
	
}
