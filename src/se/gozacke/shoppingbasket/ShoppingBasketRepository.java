package se.gozacke.shoppingbasket;

import java.util.List;

public interface ShoppingBasketRepository {
	public List<ShoppingBasket> getAllShoppingBaskets();
	public void setOrderInShoppingBasket(int userId, int productId, int quantity);
	public void updateOrderInShoppingBasket(ShoppingBasket shoppingBasket);
	public void deleteOrderInShoppingBasket(ShoppingBasket shoppingBasket);
}