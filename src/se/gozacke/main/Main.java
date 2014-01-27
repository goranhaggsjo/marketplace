package se.gozacke.main;

import se.gozacke.category.Category;
import se.gozacke.category.CategoryRepository;
import se.gozacke.category.MySQLCategoryRepository;
import se.gozacke.ecommerce.ECommerce;
import se.gozacke.product.MySQLProductRepository;
import se.gozacke.product.Product;
import se.gozacke.product.ProductRepository;
import se.gozacke.productcategory.MySQLProductCategoryRepository;
import se.gozacke.productcategory.ProductCategory;
import se.gozacke.productcategory.ProductCategoryRepository;
import se.gozacke.shoppingbasket.MySQLShoppingBasketRepository;
import se.gozacke.shoppingbasket.ShoppingBasket;
import se.gozacke.shoppingbasket.ShoppingBasketRepository;
import se.gozacke.user.MySQLUserRepository;
import se.gozacke.user.User;
import se.gozacke.user.UserRepository;

public class Main {

	public static void main(String[] args) {
		// *************************************************************************
//		UserRepository userRepository = new MySQLUserRepository();
//		UserRepository eCommerceUser = new ECommerce(userRepository);
		
//		User u1 = new User();
//		u1.setEmail("another.one@hotmail.com");
//		u1.setPassword("another");
//		u1.setFirstName("Another");
//		u1.setSurName("One");
//		u1.setStreetAddress("Hujajagatan 55");
//		u1.setPostCode("96767");
//		u1.setTown("New York");
//		u1.setTelephone("055-54323234");
		
//		eCommerceUser.insertUser(u1);
		
//		User u2 = eCommerceUser.getAllUsers().get(3);
//		u2.setEmail("great.two@gmail.com");
//		u2.setPassword("great");
//		u2.setFirstName("Great");
//		u2.setSurName("Two");
//		u2.setStreetAddress("Nehehehejgatan 99");
//		u2.setPostCode("435734");
//		u2.setTown("Philadelphia");
//		u2.setTelephone("0505-111222333");
		
//		eCommerceUser.updateUser(u2);
		
//		eCommerceUser.deleteUser(u2);
		
//		System.out.println(eCommerceUser.validateUsernameAndPassword("manne.banne@hotmail.com", "gneten"));
		
//		System.out.println(eCommerceUser.getAllUsers());
		// *************************************************************************
		
		// *************************************************************************
//		ProductRepository productRepository = new MySQLProductRepository();
//		ProductRepository eCommerceProduct = new ECommerce(productRepository);
		
//		Product p1 = new Product();
//		p1.setProductName("Trumpet");
//		p1.setDescription("Give a nice tone");
//		p1.setCost(23.45);
//		p1.setRrp(51.21);
		
//		eCommerceProduct.insertProduct(p1);
		
//		Product p2 = eCommerceProduct.getAllProducts().get(2);
//		p2.setProductName("Brush");
//		p2.setDescription("The hair will be nice.");
//		p2.setCost(123.50);
//		p2.setRrp(210.60);
		
//		eCommerceProduct.updateProduct(p2);
		
//		eCommerceProduct.deleteProduct(p2);
		
//		System.out.println(eCommerceProduct.getProductsFromCategoryName("Children"));
		
//		System.out.println(eCommerceProduct.getProductFromProductName("Flashlight"));
		
//		System.out.println(eCommerceProduct.getAllProducts());
		// *************************************************************************
		
		// *************************************************************************
//		CategoryRepository categoryRepository = new MySQLCategoryRepository();
//		CategoryRepository eCommerceCategory = new ECommerce(categoryRepository);
		
//		Category c1 = new Category();
//		c1.setCategoryName("Space");
//		c1.setStaffId(46);
		
//		eCommerceCategory.insertCategory(c1);
		
//		Category c2 = eCommerceCategory.getAllCategories().get(11);
//		c2.setCategoryName("Nasa");
//		c2.setStaffId(36);
		
//		eCommerceCategory.updateCategory(c2);
		
//		eCommerceCategory.deleteCategory(c2);
		
//		System.out.println(eCommerceCategory.getAllCategories());
		// *************************************************************************
		
		// *************************************************************************
		ShoppingBasketRepository shoppingBasketRepository = new MySQLShoppingBasketRepository();
		ShoppingBasketRepository eCommerceShoppingBasket = new ECommerce(shoppingBasketRepository);
		
//		ShoppingBasket sb1 = new ShoppingBasket();
//		sb1.setUserId(3);
//		sb1.setProductId(2);
//		sb1.setQuantity(11);
		
//		eCommerceShoppingBasket.insertOrderInShoppingBasket(sb1);
		
//		ShoppingBasket sb2 = eCommerceShoppingBasket.getAllShoppingBaskets().get(1);
//		sb2.setUserId(3);
//		sb2.setQuantity(15);
//		eCommerceShoppingBasket.updateOrderInShoppingBasket(sb2);
		
//		eCommerceShoppingBasket.deleteOrderInShoppingBasket(sb2);
		
		System.out.println(eCommerceShoppingBasket.getShoppingBasketOnUsername("manne.banne@hotmail.com"));
		
//		System.out.println(eCommerceShoppingBasket.getAllShoppingBaskets());
		// *************************************************************************
		
		// *************************************************************************
//		ProductCategoryRepository productCategoryRepository = new MySQLProductCategoryRepository();
//		ProductCategoryRepository eCommerceProductCategory = new ECommerce(productCategoryRepository);
		
//		ProductCategory pc1 = new ProductCategory();
//		pc1.setProductId(1);
//		pc1.setCategoryId(11);
		
//		eCommerceProductCategory.insertProductCategory(pc1);
		
//		ProductCategory pc2 = eCommerceProductCategory.getAllProductCategories().get(2);
//		pc2.setProductId(2);
//		pc2.setCategoryId(1);
		
//		eCommerceProductCategory.updateProductCategory(pc2);
		
//		eCommerceProductCategory.deleteProductCategory(pc2);
		
//		System.out.println(eCommerceProductCategory.getAllProductCategories());
		// *************************************************************************
	}
}