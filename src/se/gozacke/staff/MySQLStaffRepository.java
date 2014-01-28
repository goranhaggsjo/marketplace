package se.gozacke.staff;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import se.gozacke.database.Database;

public class MySQLStaffRepository implements StaffRepository {
	private List<Staff> staffs;
	
	public MySQLStaffRepository() {
		staffs = new ArrayList<>();
	}

	@Override
	public List<Staff> getStaffFromFirstNameAndSurName(String firstName, String surName) {
		ResultSet rs = null;
	    Connection conn = null;
	    PreparedStatement pstmt = null;
	    staffs.clear();
	    
	    try {
			conn = Database.getConnection();
			
			String query = "SELECT * "
						 + "FROM staff "
						 + "WHERE firstname = ? "
						 + "AND surname = ?;";
			
//			Ian
//			Melendez
			pstmt = conn.prepareStatement(query);
			
			pstmt.setString(1, firstName);
			pstmt.setString(2, surName);
			
			rs = pstmt.executeQuery();
			
			
//			private final int staffId;
//			private int departmentId;
//			private int salary;
//			private String firstName;
//			private String surName;
//			private String dateOfBirth;
//			private String streetAddress;
//			private String town;
//			private String postCode;
//			private String mobile;
//			private String email;
			
			// Display all the data in the table.
			while (rs.next()) {
				Staff tempStaff = new Staff(rs.getInt("id"));
				tempStaff.setSalary(rs.getInt("salary"));
				tempStaff.setFirstName(rs.getString("firstname"));
				tempStaff.setSurName(rs.getString("surname"));
				tempStaff.setDateOfBirth(rs.getString("dob"));
				tempStaff.setStreetAddress(rs.getString("street_address"));
				tempStaff.setTown(rs.getString("town"));
				tempStaff.setPostCode(rs.getString("postcode"));
				tempStaff.setMobile(rs.getString("mobile"));
				tempStaff.setEmail(rs.getString("email"));

				staffs.add(tempStaff);
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
	    
	    return staffs;
	}
}