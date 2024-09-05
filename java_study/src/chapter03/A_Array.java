package chapter03;

// 배열(Array)
// : 같은 타입의 여러 변수를 하나의 집합으로 묶어서 처리하는 자료 구조
// - 데이터를 연속적으로 저장
// - 순서 ㅇ (index 인덱스 번호, 0 부터 1씩 증가되는 값)
// - 중복 ㅇ 
public class A_Array {
	

	public static void main(String[] args) {
		// 배열 vs 변수
		// 배열은 '생성한다' >> new 연산자 사용
		// 변수는 '선언'
		
		// 1) 변수 
		int korean = 90;
		int math = 75;
		int english = 80;
		
		// 2) 배열
		// : 생성하여 사용 - new 연산자 사용
		
		// === 배열의 선언 ===
		// : 생성한 배열을 담을 그릇
		// >> 데이터타입[] 배열명;
		// >> 데이터타입 배열명[];
	
		int[] array; // 정수형의 데이터를 담을 수 있는 배열
		
		// === 배열의 생성 ===
		// : 실제 데이터가 저장되는 것이 아니라 데이터 배열이 저장된 첫 번째 메모리 주소가 저장
		// >> new 데이터타입[배열의 길이];
		array = new int[3];
		
		System.out.println(array); // [I@4e50df2e
		
		// === 배열의 요소에 접근 ===
		// 배열명[인덱스 번호];
		// 데이터 삽입: 배열명[인덱스 번호] = 데이터;
		
		// cf) 배열 생성 시 모든 요소는 해당 데이터 타입의 기본값으로 초기화
		array[0] = 123;
		array[1] = 456;
		array[2] = 789;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		
//		System.out.println(array[3]); - Error
		
		// === 배열 선언과 동시에 초기화 ===
		// new 연산자를 사용한 직접적인 배열 생성 시 길이 지정 x
		
		// a. 데이터타입[] 배열명 = new 데이터타입[] {요소1, 요소2, 요소3, ...}
		int[] scoreList = new int[] {90, 80, 60};
		System.out.println(scoreList[0]);
  		// b. 데이터타입[] 배열명 = {요소1, 요소2, 요소3, ...}
		char[] greet = {'h', 'e', 'l', 'l', 'o'};
		System.out.print(greet[0]);
		System.out.print(greet[1]);
		System.out.print(greet[2]);
		System.out.print(greet[3]);
		System.out.println(greet[4]);
		
//		System.out.print(greet[5]);
		// >> 생성 시 요소의 개수를 파악하여 배열의 길이를 자동 지정
		
		// === 배열의 길이(크기) ===
		// .length 속성으로 확인
		System.out.println(greet.length);
		
		// === 배열의 특징 ===
		// > 한 번 생성되면 크기 변경 x
		// > 참조 타입: 주소값이 저장
		// > 모든 요소는 같은 자료형이어야 한다.
		
		// === 문자열 배열 생성 ===
		// String 타입의 기본값은 null
		String[] fruits = new String[3];
		System.out.println(fruits[0]); // null
		
		fruits[0] = "사과";
		System.out.println(fruits[0]); // 사과
		
		// === 배열 요소 삭제 ===
		// : 삭제 기능을 담당하는 문법 x
		// >> 삭제할 요소를 제외한 나머지 요소를 새로운 배열로 복사
		int[] original = {1, 2, 3, 4};
		int removeIndex = 2; // 제거할 요소의 인덱스 번호
		int originalLength = original.length;// 4
		
		int[] result = new int[originalLength - 1];
		int k = 0; // 새로운 배열의 인덱스 번호
		for (int i = 0; i < originalLength; i++) {
			if(i == removeIndex) {
				continue; // 루프의 나머지 부분을 건너뛰고 다음 반복을 진행
			}
			
			result[k] = original[i];
			k++;
		}
		
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		
		// === 배열을 순회하는 향상된 for문(for-each문)
		// for (데이터타입 변수명: 해당 데이터 타입의 배열) {
		// 배열의 모든 요소에 접근하는 코드
		//}
		
		int[] arrayNumber = {1, 3, 5, 7, 9};
		for(int number: arrayNumber) { // number 변수: for문 내의 변수
			System.out.print(number);
		}
	}
		
		

}
