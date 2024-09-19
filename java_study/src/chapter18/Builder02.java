package chapter18;
// 학생 클래스 구현
// name, age 필수
// grade, major 선택
class Student {
	private final String name;
	private final int age;
	private String grade;
	private String major;

	// 빌더 패턴 사용 시의 생성자
	private Student(Builder builder) {
		this.name = builder.name;
		this.age = builder.age;
		this.grade = builder.grade;
		this.major = builder.major;
	}
	
	// 빌더 클래스 정의
	public static class Builder {
		private final String name;
		private final int age;
		private String grade;
		private String major;
		
		public Builder(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		// - 선택적 필드의 체닝을 위한 메서드 - 
		public Builder grade(String grade) {
			this.grade = grade;
			return this;
		}
		public Builder major(String major) {
			this.major = major;
			return this;
		}
		
		// 빌더를 통한 Student 인스턴스 생성
		public Student build() {
			return new Student(this);
		}
	}
	
// 필수 선택적 값을 받을 생성자 구현
//>> 생성자 4개 구현
//	public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//	
//	// 생성자의 오버로딩
//	//: 파라미터의 개수와 타입이 같다면 생성자 호출 시 충돌 발생
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
	
// 데이터 호출을 위한 Getter 구현
//>> 각 필드에 대한 getter 구현
	public String getName() {
		return name;
	}
	public int getAge() {
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
//		Student st1 = new Student("박영준", 26, "1학년");
//		Student st2 = new Student("홍길동", 30);
//		Student st3 = new Student("전우치", 34, "4학년");
//		System.out.println(st1.getGrade());
//		System.out.println(st2.getAge());
//		System.out.println(st3.getName());
		
		Student st1 = new Student.Builder("박영준", 26).grade("1학년").build();
		Student st2 = new Student.Builder("홍길동", 30).build();
		Student st3 = new Student.Builder("전우치", 34).grade("4학년").major("컴퓨터").build();
		System.out.println(st1.getGrade());
		System.out.println(st2.getAge());
		System.out.println(st3.getName());
	}
}
