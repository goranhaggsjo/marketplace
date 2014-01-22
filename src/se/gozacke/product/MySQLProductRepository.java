package se.gozacke.product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import se.gozacke.database.Database;

public class MySQLProductRepository implements ProductRepository {
	private List<Product> products;
	
	public MySQLProductRepository() {
		products = new ArrayList<>();
	}
	
	@Override
	public List<Product> getAllProducts() {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    
	    try {
			conn = Database.getConnection();
			
			String query = "SELECT * FROM products;";
		
			pstmt = conn.prepareStatement(query);
			
//			pstmt.setString(1, "Juliet");
//			pstmt.setString(2, "Crane");
			
			rs = pstmt.executeQuery();
			
			// Display all the data in the table.
			while (rs.next()) {
//				System.out.println(rs.getString("firstname") + " " + rs.getString("surname"));
				Product tempProduct = new Product(rs.getInt("id"));
				tempProduct.setProductName(rs.getString("product_name"));
				tempProduct.setDescription(rs.getString("description"));
				tempProduct.setCost(rs.getFloat("cost"));
				tempProduct.setRrp(rs.getFloat("rrp"));
				
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
				products.add(tempProduct);
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
	    
	    return products;
	}
}