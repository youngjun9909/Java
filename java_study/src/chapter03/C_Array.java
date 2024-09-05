package chapter03;

import java.util.Arrays;

// Arrays 클래스
// : 배열을 조작하는 데 유요한 기능들을 제공
//>> 정렬, 검색, 변환 등

// - java.util 패키지 내부에 포함
// : 사용을 위해 import 구분 사용
public class C_Array {

	public static void main(String[] args) {
		// Arrays 클래스 사용법
		int[] numbers = {3, 2, 5, 7, 8};
		
		// === 배열 정렬(오름차순) ===
		// Arrays.sort(정렬할 배열);
		Arrays.sort(numbers);
		System.out.println(numbers[0]); // 2
		
		// === 배열 변환 ===
		// Arrays.toString();
		// 배열을 전체 구조를 파악할 수 있는 기능
		// 전체 배열을 대괄호 안에 담은 형태를 나타냄
		// 각 요소를 순회하며 문자열로 반환
		System.out.println(Arrays.toString(numbers)); // [2, 3, 5, 7, 8]

		// === 배열 내 검색 ===
		// Arrays.binarySearch(배열, 찾을 내용)
		// 존재 o : 인덱스 번호 반환
		// 존재 x : 음수 반환
		System.out.println(Arrays.binarySearch(numbers, 10));
		System.out.println(Arrays.binarySearch(numbers, 7));
		
		// === 배열의 비교 ===
		// Arrays.equals(a배열, b배열)
		// 논리형태로 반환
		int[] number2 = {1,2,3,4,5};
		System.out.println(Arrays.equals(numbers, number2)); // false
		
		// === 배열의 채움 ===
		// Arrays.fill(배열, 삽일할 값);
		// 배열의 모든 요소를 특정 값으로 채움
		int[] example = new int[3];
		Arrays.fill(example, 10);
		System.out.println(Arrays.toString(example));
		
	}

}
