package alumni;

import java.util.Scanner;

import student.Student;

//Alumni Node Class

class Alumni_Node {

	Scanner sc = new Scanner(System.in);

	String fname;

	String lname;

	String email;

	int year;

	String branch;

	String description;

	String password;

	String question;

	int identity_no;

	Alumni_Node next;

	Alumni_Node(String fname, String lname, String email, int year, String branch, String description, String password,

			int identity_no, String question) {

		this.fname = fname;

		this.lname = lname;

		this.email = email;

		this.year = year;

		this.branch = branch;

		this.description = description;

		this.password = password;

		this.identity_no = identity_no;

		this.question = question;

		next = null;

	}

}

//Alumni Methods Class

public class Alumni_Profile {

	boolean value;

	Scanner sc = new Scanner(System.in);

	private Alumni_Node head;

	public Alumni_Profile() {

		head = null;

	}

//Alumni Sign Up	

	public void signup() {

		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t                  SIGN IN                        \t\t\t\t");

		System.out.println("\t\t\t\t\t\t\t\t     -----------------------------------\t\t\t\t\n\n");

		System.out.println("\n\n* This Application Is Applicable Only For Cummins Students *\n");

		System.out.print("\n\nFIRST NAME : ");

		String fname = sc.next();

		boolean value = onlyAlphabets(fname);

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

			System.out.println("\n\nPLEASE ENTER A VALID EMAIL ID!");

			return;

		}

		if (head == null) {

			head = temp;

		}

		else {

			Alumni_Node ptr = head;

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

			System.out.print("\nYEAR OF PASSING : ");

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

		System.out.print("\nYOUR SPECIALIZATIONS : ");

		String specialization = sc.nextLine();

		value = onlyAlphabets(specialization);

		while (!value) {

			System.out.println("\n\nEnter Alphabets ONLY!!");

			System.out.print("\nRe-Enter : ");

			specialization = sc.nextLine();

			value = onlyAlphabets(specialization);

		}

		System.out.println(

				"\n\n* Your Password Must Contain 8 Characters, Atleast One Must be of Upper Case, Lower Case, Number and a Special Character *\n");

		System.out.print("\nSET PASSWORD : ");

		String password = sc.nextLine();

		boolean output = isPasswordValid(password);

		while (!output) {

			System.out.println("\n\nINVALID PASSWORD!. Please Try Again.");

			System.out.print("\n\nEnter A Password Again : ");

			password = sc.nextLine();

			if (isPasswordValid(password)) {

				System.out.println("\n\n\nPassword Is Valid.\n");

				output = true;

			}

		}

		System.out.print("\n\nCONFIRM PASSWORD : ");

		String re_password = sc.nextLine();

		if (re_password.equals(password)) {

			System.out.println("\n\nSIGNED IN & PROFILE CREATED SUCCESSFULLY!!");

		}

		else {

			System.out.println("\n\nPASSWORD DOESN'T MATCH!!");

			return;

		}

		Alumni_Node temp = new Alumni_Node(fname, lname, email, year, branch, specialization, password, identity_no,

				question);

		if (head == null) {

			head = temp;

		}

		else {

			Alumni_Node ptr = head;

			while (ptr.next != null) {

				ptr = ptr.next;

			}

			ptr.next = temp;

		}

		identity_no++;

	}

//Alumni Log In	

