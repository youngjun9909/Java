package chapter20.Library;

import java.util.ArrayList;
import java.util.List;

// 데이터를 메모리에 저장하고 관리하는 클래스

public class BookRepository {
	private List<Book> books = new ArrayList<Book>();
	private int idCounter = 1;
	
	// 메모리에 데이터를 저장하는 메서드
	public void save(Book book) {
		// 책을 생성하면서 id 값은 전달 X >> int 필드의 기본값이 0
		// - 책의 생성
		if(book.getId() == 0) {
			book.setId(idCounter++);
			books.add(book);
		}else {
			// - 책의 수정
			int index = books.indexOf(findById(book.getId()));
			books.set(index, book);
		}
	}
	
	// id 를 통해 책을 검색하는 메서드
	public Book findById(int id) {
		return books.stream()
				.filter(book -> book.getId() == id)
				.findFirst()
				.orElse(null);
	}
	
	// id 에 해당하는 책 요소를 삭제
	public void delete(int id) {
		books.removeIf(book -> book.getId() == id);
	}
	
	// 전체 책 데이터를 반환
	public List<Book> findAll() {
		return books;
	}
}
