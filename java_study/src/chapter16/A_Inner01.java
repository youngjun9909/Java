package chapter16;

// 내부 클래스(Inner Class)
// : 다른 클래스 내부에 선언된 클래스를 의미
//>>

// 외부 클래스
class OuterClass {
	private String outerField = "외부 클래스의 필드";
	static String staticField = "외부 클래스의 스태틱 필드";
	
	class InnerClass {
		void display() {
			System.out.println("외부클래스 필드에 접근 " + outerField);
		}
	}
	
	// 정적 내부 클래스 스태틱
	static class StaticClass {
		void display() {
			System.out.println("외부 클래스에 접근 " + staticField);
		}
	}
	
	// 메서드 내부 클래스 (로컬 클래스)
	void outerMethod() {
		final String localVar = "로컬 변수";
		
		// 메서드 내부에서만 사용 가능
		class MethodClass {
			void display() {
				System.out.println("로컬 변수에 접근 " + localVar);
			}
		}
		// 로컬 클래스의 인스턴스화
		MethodClass  inner = new MethodClass();
		inner.display();
	}
}

// 추상 클래스
//: 하나 이상의 추상 메서드를 포함
// cf) 추상 메서드 - 구현부 {}가 없는 메서드
abstract class AbstractClass {
	// 추상 메서드
	abstract void display() ;
}

public class A_Inner01 {
	public static void main(String[] args) {
		// 비정적 내부 클래스
		//1) 외부 클래스 인스턴스화
		
		OuterClass outer1 = new OuterClass();
		
		
		//2) 외부 클래스. 내부 클래스 형식으로 내부 클래스를 생성
		// 외부 클래스타입. 내부클래스타입 변수  = 외부인스턴스.new 내부 클래스();
		OuterClass.InnerClass inner = outer1.new InnerClass();
		inner.display();
		
		// 정적 내부 클래스 (스태틱 클래스***)
		// 1) 외부 클래스 인스턴스화가 필요없이 클래스를 통한 내부클래스 생성이 가능
		// 외부클래스타입.내부클래스타입 변수 = new 외부클래스.내부클래스();
		OuterClass.StaticClass staticInner = new OuterClass.StaticClass();
		
		// 메서드 내부 클래스(지역 클래스)
		OuterClass outer2 = new OuterClass();
		outer2.outerMethod();
		
		// 익명 내부 클래스 ****
		// 클래스 타입 변수명 = new 클래스명 () { 메서드 구현 - 추상 클래스, 인터페이스 }
 		AbstractClass obj = new AbstractClass() {
			
			@Override
			void display() {
				System.out.println("익명 내부 클래스");
			}
		}; // 추상 클래스는 구현하는 익명 클래스 >> 재사용이 불가, 디버깅이 어려움
		
		obj.display(); // 익명 내부 클래스
		
		
		
		
		
		
		
		
		
	}
}
