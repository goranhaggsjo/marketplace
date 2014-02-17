package se.gozacke.main;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import se.gozacke.actor.Actor;
import se.gozacke.actor.ActorRepository;
import se.gozacke.actor.MySQLActorRepository;
import se.gozacke.author.Author;
import se.gozacke.author.AuthorRepository;
import se.gozacke.author.MySQLAuthorRepository;
import se.gozacke.category.Category;
import se.gozacke.category.CategoryRepository;
import se.gozacke.category.MySQLCategoryRepository;
import se.gozacke.console.ActorConsole;
import se.gozacke.console.AuthorConsole;
import se.gozacke.console.BookConsole;
import se.gozacke.console.CategoryConsole;
import se.gozacke.console.FilmConsole;
import se.gozacke.console.MainConsole;
import se.gozacke.console.ProductConsole;
import se.gozacke.console.UserConsole;
import se.gozacke.ecommerce.ECommerce;
import se.gozacke.product.Book;
import se.gozacke.product.Film;
import se.gozacke.product.MySQLProductRepository;
import se.gozacke.product.Product;
import se.gozacke.product.ProductRepository;
import se.gozacke.productcategory.MySQLProductCategoryRepository;
import se.gozacke.productcategory.ProductCategory;
import se.gozacke.productcategory.ProductCategoryRepository;
import se.gozacke.shoppingbasket.MySQLShoppingBasketRepository;
import se.gozacke.shoppingbasket.ShoppingBasket;
import se.gozacke.shoppingbasket.ShoppingBasketRepository;
import se.gozacke.staff.MySQLStaffRepository;
import se.gozacke.staff.Staff;
import se.gozacke.staff.StaffRepository;
import se.gozacke.user.MySQLUserRepository;
import se.gozacke.user.User;
import se.gozacke.user.UserRepository;

public class Main {

