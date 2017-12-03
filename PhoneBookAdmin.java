//a class for the admin, which extends the user class and implements the AU interface

import java.util.Scanner;
public class PhoneBookAdmin extends User implements AU {
	
	private String email;
	
	Scanner input = new Scanner(System.in);
	
	public PhoneBookAdmin() {}
	
	public PhoneBookAdmin(String us, String pass, String em) {
		super.setusername(us);
		super.setpassword(pass);
		email = em;
	}
	
	public PhoneBookAdmin(String us, String pass, String em, PhoneBookDirectory pbd) {
		super(us, pass, pbd);
		super.setusername(us);
		super.setpassword(pass);
		super.setphoneBookDirectory(pbd);
		email = em;
	}

	
	public int addEntry() {
		System.out.println("Enter id of the entry");
		int Id = input.nextInt();
		System.out.println("Enter first name of the entry");
		String f = input.next();
		System.out.println("Enter last name of the entry");
		String l = input.next();
		System.out.println("enter email of the entry");
		String EM = input.next();
		System.out.println("Enter zipcode of the entry");
		String z = input.next();
		System.out.println("Enter phonenumber of the entry");
		String pn = input.next();
		
		PhoneBookEntry pbe = new PhoneBookEntry(Id, f, l, EM, z, pn);
		
		return phoneBookDirectory.addEntry(pbe);
		               

	}
    
	
	public int EditPhoneBookEntry() {
		System.out.println("Enter first name of the entry you want to edit");
		String f = input.next();
		System.out.println("Enter last name of the entry you want to edit");
		String l = input.next();
		
		return phoneBookDirectory.EditPhoneBookEntry(f, l);
	}

	
	public int DeleteEntry() {
		System.out.println("Enter id of the entry that you want to delete");
		int n = input.nextInt();
		
		return phoneBookDirectory.DeleteEntry(n);
		
	}

	
	public void SortPhoneBookEntry() {
		
		phoneBookDirectory.SortPhoneBookEntry();
		
	}

	@Override
	public int LinearSearchByPhoneNumber() {
		
		System.out.println("Enter phone number you want to search");
		String k = input.next();
		
		return phoneBookDirectory.LinearSearchByPhoneNumber(k);
		
	}

	public PhoneBookEntry SearchByIdBinarySearch() {
		System.out.println("Enter id that you want to search");
		int o = input.nextInt();
		
		return phoneBookDirectory.SearchByIdBinarySearch(o);
	}

	@Override
	public void PrintUserInfo() {
		System.out.println("PhoneBookAdmin's username is:" + super.getusername());
		System.out.println("PhoneBookAdmin's password is:" + super.getpassword());
		System.out.println("PhoneBookAdmin's email is:" + email);
		phoneBookDirectory.printAllEntries();

	}

	public void changepassword() {
		System.out.println("What do you want to change the password to?");
		String r = input.next();
		super.setpassword(r);
	}

	public void changeusername() {
		System.out.println("What do you want to change the username to?");
		String u = input.next();
		super.setusername(u);
	}

}
