package chapter02;

import java.util.Scanner;

public class B_Switch {
	public static void main(String[] args) {
		// Switch 조건문
		// : 특정 변수의 값에 따라 실행할 코드 블록의 범위를 결정

		// - 비교할 변수와 case 값을 비교하여 같은 값이 경우 해당 블록을 끝까지 실행
		// : break 키워드에서 switch 문이 종료

		// - 해당하는 case 가 없을 경우 default 문이 실행
		Scanner sc = new Scanner(System.in);

		System.out.println("Chapter를 선택하세요.");
		int chapter = sc.nextInt();

		switch (chapter) {
		case 1:
			System.out.println("자바 기본 문법");
			break;
		case 2:
			System.out.println("자바 제어문 - 조건/ 반복");
			break;
		case 3:
			System.out.println("자바 배열");
			break;
		default:
			System.out.println("범위 초과");
		}
		sc.close();

	}
}
