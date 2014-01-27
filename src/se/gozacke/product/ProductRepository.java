package se.gozacke.product;

import java.util.List;

public interface ProductRepository {
	public List<Product> getAllProducts();
	public void insertProduct(Product product);
	public void updateProduct(Product product);
	public void deleteProduct(Product product);
	public List<Product> getProductsFromCategoryName(String categoryName);
	public List<Product> getProductFromProductName(String productName);
}