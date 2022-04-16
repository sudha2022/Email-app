package emailApp;

import java.util.Scanner;

public class Email { // variables are declared and they are made private
	private	String firstName;
	private	String lastName;
	private	String password;
	private	String department;
	private String email;
	private	int mailboxCapacity =500;
	private int defaultPasswordLength =10;
	private	String alternateEmail;
	private String companySuffix ="company.com";

	//constructor to receive the first and last name

	public Email(String firstName, String lastName) {

		super();
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email created:" + this.firstName +"" + this.lastName);




		//  call a method asking for the  department return department
		this.department=  setDepartment();
		System.out.println("Department:" + this.department);
		
		//call a method that returns a random password
		this.password=randomPassword(defaultPasswordLength);
		//System.out.println("Your password is: "+this.password);
		
		//combine elements to generate email
		email= firstName.toLowerCase() +"" + lastName.toLowerCase() + "@" + department +"." + "" + companySuffix;
		//System.out.println("Your email is:" + email);

	}



	//Ask for the department
	private	String setDepartment() {
		System.out.println("DEPARTMENT CODES\n1 for sales\n2 for Development\n3 for Accounting\n0 for none\nEnter deparment code:");
		Scanner in= new Scanner(System.in);
		int depChoice=	in.nextInt();
		if(depChoice==1) {return "sales";}
		else if (depChoice==2) {return "dev";}
		else if(depChoice==3) {return "Acc";}
		else {return "";}


	
}
// Generate a Random password
    private String randomPassword (int length) {
	String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
	char[] password=new char[length];
	for(int i=0;i<length; i++){
	int rand=	(int) (Math.random()*passwordSet.length());
	password[i]=passwordSet.charAt(rand);
		
	}
	return new String(password);
    }



// set the mailboxCapacity
public void setmailboxCapacity(int length) {
	this.mailboxCapacity= mailboxCapacity;
}

// set alternateEmail
public void setAlternateEmail(String altEmail) {
	this.alternateEmail= altEmail;

}


// change the password
public void changePassword(String password) {
	this.password=password;
	
}
public int getMailboxCapacity() {return mailboxCapacity;}
public String  getAlternateEmail() {return alternateEmail;}
public String getpassword() {return password;}
public String showInfo() {
	return "DISPLAY NAME:" + firstName + ""+lastName+
			"\nCOMPANY EMAIL:" + email +
			"\nMAILBOX CAPACITY:" + mailboxCapacity + "mb";}
}




