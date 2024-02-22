package org.scanner;

import java.util.Scanner;

public class EmployeeDetails {
public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	System.out.println("Enter Emp Id");
	int id = s.nextInt();
	System.out.println("Enter Emp name");
	String name = s.next();
	System.out.println("Enter Emp email");
	String email = s.next();
	System.out.println("Enter Emp Phno");
	long phno = s.nextLong();
	System.out.println("ENter Emp Sal");
	Float sal = s.nextFloat();
	System.out.println("Enter Emp Gender");
	char gen = s.next().charAt(0);
	System.out.println("Enter Emp City");
	String city = s.next();
	
	System.out.println("\n\n\nEmployeeDetails- ");
	System.out.println("Emplyee Id- " +id);
	System.out.println("Emplyee Name- " +name);
	System.out.println("Emplyee Email- " +email);
	System.out.println("Emplyee Phno- " +phno);
	System.out.println("Emplyee Sal- " +sal);
	System.out.println("Emplyee Gen- " +gen);
	System.out.println("Emplyee City- " +city);
}
}
