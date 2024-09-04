package chater02;

public class D_While {

	public static void main(String[] args) {
		// while문 
		//: 일반적으로 반복 횟수가 지정되지 않을 때 사용
		
		// 조건을 검사하고 해당 조건이 true 인 경우 코드 블록을 실행
		// >> if 문의 반복 형태
		
		/*
		 while (조건) {
		 	조건이 참일 때 실행
		 }
		 */
		
		int num = 0;
		while(true) { // 무한 루프 
			if(num % 2 == 0 ) { // 0부터 20까지 중에서 홀수만 출력
				num++;
				continue; // 코드안에서 continue를 만나면 아래의 코드를 모두 무시하고 다시 조건 실행
			}
			System.out.println(num); // 홀수만 아래 내용이 실행
			num++;
			
			if(num == 20) break;
		}
		
		
		
	}

}
