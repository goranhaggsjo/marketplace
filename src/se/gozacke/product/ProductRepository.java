package se.gozacke.product;

import java.util.List;
import java.util.Set;

public interface ProductRepository {
	public List<Product> getAllProducts();
	public void insertProduct(Product product, Set<Integer> listOfCategories);
	public void updateProduct(Product product, Set<Integer> listOfCategories);
	public void deleteProduct(Product product);
	public List<Product> getProductsFromCategoryName(String categoryName);
	public List<Product> getProductFromProductName(String productName);
	public List<Product> getProductFromProductId(int productId);
	public List<Film> getAllFilms();
	public List<Film> getFilmsOnActorId(int actorId);
	public List<Film> getFilmsOnActorFirstNameAndSurName(String firstName, String surName);
	public List<Film> getFilmOnProductId(int productId);
	public List<Film> getFilmOnProductName(String productName);
	public int getProductIdOnFilmId(int filmId);
	public int getProductIdOnBookId(int bookId);
	public List<Book> getAllBooks();
	public List<Book> getBooksOnAuthorId(int authorId);
	public List<Book> getBooksOnAuthorFirstNameAndSurName(String firstName, String surName);
	public List<Book> getBookOnProductId(int productId);
	public List<Book> getBookOnProductName(String productName);
	public void insertFilm(Film film, Set<Integer> listOfCategories, Set<Integer> listOfActors);
	public void updateFilm(Film film, Set<Integer> listOfCategories, Set<Integer> listOfActors);
	public void deleteFilm(Film film);
	public void insertBook(Book book, Set<Integer> listOfCategories, Set<Integer> listOfAuthors);
	public void updateBook(Book book, Set<Integer> listOfCategories, Set<Integer> listOfAuthors);
	public void deleteBook(Book book);
}