	public int login() {

		int flag = 0;

		Alumni_Node ptr = head;

		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t                   LOGIN                        \t\t\t\t");

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

		System.out.print("\nPASSWORD : ");

		String password = sc.nextLine();

		if (!email.contains("@cumminscollege.in")) {

			System.out.println("\n\nPLEASE ENTER VALID EMAIL ID!");

			return 0;

		}

		while (ptr != null) {

			if (fname.equals(ptr.fname) && lname.equals(ptr.lname) && email.equals(ptr.email)

					&& password.equals(ptr.password)) {

				flag = ptr.identity_no;

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

						System.out.print("\n\nSET PASSWORD : ");

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

						flag = ptr.identity_no;

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

//Alumni Profile Update

	public void update(int id)

	{

		Alumni_Node ptr = head;

		while (ptr != null) {

			if (ptr.identity_no == id) {

				break;

			}

			ptr = ptr.next;

		}

		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t                UPDATE PROFILE                        \t\t\t\t");

		System.out.println("\t\t\t\t\t\t\t\t     -----------------------------------\t\t\t\t\n\n");

		int year1;

		try {

			System.out.print("\nPASSING YEAR : ");

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

		System.out.print("\nYOUR SPECIALIZATIONS : ");

		String specialization1 = sc.nextLine();

		value = onlyAlphabets(specialization1);

		while (!value) {

			System.out.println("\n\nEnter Alphabets ONLY!!");

			System.out.print("\nRe-Enter : ");

			specialization1 = sc.nextLine();

			value = onlyAlphabets(specialization1);

		}

		ptr.branch = branch1;

		ptr.year = year1;

		ptr.description = specialization1;

		System.out.println("\n\nPROFILE UPDATED SUCCESSFULLY!!");

	}

	// Method to view own profile
	public void view_profile(int id) {
		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t                YOUR PROFILE                        \t\t\t\t");

		System.out.println("\t\t\t\t\t\t\t\t     _______________________________________\t\t\t\t\n\n");

		Alumni_Node ptr = head;

		while (ptr != null) {

			if (ptr.identity_no == id) {

				break;

			}

			ptr = ptr.next;

		}

		System.out.println("\n\nNAME : " + ptr.fname + " " + ptr.lname);

		System.out.println("\nBRANCH : " + ptr.branch);

		System.out.println("\nYEAR : " + ptr.year);

		System.out.println("\nSPECIALIZATIONS : " + ptr.description);

	}

//Method To Display Recommendations To Student

	String str;

	public int show_student() {

		int flag = 0;

		String str1 = "";

		Alumni_Node ptr = head;

		System.out.println("\n\n\n\n\n\t\t\t\t\t\t\t\t                    CONNECT                         \t\t\t\t");

		System.out.println("\t\t\t\t\t\t\t\t     -----------------------------------\t\t\t\t\n\n");

		System.out.println("\n\nEnter Details for Recommendations");

		int year;

		try {

			System.out.print("\nPASSING YEAR : ");

			year = sc.nextInt();

			sc.nextLine();

		} catch (Exception e) {

			System.out.println("\n\nEnter Digits ONLY!!");

			System.out.print("\nRe-Enter : ");

			sc.nextLine();

			year = sc.nextInt();

			sc.nextLine();

		}

		System.out.print("\nBRANCH : ");

		String branch = sc.nextLine();

		boolean value = onlyAlphabets(branch);

		while (!value) {

			System.out.println("\n\nEnter Alphabets ONLY!!");

			System.out.print("\nRe-Enter : ");

			branch = sc.nextLine();

			value = onlyAlphabets(branch);

		}

		System.out.print("\nSPECIALIZATIONS : ");

		String specialization = sc.nextLine();

		value = onlyAlphabets(specialization);

		while (!value) {

			System.out.println("\n\nEnter Alphabets ONLY!!");

			System.out.print("\nRe-Enter : ");

			specialization = sc.nextLine();

			value = onlyAlphabets(specialization);

		}

		while (ptr != null) {

			if (year == ptr.year && ptr.branch.contains(branch) && ptr.description.contains(specialization)) {

				System.out.println("\n\nUnique Identity No. : " + ptr.identity_no);

				System.out.println("\nNAME : " + ptr.fname + " " + ptr.lname);

				System.out.println("BRANCH : " + ptr.branch);

				System.out.println("PASSING YEAR : " + ptr.year);

				System.out.println("SPECIALIZATIONS : " + ptr.description);

				str1 += (ptr.identity_no + " ");

				flag = 1;

			}

			ptr = ptr.next;

		}

		if (flag == 0) {

			System.out.println("\n\nNO RESULTS FOUND!");

			return 0;

		}

		System.out.print("\n\nDo you Want to Connect? (YES/NO) : ");

		String op1 = sc.next();

		value = onlyAlphabets(op1);

		while (!value) {

			System.out.println("\n\nEnter Alphabets ONLY!!");

			System.out.print("\nRe-Enter : ");

			op1 = sc.next();

			value = onlyAlphabets(op1);

		}

		String op = op1.toUpperCase();

		str = str1;

		return connect(op);

	}

//Method to check if entered Identity No Is Valid	

	public int connect(String op) {

		while (true) {

			if (op.equals("YES")) {

				int id;

				try {

					System.out.print("\n\nEnter Unique Identity NO. to Connect : ");

					id = sc.nextInt();

					sc.nextLine();

				} catch (Exception e) {

					System.out.println("\n\nEnter Digits ONLY!!");

					System.out.print("\nRe-Enter : ");

					sc.nextLine();

					id = sc.nextInt();

					sc.nextLine();

				}

				int f = 0;

				if (check(id, str) == 1) {

					Alumni_Node p = head;

					while (p != null) {

						if (p.identity_no == id) {

							return p.identity_no;

						}

						p = p.next;

					}

				}

				if (f == 0) {

					System.out.print("\n\nDo you Want to Connect? (YES/NO) : ");

					String op1 = sc.next();

					value = onlyAlphabets(op1);

					while (!value) {

						System.out.println("\n\nEnter Alphabets ONLY!!");

						System.out.print("\nRe-Enter : ");

						op1 = sc.next();

						value = onlyAlphabets(op1);

					}

					op = op1.toUpperCase();

					if (op.equals("NO"))

					{

						return 0;

					}

				}

			}

			else {

				return 0;

			}

		}

	}

//Method To Display Alumni As Connections To The Student	

	public void display_alumni(String alumni_ids) {

		String[] alumniIdArray = alumni_ids.split(" "); // Splits the string into array of strings

		for (int i = 0; i < alumniIdArray.length; i++) {

			String alumniIdstr = alumniIdArray[i];

			int alumniId = Integer.parseInt(alumniIdstr);

			Alumni_Node ptr = head;

			int flag = 0;

			while (ptr != null) {

				if (ptr.identity_no == alumniId) {

					System.out.println("\n\nUnique Identity No. : " + ptr.identity_no);

					System.out.println("\nNAME : " + ptr.fname + " " + ptr.lname);

					System.out.println("BRANCH : " + ptr.branch);

					System.out.println("PASSING YEAR : " + ptr.year);

					System.out.println("SPECIALIZATIONS : " + ptr.description);

					flag = 1;

				}

				if (flag == 1) {

					break;

				}

				ptr = ptr.next;

			}

		}

	}

//Method To Display And Send Messages To Student Connections
	// returns choice

	public int alumni_messages() {

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

//Method To Return Name Aligned To A Identity No for messages sender name

	public String alumni_name(int id) {

		Alumni_Node ptr = head;

		while (ptr != null) {

			if (ptr.identity_no == id) {

				return (ptr.fname + " " + ptr.lname);

			}

			ptr = ptr.next;

		}

		return null;

	}

//Method to Check If User Enters Only Among The Displayed Identity No 

	public int check(int id, String alumni_ids) {

		String[] alumniIdArray = alumni_ids.split(" "); // Splits the string into array of strings

		for (int i = 0; i < alumniIdArray.length; i++) {

			String alumniIdstr = alumniIdArray[i];

			int alumniId = Integer.parseInt(alumniIdstr);

			if (id == alumniId) {

				return 1;

			}

		}

		System.out.println("\nINVALID IDENTITY NO.!!");

		return 0;

	}

//Method To Check If The String Only Contains Alphabets

	boolean onlyAlphabets(String str) {

		int n = str.length();

		for (int i = 0; i < n; i++) {

			if (!Character.isAlphabetic(str.charAt(i)) && str.charAt(i) != ' ' && str.charAt(i) != ',') {

				return false;

			}

		}

		return true;

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

	int identity_no = 1;

	Alumni_Node temp;

}