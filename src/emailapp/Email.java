package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity;
	private int defaultpasswordlength = 10;;
	private String alternateEmail;
	private String collegesuffix = "reg.edu";
	private String email;

	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		System.out.println("email created");

		this.department = setDepartment();
		System.out.println("Department selected :" + this.department);

		this.password = randomPassword(defaultpasswordlength);
		System.out.println("Your password is " + this.password);

		email = firstName + "." + lastName + "@" + department + "." + collegesuffix;
		System.out.println(email);

	}

	private String setDepartment() {
		System.out.println("Enter the department code \n 1  students \n 2 Teachers \n 3 Officestaff");
		Scanner in = new Scanner(System.in);
		int DeaprtmentChoice = in.nextInt();
		if (DeaprtmentChoice == 1) {
			return "students";
		} else if (DeaprtmentChoice == 2) {
			return "Teachers";
		} else if (DeaprtmentChoice == 3) {
			return "officestaff";
		} else {
			return "";
		}
	}

	private String randomPassword(int length) {
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz123456789!@#$%^&";
		char[] password = new char[length];
		for (int i = 0; i < length; i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}

	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}

	public void setAlternateEmail(String alternateEmail) {
		this.alternateEmail = alternateEmail;
	}

	public void setPassword(String passowrd) {
		this.password = password;
	}

	public int getMailboxCapacity() {
		return mailboxCapacity;
	}

	public String getAlternateEmail() {
		return alternateEmail;
	}

	public String getPassword() {
		return password;
	}

}
