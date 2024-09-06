package chapter06;

// 
class Parent {} // - 기존 클래스 (부모)
class Child extends Parent {} // - 새로운 클래스 (자식 클래스)

// cf) 명칭
// 상속해주는 클래스(Parent) : 조상, 부모, 상위, 기반, 슈퍼클래스
// 상속 받는 클래스(Child) : 자손, 자식, 하위, 파생, 서브 클래스

class Animal {
	String name;
}

// dog 자식 클래스는 animal 부모 클래스의 상속 받음
class Dog extends Animal{
	// 부모 클래스의 속성과 메서드를 모두 상속 받음
	// String name; 생략되어있음
	
	void bark( ) {
		System.out.println("강아지가 짖습니다.");
	}
}

class Tv {
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	void channelUp() {
		++channel;
	}
	void channelDown() {
		--channel;
	}
}

class SmartTv extends Tv {
	boolean ott; // ott플랫폼 전원 상태
	
	void displayOtt(String platform) {
		if(ott) {
			System.out.println(platform);
		} else {
			System.out.println("OTT 연결이 되지 않았습니다.");
		}
	}
}

public class Inheritance01 {
	public static void main(String[] args) {
		Dog choco = new Dog();
		choco.name = "초코";
		System.out.println(choco.name);
		
		System.out.println("===== 예제 2 =====");
		SmartTv stv = new SmartTv();
		stv.channel = 10;
		stv.channelUp();
		stv.channelUp();
		stv.channelUp();
		System.out.println(stv.channel); // 13
		
		stv.displayOtt("Netflix"); // OTT 연결이 되지 않았습니다.
		stv.ott = true;
		stv.displayOtt("Netflix"); // Netflix

	}
}
