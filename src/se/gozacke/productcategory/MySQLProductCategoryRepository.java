package se.gozacke.productcategory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import se.gozacke.database.Database;

public class MySQLProductCategoryRepository implements ProductCategoryRepository {
	private List<ProductCategory> productCategories;
	
	public MySQLProductCategoryRepository() {
		productCategories = new ArrayList<>();
	}

	@Override
	public List<ProductCategory> getAllProductCategories() {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    productCategories.clear();
	    
	    try {
			conn = Database.getConnection();
			
			String query = "SELECT * FROM products_categories;";
			
			pstmt = conn.prepareStatement(query);
			
//			pstmt.setString(1, "categories.staff_id");
//			pstmt.setString(2, "Crane");
			
			rs = pstmt.executeQuery();
			
			// Display all the data in the table.
			while (rs.next()) {
//				System.out.println(rs.getString("firstname") + " " + rs.getString("surname"));
				ProductCategory tempProductCategory = new ProductCategory(rs.getInt("id"));
				tempProductCategory.setProductId(rs.getInt("products_id"));
				tempProductCategory.setCategoryId(rs.getInt("categories_id"));
				
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
				productCategories.add(tempProductCategory);
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
	    
	    return productCategories;
	}

	@Override
	public void insertProductCategory(ProductCategory productCategory) {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    
	    try {
			conn = Database.getConnection();
			
			conn.setAutoCommit(false);
			
			String query = "INSERT INTO products_categories VALUES (null, ?, ?);";
		
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, productCategory.getProductId());
			pstmt.setInt(2, productCategory.getCategoryId());
			
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
	public void updateProductCategory(ProductCategory productCategory) {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    
	    try {
			conn = Database.getConnection();
			
			conn.setAutoCommit(false);
			
			String query = "UPDATE products_categories "
						 + "SET products_id = ?, "
						 + "categories_id = ? "
						 + "WHERE id = ?;";
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, productCategory.getProductId());
			pstmt.setInt(2, productCategory.getCategoryId());
			pstmt.setInt(3, productCategory.getProductCategoryId());
			
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
	public void deleteProductCategory(ProductCategory productCategory) {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    
	    try {
			conn = Database.getConnection();
			
			conn.setAutoCommit(false);
			
			String query = "DELETE FROM products_categories WHERE id = ?;";
			
			pstmt = conn.prepareStatement(query);
			
			pstmt.setInt(1, productCategory.getProductCategoryId());
			
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
}