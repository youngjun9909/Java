package chapter05;

class BaseballPlayer {
	// 인스턴스 변수
	// 선수 이름(name - 문자열),
	// 타율(battingAverage - double), 
	// 홈런 수(homeRuns - int)
	
	String name;
	double battingAverage;
	int homeRuns;
	
	// 정적(클래스) 변수
	// : 생성된 선수의 총 인원 (playerCount - int)
	//>> 모든 인스턴스에서 공유
	static int playerCount = 0;
	
	// 생성자 >> 인스턴스 변수 초기화 & 정적 변수 후위 증가(변수명++)
	BaseballPlayer(String name, double battingAverage, int homeRuns) {
		this.name = name;
		this.battingAverage = battingAverage;
		this.homeRuns = homeRuns;
		
		playerCount++;
	}
	
	// 인스턴스 메서드
	// 선수의 타율과 홈런 수를 업데이트하는 메서드
	//>> 매개변수: newBattingAverage, newHomeRuns를 받아 기존의 인스턴스 변수에 재 할당
	void update( double newBattingAverage, int newHomeRuns ) {
		battingAverage = newBattingAverage;
		homeRuns = newHomeRuns;
	}
}

public class MethodPractice {
	public static void main(String[] args) {
		BaseballPlayer p1 = new BaseballPlayer("이대호", 0.325, 10);
		BaseballPlayer p2 = new BaseballPlayer("최동원", 0.322, 5);
		BaseballPlayer p3 = new BaseballPlayer("김태형", 0.312, 3);
		System.out.println("총 생성된 선수: " + BaseballPlayer.playerCount);
	}
}
