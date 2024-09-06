package chapter05;

// 음식점 클래스
// : 다양한 방법으로 주문을 받는 메서드 정의
class Restaurant {
	// 메서드 정의
	String dish;
	int quantity;
	String specialRequests;
	// : placeOrder 주문 메서드
	//>> 메뉴 이름 (String dish)
	void placeOrder(String dish) {
		System.out.println("메뉴: " + dish);
	}
	//>> 메뉴 이름, 수량 제공 (int quantity)
	void placeOrder(String dish, int quantity) {
		System.out.println("메뉴: " + dish + ", 수량: " + quantity);
	}
	
	void placeOrder(String dish, String specialRequests) {
		System.out.println("메뉴: " + dish + ", 요청사항: " + specialRequests);
	}
	
	//>> 메뉴이름, 특별 오청 사항 제공 (String specialRequests)
	void placeOrder(String dish, int quantity, String specialRequests) {
		System.out.println("메뉴: " + dish + ", 수량: " + quantity + ", 요청사항: " + specialRequests);
	}
}
public class OverLoading02 {
	public static void main(String[] args) {
		Restaurant order = new Restaurant();
		order.placeOrder("삼겹살"); // 메뉴: 삼겹살
		order.placeOrder("삼겹살", 2); // 메뉴: 삼겹살, 수량: 2
		order.placeOrder("삼겹살", "많이"); // 메뉴: 삼겹살, 요청사항: 많이
		order.placeOrder("삼겹살", 2, "많이"); // 메뉴: 삼겹살, 수량: 2, 요청사항: 많이
	}
}
