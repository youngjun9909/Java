package chapter07;

import otherPackage.ParentClass;

class PrivateClass {
	private int myField;
	private void myMethod() {}
}

class DefaultClass {
	int myField;
	void myMethod() {}
}

class ProtectedClass extends ParentClass {
	protected int myField;
	
	public ProtectedClass() {
		// 상속 받은 기능은 다른 패키지더라도 접근 가능
		System.out.println(protectedField);
		exampleMethod();
	}
}


// 어떤 클래스든 어떤 패키지 내에 있는 접근 가능
public class A_Modifier {
	static String name = "박영준";
	
	public static void main(String[] args) {
		PrivateClass pc = new PrivateClass();
//		pc.myField; - private 설정 된 속성과 메서드는 해당 클래스 내부에서만 읽힘
		
		DefaultClass dc = new DefaultClass();
		dc.myField = 10;
		dc.myMethod();
		
		ProtectedClass pc2 = new ProtectedClass();
//		pc2.exampleMethod();
		
		
	}
}
