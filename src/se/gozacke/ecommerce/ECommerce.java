package se.gozacke.ecommerce;

import java.util.List;

import se.gozacke.category.Category;
import se.gozacke.category.CategoryRepository;
import se.gozacke.product.Product;
import se.gozacke.product.ProductRepository;
import se.gozacke.shoppingbasket.ShoppingBasket;
import se.gozacke.shoppingbasket.ShoppingBasketRepository;
import se.gozacke.user.User;
import se.gozacke.user.UserRepository;

public class ECommerce implements CategoryRepository, ProductRepository, UserRepository,
								  ShoppingBasketRepository{
	CategoryRepository categoryRepository;
	ProductRepository productRepository;
	UserRepository userRepository;
	ShoppingBasketRepository shoppingBasketRepository;
	
	public ECommerce(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}
	
	public ECommerce(ProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public ECommerce(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public ECommerce(ShoppingBasketRepository shoppingBasketRepository) {
		this.shoppingBasketRepository = shoppingBasketRepository;
	}
	
	// *******************************************************************
	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.getAllCategories();
	}
	// *******************************************************************
	
	// *******************************************************************
	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}
	// *******************************************************************
	
	// *******************************************************************
	@Override
	public List<User> getAllUsers() {
		return userRepository.getAllUsers();
	}
	// *******************************************************************
	
	// *******************************************************************
	@Override
	public List<ShoppingBasket> getAllShoppingBaskets() {
		return shoppingBasketRepository.getAllShoppingBaskets();
	}
	// *******************************************************************
}