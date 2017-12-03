//this class brings the program together and contains the main method

import java.io.*;
import java.util.Scanner;
public class PhoneBookApplication {

	public static void main(String[] args) {
		PhoneBookAdmin pba = new PhoneBookAdmin();
		NormalUser nu = new NormalUser();
		
		Scanner input = new Scanner(System.in);
		Scanner sc;
		
		String username1 = "";
		String username = "";
		String password = "";
		String password1 = "";
		int id = 0;
		String email  = "";
		
		
		try{
			sc = new Scanner(new File("NormalUserInfo.txt")).useDelimiter(","); //the files I used were named NormalUserInfo.txt
			                                  				//and AdminInfo.txt, but they can be changed to whatever the user of this program wants
			while (sc.hasNextLine()){
			   id = sc.nextInt();
			   username = sc.next();
			   password = sc.next();
			}
			   
			sc = new Scanner(new File("AdminInfo.txt")).useDelimiter(",");
			
			while (sc.hasNextLine()){
				username1 = sc.next();
				password1 = sc.next();
				email = sc.next();
			}
				
			sc.close();
		}
		catch(FileNotFoundException ex){
			
			System.out.println("file not found");
		}
		
		boolean f = true;
		
		while(f) {
			System.out.println("Are you an admin or user? enter admin or user");
			String x = input.nextLine();
			
			if(x.equals("admin")) {
				System.out.println("Enter username");
				String un = input.next();
				System.out.println("Enter password");
				String pa = input.next();
				System.out.println("Enter email");
				String em = input.next();
				
				if((un.equals(username1)) && (pa.equals(password1)) && (em.equals(email))){
					pba = new PhoneBookAdmin(username1, password1, email, new PhoneBookDirectory());
					
					boolean og = true;
					
					System.out.println("What do you want to do?");
					
					while(og) {
						System.out.println("1. Add Entry");
						System.out.println("2. Edit PhoneBookEntry");
						System.out.println("3. Delete Entry");
						System.out.println("4. Sort PhoneBookEntry");
						System.out.println("5. Linear Search by PhoneNumber");
						System.out.println("6. Search ID by binary search" );
						System.out.println("7. print user info");
						System.out.println("8. change password");
						System.out.println("9. change username");
						System.out.println("10. quit");
						System.out.println("enter 1-10");
						
						int n = input.nextInt();
						
						if(n == 1) {
							pba.addEntry();
						}					
						else if(n == 2) {
							pba.EditPhoneBookEntry();
						}
						else if(n == 3) {
							pba.DeleteEntry();
						}
						else if(n == 4) {
							pba.SortPhoneBookEntry();
						}
						else if(n == 5) {
							pba.LinearSearchByPhoneNumber();
						}
						else if(n == 6) {
							PhoneBookEntry temp = pba.SearchByIdBinarySearch();
							System.out.println(temp.getId());
						}
						else if(n == 7) {
							pba.PrintUserInfo();
						}
						else if(n == 8) {
							pba.changepassword();
						}
						else if(n == 9) {
							pba.changeusername();
						}
						else if(n == 10) {
							og = false;
							break;
						}
						else {
							System.out.println("you have entered an invalid input, enter again");
							n = input.nextInt();
						}
							
					}
					
				}
				else {
					System.out.println("the username or password was wrong. program closed");
					f = false;
				}
				
				
			}
			else if(x.equals("user")) {
				System.out.println("Enter username");
				String un = input.next();
				System.out.println("Enter password");
				String pa = input.next();
				System.out.println("Enter id");
				int ID = input.nextInt();
				
				if((un.equals(username)) && (pa.equals(password))){
					nu = new NormalUser(ID, username, password, new PhoneBookDirectory());
					
					boolean op = true;
					
					System.out.println("What do you want to do");
					
					while(op) {
						System.out.println("1. Add Entry");
						System.out.println("2. Edit Entry");
						System.out.println("3. Sort PhoneBookEntry");
						System.out.println("4. Linear Search PhoneBookEntry");
						System.out.println("5. Print User Info");
						System.out.println("6. quit");
						System.out.println("enter 1, 2, 3, 4, 5, 6");
						
						int y = input.nextInt();
						
						if(y == 1) {
							nu.addEntry();
						}
						else if(y == 2) {
							nu.EditPhoneBookEntry();
						}
						else if(y == 3) {
							nu.SortPhoneBookEntry();
						}
						else if(y == 4) {
							nu.LinearSearchByPhoneNumber();
						}
						else if(y == 5) {
							nu.PrintUserInfo();
						}
						else if(y == 6) {
							op = false;
							break;
						}
						else {
							System.out.println("invalid input, enter again");
							y = input.nextInt();
						}
					}
				}
				else {
					System.out.println("the username or password was wrong. program closed");
					f = false;
				}
			}
			else {
				System.out.println("invalid input, input should be admin or user. Program closed");
				f = false;
			}
		}
	}
}
