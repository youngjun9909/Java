package chapter05;

// 사칙연산 클래스
// : 두 개의 매개변수로 전달받아 사칙연산 수행
class MyMath {
	// 매개 변수 O , 반한값 O
	int add(int a, int b) {return a + b;}
	int subtract(int a, int b) {return a - b;}
	int multiply(int a, int b) {return a * b;}
	int divide(int a, int b) {return a / b;}
	
	// return 문
	// : 현재 실행중인 메서드를 종료하고 호출한 메서드로 돌아감
	//>> 반환값 유무에 상관없이 반드시 존재 !
	
	// 반환이 없는 메서드
	void noReturn() {
		System.out.println("해당 메서드는 반환값이 없습니다.");
		// return;  있으나 없으나 출력값 동일
		// 자바 컴파일러가 반환 타입을 읽고 메서드 마지막에 자동으로 return; 을 추가
	}
	
	String yesReturn() {
		String name = "박영준";
		return name;
		//>> 반환 타입이 void가 아닌 경우 return문 생략 시 오류
		//>> 반드시 반환 타입의 데이터값이 반환되어야 함
	}
	// 조건에 따른 반환값 지정
	int max(int a, int b) {
		if (a > b) {
			return a;
		}else {
			return b;
		}
		// 반환타입이 있는 경우 > 항상 결과값이 반환되도록 지정
	}
	
	int min (int a, int b) {
		return a < b ? a : b;
	}
}

public class Method03 {
	public static void main(String[] args) {
		// 인스턴스 생성
		MyMath mm = new MyMath();
		
		System.out.println(mm.add(10, 20)); // 메서드 호출 30
		System.out.println(mm.subtract(10, 20)); // 메서드 호출 -10
		System.out.println(mm.multiply(10, 20)); // 메서드 호출 200
		System.out.println(mm.divide(40, 20)); // 메서드 호출 2
		mm.noReturn(); // 해당 메서드는 반환값이 없습니다.
		
		System.out.println(mm.max(11, 20)); // 20
		System.out.println(mm.min(11, 20)); // 11
	}
}
