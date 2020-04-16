package net.sqliteconnection.main;

import net.sqliteconnection.connection.UserDB;
import net.sqliteconnection.controller.UserController;
import net.sqliteconnection.model.User;
import net.sqliteconnection.view.UserView;

public class CreateUserAccount {
	public static void main(String[] args) {
		UserDB userClient = new UserDB();
		User model = retrieveUserFromDataBase();
		UserView view = new UserView();
		UserController controller = new UserController(model, view);
		// controller used for hashmap demo
		// userClient used to store info in to the sql table
		userClient.storeUser(model.getUsername(), model.getInformation());
	}
	private static User retrieveUserFromDataBase() {
		User user = new User();
		user.setUsername("Pinco");
		user.setInformation("username", "password", "Hello", "Three", "53 Cinco Three Street", "CincoThree@cincothree.com");
		// Information in order: Username, Password, First Name, Last Name, Address, Email
		user.storeDataBase(user.getUsername(), user.getInformation());
		return user;
	}
}