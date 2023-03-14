package employee;
import java.util.Scanner;
import service.Credentialservice;

public class Employee {
	

	public Employee(String firstname, String lastname) {
		
		
	}

	public static void main(String[] args) {
		
		System.out.println("Please enter your first name");
		Scanner sc1 =new Scanner(System.in);
		String firstname = sc1.next();
		
		
		System.out.println("Please enter your last name");
		Scanner sc2 =new Scanner(System.in);
		String lastname = sc2.next(); 
		
	Credentialservice cs = new Credentialservice();
	
	String dept=cs.dept();
	
	if(dept != "Select proper department") {
	
	String email = firstname+"."+lastname+"@"+cs.dept()+".greatlearning.com";
	System.out.println("Your email is "+email);
	
	 System.out.println("Your password is "+cs.Password());
		}
	else 
		System.out.println("Invalid choices,please try again");
	}

}