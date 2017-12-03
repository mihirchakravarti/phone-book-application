//PhoneBookDirectory consists of the things that a user can do - add an entry, delete an entry, search for an entry, etc.
//For example, the max size of the entry list I'm creating is 6, but that can be changed in the code below.

import java.util.*;
import java.util.Scanner;

public class PhoneBookDirectory {
	
	PhoneBookEntry[] PBE = new PhoneBookEntry[6];
	int count = 0;
	public int addEntry(PhoneBookEntry entry) {
	
			if(count == 6) {
				System.out.println("entry not added");
				return 0;
			}
			else {
				PBE[count] = entry;
				count++;
				System.out.println("entry added");
				return 1;
			}
		}
	
	public void printAllEntries() {
		for(int i = 0; i < count; ++i) {
			PBE[i].printBookEntry();
		}
	}
	
	public int LinearSearchByPhoneNumber(String PhoneNumber) {
		for(int i = 0; i < count; i++) {
			if((PBE[i].getphonenumber()).equals(PhoneNumber)) {
				System.out.println("number found");
				return 1;
			}
		}
		System.out.println("number not found");
		return 0;
	}
	
	public PhoneBookEntry SearchByIdBinarySearch(int id) {
		
		SortPhoneBookEntry();
		
		int high = count - 1;
		int low = 0;
		
		while(high >= low) {
			int mid = low + (high - low)/2;
			
			if(PBE[mid].getId() == id) {
				PBE[mid].printBookEntry();
				return PBE[mid];
			}
			
			if(PBE[mid].getId() < id) {
				low = mid + 1;
			}
			else {
				high = mid - 1;
			}
		}
		
		PhoneBookEntry newPBE = new PhoneBookEntry();
		return newPBE;
	}
	
	public void SortPhoneBookEntry() {
		
		for(int i = 0; i < count - 1; i++) {
			for(int j = 0; j < count - i - 1; j++) {
				int x = PBE[j].getId();
				int y = PBE[j + 1].getId();
				if(x > y) {
					PhoneBookEntry sw = new PhoneBookEntry();
					sw = PBE[j];
					PBE[j] = PBE[j + 1];
					PBE[j + 1] = sw;
				}
			}
		}
	}
	
	public int EditPhoneBookEntry(String fn, String ln) {
		
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < count; i++) {
			if(PBE[i].getfirstname().equals(fn) && PBE[i].getlastname().equals(ln)) {
				System.out.println("What do you want to edit?");
				boolean f = true;
				
				while(f == true) {
					System.out.println("1. ID");
					System.out.println("2. first name");
					System.out.println("3. last name");
					System.out.println("4. email");
					System.out.println("5. phone number");
					System.out.println("6. zipcode");
					System.out.println("7. quit");
					
					int o = input.nextInt();
					
					if(o == 1) {
						System.out.println("what do you want to change the ID to?");
						int s = input.nextInt();
						PBE[i].setId(s);
						System.out.println("new ID is" + PBE[i].getId());
					}
					else if(o == 2) {
						System.out.println("what do you want to change the first name to?");
						String s = input.next();
						PBE[i].setfirstname(s);
						System.out.println("new first name is" + PBE[i].getfirstname());
					}
					else if(o == 3) {
						System.out.println("what do you want to change the last name to?");
						String s = input.next();
						PBE[i].setlastname(s);
						System.out.println("new last name is" + PBE[i].getlastname());
					}
					else if(o == 4) {
						System.out.println("what do you want to change the email to?");
						String s = input.next();
						PBE[i].setemail(s);;
						System.out.println("new email is" + PBE[i].getemail());
					}
					else if(o == 5) {
						System.out.println("what do you want to change the phone number to?");
						String s = input.next();
						PBE[i].setphonenumber(s);
						System.out.println("new phone number is" + PBE[i].getphonenumber());
					}
					else if(o == 6) {
						System.out.println("what do you want to change the zipcode to?");
						String s = input.next();
						PBE[i].setzipcode(s);
						System.out.println("new first name is" + PBE[i].getzipcode());
					}
					else if(o == 7) {
						f = false;
						return 1;
					}
					else {
						System.out.println("you entered an invalid option, please enter again");
						o = input.nextInt();
					}
				}
			}
			else {
				System.out.println("No such entry with these first and last name found");
			}
		}
		return 0;
	}
	
	public int DeleteEntry(int id) {
		
		for(int i = 0; i < count; i++) {
			if(PBE[i].getId() == id) {
				PBE[i].setId(0); //default ID is 0
				PBE[i].setfirstname("0"); //default first name is "0"
				PBE[i].setlastname("0"); //default last name is "0"
				PBE[i].setphonenumber("0"); //default last name is "0"
				PBE[i].setemail("0"); //default last name is "0"
				PBE[i].setzipcode("0"); //default zipcode is "0"
				return 1;
			}
		} 
		return 0;
	}
	
}
