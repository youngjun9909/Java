package chapter16;

import java.util.ArrayList;
import java.util.Comparator; // 두 객체를 비교하는 데 사용되는 함수형 인터페이스
import java.util.List;

class Student2 {
	private String name;
	private int score;
	
	public Student2(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	
	public int getScore() {
		return score;
	}
}

interface Grading2 {
	String calculateGrade(Student2 student); // 추상 메서드
}


public class C_Lambda01 {
	public static void main(String[] args) {
		List<Student2> students = new ArrayList<Student2>();
		students.add(new Student2("박영준",89));
		students.add(new Student2("홍길동",74));
		students.add(new Student2("각시탈",68));
		students.add(new Student2("전우치",90));
		students.add(new Student2("임꺽정",97));
		
		// 람다 표현식을 사용한 성적 계산
		Grading2 grading = (Student2 student) -> {
			int score = student.getScore();
			if(score > 100 || score < 0) {
				System.out.println("잘못된 점수입니다.");
				return null;
			}else if(score >= 90) {
				return "A";
			}else if(score >= 80) {
				return "B";
			}else if(score >= 70) {
				return "C";
			}else if(score >= 60) {
				return "D";
			}else {
				return "F";
			}
		};
		
		// 성적 출력
		for (Student2 student: students) {
			System.out.println(student.getName() + "의 성적: " + grading.calculateGrade(student));
		}
		
		// 학생 성적에 따라 정렬
		students.sort(Comparator.comparingInt(Student2::getScore)); // 오름 차순
		students.sort(Comparator.comparingInt(Student2::getScore).reversed()); // 내림 차순
		for(Student2 student : students) {
			System.out.println(student.getName()+ "의 성적: " + student.getScore());
		}
		
		//cf) 메서드 참조
		// (Student2 st) -> getScore(st);
		//= Student2::getScore
		
		// (x) -> 인스턴스.인스턴스메서드명(x);
		// 인스턴스::메서드명
		
		// (x) -> 클래스명.메서드명(x)
		// 클래스::메서드명
		
		
		
		
 	}
}
