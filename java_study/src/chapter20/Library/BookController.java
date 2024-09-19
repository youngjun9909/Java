package chapter20.Library;

import java.util.List;

public class BookController {
	private final BookService bookService;
	
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}
	
	// 책 추가
	public void addBook(String title, String author, int year) {
		bookService.addBook(title, author, year);
	}
	// 책 수정
	public void updateBook(int id, String title, String author, int year) {
		bookService.updateBook(id, title, author, year);
	}
	// 책 삭제
	public void deleteBook(int id) {
		bookService.deleteBook(id);
	}
	// 책 조회
	// 1. 특정 아이디를 가진 책 조회
	public Book getBook (int id) {
		return bookService.getBook(id);
	}
	// 2. 모든 책 조회
	public List<Book> getAllBooks() {
		return bookService.getAllBooks();
	}
}
