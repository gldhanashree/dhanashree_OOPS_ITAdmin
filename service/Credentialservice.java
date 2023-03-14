package service;
import java.util.Random;
import java.util.Scanner;

import employee.Employee;



public class Credentialservice {
	
public String dept() {
	System.out.println("Please enter the department from following : ");
	System.out.println("1. Technical  2. Admin 3.HR 4.Legal");
	Scanner sc3 =new Scanner(System.in);
	int dept = sc3.nextInt();
	
	String department="";
	
	switch(dept) {
	case 1: 
		department="tech";
		break;
	case 2:
		department="admin";
		break;
	case 3:
		department="HR";
		break;
	case 4:
		department="legal";
		break;
		
		default:
			System.out.println("Select proper department");
	}
	return department;

	}


public String Password() {
	String password="";
	String caps="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	String small="abcdefghijklmnopqrstuvwxyz";
	String numbers="0123456789";
	String special = "!@#$%^&*()";
	
	Random random = new Random();
	
	password +=caps.charAt(random.nextInt(caps.length()));
	password +=small.charAt(random.nextInt(small.length()));
	password +=caps.charAt(random.nextInt(caps.length()));
	password +=numbers.charAt(random.nextInt(numbers.length()));
	password +=special.charAt(random.nextInt(special.length()));
	password +=small.charAt(random.nextInt(small.length()));
	password +=numbers.charAt(random.nextInt(numbers.length()));
	password +=special.charAt(random.nextInt(special.length()));
	
	return password;
	
}


}
	

	

