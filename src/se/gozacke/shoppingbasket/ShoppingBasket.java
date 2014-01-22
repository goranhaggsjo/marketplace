package se.gozacke.shoppingbasket;

public class ShoppingBasket {
	private int userId;
	private int productId;
	private int quantity;
	
	public ShoppingBasket() {
		userId = 0;
		productId = 0;
		quantity = 0;
	}
	
	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		String shoppingBasketInfo = "";
		
		shoppingBasketInfo += "userId: " + userId + "\n";
		shoppingBasketInfo += "productId: " + productId + "\n";
		shoppingBasketInfo += "quantity: " + quantity + "\n";
		
		return shoppingBasketInfo;
	}
}