package chapter07;

// 접근 범위 제한 x
public class Example {
	// 클래스의 속성
	
	// 어디서든 접근 가능
	public int publicVar = 1;
	
	// 같은 패키지 O, 다른 패키지 - 해당 클래스를 상속받은 자식 클래스만 접근
	protected int protectedVar = 2;
	
	// 같은 패키지 O, 다른 패키지 X
	int defaultVar = 3;
	
	// 같은 클래스 내에서만 접근O
	private int privateVar = 4; 
	
	// 클래스의 메서드
	public void ex1() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
		System.out.println(defaultVar);
		System.out.println(privateVar);
	}
	
	protected void ex2() {System.out.println(protectedVar);}
	
	void ex3() {System.out.println(defaultVar);}
	
	private void ex4() {System.out.println(privateVar);}
}
