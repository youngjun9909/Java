package chapter09;

// 추상화(abstract)
// : 미완성 설계도, 완전하지 않은 클래스
//>> 다른 클래스가 상속받아 완성 가능, 그 자체로는 인스턴스 생성X 

// == 추상 클래스의 특징 ==
// 1. 클래스 자체로는 인스턴스 생성 X
// 2. 추상 메서드를 하나 이상 포함 !
// 3. 확장성 제공을 위한 사용

// === 추상 클래스의 구현 방법 ===
// : abstract 키워드를 사용하여 선언

// == 추상 클래스 예시 ==
abstract class Human {
	// cf) 메서드의 구성: 선언부 + 구현부
	// (접근제어자) 반환타입 메서드명 (매개변수) {메서드의 기능 동작}
	
	// === 추상 메서드 ===
	// : 메서드의 선언부만 존재, 구현부는 존재하지 않는 메서드
	//>> 자식 클래스에서 해당 메서드를 반드시 구현하도록 강제하는 역할 !
	//>> abstract 키워드를 사용 + 구현부 {} 대신 세미콜론;을 사용하여 선언을 마침
	abstract void work();
}

class Police extends Human {
	void work() {
		System.out.println("경찰은 치안유지 업무를 담당합니다.");
	}
}

class Student extends Human {
	void work() {
		System.out.println("학생은 공부를합니다.");
	}
}

// == 추상 클래스 예제 ==
abstract class Animal {
	abstract void makeSound();
	
	void eat() {
		System.out.println("동물은 먹이를 먹습니다.");
	}
}

class Cat extends Animal {
	// 추상 메서드 구현
	void makeSound() {
		System.out.println("야옹");
	}
	
	// 상속받은 메서드 재정의(오버라이딩)
	@Override
	void eat() {
		System.out.println("고양이는 츄르를 먹습니다.");
	}
}

class Dog extends Animal {
	void makeSound() {
		System.out.println("멍멍");
	}
}

public class A_Abstract {
	public static void main(String[] args) {
//		Human human = new Human();
		//>> 추상 클래스를 통한 인스턴스화는 불가 !
		
		Police police = new Police();
		police.work();
		
		Student student = new Student();
		student.work();
		
		// == 에제 인스턴스 생성 ==
		Cat cat = new Cat();
		cat.makeSound();
		cat.eat();
		
		Dog dog = new Dog();
		dog.eat(); // 동물은 먹이를 먹습니다. >> 부모 클래스에서 정의 된 기능
		dog.makeSound();
	}
}
