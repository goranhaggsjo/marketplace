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
	    products.clear();
	    
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
				tempProduct.setCost(rs.getDouble("cost"));
				tempProduct.setRrp(rs.getDouble("rrp"));
				
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
	
	@Override
	public void insertProduct(Product product) {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    
	    try {
			conn = Database.getConnection();
			
			conn.setAutoCommit(false);
			
			String query = "INSERT INTO products VALUES (null, ?, ?, ?, ?);";
		
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, product.getProductName());
			pstmt.setString(2, product.getDescription());
			pstmt.setDouble(3, product.getCost());
			pstmt.setDouble(4, product.getRrp());
			
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
	public void updateProduct(Product product) {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    
	    try {
			conn = Database.getConnection();
			
			conn.setAutoCommit(false);
			
			String query = "UPDATE products "
						 + "SET product_name = ?, "
						 + "description = ?, "
						 + "cost = ?, "
						 + "rrp = ? "
						 + "WHERE id = ?;";
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, product.getProductName());
			pstmt.setString(2, product.getDescription());
			pstmt.setDouble(3, product.getCost());
			pstmt.setDouble(4, product.getRrp());
			pstmt.setInt(5, product.getProductId());
			
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
	public void deleteProduct(Product product) {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    
	    try {
			conn = Database.getConnection();
			
			conn.setAutoCommit(false);
			
			String query = "DELETE FROM products WHERE id = ?;";
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, product.getProductId());
			
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
	public List<Product> getProductsFromCategoryName(String categoryName) {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    products.clear();
	    
	    try {
			conn = Database.getConnection();
			
			String query = "SELECT products.id, products.product_name, "
								+ "products.description, products.cost, "
								+ "products.rrp "
						 + "FROM products, categories, products_categories "
						 + "WHERE products.id = products_categories.products_id "
						 + "AND categories.id = products_categories.categories_id "
						 + "AND categories.category_name = ?;";
		
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, categoryName);
//			pstmt.setString(2, "Crane");
			
			rs = pstmt.executeQuery();
			
			// Display all the data in the table.
			while (rs.next()) {
//				System.out.println(rs.getString("firstname") + " " + rs.getString("surname"));
				Product tempProduct = new Product(rs.getInt("id"));
				tempProduct.setProductName(rs.getString("product_name"));
				tempProduct.setDescription(rs.getString("description"));
				tempProduct.setCost(rs.getDouble("cost"));
				tempProduct.setRrp(rs.getDouble("rrp"));
				
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
	
	@Override
	public List<Product> getProductFromProductName(String productName) {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    products.clear();
	    
	    try {
			conn = Database.getConnection();
			
			String query = "SELECT * FROM products WHERE product_name = ?;";
		
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, productName);
//			pstmt.setString(2, "Crane");
			
			rs = pstmt.executeQuery();
			
			// Display all the data in the table.
			while (rs.next()) {
//				System.out.println(rs.getString("firstname") + " " + rs.getString("surname"));
				Product tempProduct = new Product(rs.getInt("id"));
				tempProduct.setProductName(rs.getString("product_name"));
				tempProduct.setDescription(rs.getString("description"));
				tempProduct.setCost(rs.getDouble("cost"));
				tempProduct.setRrp(rs.getDouble("rrp"));
				
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
	
	// **********************************************
	/*public void test() {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    
	    try {
	    	conn = Database.getConnection();
		 
	    	conn.setAutoCommit(false);
		
	    	String query = "INSERT INTO user (userId,password,firstName,lastName,streetAddress,phoneNumber,eMail) VALUES(?,?,?,?,?,?,?)";
		
	    	pstmt = conn.prepareStatement(query, ResultSet.CONCUR_UPDATABLE);
		
	    	try {
	    		pstmt.setInt(1, user.getUserId());
	    		pstmt.setString(2, user.getPassword());
	    		pstmt.setString(3, user.getFirstName());
	    		pstmt.setString(4, user.getLastName());
	    		pstmt.setString(5, user.getStreetAddress());
	    		pstmt.setString(5, user.getPhoneNumber());
	    		pstmt.setString(7, user.getEMail());
	    		pstmt.executeUpdate();
	    		rs = pstmt.getGeneratedKeys();
	    		rs.next();
	    		int id = rs.getInt(1);
	    		// user.getUserId(); // not sure if this is the best way to return the id.
	    		conn.commit();
	    	} catch (SQLException e) {
	    		conn.rollback();
	    		e.printStackTrace();
	    	}
	    } catch (ClassNotFoundException e) {
	    	e.printStackTrace();
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    } finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (pstmt != null) {
					pstmt.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}*/
	// **********************************************
}