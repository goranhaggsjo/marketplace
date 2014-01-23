package se.gozacke.main;

import se.gozacke.category.CategoryRepository;
import se.gozacke.category.MySQLCategoryRepository;
import se.gozacke.ecommerce.ECommerce;
import se.gozacke.product.MySQLProductRepository;
import se.gozacke.product.Product;
import se.gozacke.product.ProductRepository;
import se.gozacke.shoppingbasket.MySQLShoppingBasketRepository;
import se.gozacke.shoppingbasket.ShoppingBasket;
import se.gozacke.shoppingbasket.ShoppingBasketRepository;
import se.gozacke.user.MySQLUserRepository;
import se.gozacke.user.UserRepository;

public class Main {

	public static void main(String[] args) {
		// *************************************************************************
		UserRepository userRepository = new MySQLUserRepository();
		UserRepository eCommerceUser = new ECommerce(userRepository);
		
		System.out.println(eCommerceUser.getAllUsers());
		// *************************************************************************
		// *************************************************************************
		ProductRepository productRepository = new MySQLProductRepository();
		ProductRepository eCommerceProduct = new ECommerce(productRepository);
		
//		Product p1 = new Product();
//		p1.setProductName("Trumpet");
//		p1.setDescription("Give a nice tone");
//		p1.setCost(23.45);
//		p1.setRrp(51.21);
		
//		eCommerceProduct.setProduct(p1);
		
		System.out.println(eCommerceProduct.getAllProducts());
		// *************************************************************************
		
		// *************************************************************************
//		CategoryRepository categoryRepository = new MySQLCategoryRepository();
//		CategoryRepository eCommerceCategory = new ECommerce(categoryRepository);
		
//		System.out.println(eCommerceCategory.getAllCategories());
		// *************************************************************************
		
		// *************************************************************************
//		ShoppingBasketRepository shoppingBasketRepository = new MySQLShoppingBasketRepository();
//		ShoppingBasketRepository eCommerceShoppingBasket = new ECommerce(shoppingBasketRepository);
		
//		eCommerceShoppingBasket.setOrderInShoppingBasket(2, 1, 6);
		
//		ShoppingBasket sb1 = eCommerceShoppingBasket.getAllShoppingBaskets().get(1);
//		sb1.setUserId(3);
//		sb1.setQuantity(15);
//		eCommerceShoppingBasket.updateOrderInShoppingBasket(sb1);
		
//		eCommerceShoppingBasket.deleteOrderInShoppingBasket(sb1);
		
//		System.out.println(eCommerceShoppingBasket.getAllShoppingBaskets());
		// *************************************************************************
	}
}