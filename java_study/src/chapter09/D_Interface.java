package chapter09;

interface Example1 {
	int EXAMPLE_VARIABLE = 10;
	void printVar1();
	
	default void method() {
		System.out.println("예시 1");
	}
}

interface Example2 {
	void printVar2();
	
	default void method() {
		System.out.println("예시 2");
	}
}

// 다중 인터페이스 구현
// : 자바에서는 여러 개의 인터페이스를 동시에 구현이 가능
//>> 둘 이상의 타입으로 동작 가능

// == 다중 인터페이스 구현 방법 ==
// : implements 키워드 뒤에 여러 개의 인터페이스를 ,로 구분하여 나열
class ExmpleClass implements Example1, Example2 {
	public void printVar1() {
		System.out.println(EXAMPLE_VARIABLE);
	}
	
	public void printVar2() {
		System.out.println("다중 인터페이스 구현");
	}
	
	//cf) 다중 인터페이스의 주의 사항 
	// : 여러 개의 인터페이스에 같은 시그니처(선언부)를 가진 디폴트 메서드가 존재할 경우
	//>> 선언이 같고 구현이 다른 메서드가 충돌
	@Override 
	public void method() {
		System.out.println("Method, 중복되는 디폴트 메서드");
	}
}

public class D_Interface {
	public static void main(String[] args) {
		ExmpleClass exClass = new ExmpleClass();
		exClass.printVar1(); // 10
		exClass.printVar2(); // 다중 인터페이스 구현
		exClass.method(); // Method, 중복되는 디폴트 메서드
		
		Example1 exInterface = exClass;
		 
		exInterface.printVar1(); // 10
//		exInterface.printVar2();
		exInterface.method(); // Method, 중복되는 디폴트 메서드
		
		//cf) 인터페이스의 다형성
		//: 인터페이스를 구현한 클래스의 객체는 해당 인터페이스 타입이 될 수 있음
		//>> 해당 인터페이스 내의 구조만을 가지며
		//>> 재정의 된 메서드는 유지
		
		
		
		
		
		
		
		
		
	} 
}
