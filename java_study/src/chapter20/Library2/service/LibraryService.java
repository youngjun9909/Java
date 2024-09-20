package chapter20.Library2.service;

import chapter20.Library2.model.Book;
import chapter20.Library2.model.User;
import chapter20.Library2.repository.BookRepository;
import chapter20.Library2.repository.UserRepository;

public class LibraryService {

	private BookRepository bookRepository = new BookRepository();
	private UserRepository userRepository = new UserRepository();
	
	public void addBook(Book book) {
		bookRepository.addBook(book);
	}

	public void registerUser(User user) {
		userRepository.addUser(user);
	}

	public void borrowBook(String userId, String bookTitle) {
		User user = userRepository.findUserId(userId);		
		Book book = bookRepository.findBookByTitle(bookTitle);
		
		if(user != null && book != null && !book.getIsBorrowed()) {
			book.setIsBorrowed(true);
			System.out.println(user.getName() + "님이" + book.getTitle() + "을(를) 대여 하였습니다.");
		}else {
			System.out.println("대여 불가: 사용자가 존재하지 않거나 도서가 이미 대여 중입니다.");
		}
		
	}

	public void returnBook(String title) {
		Book book = bookRepository.findBookByTitle(title);
		if(book != null && book.getIsBorrowed()) {
			book.setIsBorrowed(false);
			System.out.println(book.getTitle() + "반납되었습니다.");
		}else {
			System.out.println("반납 불가: 해당 도서는 대여 중이 아닙니다.");
		}
	}

	public void listAllBooks() {
		for (Book book : bookRepository.findAllBooks()) {
			System.out.println(book.getTitle() + " - " + (book.getIsBorrowed() ? "대여 중" : "대여 중 아님"));
		}
	}
	
	public void listAllUsers() {
		for (User user : userRepository.findAllUser()) {
			System.out.println("ddd");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
