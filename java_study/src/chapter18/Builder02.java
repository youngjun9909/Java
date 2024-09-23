package chapter18;

// == 빌더 패턴 없이! ==
// 학생 클래스 구현 

// 1) private한 필드 데이터 설정
// : name, age (필수 속성)
// : grade, major (선택적 속성)

// 2) 필수/선택적 값을 받을 생성자 구현
// >> 생성자 4개 구현

// 3) 데이터 호출을 위한 Getter 구현
// >> 각 필드에 대한 getter 구현

class Student {
	private final String name;
	private final int age;
	private String grade; // 학년
	private String major;
	
	// == 빌더 패턴 사용 시의 생성자 ==
	private Student(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.grade = builder.grade;
		this.major = builder.major;
	}
	
	// == 빌더 클래스 정의 (내부 클래스) ==
	public static class Builder {
		private final String name;
		private final int age;
		private String grade; // 학년
		private String major;
		
		public Builder(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		// - 선택적 필드의 체이닝을 위한 메서드 -
		public Builder grade(String grade) {
			this.grade = grade;
			return this;
		}
		public Builder major(String major) {
			this.major = major;
			return this;
		}
		
		// - 빌더를 통한 Student 인스턴스 생성
		public Student build() {
			return new Student(this);
		}
	}
	
	// 생성자
//	public Student(String name, int age) {
//		this.name = name;
//		this.age = age;
//	}
	
	// cf) 생성자의 오버로딩
	// : 파라미터의 개수와 타입이 같다면 생성자 호출 시 충돌 발생
//	public Student(String name, int age, String selectedField) {
//		this.name = name;
//		this.age = age;
//		this.grade = selectedField;
//	}
//
//	public Student(String name, int age, String grade, String major) {
//		this.name = name;
//		this.age = age;
//		this.grade = grade;
//		this.major = major;
//	}
	
	// Getter 메서드
	public String getName() {
		return name;
	}
	public int getAge () {
		return age;
	}
	public String getGrade() {
		return grade;
	}
	public String getMajor() {
		return major;
	}
}

public class Builder02 {
	public static void main(String[] args) {
//		Student st1 = new Student("박영준", 28, "1학년");
//		Student st2 = new Student("홍길동", 30);
//		Student st3 = new Student("전우치", 34, "4학년");
//		System.out.println(st1.getGrade()); // 1학년
//		System.out.println(st2.getAge()); // 30
//		System.out.println(st3.getName()); // 전우치
		
		Student std1 = new Student.Builder("박영준", 28).build();
		
		Student std2 = new Student.Builder("홍길동", 30)
				.grade("1학년")
				.major("회계학과")
				.build();
		
		Student std3 = new Student.Builder("전우치", 16)
				.grade("3학년")
				.build();
		
		Student std4 = new Student.Builder("임꺽정", 19)
				.major("심리학과")
				.build();
		
		System.out.println(std1.getName());
		System.out.println(std2.getName());
		System.out.println(std3.getName());
		System.out.println(std4.getName());
	}
}