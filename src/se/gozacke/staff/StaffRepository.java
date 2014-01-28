package se.gozacke.staff;

import java.util.List;

public interface StaffRepository {
	public List<Staff> getStaffFromFirstNameAndSurName(String firstName, String surName);
}