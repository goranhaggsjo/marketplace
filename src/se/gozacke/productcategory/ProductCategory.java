package se.gozacke.productcategory;

import se.gozacke.category.Category;
import se.gozacke.product.Product;

public class ProductCategory {
	private Product product;
	private Category category;
	
	public ProductCategory() {
		product = null;
		category = null;
	}
	
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}