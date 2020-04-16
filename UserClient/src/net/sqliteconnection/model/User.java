package net.sqliteconnection.model;
import java.util.HashMap;


public class User {
	private String userName;
	private HashMap<String, String[]> dataBase = new HashMap<String, String[]>();
	private String[] information = new String[6];
	
	public String getUsername() {
		return userName;
	}
	
	public void setUsername(String userName) {
		this.userName = userName;
	}
	
	public String[] getInformation() {
		return information;
	}

	public void setInformation(String userName, String userPassword, String firstName, String lastName, String userAddress, String userEmail) {
		this.information = new String[]{userName, userPassword, firstName, lastName, userAddress, userEmail};
		// information[0] = userName
		// information[1] = userPassword
		// ...
	}
	
	public HashMap<String, String[]> getDatabase(){
		return dataBase;
	}
	
	public void storeDataBase(String userName, String[] information) {
		this.dataBase.put(userName, information);
	}
}