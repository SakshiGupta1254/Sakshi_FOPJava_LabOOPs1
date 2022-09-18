package com.greatlearning.itsupport.service;
import com.greatlearning.itsupport.model.Employee;
import java.util.Random;
import java.util.Scanner;
public class Service {
	public String generateEmail (String firstName, String lastName, String department) {
		return firstName+lastName+"@"+department+"."+"greatLearning.com";
	}
	public char[] generatePassword() {
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallLetters = "abcdefghijklmnopqrstuvwxyz";
		String numbers = "0123456789";
		String spclChars = "@!#$%^&*";
		String tempPassword = capitalLetters+smallLetters+numbers+spclChars;
		char[] password = new char[8];
		Random random = new Random();
		for(int i=0;i<8;i++)
		{
		password[i] = tempPassword.charAt(random.nextInt(tempPassword.length()));
		}
		
		return password;
	}
	public String computeDepartment() {
		String department = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Technical");
		System.out.println("2. Human Resource");
		System.out.println("3. Admin");
		System.out.println("4. Legal");
		System.out.println("Please Select Department from list above");
		int option = sc.nextInt();
		
		if(option == 1 || option == 2 || option == 3 || option ==4)
		{
			switch(option)
		{
		   case 1 :
			   department =  "Technical";
			   break;
			  
		   case 2 :
		      department = "HumanResource" ;
		      break;
		   case 3 :
			   department = "Admin"; 
			   break;
		   case 4 :
			   department = "Legal" ;
			   break;
		   default : 
			   System.out.println("You've Entered department as:"+department);
			   break;
		}
			
		}
		return department;
		
	}
	public void showCredentials(Employee employee, String email, char[] generatePassword) {
		System.out.println("Dear,"+ employee.getFirstName() +" Welcome to the GreatLearning! here are your Credentials :");
		System.out.println("Email :"+ email);
		System.out.println("Password :"+ generatePassword);
	}
	
	
}