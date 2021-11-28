package com.oopslab.main;
import com.oopslab.employee.*;
import com.oopslab.service.*;

public class EmployeeMain {

	public static void main (String args[]) {
		Employee emp = new Employee("khalifathullah","khan");
		CredentialsService cs = new CredentialsService();
		
		emp.showDepartment();
		cs.showCredentials(emp.getFirstName(), emp.getLastName(), emp.getDepartment(), emp.getCompany());
	}
}
