package se.gozacke.category;

import java.util.List;

public interface CategoryRepository {
	public List<Category> getAllCategories();
	public void insertCategory(Category category);
	public void updateCategory(Category category);
	public void deleteCategory(Category category);
	public List<Category> getCategoryOnCategoryName(String categoryName);
	public void updateStaffMemberResponsibleForCategory(int staffId, int categoryId);
	public List<Category> getCategoriesFromProductName(String productName);
	public List<Category> getCategoriesFromProductId(int productId);
	public List<Category> getCategoryOnCategoryId(int categoryId);
}