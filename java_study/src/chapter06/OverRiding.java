package chapter06;

class AnimalClass {
	void sound () {
		System.out.println("동물이 소리를 냅니다.");
	}
}

class DogClass extends AnimalClass {
	// 어노테이션
	// : 코드에 메타데이터를 제공하는 방법
	
	//현재 메서드가 부모 클래스의 메서드를 오버라이딩 한다는 것을 명시
	@Override
	void sound() {
		System.out.println("개가 멍멍 짖습니다.");
	}
}

class CatClass extends AnimalClass {
	@Override
	void sound () {
		System.out.println("고양이가 야옹 웁니다.");
	}
}

public class OverRiding {
	public static void main(String[] args) {
		DogClass dog1 = new DogClass();
		dog1.sound();
		
		CatClass cat1 = new CatClass();
		cat1.sound();
	}
}
