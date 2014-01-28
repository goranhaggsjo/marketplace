package se.gozacke.main;

import se.gozacke.category.CategoryRepository;
import se.gozacke.category.MySQLCategoryRepository;
import se.gozacke.ecommerce.ECommerce;
import se.gozacke.staff.MySQLStaffRepository;
import se.gozacke.staff.StaffRepository;

public class StaffCategoryMain {

	public static void main(String[] args) {
		CategoryRepository categoryRepository = new MySQLCategoryRepository();
		CategoryRepository eCommerceCategory = new ECommerce(categoryRepository);
		
		StaffRepository staffRepository = new MySQLStaffRepository();
		StaffRepository eCommerceStaff = new ECommerce(staffRepository);
		
		System.out.println(eCommerceCategory.getCategoryOnCategoryName("Gardening"));
		
		System.out.println(eCommerceStaff.getStaffFromFirstNameAndSurName("Ian", "Melendez"));
//		System.out.println(eCommerceStaff.getStaffFromFirstNameAndSurName("Sophia", "Nash"));
		
//		eCommerceCategory.updateStaffMemberResponsibleForCategory(5, 3);
	}
}