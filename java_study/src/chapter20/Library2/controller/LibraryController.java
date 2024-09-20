package chapter20.Library2.controller;

import java.util.Scanner;

import chapter20.Library2.model.Book;
import chapter20.Library2.model.User;
import chapter20.Library2.service.LibraryService;

public class LibraryController {
 private LibraryService libraryService = new LibraryService();
 
 	public void start() {
 		Scanner sc = new Scanner(System.in);
 		boolean running = true;
 		
 		
 		while(running) {
 			System.out.println("1: 도서 등록 | 2: 사용자 등록 | 3: 도서 대여 | 4: 도서 반납 | 5: 도서 목록 조회 | 6: 종료");
 			
 			int choice = sc.nextInt();
 			sc.nextLine();
 			
 			switch(choice) {
 			case 1:
 				System.out.println("도서 제목: ");
 				String title = sc.nextLine();
 				
 				System.out.println("도서 저자: ");
 				String author = sc.nextLine();
 				libraryService.addBook(new Book(title, author, false));
 				break;
 				
 			case 2:
 				System.out.println("사용자 이름: ");
 				String name = sc.nextLine();
 				
 				System.out.println("사용자 ID: ");
 				String userId = sc.nextLine();
 				
 				libraryService.registerUser(new User(name, userId));
 				break;
 				
 			case 3:
 				System.out.println("사용자 ID: ");
 				userId = sc.nextLine();
 				
 				System.out.println("도서 제목: ");
 				title = sc.nextLine();
 				
 				libraryService.borrowBook(userId, title);
 				break;
 				
 			case 4:
 				System.out.println("반납할 도서 제목");
 				title = sc.nextLine();
 				libraryService.returnBook(title);
 				break;
 				
 			case 5:
 				libraryService.listAllBooks();
 				break;
 				
 			case 6:
 				running = false;
 				break;
 			
 			default:
 				System.out.println("잘못된 입력입니다. 다시 입력하세요.");
 			}
 		}
 		sc.close();
 	}
 	
 	
}
