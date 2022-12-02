package A22_11_28_Annotation;

public class Service {
	
	//필드
	String test;

	
	//생성자
	Service() {}
	
	//메소드
	@printAnnotation
	public void method1() {}

	@printAnnotation
	public void method2() {}
	
	//값을 Annotation에 넘겨줄 수 있다.
	@printAnnotation(value = "#", number=20)
	public void method3() {}
	
	
}
