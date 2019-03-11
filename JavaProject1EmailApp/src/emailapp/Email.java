package emailapp;

import java.util.Scanner;

public class Email {

	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailBoxCapacity=500;
	private int defaultPasswordLength=10;
	private String alternateEmail;
	private String email;
	private String companySuffix = "myNEXTJOB.com";
	
	
	//constructor to receive firstname and last name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("Email created for  "+this.firstName+" "+ this.lastName);
		
		//call a method for department- return the department.
		this.department=setDepartment();
		System.out.println("DEPARTMENT is:"+this.department);
		
		//password random
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your temporary password is: "+this.password);
		
		
		//combine elements to generate email
		email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		System.out.println("Your email is: "+email);
	}
	
	//ask for department
	
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES:\n1 for sales\n2 for development\n3 for accounting\n0 for none\n Enter the department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice=in.nextInt();
		if(depChoice==1) {
			return "Sales";
		}
		else if(depChoice==2) {
			return "DEV";
		}
		else if(depChoice==3) {
			return "Accounting";
		}
		else {
			return "Nothing";
		}
	}
	
	
	//generate random password
	private String randomPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890@!$*";
		char[] password = new char[length];
		for(int i=0;i<length;i++) {
			int rand = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	//set mail box capacity
	public void setMailBoxCapacity(int capacity) {
		this.mailBoxCapacity=capacity;
	}
	
	//set alternate email
	public void setAlternateEmail(String alternateemail) {
		this.alternateEmail = alternateemail;
	}
	
	//Change passwords
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword() {
		return password;
	}
	
	
	//DISPLAY INFO METHOD:-
	
	public String showInfo() {
		return "DISPLAY NAME: "+ firstName+" "+lastName +
				"\nCOMPANY EMAIL: "+email +
				"\nMAIL BOX CAPACITY"+mailBoxCapacity+" mb";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
