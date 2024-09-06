package chapter06;

class Mammal {
	String name = "Parent";
	
	Mammal() {
		System.out.println("빈 부모 생성자 - 인스턴스 생성");
	}
	
	Mammal(String name) {
		// Mammal 클래스로 생성되는 각 객체 (this)
		this.name = name;
	}
}

class Cat extends Mammal {
	String name = "Child";
	
	// super();
	// : 자식 클래스의 기본 생성자는 사용자 정의 생성자가 없더라도
	// super() 부모 클래스 생성자 호출 키워드가 정의되어 있음 (생략)
	
	Cat() {
		// super()
		System.out.println("빈 자식 생성자");
	}
	Cat(String name) {
		// super()는 부모 클래스의 생성자를 가지고 오기 때문에
		// : 기본 생성자 또는 사용자 정의 생성자의 형태 그대로를 사용
		super(name); // 부모 클래스를 가리킴
		System.out.println("자식 클래스가 생성되었습니다.");
	}
	
	// 인스턴스 메서드
	void greet() {
		// 해당 클래스가 가진 인스턴스 변수에 접근 this (생략 O)
		System.out.println("자식: " + this.name);
		// 부모 클래스가 가진 인스턴스 변수에 접근 super (생략X)
		System.out.println("부모: " + super.name);
	}
}

public class Inheritance02 {
	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Cat cat2 = new Cat("치즈");
		
		cat1.greet(); // 자식: Child , 부모: Parent
		
		cat2.greet(); // 자식: Child , 부모: 치즈
		
	}
}
