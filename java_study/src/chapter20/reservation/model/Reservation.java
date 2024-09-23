package chapter20.reservation.model;

import lombok.Getter;
import lombok.Setter;

/* Reservation 클래스
 * - 예약 정보를 담는 클래스
 * - 속성: 예약ID, 사용자ID, 예약 시간, 예약 상태 등
 * 
 */

@Getter
@Setter
public class Reservation {
	private String reservationId;
	private String userId;
	private String reservationTime;
	private boolean isActive;
	
	public Reservation(String reservationId, String userId,  String reservationTime) {
		this.reservationId = reservationId;
		this.userId = userId;
		this.reservationTime = reservationTime;
		this.isActive = true; // 기본값으로 예약은 활성 상태
	}
	
	public void cancel() {
		this.isActive = false; // 예약 취소 시 비활성 상태로 변경
	}
}
