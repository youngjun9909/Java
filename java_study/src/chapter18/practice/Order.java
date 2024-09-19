package chapter18.practice;

import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

// 주문 클래스
// 한명의 고객이 여러 개의 제품

@Builder
@ToString
@Getter
public class Order {
	private final String orderId;
	private final Customer customer;
	private final List<Product> products;
	private final double totalPrice;
	
	// 총 금액을 계산하는 메서드
	public static double calculateTotalPrice(List<Product> products) {
		// 리스트 프레임워크 데이터를 순회하여 double 타입의 데이터로 반환
		return products.stream().mapToDouble(Product::getPrice).sum();
	}
}
