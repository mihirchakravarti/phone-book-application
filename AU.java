//an interface for the admin, which lists the things an admin can do


public interface AU {
	
	public int addEntry();
	public int EditPhoneBookEntry();
	public int DeleteEntry(); //delete using id instead of first name, last name
	public void SortPhoneBookEntry();
	public int LinearSearchByPhoneNumber();
	public PhoneBookEntry SearchByIdBinarySearch();
	public void PrintUserInfo();
	public void changepassword();
	public void changeusername();

}
