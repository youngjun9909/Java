package chapter02;

// 반복문
// : 작업을 반복적으로 실행하고 싶을 때 사용

// for , while, do-while 문

public class C_For {
	public static void main(String[] args) {
		// for 문
		// : 특정 조건이 만족될 때까지 코드 블록을 반복 실행
		// : 횟수가 정해져 있을 때 
		
		/*
		  for (초기화식; 조건; 증감) {
		  	조건이 만족될 때 실행할 코드
		  }
		 */
		
		for (int num = 1; num <= 5; num++) {
			System.out.print(num); // 12345
		}
		
		//  == 예제 ==
		// for 반복문을 사용하여 1 부터 10 까지의 숫자 중 짝수만 출력
		System.out.println("======");
		for (int numb = 1; numb <= 10; numb++ ) {
			if(numb % 2 == 0) {
				System.out.print(numb);
			}
		}
		
		// == for 반복문을 사용하여 구구단의 일부를 출력하는 코드 ==
		// = 3단
		int num = 3;
		for(int i = 1; i <= 9; i++) {
			System.out.println(num + "X" + i + "=" + num * i);
		}
		
		System.out.println("=== 구구단 전체 ===");
		
		for (int num1 = 1; num1 <= 9; num1++) {
			System.out.println("[" + num1 + "단]");
			for(int num2 = 1; num2 <= 9; num2++) {
				System.out.println(num1 + "X" + num2 + "="+ num1 * num2);
			}
		}
	}
}
