package com.greatlearning.itsupport.driver;
import com.greatlearning.itsupport.model.Employee;
import com.greatlearning.itsupport.service.Service;
import java.util.Scanner;

public class Driver {
	
	public static void main(String args[]) {
		Employee employee = new Employee("sakshi","gupta");
		Service s1 = new Service();
		employee.getFirstName();
		employee.getLastName();
		s1.showCredentials(employee, s1.generateEmail(employee.getFirstName(), employee.getLastName(), s1.computeDepartment()),
				s1.generatePassword());
		
		
	}
}