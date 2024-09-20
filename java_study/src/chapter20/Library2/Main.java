package chapter20.Library2;

import chapter20.Library2.controller.LibraryController;

// 1. 프로젝트 개요
// : 도서 대여 관리 시스템을 구축
// > 도서 등록, 사용자 등록, 도서 대여 및 반납을 관리

// 2. 프로젝트 구조

// 1_) controller - LibraryController
// : 요청을 처리하는 컨트롤러 계층

// 2_) model - Book, User
// : 데이터 설계

// 3_) repository - BOokRepository, UserRepository
// : 데이터를 저장하고 조회하는 계층

// 4_) service - LibraryService
// : 비즈니스 로직을 처리하는 서비스 계층

// 5_) Main.java (클래스 파일 - 실행 메서드 포함)
// : 애플리케이션의 시작점

// 3. 프로젝트 기능 목록

// 1. 사용자 관리
// - 사용자 등록
// - 사용자 목록 조회

// 2. 도서 괄닐
// - 도서 등록
// - 도서 목록 조회

// 3. 도서 대여
// - 사용자에게 도서 대여
// - 도서 반납

// 4. 기타
// - 도서 대여 여부 확인
// - 대여중인 도서 목록 조회

public class Main {
	public static void main(String[] args) {
		LibraryController controller = new LibraryController();
		controller.start();
	}
}
