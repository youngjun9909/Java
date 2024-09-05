package chapter05;

class Example {
	// (인스턴스) 변수 선언
	// : 데이터 타입이 같은 경우 타입 생략 가능
	int x, y;
//	int x;
//	int y;
	
	int add(int x, int y) {
		return x + y;
	}
	
	// 곱셈
	int multiply (int x, int y) {
		return x * y;
	}
	
	// 매개변수 X, 반환 값 X
	void print99dan() {
		for (int i = 1; i < 8; i++ ) {
			for(int j = 0; j < 8; j++) {
				System.out.print(j * i + " ");
			}
			System.out.println();
		}
	}
}

// class 파일
public class Method02 {
	// main 메서드
	// 접근제어자 정적메서드 반환타입 메서드명(매개변수) {...구현부}
	public static void main(String[] args) {
		Example ex1 = new Example();
		
		ex1.print99dan();
		
//		ex1.add(10, 20, 30); - Error
//		ex1.add("10", "20"); - Error
		ex1.add('a', 'b'); // char 타입(2) >> int 타입(4): 자동 형 변환
		
		System.out.println(ex1.multiply(10, 20));
	}
}
