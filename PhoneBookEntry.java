//defining the PhoneBookEntry class. Phone book entry consists of an ID, firstname, lastname, email, zipcode, and a phonenumber.
//Every entry has a unique id. 

public class PhoneBookEntry {
	
	private int Id;
	private String firstname;
	private String email;
	private String lastname;
	private String zipcode;
	private String phonenumber;
	
	public PhoneBookEntry() {
		Id = 0;
		firstname = "";
		email = "";
		lastname = "";
		zipcode = "";
		phonenumber = "";
	}
	
	public PhoneBookEntry(int id, String fn, String ln, String em, String zc, String pn) {
		Id = id;
		firstname = fn;
		lastname = ln;
		email = em;
		zipcode = zc;
		phonenumber = pn;
	}
	
	public PhoneBookEntry(String fn, String pn) {
		firstname = fn;
		phonenumber = pn;
	}
	
	public void setfirstname(String fn) {
		firstname = fn;
	}	
	public String getfirstname(){
		return firstname;
	}
	
	public void setlastname(String ln) {
		lastname = ln;
	}
	public String getlastname() {
		return lastname;
	}
	
	public void setId(int id) {
		Id = id;
	}
	public int getId(){
		return Id;
	}
	
	public void setemail(String em) {
		email = em;
	}
	public String getemail(){
		return email;
	}
	
	public void setzipcode(String zc) {
		zipcode = zc;
	}
	public String getzipcode() {
		return zipcode;
	}
	
	public void setphonenumber(String pn) {
		phonenumber = pn;
	}
	public String getphonenumber() {
		return phonenumber;
	}
	
	public void printBookEntry() {
		System.out.println("ID: " + Id);
		System.out.println("firstname: " + firstname);
		System.out.println("lastname: " + lastname);
		System.out.println("email: " + email);
		System.out.println("zipcode: " + zipcode);
		System.out.println("phonenumber: " + phonenumber);
	}
}
