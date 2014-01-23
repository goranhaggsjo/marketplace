package se.gozacke.product;

import java.util.List;

public interface ProductRepository {
	public List<Product> getAllProducts();
	public void setProduct(Product product);
}