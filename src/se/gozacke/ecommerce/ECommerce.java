package se.gozacke.ecommerce;

import java.util.List;
import java.util.Set;

import se.gozacke.actor.Actor;
import se.gozacke.actor.ActorRepository;
import se.gozacke.author.Author;
import se.gozacke.author.AuthorRepository;
import se.gozacke.category.Category;
import se.gozacke.category.CategoryRepository;
import se.gozacke.product.Book;
import se.gozacke.product.Film;
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
								  StaffRepository, ActorRepository, AuthorRepository {
	CategoryRepository categoryRepository;
	ProductRepository productRepository;
	UserRepository userRepository;
	ShoppingBasketRepository shoppingBasketRepository;
	ProductCategoryRepository productCategoryRepository;
	StaffRepository staffRepository;
	ActorRepository actorRepository;
	AuthorRepository authorRepository;
	
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
	
	public ECommerce(ActorRepository actorRepository) {
		this.actorRepository = actorRepository;
	}
	
	public ECommerce(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
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
	
	@Override
	public List<Category> getCategoriesFromProductName(String productName) {
		return categoryRepository.getCategoriesFromProductName(productName);
	}
	
	@Override
	public List<Category> getCategoriesFromProductId(int productId) {
		return categoryRepository.getCategoriesFromProductId(productId);
	}
	
	@Override
	public List<Category> getCategoryOnCategoryId(int categoryId) {
		return categoryRepository.getCategoryOnCategoryId(categoryId);
	}
	// *******************************************************************
	
	// *******************************************************************
	@Override
	public List<Product> getAllProducts() {
		return productRepository.getAllProducts();
	}
	
	@Override
	public void insertProduct(Product product, Set<Integer> listOfCategories) {
		productRepository.insertProduct(product, listOfCategories);
	}
	
	@Override
	public void updateProduct(Product product, Set<Integer> listOfCategories) {
		productRepository.updateProduct(product, listOfCategories);
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
	
	@Override
	public List<Film> getAllFilms() {
		return productRepository.getAllFilms();
	}
	
	@Override
	public List<Film> getFilmsOnActorId(int actorId) {
		return productRepository.getFilmsOnActorId(actorId);
	}
	
	@Override
	public List<Film> getFilmsOnActorFirstNameAndSurName(String firstName, String surName) {
		return productRepository.getFilmsOnActorFirstNameAndSurName(firstName, surName);
	}
	
	@Override
	public List<Book> getAllBooks() {
		return productRepository.getAllBooks();
	}
	
	@Override
	public List<Book> getBooksOnAuthorId(int authorId) {
		return productRepository.getBooksOnAuthorId(authorId);
	}
	
	@Override
	public List<Book> getBooksOnAuthorFirstNameAndSurName(String firstName, String surName) {
		return productRepository.getBooksOnAuthorFirstNameAndSurName(firstName, surName);
	}
	
	@Override
	public void insertFilm(Film film, Set<Integer> listOfCategories, Set<Integer> listOfActors) {
		productRepository.insertFilm(film, listOfCategories, listOfActors);
	}
	
	@Override
	public void updateFilm(Film film, Set<Integer> listOfCategories, Set<Integer> listOfActors) {
		productRepository.updateFilm(film, listOfCategories, listOfActors);
	}
	
	@Override
	public void deleteFilm(Film film) {
		productRepository.deleteFilm(film);
	}
	
	@Override
	public void insertBook(Book book, Set<Integer> listOfCategories, Set<Integer> listOfAuthors) {
		productRepository.insertBook(book, listOfCategories, listOfAuthors);
	}
	
	@Override
	public List<Film> getFilmOnProductId(int productId) {
		return productRepository.getFilmOnProductId(productId);
	}
	
	@Override
	public List<Film> getFilmOnProductName(String productName) {
		return productRepository.getFilmOnProductName(productName);
	}
	
	@Override
	public void updateBook(Book book, Set<Integer> listOfCategories, Set<Integer> listOfAuthors) {
		productRepository.updateBook(book, listOfCategories, listOfAuthors);
	}
	
	@Override
	public List<Book> getBookOnProductId(int productId) {
		return productRepository.getBookOnProductId(productId);
	}
	
	@Override
	public List<Book> getBookOnProductName(String productName) {
		return productRepository.getBookOnProductName(productName);
	}
	
	@Override
	public void deleteBook(Book book) {
		productRepository.deleteBook(book);
	}
	
	@Override
	public int getProductIdOnFilmId(int filmId) {
		return productRepository.getProductIdOnFilmId(filmId);
	}
	
	@Override
	public int getProductIdOnBookId(int bookId) {
		return productRepository.getProductIdOnBookId(bookId);
	}
	
	@Override
	public List<Product> getProductFromProductId(int productId) {
		return productRepository.getProductFromProductId(productId);
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
	
	@Override
	public List<User> getUserOnUserId(int userId) {
		return userRepository.getUserOnUserId(userId);
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
	
	@Override
	public List<Staff> getAllStaffMembers() {
		return staffRepository.getAllStaffMembers();
	}
	
	@Override
	public List<Staff> getStaffOnStaffId(int staffId) {
		return staffRepository.getStaffOnStaffId(staffId);
	}
	// *******************************************************************

	// *******************************************************************
	@Override
	public List<Actor> getAllActors() {
		return actorRepository.getAllActors();
	}
	
	@Override
	public List<Actor> getActorOnActorId(int actorId) {
		return actorRepository.getActorOnActorId(actorId);
	}
	
	@Override
	public List<Actor> getActorOnFirstNameAndSurName(String firstName, String surName) {
		return actorRepository.getActorOnFirstNameAndSurName(firstName, surName);
	}
	
	@Override
	public void insertActor(Actor actor) {
		actorRepository.insertActor(actor);
	}
	
	@Override
	public void updateActor(Actor actor) {
		actorRepository.updateActor(actor);
	}
	
	@Override
	public List<Integer> getActorsFilmIds(Actor actor) {
		return actorRepository.getActorsFilmIds(actor);
	}
	
	@Override
	public boolean getIfFilmIdStillExistOnAnyActorId(int filmId) {
		return actorRepository.getIfFilmIdStillExistOnAnyActorId(filmId);
	}
	
	@Override
	public void deleteActor(Actor actor, ActorRepository ar, ProductRepository pr) {
		actorRepository.deleteActor(actor, ar, pr);
	}
	
	@Override
	public List<Integer> getActorsOnProductId(int productId) {
		return actorRepository.getActorsOnProductId(productId);
	}
	// *******************************************************************
	
	// *******************************************************************
	@Override
	public List<Author> getAllAuthors() {
		return authorRepository.getAllAuthors();
	}
	
	@Override
	public List<Author> getAuthorOnAuthorId(int authorId) {
		return authorRepository.getAuthorOnAuthorId(authorId);
	}
	
	@Override
	public List<Author> getAuthorOnFirstNameAndSurName(String firstName, String surName) {
		return authorRepository.getAuthorOnFirstNameAndSurName(firstName, surName);
	}
	
	@Override
	public List<Integer> getAuthorsBookIds(Author author) {
		return authorRepository.getAuthorsBookIds(author);
	}
	
	@Override
	public boolean getIfBookIdStillExistOnAnyAuthorId(int bookId) {
		return authorRepository.getIfBookIdStillExistOnAnyAuthorId(bookId);
	}
	
	@Override
	public void insertAuthor(Author author) {
		authorRepository.insertAuthor(author);
	}
	
	@Override
	public void updateAuthor(Author author) {
		authorRepository.updateAuthor(author);
	}
	
	@Override
	public void deleteAuthor(Author author, AuthorRepository ar, ProductRepository pr) {
		authorRepository.deleteAuthor(author, ar, pr);
	}
	
	@Override
	public List<Integer> getAuthorsOnProductId(int productId) {
		return authorRepository.getAuthorsOnProductId(productId);
	}
	// *******************************************************************
}