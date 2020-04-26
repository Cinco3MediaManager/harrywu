// Admin client function
package net.sqliteconnection.main;

import net.sqliteconnection.connection.UserDB;
public class AdminClient {
	public static void main(String[] args) {
		UserDB adminClient = new UserDB();
		adminClient.login("admin_wu", "fivetres"); // login to servers
		adminClient.getUserInfo("username"); // performs a query (looking for user with this username);
	}
}