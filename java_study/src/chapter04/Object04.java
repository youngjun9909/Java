package chapter04;

// 클래스 생성 (Book, Person, ...)
	// 속성 2개 
 	// 메서드 1개

class Person {
	String name;
	int age;
	boolean isStudent;
	
	void displayInfo() {
		System.out.println("이름: " + name + ", 나이: " + age + ", 학생 ? :" + isStudent );
	};
	
	Person (String name, int age, boolean isStudent) {
		this.name = name;
		this.age = age;
		this.isStudent = isStudent;
	}
}

public class Object04 {

	public static void main(String[] args) {
		// 위에서 정의한 클래스 사용하여 객체 인스턴스화
		Person myInfo = new Person("박영준", 26, true);
		
		// 속성 출력
		System.out.println(myInfo.name);
		System.out.println(myInfo.age);
		System.out.println(myInfo.isStudent);
		// 메서드 호출
		myInfo.displayInfo();
	}

}
