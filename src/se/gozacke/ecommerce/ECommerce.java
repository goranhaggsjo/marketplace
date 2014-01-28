package se.gozacke.ecommerce;

import java.util.List;

import se.gozacke.category.Category;
import se.gozacke.category.CategoryRepository;
import se.gozacke.product.Product;
import se.gozacke.product.ProductRepository;
import se.gozacke.productcategory.ProductCategory;
import se.gozacke.productcategory.ProductCategoryRepository;
import se.gozacke.shoppingbasket.ShoppingBasket;
import se.gozacke.shoppingbasket.ShoppingBasketRepository;
import se.gozacke.staff.Staff;
import se.gozacke.staff.StaffRepository;
import se.gozacke.user.User;
import se.gozacke.user.UserRepository;

public class ECommerce implements CategoryRepository, ProductRepository, UserRepository,
								  ShoppingBasketRepository, ProductCategoryRepository,
								  StaffRepository {
	CategoryRepository categoryRepository;
	ProductRepository productRepository;
	UserRepository userRepository;
	ShoppingBasketRepository shoppingBasketRepository;
	ProductCategoryRepository productCategoryRepository;
	StaffRepository staffRepository;
	
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
	
	public ECommerce(ProductCategoryRepository productCategoryRepository) {
		this.productCategoryRepository = productCategoryRepository;
	}
	
	public ECommerce(StaffRepository staffRepository) {
		this.staffRepository = staffRepository;
	}
	
	// *******************************************************************
	@Override
	public List<Category> getAllCategories() {
		return categoryRepository.getAllCategories();
	}
	
	@Override
	public void insertCategory(Category category) {
		categoryRepository.insertCategory(category);
	}

	@Override
	public void updateCategory(Category category) {
		categoryRepository.updateCategory(category);
	}

	@Override
	public void deleteCategory(Category category) {
		categoryRepository.deleteCategory(category);
	}
	
	@Override
	public List<Category> getCategoryOnCategoryName(String categoryName) {
		return categoryRepository.getCategoryOnCategoryName(categoryName);
	}
	
	@Override
	public void updateStaffMemberResponsibleForCategory(int staffId, int categoryId) {
		categoryRepository.updateStaffMemberResponsibleForCategory(staffId, categoryId);
	}
	// *******************************************************************
	
	// *******************************************************************
	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}
	
	@Override
	public void insertProduct(Product product) {
		productRepository.insertProduct(product);
	}
	
	@Override
	public void updateProduct(Product product) {
		productRepository.updateProduct(product);
	}
	
	@Override
	public void deleteProduct(Product product) {
		productRepository.deleteProduct(product);
	}
	
	@Override
	public List<Product> getProductsFromCategoryName(String categoryName) {
		return productRepository.getProductsFromCategoryName(categoryName);
	}
	
	@Override
	public List<Product> getProductFromProductName(String productName) {
		return productRepository.getProductFromProductName(productName);
	}
	// *******************************************************************
	
	// *******************************************************************
	@Override
	public List<User> getAllUsers() {
		return userRepository.getAllUsers();
	}
	
	@Override
	public void insertUser(User user) {
		userRepository.insertUser(user);
	}

	@Override
	public void updateUser(User user) {
		userRepository.updateUser(user);
	}

	@Override
	public void deleteUser(User user) {
		userRepository.deleteUser(user);
	}
	
	@Override
	public boolean validateUsernameAndPassword(String username, String password) {
		return userRepository.validateUsernameAndPassword(username, password);
	}
	// *******************************************************************
	
	// *******************************************************************
	@Override
	public List<ShoppingBasket> getAllShoppingBaskets() {
		return shoppingBasketRepository.getAllShoppingBaskets();
	}
	
	@Override
	public void insertOrderInShoppingBasket(ShoppingBasket shoppingBasket) {
		shoppingBasketRepository.insertOrderInShoppingBasket(shoppingBasket);
	}
	
	@Override
	public void updateOrderInShoppingBasket(ShoppingBasket shoppingBasket) {
		shoppingBasketRepository.updateOrderInShoppingBasket(shoppingBasket);
	}
	
	@Override
	public void deleteOrderInShoppingBasket(ShoppingBasket shoppingBasket) {
		shoppingBasketRepository.deleteOrderInShoppingBasket(shoppingBasket);
	}
	
	@Override
	public List<ShoppingBasket> getShoppingBasketOnUsername(String username) {
		return shoppingBasketRepository.getShoppingBasketOnUsername(username);
	}
	// *******************************************************************
	
	// *******************************************************************
	@Override
	public List<ProductCategory> getAllProductCategories() {
		return productCategoryRepository.getAllProductCategories();
	}

	@Override
	public void insertProductCategory(ProductCategory productCategory) {
		productCategoryRepository.insertProductCategory(productCategory);
	}

	@Override
	public void updateProductCategory(ProductCategory productCategory) {
		productCategoryRepository.updateProductCategory(productCategory);
	}

	@Override
	public void deleteProductCategory(ProductCategory productCategory) {
		productCategoryRepository.deleteProductCategory(productCategory);
	}
	// *******************************************************************
	
	// *******************************************************************
	@Override
	public List<Staff> getStaffFromFirstNameAndSurName(String firstName, String surName) {
		return staffRepository.getStaffFromFirstNameAndSurName(firstName, surName);
	}
	// *******************************************************************
}