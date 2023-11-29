package student;

import java.util.Scanner;

import alumni.Alumni_Profile;
//Student Node class

class Student_Node {

	Student_Node next;

	String fname;

	String lname;

	String email;

	String password;

	int identity;

	String question;

	String branch;

	int year;

	Student_Node(String fname, String lname, String email, String password, int identity, String question,

			String branch, int year) {

		this.fname = fname;

		this.lname = lname;

		this.email = email;

		this.password = password;

		this.identity = identity;

		this.question = question;

		this.branch = branch;

		this.year = year;

		this.next = null;

	}

}
//Student Methods Class

public class Student {

	Scanner sc = new Scanner(System.in);

	boolean value;

	private Student_Node head;

	public Student() {

		head = null;

	}
//Student Sign Up

	public void sign_up() {

		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t                  SIGN IN                        \t\t\t\t");

		System.out.println("\t\t\t\t\t\t\t\t     -----------------------------------\t\t\t\t\n\n");

		System.out.println("\n\n* This Application is Applicable Only for Cummins Students *");

		System.out.print("\n\nFIRST NAME : ");

		String fname = sc.next();

		value = onlyAlphabets(fname);
		while (!value) {

			System.out.println("\n\nEnter Alphabets ONLY!!");

			System.out.print("\nRe-Enter : ");

			fname = sc.next();

			value = onlyAlphabets(fname);

		}

		System.out.print("\nLAST NAME : ");

		String lname = sc.next();

		value = onlyAlphabets(lname);

		while (!value) {

			System.out.println("\n\nEnter Alphabets ONLY!!");

			System.out.print("\nRe-Enter : ");

			lname = sc.next();

			value = onlyAlphabets(lname);

		}

		System.out.print("\nEMAIL : ");

		String email = sc.next();

		sc.nextLine();

		if (!email.contains("@cumminscollege.in")) {

			System.out.println("\n\nPLEASE ENTER VALID EMAIL ID!");

			return;

		}

		if (head == null) {

			head = temp;

		}

		else {

			Student_Node ptr = head;

			boolean emailexits = false;

			while (ptr != null) {

				if (email.equals(ptr.email)) {

					emailexits = true;

					break;

				}

				ptr = ptr.next;

			}

			if (emailexits) {

				System.out.println("\n\nYOU HAVE ALREADY SIGNED!!");

				return;

			}

		}

		System.out.print("\nBRANCH : ");

		String branch = sc.nextLine();
		value = onlyAlphabets(branch);

		while (!value) {

			System.out.println("\n\nEnter Alphabets ONLY!!");

			System.out.print("\nRe-Enter : ");

			branch = sc.nextLine();

			value = onlyAlphabets(branch);

		}

		int year;

		try {

			System.out.print("\nCURRENT YEAR OF STUDY : ");

			year = sc.nextInt();
			sc.nextLine();

		} catch (Exception e) {

			System.out.println("\n\nEnter Digits ONLY!!");

			System.out.print("\nRe-Enter : ");

			sc.nextLine();

			year = sc.nextInt();

			sc.nextLine();

		}

		System.out.println("\n\nSecurity Question : ");

		System.out.println("\nWhat was your favorite food as a child?");

		String question = sc.nextLine();

		value = onlyAlphabets(question);

		while (!value) {

			System.out.println("\n\nEnter Alphabets ONLY!!");

			System.out.print("\nRe-Enter : ");

			question = sc.nextLine();

			value = onlyAlphabets(question);

		}

		System.out.println(

				"\n\n* Your Password Must Contain 8 Characters, Atleast One Must Be of Upper Case, Lower Case, Number and a Special Character *");

		System.out.print("\n\nSET PASSWORD : ");

		String password = sc.nextLine();

		boolean output = isPasswordValid(password);

		while (!output) {

			System.out.println("\n\nINVALID PASSWORD. Please try again.");

			System.out.print("\n\nEnter a password again : ");

			password = sc.nextLine();

			if (isPasswordValid(password)) {

				System.out.println("\n\nPassword Is Valid.");

				output = true;

			}

		}

		System.out.print("\n\nCONFIRM PASSWORD : ");

		String re_password = sc.nextLine();

		if (re_password.equals(password)) {

			System.out.println("\n\nACCOUNT CREATED SUCCESSFULLY!!");

		}

		else {

			System.out.println("\n\nPASSWORD DOESN'T MATCH!!");

			return;

		}

		Student_Node temp = new Student_Node(fname, lname, email, password, identity, question, branch, year);

		if (head == null) {

			head = temp;

		}

		else {

			Student_Node ptr = head;

			while (ptr.next != null) {

				ptr = ptr.next;

			}

			ptr.next = temp;

		}

		identity++;

	}
//Student Log In

