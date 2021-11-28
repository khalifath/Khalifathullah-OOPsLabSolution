package com.oopslab.employee;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Employee {
	private String firstName;
	private String lastName;
	private String department;
	private String company = "abc";
	private Scanner sc = new Scanner(System.in);

	public Employee (String fName,String lName) {
		firstName = fName;
		lastName = lName;
	}

	//Set methods are not used stil included.
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void showDepartment () {
		System.out.println ("Please enter the department from the following");
		System.out.println ("1. Technical \n2. Admin \n3. Human Resource \n4. Legal");

		int option=0;
		try {
			option = sc.nextInt();
		} catch (InputMismatchException e) {
			System.out.println ("You have entered a non numeric character, please enter number between 1 and 4 !!!");
		}

		switch(option) {
			case 1:
				setDepartment("tech");
				break;
			case 2:
				setDepartment("admin");
				break;
			case 3:
				setDepartment("hr");
				break;
			case 4:
				setDepartment("legal");
				break;
			default:
				break;
		}
	}
}
