package se.gozacke.main;

import se.gozacke.category.CategoryRepository;
import se.gozacke.category.MySQLCategoryRepository;
import se.gozacke.ecommerce.ECommerce;
import se.gozacke.product.MySQLProductRepository;
import se.gozacke.product.ProductRepository;
import se.gozacke.shoppingbasket.MySQLShoppingBasketRepository;
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
		
		System.out.println(eCommerceProduct.getAllProducts());
		// *************************************************************************
		
		// *************************************************************************
		CategoryRepository categoryRepository = new MySQLCategoryRepository();
		CategoryRepository eCommerceCategory = new ECommerce(categoryRepository);
		
		System.out.println(eCommerceCategory.getAllCategories());
		// *************************************************************************
		
		// *************************************************************************
		ShoppingBasketRepository shoppingBasketRepository = new MySQLShoppingBasketRepository();
		ShoppingBasketRepository eCommerceShoppingBasket = new ECommerce(shoppingBasketRepository);
		
		System.out.println(eCommerceShoppingBasket.getAllShoppingBaskets());
		// *************************************************************************
	}
}