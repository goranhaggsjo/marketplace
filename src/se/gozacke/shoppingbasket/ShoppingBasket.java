package se.gozacke.shoppingbasket;

import se.gozacke.product.Product;
import se.gozacke.user.User;

public class ShoppingBasket {
	private User user;
	private Product product;
	private int quantity;
	
	public ShoppingBasket() {
		user = null;
		product = null;
		quantity = 0;
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}