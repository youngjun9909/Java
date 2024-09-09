package chapter08;

// === 다형성 ===
// Animal, Cat, Dog 클래스 선언

// Animal 클래스: sound 메서드 (The animal makes a sound)
class Animal {
	void sound() {
		System.out.println("The animal makes a sound");
	}
}

class Cat extends Animal {
	@Override
	void sound() {
		System.out.println("meow");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("bark");
	}
}

// Cat, Dog 클래스 - Animal 클래스를 상속
// : sound 메서드를 오버라이딩 >> 각각 "meow", "bark" 출력

// === instanceof 연산자 === 
// AnimalChecker 클래스 선언
// : Animal, Cat, Dog 클래스를 사용하여 다형성을 확인하는 메서드 작성
// : checkAnimalType 메서드 - Animal 타입의 매개변수를 전달
// : instanceof 연산자를 사용하여 매개변수가 Cat과 Dog 중 어느 인스턴스인지 확인
// : Cat > 'cat'출력 / Dog > 'dog'출력 / 둘 다 X > 'Unknown animal type'
class AnimalChecker {
	void checkAnimalType(Animal animal) {
		if(animal instanceof Cat) {
			System.out.println("cat");
		}else if (animal instanceof Dog) {
			System.out.println("dog");
		}else {
			System.out.println("Unknown animal type");
		}
	}
	
}
public class C_Practice {
	public static void main(String[] args) {
			
		AnimalChecker animalChecker = new AnimalChecker();
		
		Animal pet1 = new Animal();
		animalChecker.checkAnimalType(pet1); // Unknown animal type
		
		Animal pet2 = new Cat();
		animalChecker.checkAnimalType(pet2); // cat
		
		Animal pet3 = new Dog(); 
		animalChecker.checkAnimalType(pet3); // dog
		
		
		
		
		
		
		
		
		
		
	}
}