	public int log_in() {

		int flag = 0;

		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t                   LOGIN                        \t\t\t\t");

		System.out.println("\t\t\t\t\t\t\t\t     -----------------------------------\t\t\t\t\n\n");

		System.out.println("\n\n* This Application is Applicable Only for Cummins Students *");

		System.out.print("\n\nFIRST NAME : ");

		String fname = sc.next();

		sc.nextLine();

		boolean value = onlyAlphabets(fname);

		while (!value) {

			System.out.println("\n\nEnter Alphabets ONLY!!");

			System.out.print("\nRe-Enter : ");

			fname = sc.next();

			value = onlyAlphabets(fname);

		}

		System.out.print("\nLAST NAME : ");

		String lname = sc.next();

		sc.nextLine();

		value = onlyAlphabets(lname);

		while (!value) {

			System.out.println("\n\nEnter Alphabets ONLY!!");

			System.out.print("\nRe-Enter : ");

			lname = sc.next();

			value = onlyAlphabets(lname);

		}

		System.out.print("\nEMAIL : ");

		String email = sc.next();

		sc.nextLine();

		System.out.print("\nPASSWORD : ");

		String password = sc.nextLine();

		if (!email.contains("@cumminscollege.in")) {

			System.out.println("\n\nPLEASE ENTER VALID EMAIL ID!");

			return 0;

		}

		Student_Node ptr = head;

		while (ptr != null) {

			if (fname.equals(ptr.fname) && lname.equals(ptr.lname) && email.equals(ptr.email)

					&& password.equals(ptr.password)) {

				flag = ptr.identity;

				break;

			}

			else if (fname.equals(ptr.fname) && lname.equals(ptr.lname) && email.equals(ptr.email)) {

				System.out.println("\nIncorrect Password!!");

				System.out.print("\nForget Password? (YES/NO) : ");

				String s1 = sc.next();
				sc.nextLine();

				String s = s1.toUpperCase();

				if (s.equals("YES")) {

					System.out.println("\n\nAnswer your security question?");

					System.out.println("\nWhat was your favorite food as a child?");

					String ans = sc.nextLine();

					if (ans.equals(ptr.question)) {

						System.out.println(

								"\n\n* Your Password Must Contain 8 Characters, Atleast One Must Be of Upper Case, Lower Case, Number and a Special Character *");

						System.out.print("\n\nENTER NEW PASSWORD TO SET : ");

						String newpassword = sc.nextLine();

						boolean output = isPasswordValid(newpassword);

						while (!output) {

							System.out.println("\n\nINVALID PASSWORD. Please try again.");

							System.out.print("\n\nEnter a password again : ");

							newpassword = sc.nextLine();

							if (isPasswordValid(newpassword)) {

								System.out.println("\n\nPassword Is Valid.");

								output = true;

							}

						}

						ptr.password = newpassword;

						flag = ptr.identity;

						break;

					}

					else {

						System.out.println("\nThat is an incorrect Answer\nPLease try again");

						return 0;

					}

				}

				else {
					return 0;
				}

			}

			else if (email.equals(ptr.email) && password.equals(ptr.password)) {

				System.out.println("\nCREDENTIALS MISMATCHED!");

				return 0;

			}

			else if (email.equals(ptr.email)) {

				System.out.println("\nCREDENTIALS MISMATCHED!");

				return 0;

			}

			else if (password.equals(ptr.password)) {

				System.out.println("\nCREDENTIALS MISMATCHED!");

				return 0;

			}

			ptr = ptr.next;

		}

		if (flag == 0) {

			System.out.println("\n\nACCOUNT NOT FOUND!\nMAKE SURE YOU HAVE SIGNED IN.");

		}

		return flag;

	}

//Student Profile Update
	public void update(int id)

	{

		Student_Node ptr = head;

		while (ptr != null) {

			if (ptr.identity == id) {

				break;

			}

			ptr = ptr.next;

		}

		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t                UPDATE PROFILE                        \t\t\t\t");

		System.out.println("\t\t\t\t\t\t\t\t     -----------------------------------\t\t\t\t\n\n");

		int year1;

		try {

			System.out.print("\nCURRENT YEAR OF STUDY : ");

			year1 = sc.nextInt();

			sc.nextLine();

		} catch (Exception e) {

			System.out.println("\n\nEnter Digits ONLY!!");

			System.out.print("\nRe-Enter : ");

			sc.nextLine();

			year1 = sc.nextInt();

			sc.nextLine();

		}

		System.out.print("\nBRANCH : ");

		String branch1 = sc.nextLine();

		value = onlyAlphabets(branch1);

		while (!value) {

			System.out.println("\n\nEnter Alphabets ONLY!!");

			System.out.print("\nRe-Enter : ");

			branch1 = sc.nextLine();

			value = onlyAlphabets(branch1);

		}

		System.out.println("\n\nPROFILE UPDATED SUCCESSFULLY!!");

	}

