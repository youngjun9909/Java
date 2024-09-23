package chapter20.reservation.controller;

import java.util.List;
import java.util.Scanner;

import chapter20.reservation.model.Reservation;
import chapter20.reservation.service.ReservationService;
import chapter20.reservation.service.UserService;

/*
 *  ReservationController
 *  - 사용자 요청을 처리하고 알맞은 서비스 메서드를 호출
 *  - 콘솔 기반의 인터페이스로 사용자와 상호작용
 */
public class ReservationController {
	private UserService userService;
	private ReservationService reservationService;
	
	public ReservationController() {
		this.userService = new UserService();
		this.reservationService = new ReservationService();
	}
	
	public void run() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("1. 사용자 등록 | 2 .로그인 | 3.로그아웃");
			System.out.println("4. 예약하기 | 5. 예약 확인 | 6. 예약 취소");
			System.out.println("7. 종료");
			System.out.println("선택: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				System.out.println("사용자 ID: ");
				String userId = sc.nextLine();
				System.out.println("비밀번호 : ");
				String password = sc.nextLine();
				System.out.println("이름 : ");
				String name = sc.nextLine();
				System.out.println("이메일 : ");
				String email = sc.nextLine();
				
				userService.registerUser(userId, password, name, email);
				break;
				// 반복문에서 break 키워드를 만날경우
				//: 아래 구문을 실행하지않고 다시 조건 검사 시작
			case 2:
				System.out.println("사용자 ID: ");
				 userId = sc.nextLine();
				System.out.println("비밀번호 : ");
				 password = sc.nextLine();
				 
				 userService.login(userId, password);
				 break;
			
			case 3:
				userService.logout();
				break;
				
			case 4: 
				// 예약하기
				System.out.println("예약 ID: ");
				String reservationId =  sc.nextLine();
				System.out.println("사용자 ID : ");
				userId = sc.nextLine();
				System.out.println("예약 시간: ");
				String reservationTime = sc.nextLine();
				
				reservationService.createReservation(reservationId, userId, reservationTime);
				break;
			
			case 5:
				System.out.println("사용자 ID : ");
				userId = sc.nextLine();
				List<Reservation> userReservations = reservationService.getReservations(userId);
				
				// 해당 리스트 컬렉션이 null이 아니고 비워져 있지 않은 경우
				if(userReservations != null && userReservations.isEmpty()) {
					System.out.println("예약 내역이 없습니다.");
				}else {
					for(Reservation reservation: userReservations) {
						System.out.println("예약 ID: " + reservation.getReservationId());
					}
				}
				break;
				
			case 6:
				System.out.println("예약 Id: ");
				reservationId =  sc.nextLine();
				
				reservationService.cancelReservation(reservationId);
				break;
				
			case 7:
				System.out.println("프로그램 종료");
				sc.close();
				return;
				// : 반복문, 조건문, 함수에서는 return 키워드를 만나면 해당 체계가 종료
				
			default:
				System.out.println("잘못된 선택입니다. 다시 시도하세요.");
			}
			
			
			
			
		}
	}
}
