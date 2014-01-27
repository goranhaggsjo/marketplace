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
	    users.clear();
	    
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
	public void insertUser(User user) {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    
	    try {
			conn = Database.getConnection();
			
			conn.setAutoCommit(false);
			
			String query = "INSERT INTO users VALUES (null, ?, ?, ?, ?, ?, ?, ?, ?);";
		
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, user.getEmail());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getFirstName());
			pstmt.setString(4, user.getSurName());
			pstmt.setString(5, user.getStreetAddress());
			pstmt.setString(6, user.getPostCode());
			pstmt.setString(7, user.getTown());
			pstmt.setString(8, user.getTelephone());
			
//			pstmt.executeQuery();
			pstmt.executeUpdate();
			// Display all the data in the table.
//			while (rs.next()) {
//				System.out.println(rs.getString("firstname") + " " + rs.getString("surname"));
//				ShoppingBasket tempShoppingbasket = new ShoppingBasket();
//				tempShoppingbasket.setUserId(rs.getInt("users_id"));
//				tempShoppingbasket.setProductId(rs.getInt("products_id"));
//				tempShoppingbasket.setQuantity(rs.getInt("quantity"));
				
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
//				shoppingBaskets.add(tempShoppingbasket);
//	        }
			conn.commit();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
	}

	@Override
	public void updateUser(User user) {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    
	    try {
			conn = Database.getConnection();
			
			conn.setAutoCommit(false);
			
			String query = "UPDATE users "
						 + "SET email = ?, "
						 + "password = ?, "
						 + "firstname = ?, "
						 + "surname = ?, "
						 + "street_address = ?, "
						 + "post_code = ?, "
						 + "town = ?, "
						 + "telephone = ? "
						 + "WHERE id = ?;";
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, user.getEmail());
			pstmt.setString(2, user.getPassword());
			pstmt.setString(3, user.getFirstName());
			pstmt.setString(4, user.getSurName());
			pstmt.setString(5, user.getStreetAddress());
			pstmt.setString(6, user.getPostCode());
			pstmt.setString(7, user.getTown());
			pstmt.setString(8, user.getTelephone());
			pstmt.setInt(9, user.getUserId());
			
//			pstmt.executeQuery();
			pstmt.executeUpdate();
			// Display all the data in the table.
//			while (rs.next()) {
//				System.out.println(rs.getString("firstname") + " " + rs.getString("surname"));
//				ShoppingBasket tempShoppingbasket = new ShoppingBasket();
//				tempShoppingbasket.setUserId(rs.getInt("users_id"));
//				tempShoppingbasket.setProductId(rs.getInt("products_id"));
//				tempShoppingbasket.setQuantity(rs.getInt("quantity"));
				
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
//				shoppingBaskets.add(tempShoppingbasket);
//	        }
			conn.commit();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
	}

	@Override
	public void deleteUser(User user) {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    
	    try {
			conn = Database.getConnection();
			
			conn.setAutoCommit(false);
			
			String query = "DELETE FROM users WHERE id = ?;";
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, user.getUserId());
			
//			pstmt.executeQuery();
			pstmt.executeUpdate();
			// Display all the data in the table.
//			while (rs.next()) {
//				System.out.println(rs.getString("firstname") + " " + rs.getString("surname"));
//				ShoppingBasket tempShoppingbasket = new ShoppingBasket();
//				tempShoppingbasket.setUserId(rs.getInt("users_id"));
//				tempShoppingbasket.setProductId(rs.getInt("products_id"));
//				tempShoppingbasket.setQuantity(rs.getInt("quantity"));
				
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
//				shoppingBaskets.add(tempShoppingbasket);
//	        }
			conn.commit();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
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
	}
	
	@Override
	public boolean validateUsernameAndPassword(String username, String password) {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
//	    users.clear();
	    boolean validUser = false;
	    int checkUser = 0;
	    
	    try {
			conn = Database.getConnection();
			
			String query = "SELECT count(*) as valid_user "
						 + "FROM users "
						 + "WHERE users.email = ? "
						 + "AND users.password = ?;";
		
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, username);
			pstmt.setString(2, password);
			
			rs = pstmt.executeQuery();
			
			// Display all the data in the table.
			while (rs.next()) {
//				System.out.println(rs.getString("firstname") + " " + rs.getString("surname"));
				checkUser = rs.getInt("valid_user");
				
				if(checkUser > 0) {
					validUser = true;
				} else {
					validUser = false;
				}
				
//				User tempUser = new User(rs.getInt("id"));
//				tempUser.setEmail(rs.getString("email"));
//				tempUser.setPassword(rs.getString("password"));
//				tempUser.setFirstName(rs.getString("firstname"));
//				tempUser.setSurName(rs.getString("surname"));
//				tempUser.setStreetAddress(rs.getString("street_address"));
//				tempUser.setPostCode(rs.getString("post_code"));
//				tempUser.setTown(rs.getString("town"));
//				tempUser.setTelephone(rs.getString("telephone"));
				
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
//				users.add(tempUser);
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
	    
	    return validUser;
	}
}