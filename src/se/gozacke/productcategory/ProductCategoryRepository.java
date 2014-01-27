package se.gozacke.productcategory;

import java.util.List;

public interface ProductCategoryRepository {
	public List<ProductCategory> getAllProductCategories();
	public void insertProductCategory(ProductCategory productCategory);
	public void updateProductCategory(ProductCategory productCategory);
	public void deleteProductCategory(ProductCategory productCategory);
}