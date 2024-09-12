package chapter12.Controller;

import java.util.ArrayList;
import java.util.List;
import chapter12.Model.Book;

// Book 데이터를 사용하여 기능 정의

public class BookController {
	// 인스턴스 변수
	private List<Book> books;
	
	// 생성자
	// >> 책(객체)을 담을 리스트 생성 
	public BookController() {
		this.books = new ArrayList<Book>();
	}
	
	// 1. 책을 추가하는 기능
	public void addBook(String title, String author, String publisher) {
		Book newBook = new Book(title, author, publisher);
		books.add(newBook);
	}
	
	// 2. 책 리스트 반환
	public List<Book> getAllBooks() {
		return books;
	}
	
	// 3. 도서 검색 기능
	public List<Book> searchBook(String title) {
		// 검색 된 도서를 담을 리스트
		List<Book> result = new ArrayList<Book>();
		
		// books 배열을 순환하여 각 순환마다 해당 요소를 Book 타입의 변수에 반환
		// >> for-each문
		for(Book book: books) {
			if (book.getTitle().contains(title)) {
				result.add(book);
			}
		}
		
		return result;
	}
}