//a class for the normal user, which implements the NU interface and extends the user class

import java.util.Scanner;

public class NormalUser extends User implements NU {
	
	private int id;
	
	Scanner input = new Scanner(System.in);
	
	public NormalUser() {}
	
	public NormalUser(int id, String us, String pass) {
		super(us, pass);
		this.id = id;
	}
    
	public NormalUser(int id, String us, String pass, PhoneBookDirectory pbd) {
		super(us, pass, pbd);
		this.id = id;
	}
    
	public int addEntry() {
		
		System.out.println("Enter id of the entry");
		int ID = input.nextInt();
		System.out.println("Enter first name of the entry");
		String f = input.next();
		System.out.println("Enter last name of the entry");
		String l = input.next();
		System.out.println("Enter email of the entry");
		String e = input.next();
		System.out.println("Enter zipcode of the entry");
		String z = input.next();
		System.out.println("Enter phonenumber of the entry");
		String pn = input.next();
		
		PhoneBookEntry pbe = new PhoneBookEntry(ID, f, l, e, z, pn);
		
		return phoneBookDirectory.addEntry(pbe);
		
	}

	
	public int EditPhoneBookEntry() {
		System.out.println("Enter first name of the entry you want to edit");
		String f = input.next();
		System.out.println("Enter last name of the entry you want to edit");
		String l = input.next();
		
		return phoneBookDirectory.EditPhoneBookEntry(f, l);
		
	}

	
	public void SortPhoneBookEntry() {
		
		phoneBookDirectory.SortPhoneBookEntry();

	}

	
	public int LinearSearchByPhoneNumber() {
		System.out.println("Enter phone number you want to search");
		String k = input.next();
		
		return phoneBookDirectory.LinearSearchByPhoneNumber(k);
	}

	@Override
	public void PrintUserInfo() {
		System.out.println("Normal user's id is: " + this.id);
		System.out.println("Normal user's username is: " + super.getusername());
		System.out.println("Normal user's password is: " + super.getpassword());		
		phoneBookDirectory.printAllEntries();
	}

}
