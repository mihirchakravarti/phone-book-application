//this class lists all the attributes of a user.
//a user has an username, password

public class User {
	
	private String username;
	private String password;
	protected PhoneBookDirectory phoneBookDirectory;
	
	public User() {
		username = "";
		password = "";
	}
	
	public User(String u, String pa) {
		username = u;
		password = pa;
	}
	
	public User(String u, String pa, PhoneBookDirectory p) {
		username = u;
		password = pa;
		phoneBookDirectory = p;
	}
	
	public void setusername(String u) {
		username = u;
	}
	
	public String getusername() {
		return username;
	}
	
	public void setpassword(String pa) {
		password = pa;
	}
	
	public String getpassword() {
		return password;
	}
	
	public void setphoneBookDirectory(PhoneBookDirectory p) {
		phoneBookDirectory = p;
	}
	
	public PhoneBookDirectory getphoneBookDirectory() {
		return phoneBookDirectory;
	}

	
	public void PrintUserInfo() {
		System.out.println("username is: " + getusername());
		System.out.println("password is: " + getpassword());
	}
}
