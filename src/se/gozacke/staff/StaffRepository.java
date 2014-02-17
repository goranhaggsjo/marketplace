package se.gozacke.staff;

import java.util.List;

public interface StaffRepository {
	public List<Staff> getStaffFromFirstNameAndSurName(String firstName, String surName);
	public List<Staff> getAllStaffMembers();
	public List<Staff> getStaffOnStaffId(int staffId);
}