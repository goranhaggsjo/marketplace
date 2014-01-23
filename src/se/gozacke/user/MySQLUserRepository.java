package se.gozacke.user;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import se.gozacke.database.Database;

public class MySQLUserRepository implements UserRepository {
	private List<User> users;
	
	public MySQLUserRepository() {
		users = new ArrayList<>();
	}
	
	@Override
	public List<User> getAllUsers() {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    
	    try {
			conn = Database.getConnection();
			
			String query = "SELECT * FROM users;";
		
			pstmt = conn.prepareStatement(query);
			
//			pstmt.setString(1, "Juliet");
//			pstmt.setString(2, "Crane");
			
			rs = pstmt.executeQuery();
			
			// Display all the data in the table.
			while (rs.next()) {
//				System.out.println(rs.getString("firstname") + " " + rs.getString("surname"));
				User tempUser = new User(rs.getInt("id"));
				tempUser.setEmail(rs.getString("email"));
				tempUser.setPassword(rs.getString("password"));
				tempUser.setFirstName(rs.getString("firstname"));
				tempUser.setSurName(rs.getString("surname"));
				tempUser.setStreetAddress(rs.getString("street_address"));
				tempUser.setPostCode(rs.getString("post_code"));
				tempUser.setTown(rs.getString("town"));
				tempUser.setTelephone(rs.getString("telephone"));
				
//				tempCustomer.setFirstname(rs.getString("firstname"));
//				tempCustomer.setSurname(rs.getString("surname"));
//				tempCustomer.setStreetAddress(rs.getString("street_address"));
//				tempCustomer.setPostCode(rs.getString("post_code"));
//				tempCustomer.setTown(rs.getString("town"));
//				tempCustomer.setMobile(rs.getString("mobile"));
//				tempCustomer.setEmail(rs.getString("email"));
//				
//				User tempUser = new User(rs.getInt("user_id"), tempCustomer);
//				
//				tempUser.setUser(rs.getString("user"));
//				tempUser.setPass(rs.getString("pass"));
//				
				users.add(tempUser);
	        }
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	    
	    return users;
	}

	@Override
	public Boolean login(String myUser, String myPassword, UserRepository users) {
		
		int length = users.getAllUsers().size();
		
		for(int i = 0; i < length; i++ ) {
			if (myUser == users.getAllUsers().get(i).getEmail()) {
				//this.userId = users.getAllUsers().get(i).getUserId(); 
				return true;
			}
		}
		return false;
	}

}