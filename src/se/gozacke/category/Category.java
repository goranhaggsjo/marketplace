package se.gozacke.category;

import se.gozacke.staff.Staff;

public class Category {
	private final int categoryId;
	private Staff staff;
	private String categoryName;
	
	public Category(int categoryId) {
		this.categoryId = categoryId;
		staff = null;
		categoryName = null;
	}
	
	public int getCategoryId() {
		return categoryId;
	}

	public Staff getStaff() {
		return staff;
	}

	public void setStaff(Staff staff) {
		this.staff = staff;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}