	// Method to view own profile
	public void view_profile(int id) {
		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t                YOUR PROFILE                        \t\t\t\t");

		System.out.println("\t\t\t\t\t\t\t\t     _______________________________________\t\t\t\t\n\n");

		Student_Node ptr = head;

		while (ptr != null) {

			if (ptr.identity == id) {

				break;

			}

			ptr = ptr.next;

		}

		System.out.println("\n\nNAME : " + ptr.fname + " " + ptr.lname);

		System.out.println("\nBRANCH : " + ptr.branch);

		System.out.println("\nYEAR : " + ptr.year);

	}

//Method To Display And Send Messages To Alumni Connections
	// return choice
	public int student_messages() {

		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t                   MESSAGES                        \t\t\t\t");

		System.out.println("\t\t\t\t\t\t\t\t     -----------------------------------\t\t\t\t\n\n");

		while (true) {

			System.out.println("\n\n1) MESSAGES\n2) EXIT ");

			try {

				System.out.print("\nPlease Enter Appropriate Option : ");

				int choice = sc.nextInt();

				return choice;

			} catch (Exception e) {

				System.out.println("\n\nEnter Digits ONLY!!");

				System.out.print("\nRe-Enter : ");

				sc.nextLine();

				int choice = sc.nextInt();

				sc.nextLine();

				return choice;

			}

		}

	}

//Method To Display Students As Connections To The Alumni

	public void display_student(String student_ids) {

		String[] studentIdArray = student_ids.split(" "); // Splits the string into array of strings

		for (int i = 0; i < studentIdArray.length; i++) {

			String studentIdstr = studentIdArray[i];

			int studentId = Integer.parseInt(studentIdstr);

			Student_Node ptr = head;

			int flag = 0;

			while (ptr != null) {

				if (ptr.identity == studentId) {

					System.out.println("\n\nUnique Identity No. : " + ptr.identity);

					System.out.println("\nNAME : " + ptr.fname + " " + ptr.lname);

					System.out.println("BRANCH : " + ptr.branch);

					System.out.println("YEAR : " + ptr.year);

					flag = 1;

				}

				if (flag == 1) {

					break;

				}

				ptr = ptr.next;

			}

		}

	}
//Method To Return Name Aligned To A Identity No to fetch name for messages

	public String student_name(int id) {

		Student_Node ptr = head;

		while (ptr != null) {

			if (ptr.identity == id) {

				return (ptr.fname + " " + ptr.lname);

			}

			ptr = ptr.next;

		}

		return null;

	}
//Method to Check If User Enters Only Among The Displayed Identity No

	public int check(int id, String student_ids) {

		String[] alumniIdArray = student_ids.split(" "); // Splits the string into array of strings

		for (int i = 0; i < alumniIdArray.length; i++) {

			String alumniIdstr = alumniIdArray[i];

			int alumniId = Integer.parseInt(alumniIdstr);

			if (id == alumniId) {

				return 1;

			}

		}

		System.out.println("INVALID IDENTITY NO.!!");

		return 0;

	}

//Method To Check If The Password Is Valid

	private boolean isPasswordValid(String password) {

		int minLength = 8;

		int maxLength = 15;

		boolean hasUppercase = false;

		boolean hasLowercase = false;

		boolean hasDigit = false;

		boolean hasSpecialChar = false;

		for (char c : password.toCharArray()) {

			if (Character.isUpperCase(c)) {

				hasUppercase = true;

			} else if (Character.isLowerCase(c)) {

				hasLowercase = true;

			} else if (Character.isDigit(c)) {

				hasDigit = true;

			} else if (!Character.isWhitespace(c)) {

				hasSpecialChar = true;

			}

		}

		return password.length() >= minLength && password.length() <= maxLength && hasUppercase && hasLowercase

				&& hasDigit && hasSpecialChar;

	}

	int identity = 100;

	Student_Node temp;

//Method To Check If The String Only Contains Alphabets
	boolean onlyAlphabets(String str) {

		int n = str.length();

		for (int i = 0; i < n; i++) {

			if (!Character.isAlphabetic(str.charAt(i)) && str.charAt(i) != ' ') {

				return false;

			}

		}

		return true;

	}
}