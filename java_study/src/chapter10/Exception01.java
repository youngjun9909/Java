package chapter10;

// 자바 예외 처리

// 예외 (Exception)
// : 프로그램 실행 중에 발생할 수 있는 예기치 못한 문제나 조건

// 예외 처리
// : 예외가 발생할 경우 프로그램이 중단되지 않고 대응하여 정삭적인 흐름을 유지하는 프로그래밍 기법

// === 자바 예외 클래스 ===
// Throwable : 모든 예외와 오류의 최상위 클래스
// - 모든 예외 클래스는 해당 클래스를 상속받음
//>> 예외와 관련된 메시지, 처리방법에 대한 예시 정보를 포함

// 1) Exception: 
// - 프로그램이 처리할 수 있는 예외들의 클래스
// - 예외 처리를 통해 개발자가 처리할 수 있는 문제들을 정의

// 1-1 ) Checked Exception
// - 컴파일 시점에 체크되는 예외
//>> 개발자 반드시 처리 !
//>> 컴파일러는 해당 예외가 처리되어 있지 않을 경우 오류를 발생

// 1-2) Runtime(Unchecked) Exception
// : 런타입 시점에 발생되는 예외
//>> 개발자의 실수로 발생
//>> 컴파일러가 강제하지 않음 (체크 X)

// 2) Error : 시스템 레벨에서 발생하는 예외, 개발자가 처리 X

// === 자바 예외 처리 방법 ===
// try-catch 블럭, throws 키워드, 사용자 정의 예외


public class Exception01 {
	public static void main(String[] args) {
		
		// 문자(char) > 혿따옴표
		// 문자열(String) > 쌍따옴표
//		System.out.println('abc'); - Error (체크 예외)
		System.out.println("ABC");
		
		// try-catch 블럭
		// 기본 형태
//		try {
//			// 예외가 발생할 수 있는 코드
//		}catch(ExceptionType e) {
//			// 예외 발생시 실행할 코드
//		}catch(ExceptionType e) {
//			// 예외 발생시 실행할 코드
//		}
		
		//>> catch 블럭: 특정 예외 타입이 발생했을 때 실행될 코드를 정의
		// >> 다중 catch 블럭으로 사용 가능(다중 예외 처리 가능)
		try {	
			// 런타임 (언체크) 예외
		int division = 10 / 0;
			//>> 정수를 0으로 나눌 수 없다.
		} catch(Exception e) {
			// try 블록 내에서 발생하는 예외를 소괄호 내에서 매개변수로 전달받아 
			//>> {} 실행문에서 처리
			//>> 매개벼수의 형식: 타입 변수명;
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("정상적인 실행입니다.");
		
		System.out.println("===========================");
		try {
			
			int[] numbers = new int[5];
			numbers[10] = 50;
			
			String text = null;
			System.out.println(text.length());
			// : null을 계산할 경우 예외 발생
			// : NullPointerException
			
			int division = 10 / 0;
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 인덱스 초과" + e.getMessage());
		}catch(NullPointerException e) {
			System.out.println("null을 계산할 경우 오류 발생");
		}catch(Exception e) {
			System.out.println("초과 오류");
		} finally {
			System.out.println("final 블록 실행");
			// 예외 발생 여부와 상관없이 항상 실행되는 코드 블럭
		}
		
		// == throw 블록 ==
		//: 예외를 직접 발생시키는 데 사용
		//>> 특정 조건에서 예외를 발생 시킬 경우 사용
		//>> 주로 조건문과 함께 사용
		
		int age = -10;
		try {
			if( age < 0 ) {
				// throw new 예외 타입("예외 메시지 작성")
				//>> 예외 메시지는 에외 객체의 .getMessage()를 통해 출력
				throw new Exception("나이는 음수가 될 수 없습니다.");
			}
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
