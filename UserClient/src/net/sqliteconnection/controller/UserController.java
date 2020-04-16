package net.sqliteconnection.controller;
import java.util.Map;
import net.sqliteconnection.model.User;
import net.sqliteconnection.view.UserView;

public class UserController {
	private User model;
	private UserView view;
	
	public UserController(User model, UserView view) {
		this.model = model;
		this.view = view;
	}
	public void setUserInformation (String userName, String userPassword, String firstName, String lastName, String userAddress, String userEmail) {
		model.setInformation(userName, userPassword, firstName, lastName, userAddress, userEmail);
	}
	public String[] getUserInformation() {
		return model.getInformation();
	}
	public void storeUserDataBase(String userName, String[] userInformation) {
		model.storeDataBase(userName, userInformation);
	}
	public Map<String, String[]> getUserDataBase() {
		return model.getDatabase();
	}
	public void storeUserAccount() {
		view.createAccount(model.getDatabase(),model.getUsername(), model.getInformation());
	}
}
