package chapter06;


// 클래스 구조
// : 변수, 메서드, 생성자

// == 생성자 ==
// : 인스턴스(객체)가 생성될 때 호출되는 '인스턴스 초기화 메서드'

// 생성자 조건
// : 생성자 이름은 클래스 이름과 동일 
// : 리턴값이 없는 메서드 형식 (void 생략가능)

// - 생성자가 인스턴스 생성x
// - new 키워드가 인스턴스를 생성

// 컴파일러가 제공하는 기본 생성자(매개변수 X, 아무런 구현 X)가 생략
class Data1 { int value; }

// 사용자 정의 생성자를 만드는 경우
// , 컴파일러가 자동으로 기본 생성자를 제거
class Data2 { 
	int value; 
	
	Data2 (int x) {
		value = x;
	}
}

class Car {
	String color;
	String gearType; // 오토 || 수동
	int tire;
	
	Car() {} // 기본 생성자 - 차를 생성 후 작업
	
	// 사용자 정의 생성자
	Car(String color, String gearType, int tire){
		this.color = color;
		this.gearType = gearType;
		this.tire = tire;
	}
	
	Car(String color) {
		// +) 정의 생성자에서 다른 생성자 호출 - this 키워드
		// >> 생성자 이름으로 클래스 이름 대신 this 사용
		// >> 정의 생성자에서 다른 생성자 호출 시 반드시! 첫 줄에서만 호출 가능
		// ?>> 호출된 생성자가 변수값 초기화를 하는 경우
		// 	   해당 생성자가 수행하는 작업을 유지하기 위함(무의미함 방지!)
		this(color, "auto", 4); // 생성자 메서드를 가리킴
		tire = 6;
		
		// >> 객체 생성 시 색상만 작성 하는 경우
		// >> 색상 + auto + 타이어 개수 6
		
	}
	void displayInfo() {
		System.out.println(color + gearType + tire);
	}
}


public class Constructor01 {
	public static void main(String[] args) {
		Data1 data1 = new Data1();
		data1.value = 10;
		
		Data2 data2 = new Data2(10);
		
		System.out.println(data1.value);
		System.out.println(data2.value);
		
		System.out.println("=== Car 클래스 ===");
		Car c1 = new Car();
		c1.color = "Red";
		c1.gearType = "수동";
		c1.tire = 4;
		c1.displayInfo(); // Red수동4
		
		Car c2 = new Car("gray", "자동", 4);
		c2.displayInfo(); // gray자동4
		
		Car c3 = new Car("blue");
		c3.displayInfo(); // blueauto6
		
	}
}
