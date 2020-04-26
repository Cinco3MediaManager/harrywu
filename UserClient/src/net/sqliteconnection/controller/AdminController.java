package net.sqliteconnection.controller;

import net.sqliteconnection.model.Admin;
import net.sqliteconnection.view.AdminView;

public class AdminController {
	private Admin model;
	private AdminView view;
	
	public AdminController(Admin model, AdminView view) {
		this.model = model;
		this.view = view;
	}
	
	public int getAdminID() {
		return model.getID();
	}
	
	public void setAdminID(int adminID) {
		model.setID(adminID);
	}
	
	public String getAdminUsername() {
		return model.getUsername();
	}
	
	public void setAdminUserName(String adminUsername) {
		model.setUsername(adminUsername);
	}
	
	public String getAdminPassword() {
		return model.getPassword();
	}
	
	public void setAdminPassword(String adminPassword) {
		model.setPassword(adminPassword);
	}
}