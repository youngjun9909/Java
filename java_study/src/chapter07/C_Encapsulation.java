package chapter07;

// === 학생 정보를 관리하는 클래스 ===
class Student {
	private String name;
	private int age;
	private int score; // 점수 필드 
	
	// getter & setter 메서드 - 캡슐화 되어있는 데이터에 접근
	// : 메서드 형식을 get변수명, set변수명으로 지정 하는 것을 권장
	
	public String getName() {
		// private 설정되어있는 name 변수는 반드시 getName() 메서드를 통해서만 외부에서 접근 가능
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		if(age < 0) {
			System.out.println("유효하지 않은 나이입니다");
		}else {
			this.age = age;			
		}
	}
	
	public int getScore() {
		return score;
	}
	
	public void setScore(int score) {
		if (score > 0 && score < 100) {
			this.score = score;
		}else {
			System.out.println("유효하지 않은 점수입니다.");
		}
	}
}

public class C_Encapsulation {
	public static void main(String[] args) {
		// 인스턴스 생성
		Student st1 = new Student();
		// st1.name = "박영준"; - Error
		st1.setName("박영준");
		st1.setAge(26);
		
		System.out.println(st1.getName());  // 박영준
		System.out.println(st1.getAge()); // 26
		st1.setAge(-10); // 유효하지 않은 나이입니다
		
		// score 필드를 getter & setter 통해 설정
		//>> 점수값에 대한 유효성 검사 코드를 추가
		// : 0 이상 100 이하
		// 85점 설정 > 출력
		st1.setScore(85); 
		System.out.println(st1.getScore()); // 85
		st1.setScore(102); //  유효하지 않은 점수입니다.
		
	}
}