	public static void main(String[] args) {
		UserRepository userRepository = new MySQLUserRepository();
		UserRepository eCommerceUser = new ECommerce(userRepository);
		
		ProductRepository productRepository = new MySQLProductRepository();
		ProductRepository eCommerceProduct = new ECommerce(productRepository);
		
		CategoryRepository categoryRepository = new MySQLCategoryRepository();
		CategoryRepository eCommerceCategory = new ECommerce(categoryRepository);
		
		ShoppingBasketRepository shoppingBasketRepository = new MySQLShoppingBasketRepository();
		ShoppingBasketRepository eCommerceShoppingBasket = new ECommerce(shoppingBasketRepository);
		
		ProductCategoryRepository productCategoryRepository = new MySQLProductCategoryRepository();
		ProductCategoryRepository eCommerceProductCategory = new ECommerce(productCategoryRepository);
		
		StaffRepository staffRepository = new MySQLStaffRepository();
		StaffRepository eCommerceStaff = new ECommerce(staffRepository);
		
		ActorRepository actorRepository = new MySQLActorRepository();
		ActorRepository eCommerceActor = new ECommerce(actorRepository);
		
		AuthorRepository authorRepository = new MySQLAuthorRepository();
		AuthorRepository eCommerceAuthor = new ECommerce(authorRepository);
		
		// *************************************************************************
		
		
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
		
//		System.out.println(eCommerceShoppingBasket.getShoppingBasketOnUsername("manne.banne@hotmail.com"));
		
//		System.out.println(eCommerceShoppingBasket.getAllShoppingBaskets());
		// *************************************************************************
		
		// *************************************************************************
		
		
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
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		// List all products *****************************************************************
//		for(Product p : eCommerceProduct.getAllProducts()) {
//			System.out.println(p);
//		}
		
//		for(Film f : eCommerceProduct.getAllFilms()) {
//			System.out.println(f);
//		}
		
//		for(Actor a : eCommerceActor.getAllActors()) {
//			System.out.println(a);
//		}
		
//		for(Actor a : eCommerceActor.getActorOnActorId(3)) {
//			System.out.println(a);
//		}
		
//		for(Actor a : eCommerceActor.getActorOnFirstNameAndSurName("Roger", "Moore")) {
//			System.out.println(a);
//		}
		
		//---------------
//		Actor a1 = new Actor();
//		a1.setFirstName("Tom");
//		a1.setSurName("Cruise");
//		a1.setDob("1964-05-24");
//		
//		eCommerceActor.insertActor(a1);
		//---------------
		
		//---------------
//		Actor a1 = eCommerceActor.getActorOnActorId(9).get(0);
//		a1.setFirstName("Argo");
//		a1.setSurName("Naut");
//		a1.setDob("1988-01-30");
//		
//		eCommerceActor.updateActor(a1);
		
//		System.out.println(eCommerceActor.getActorsFilmIds(a1));
		//---------------
		
		//---------------
//		Actor a1 = eCommerceActor.getActorOnActorId(11).get(0);
//		
//		eCommerceActor.deleteActor(a1, eCommerceActor, eCommerceProduct);
		//---------------
		
		
//		System.out.println(eCommerceActor.getIfFilmIdStillExistOnAnyActorId(1));
		
//		System.out.println(eCommerceProduct.getProductIdOnFilmId(15));
		
//		System.out.println(eCommerceProduct.getFilmsOnActorId(1));
		
//		System.out.println(eCommerceProduct.getFilmsOnActorFirstNameAndSurName("Arnold", "Swarschenegger"));
		
//		System.out.println(eCommerceAuthor.getAllAuthors());
		
//		System.out.println(eCommerceProduct.getAllBooks());
		
//		System.out.println(eCommerceProduct.getBooksOnAuthorId(2));
		
//		System.out.println(eCommerceProduct.getBooksOnAuthorFirstNameAndSurName("JRR", "Tolkien"));
		
//		System.out.println(eCommerceAuthor.getAuthorOnAuthorId(4));
		
//		System.out.println(eCommerceAuthor.getAuthorOnFirstNameAndSurName("JRR", "Tolkien"));
		
		//-----------------
//		Author a1 = eCommerceAuthor.getAuthorOnAuthorId(3).get(0);
		
//		System.out.println(eCommerceAuthor.getAuthorsBookIds(a1));
//		System.out.println(eCommerceAuthor.getIfBookIdStillExistOnAnyAuthorId(12));
		//-----------------
		
		//-----------------
//		Author a1 = new Author();
//		a1.setFirstName("Werter");
//		a1.setSurName("Original");
//		a1.setDob("1856-02-23");
//		
//		eCommerceAuthor.insertAuthor(a1);
		//-----------------
		
		//-----------------
//		Author a1 = eCommerceAuthor.getAuthorOnAuthorId(5).get(0);
//		a1.setFirstName("Lena");
//		a1.setSurName("Nyman");
//		a1.setDob("1961-06-06");
//		
//		eCommerceAuthor.updateAuthor(a1);
		//-----------------
		
		//-----------------
//		System.out.println(eCommerceProduct.getProductIdOnBookId(12));
		
//		Author a1 = eCommerceAuthor.getAuthorOnAuthorId(2).get(0);
//		
//		eCommerceAuthor.deleteAuthor(a1, eCommerceAuthor, eCommerceProduct);
		//*************************
		//*************************
		//*************************
		//*************************
		//*************************
		//-----------------
		
		//----------------
//		Film f1 = new Film();
//		f1.setProductName("For a few dollar more");
//		f1.setDescription("A western movie with Clint Eastwood.");
//		f1.setCost(20);
//		f1.setRrp(40);
//		f1.setAgelimit(15);
//		f1.setRating(5);
//		f1.setReleaseYear("1961");
//		
//		Set<Integer> i1 = new TreeSet<>();
//		i1.add(2);
//		i1.add(5);
//		i1.add(8);
//		
//		Set<Integer> a1 = new TreeSet<>();
//		a1.add(1);
//		a1.add(3);
//		
//		eCommerceProduct.insertFilm(f1, i1, a1);
		//----------------
		
		//----------------
//		System.out.println(eCommerceProduct.getFilmOnProductId(62));
//		System.out.println(eCommerceProduct.getFilmOnProductName("The finally escaped prisoners"));
		
//		Film f2 = eCommerceProduct.getFilmOnProductName("Watership Down").get(0);
//		f2.setProductName("Watership Down");
//		f2.setDescription("Animated rabbit movie.");
//		f2.setCost(21);
//		f2.setRrp(56);
//		f2.setAgelimit(11);
//		f2.setRating(1);
//		f2.setReleaseYear("1985");
//		
//		Set<Integer> i1 = new TreeSet<>();
//		i1.add(4);
//		i1.add(2);
//		i1.add(11);
//		
//		Set<Integer> a1 = new TreeSet<>();
//		a1.add(2);
//		
//		eCommerceProduct.updateFilm(f2, i1, a1);
		//----------------
		
		//----------------
//		Film f3 = eCommerceProduct.getFilmOnProductName("film").get(0);
//		
//		eCommerceProduct.deleteFilm(f3);
		//----------------
		
		//-------------
//		Product p1 = new Product();
//		p1.setProductName("Wax");
//		p1.setDescription("Good for thin hair.");
//		p1.setCost(32);
//		p1.setRrp(130);
//		
//		Set<Integer> i3 = new TreeSet<>();
//		
//		i3.add(2);
//		i3.add(5);
//		i3.add(8);
//		
//		eCommerceProduct.insertProduct(p1, i3);
		//-------------
		
		//-------------
//		Product p2 = eCommerceProduct.getProductFromProductName("Wacko").get(0);
//		p2.setProductName("Wax");
//		p2.setDescription("Good for thin hair.");
//		p2.setCost(32);
//		p2.setRrp(130);
//		
//		Set<Integer> i4 = new TreeSet<>();
//		i4.add(9);
//		i4.add(1);
//		
//		eCommerceProduct.updateProduct(p2, i4);
		//-------------
		
		//-------------
//		Book b1 = new Book();
//		b1.setProductName("Narnia");
//		b1.setDescription("A family fantasy.");
//		b1.setIsbn("238239854");
//		b1.setCost(110);
//		b1.setRrp(240);
//		b1.setPublished("1955");
//		
//		Set<Integer> i2 = new TreeSet<>();
//		i2.add(2);
//		i2.add(5);
//		i2.add(8);
//		
//		Set<Integer> a1 = new TreeSet<>();
//		a1.add(2);
//		a1.add(3);
//		
//		eCommerceProduct.insertBook(b1, i2, a1);
		//-------------
		
		//-------------
//		System.out.println(eCommerceProduct.getBookOnProductId(63));
//		System.out.println(eCommerceProduct.getBookOnProductName("IT"));
		
//		Book b1 = eCommerceProduct.getBookOnProductName("Narnia").get(0);
//		b1.setProductName("Narnia Two");
//		b1.setDescription("A not so great family fantasy book.");
//		b1.setIsbn("4523768454");
//		b1.setCost(55);
//		b1.setRrp(178);
//		b1.setPublished("1957");
//		
//		Set<Integer> i4 = new TreeSet<>();
//		i4.add(5);
//		i4.add(3);
//		i4.add(11);
//		
//		Set<Integer> a1 = new TreeSet<>();
//		a1.add(3);
//		
//		eCommerceProduct.updateBook(b1, i4, a1);
		//-------------
		
		//-------------
//		Book b1 = eCommerceProduct.getBookOnProductName("IT").get(0);
//		
//		eCommerceProduct.deleteBook(b1);
		//-------------
		// **********************************************************************************
		
		// Console for CRUD on product ******************************************************
//		MainConsole.mainWindow(eCommerceProduct, eCommerceCategory, eCommerceActor, eCommerceAuthor, eCommerceStaff, eCommerceUser);
		
		
//		ProductConsole.insertProduct(eCommerceProduct, eCommerceCategory);
		
//		ProductConsole.updateProduct(eCommerceProduct, eCommerceCategory);
		
//		ProductConsole.deleteProduct(eCommerceProduct, eCommerceCategory);
		
//		ProductConsole.getProductsOnCategoryName(eCommerceProduct, eCommerceCategory);
		
//		ProductConsole.getProductOnProductName(eCommerceProduct);
		
		
//		FilmConsole.insertFilm(eCommerceProduct, eCommerceCategory, eCommerceActor);
		
//		FilmConsole.updateFilm(eCommerceProduct, eCommerceCategory, eCommerceActor);
		
//		FilmConsole.deleteFilm(eCommerceProduct, eCommerceCategory, eCommerceActor);
		
		
//		BookConsole.insertBook(eCommerceProduct, eCommerceCategory, eCommerceAuthor);
		
//		BookConsole.updateBook(eCommerceProduct, eCommerceCategory, eCommerceAuthor);
		
//		BookConsole.deleteBook(eCommerceProduct, eCommerceCategory, eCommerceAuthor);
		
		
//		CategoryConsole.insertCategory(eCommerceCategory, eCommerceStaff);
		
//		CategoryConsole.updateCategory(eCommerceCategory, eCommerceStaff);
		
//		CategoryConsole.deleteCategory(eCommerceCategory, eCommerceStaff);
		
		
//		UserConsole.insertUser(eCommerceUser);
		
//		UserConsole.updateUser(eCommerceUser);
		
//		UserConsole.deleteUser(eCommerceUser);
		
//		UserConsole.validateUser(eCommerceUser);
		
		
//		ActorConsole.insertActor(eCommerceActor);
		
//		ActorConsole.updateActor(eCommerceActor);
		
//		ActorConsole.deleteActor(eCommerceActor, eCommerceProduct);
		
		
//		AuthorConsole.insertAuthor(eCommerceAuthor);
		
//		AuthorConsole.updateAuthor(eCommerceAuthor);
		
//		AuthorConsole.deleteAuthor(eCommerceAuthor, eCommerceProduct);
		// **********************************************************************************
		
		// Insert new product and set which category it belongs to **************************
//		Product p1 = new Product();
		
//		p1.setProductName("Trumpet");
//		p1.setDescription("Give a nice tone");
//		p1.setCost(23.45);
//		p1.setRrp(51.21);
		
//		Category c1 = eCommerceCategory.getCategoryOnCategoryName("Films").get(0);
		
//		eCommerceProduct.insertProduct(p1, c1);
		// **********************************************************************************
		
		// Update product *******************************************************************
//		Product p2 = eCommerceProduct.getProductFromProductName("Trumpet").get(0);
		
//		p2.setProductName("Guitar");
//		p2.setDescription("Burry sound.");
//		p2.setCost(66);
//		p2.setRrp(99);
		
//		eCommerceProduct.updateProduct(p2);
		// **********************************************************************************
		
		// Delete product and from products_categories and shoppingbasket *******************
//		Product p3 = eCommerceProduct.getProductFromProductName("Guitar").get(0);
		
//		eCommerceProduct.deleteProduct(p3);
		// **********************************************************************************
		
		
		
		// List all categories ***************************************************************
//		for(Category c : eCommerceCategory.getAllCategories()) {
//			System.out.println(c);
//		}
		// **********************************************************************************
		
		// Insert new category and staff member responsible for that category ***************
//		int staffId = eCommerceStaff.getStaffFromFirstNameAndSurName("Eve", "White").get(0).getStaffId();
		
//		Category c2 = new Category();
		
//		c2.setCategoryName("Space");
//		c2.setStaffId(staffId);
		
//		eCommerceCategory.insertCategory(c2);
		// **********************************************************************************
		
		// Update category ******************************************************************
//		Category c3 = eCommerceCategory.getCategoryOnCategoryName("Space").get(0);
		
//		c3.setCategoryName("Outerspace");
		
//		eCommerceCategory.updateCategory(c3);
		// **********************************************************************************
		
		// Delete category and from products_categories *************************************
//		Category c4 = eCommerceCategory.getCategoryOnCategoryName("Outerspace").get(0);
		
//		eCommerceCategory.deleteCategory(c4);
		// **********************************************************************************
		
		
		
		// List all products belonging to categories *****************************************
//		for(ProductCategory pc : eCommerceProductCategory.getAllProductCategories()) {
//			System.out.println(pc);
//		}
		// **********************************************************************************
		
		// Insert new product to category ***************************************************
//		ProductCategory pc1 = new ProductCategory();
		
//		pc1.setProductId(eCommerceProduct.getProductFromProductName("bike").get(0).getProductId());
//		pc1.setCategoryId(eCommerceCategory.getCategoryOnCategoryName("Films").get(0).getCategoryId());
		
//		eCommerceProductCategory.insertProductCategory(pc1);
		// **********************************************************************************
		
		// Update product belonging to category **********************************************
//		ProductCategory pc2 = eCommerceProductCategory.getAllProductCategories().get(5);
		
//		pc2.setProductId(eCommerceProduct.getProductFromProductName("test").get(0).getProductId());
//		pc2.setCategoryId(eCommerceCategory.getCategoryOnCategoryName("Children").get(0).getCategoryId());
		
//		eCommerceProductCategory.updateProductCategory(pc2);
		// **********************************************************************************
		
		// Delete product from category *****************************************************
//		ProductCategory pc3 = eCommerceProductCategory.getAllProductCategories().get(5);
		
//		eCommerceProductCategory.deleteProductCategory(pc3);
		// **********************************************************************************
		
		
		
		// List all users *******************************************************************
//		for(User u : eCommerceUser.getAllUsers()) {
//			System.out.println(u);
//		}
		// **********************************************************************************
		
		// Insert user **********************************************************************
//		User u1 = new User();
		
//		u1.setEmail("great@user.se");
//		u1.setPassword("greater");
//		u1.setFirstName("Harald");
//		u1.setSurName("Ostman");
//		u1.setStreetAddress("Greatgatan 23");
//		u1.setTown("Oslo");
//		u1.setPostCode("53368");
//		u1.setTelephone("0701-653275");
		
//		eCommerceUser.insertUser(u1);
		// **********************************************************************************
		
		// Update user **********************************************************************
//		User u2 = eCommerceUser.getAllUsers().get(3);
		
//		u2.setEmail("werters@original.nu");
//		u2.setPassword("olgazzz");
//		u2.setFirstName("Werter");
//		u2.setSurName("Original");
//		u2.setStreetAddress("Sindargatan 99");
//		u2.setTown("Halmstad");
//		u2.setPostCode("22998");
//		u2.setTelephone("073-399548");
		
//		eCommerceUser.updateUser(u2);
		// **********************************************************************************
		
		// Delete user **********************************************************************
//		User u3 = eCommerceUser.getAllUsers().get(3);
		
//		eCommerceUser.deleteUser(u3);
		// **********************************************************************************
		
		// Validate username and password to see if it's a valid user ***********************
//		System.out.println(eCommerceUser.validateUsernameAndPassword("manne.banne@hotmail.com", "gneten"));
		// **********************************************************************************
		
		
		
		// List all shoppingbaskets *********************************************************
//		for(ShoppingBasket sb : eCommerceShoppingBasket.getAllShoppingBaskets()) {
//			System.out.println(sb);
//		}
		// **********************************************************************************
		
		// Insert order to the shoppingbasket ***********************************************
//		ShoppingBasket sb1 = new ShoppingBasket();
		
//		sb1.setUserId(eCommerceUser.getAllUsers().get(2).getUserId());
//		sb1.setProductId(eCommerceProduct.getProductFromProductName("bike").get(0).getProductId());
//		sb1.setQuantity(2);
		
//		eCommerceShoppingBasket.insertOrderInShoppingBasket(sb1);
		// **********************************************************************************
		
		// Update shoppingbasket ************************************************************
//		ShoppingBasket sb2 = eCommerceShoppingBasket.getAllShoppingBaskets().get(5);
		
//		sb2.setProductId(eCommerceProduct.getProductFromProductName("test").get(0).getProductId());
//		sb2.setQuantity(12);
		
//		eCommerceShoppingBasket.updateOrderInShoppingBasket(sb2);
		// **********************************************************************************
		
		// Delete shoppingbasket ************************************************************
//		ShoppingBasket sb3 = eCommerceShoppingBasket.getAllShoppingBaskets().get(5);
		
//		eCommerceShoppingBasket.deleteOrderInShoppingBasket(sb3);
		// **********************************************************************************
		
		
		
		// List staff member on firstname and surname ***************************************
//		for(Staff s : eCommerceStaff.getStaffFromFirstNameAndSurName("Sophia", "Nash")) {
//			System.out.println(s);
//		}
		// **********************************************************************************
	}
}