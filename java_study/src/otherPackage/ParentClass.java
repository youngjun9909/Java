package otherPackage;

public class ParentClass {
	public String publicField;
	
	protected String protectedField;
	
	public ParentClass() {
		this.protectedField = "안녕하세요";
		
	}
	
	protected void exampleMethod () {
		System.out.println("hi");
	}
	
}
