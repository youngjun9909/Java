package chapter16;

// 람다 표현식
// : 익명 함수를 간결하게 표현, 한 번만 사용되는 함수를 정의

// = 람다 표현식의 축약 = 
// 1. 중괄호 생략 가능: 본문이 단일 명령문

interface Example2 {
	String message(String msg);
}

public class C_Lambda02 {
	public static void main(String[] args) {
		Example2 hello = (a) -> {
			return a;
		};
		hello.message("안녕");
	
	}
}
