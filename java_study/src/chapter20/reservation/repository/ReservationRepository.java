package chapter20.reservation.repository;

import java.util.ArrayList;
import java.util.List;

import chapter20.reservation.model.Reservation;

public class ReservationRepository {
	private List<Reservation> reservations;
	
	public ReservationRepository() {
		this.reservations = new ArrayList<Reservation>();
	}
	
	
	// 예약 추가 메서드
	public void addReservation(Reservation reservation) {
		reservations.add(reservation); // 예약 목록에 추가
	}
	
	// 예약 조회 메서드
	public Reservation findById(String reservationId) {
		for(Reservation reservation: reservations) {
			if(reservation.getReservationId().equals(reservationId)) {
				return reservation;
			}
		}
		return null;
	}
	
	// 모든 예약 예약 조회 메서드
	public List<Reservation> findAll () {
		return reservations;
	}
}

