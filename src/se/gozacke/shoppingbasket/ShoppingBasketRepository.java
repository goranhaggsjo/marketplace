package se.gozacke.shoppingbasket;

import java.util.List;

public interface ShoppingBasketRepository {
	public List<ShoppingBasket> getAllShoppingBaskets();
	public void insertOrderInShoppingBasket(ShoppingBasket shoppingBasket);
	public void updateOrderInShoppingBasket(ShoppingBasket shoppingBasket);
	public void deleteOrderInShoppingBasket(ShoppingBasket shoppingBasket);
	public List<ShoppingBasket> getShoppingBasketOnUsername(String username);
}