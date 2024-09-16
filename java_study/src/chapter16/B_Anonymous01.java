package chapter16;

// 익명 클래스
// : 이름이 없는 클래스
// - 주로 일회성 객체를 생성할 때 사용
// - 클래스를 정의하면서 동시에 그 인스턴스를 생성
// - 추상 클래스나 인터페이스 구현에 사용

// == 기본 형태 ==
// new 추상클래스명, 인터페이스명() {}

abstract class Example {
	abstract void display();
}

// A라는 이름을 가진 클래스
class A extends Example{
	void display() {
		System.out.println("이름이 있는 클래스를 출력합니다.");
	}
}

public class B_Anonymous01 {
	public static void main(String[] args) {
	// 이름이 있는 클래스는 여러 개의 인스턴스 생성이 가능
	A a1 = new A();
	A a2 = new A();
	A a3 = new A();
	
	//  추상 클래스의 익명 클래스
	Example a = new Example() {
		void display() {
			System.out.println("익명 클래스의 출력");
			}
		};
		
		a1.display();
		a2.display();
		a3.display();
		a.display();
	}
}
