package chapter01;

public class B_DataType {

	public static void main(String[] args) {
		// 데이터 타입 (자료형, Data Type)
		// : 자바는 강 타입 언어
		// >> 모든 변수 선언 시 반드시 데이터 타입 명시!
		
		// 1. 데이터 타입 종류
		/*
		 * : 기본 타입
		 * >> 변수 선언 시 해당되는 자료형의 크기 만큼 메모리 할당
		 * >> 실질적인 데이터가 저장
		 * 
		 * : 참조 타입
		 * >> 객체의 참조 (메모리 주소)를 저장하는 변수 타입
		 * 
		 * 
		 * 2. 기본 자료형
		 * : 총 8가지의 기본형 타입 존재
		 * : byte(1), short(2), long(8), float(4)
		 * 
		 * : int(4), double(8), char(2), boolean(1) **
		 */
		int age; // 변수 선언
		age = 26; // 변수 초기화
		int height = 179; // 선언 + 초기화
		
		// long 타입은 숫자뒤에 알파벳 L,l Long 형태 명시
		long bitNumber = 10000000000000000L;
		
		System.out.println(age);
		System.out.println(height);
		
		/* 2-2. 문자형
		 * char*: 하나의 문자를 저장하기 위한 변수를 선언할 때 사용
		 * - 문자형의 데이터의 경우 따옴표를 사용해 감싸야 함
		 * - 2바이트
		 * >> 단일 문자 저장
		 */
		char grade = 'a';
		
		/* 2-3. 실수형(부동 소수점 타입): 소수점 자리가 있는 수
		 * float: 4바이트 소수점, 숫자 뒤에 알파벳 F를 써서 float 형임을 명시
		 * double*(기본): 8바이트 소수점. 기본 실수 타입
		 */
		
		float weight = 70.9f;
		double weight2 = 70.8;
		
		/* 2-4. 논리형*: 데이터 값으로 true, false 만 담을 수 있음
		 *  - 1 바이트
		 *  - 값이 존재하는지, 결과가 참인지 거짓인지 표현
		 *  - 소문자 값 사용을 권장
		 *  - is 키워드를 사용하여 변수명 사용
		 */
		boolean isMarried = false;
		
		/* 3. 참조 자료 형태
		 * : 기본 자료형을 기초로 만들어진 자료형
		 * >> 실제 데이터 값이 아니라, 데이터가 저장된 주소값을 가지는 자료형
		 * 
		 * - 종류: 
		 * >> String: 문자열을 저장하는 데 사용
		 * >> Array: 배열을 저장하는 데 사용
		 */
		String name = "박영준";
		int[] scores = {90, 60, 70};
		
	}

}
