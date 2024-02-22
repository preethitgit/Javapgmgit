package org.methodoverloading;

public class EmployeeDetails {

	private void employee() {
	System.out.println("Employee");
	}
	private void employee(int age) {
		System.out.println("Employee Age: " +age);
		}	
	private void employee(String name) {
		System.out.println("Employee Name: " +name);
		}
	private void employee(String address, int pin) {
		System.out.println("Employee Address: " +address);
		System.out.println("Employee Pin: " +pin);
		}
	private void employee(float sal, long acc) {
		System.out.println("Employee Salary: " +sal);
		System.out.println("Employee accno: " +acc);
		}
	private void employee(long phno,float avr) {
		System.out.println("Employee Ph No: " +phno);
		System.out.println("Empoyee Average: " +avr);
		}
	public static void main(String[] args) {
		EmployeeDetails e = new EmployeeDetails();
		e.employee();
		e.employee(26);
		e.employee("Preethi");
		e.employee(55.45912f, 123456789854l);
		e.employee(912345678l, 99.45154564f);
		e.employee("No 23, Hasinapuram Chennai", 600064);
		
	}
}
