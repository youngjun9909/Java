package chapter01;

//자바 형 변환
		// : 하나의 타입을 다른 타입으로 바꾸는 것
		
//		 **자료형의 크기에 따른 형 변환 규칙**
//		 
//
//		**byte(1)  <  short(2)  <  int(4)  <  long(8)  <  float(4)  <  double(8)**
//
//		- 메모리 설계 상 정수 타입 보다 실수 타입이 더 크다

public class C_TypeConversion {

	public static void main(String[] args) {
		// 1. 자동 형 변환
		byte smallBowl = 10; // 1byte 
		int bigBowl = 10000; // 4byte

		// 작은 범위의 타입을 큰 타입으로 넣을 때
		// 컴파일러가 자동으로 형 변환 수행
		bigBowl = smallBowl;

		byte a = 32 ;
		short b = a;
		int c = b;
		long d = c;

		float e = d; // 실수는 정수 자료형 보다 크다.
		
		// 2. 강제 형 변환
		int number = 1234;
		float fNumber = number;
		
		float fNumber1 = 3.14f;
//		int number1 = fNumber1; - Error
		
		// (작은변환자료형) 큰데이터값;
		int number1 = (int)fNumber1;
		System.out.println(number1);
		
		char a1 = 'a'; // 일반 문자값
		char a2 = 97; // 아스키코드값
		char a3 = '\u0061'; // 유니코드값
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
				
		char example = '가';
		System.out.println((int)example);
		System.out.println((int)example + 1);
		System.out.println((char)((int)example + 1));
		
		// char 자료형은 음수 표현식 X 
		long l1 = 123456;
		int i1 = (int)l1;
		short s1 = (short)i1;
		byte b1 = (byte)s1;
		System.out.println(b1);
	}

}
