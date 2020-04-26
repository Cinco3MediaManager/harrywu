// Emulates user account functions
// functions so far: create account, login
package net.sqliteconnection.main;

import net.sqliteconnection.connection.UserDB;
import net.sqliteconnection.model.User;

public class CreateUserAccount {
	public static void main(String[] args) {
		UserDB userClient = new UserDB();
		User model = retrieveUserFromDataBase();
		userClient.storeUser(model.getUsername(), model.getInformation()); // store account variables to database
		userClient.login("newuser", "password"); // can replace these variables with model variables
	}
	private static User retrieveUserFromDataBase() { // create test account
		User user = new User();
		user.setInformation("newuser", "password", "Hello", "Three", "53 Cinco Three Street", "CincoThree@cincothree.com");
		// Information in order: Username, Password, First Name, Last Name, Address, Email
		user.storeDataBase(user.getUsername(), user.getInformation());
		return user;
	}
}