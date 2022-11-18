package test.ch06.exam01.pakage1;

//클래스는 public, default 접근제한자를 가질 수 있다.
//아무것도 안쓰고 class만 있으면 default
public class A {
	public int field1;
	int field2;
	private int field3;
	
	public A() {  //생성자
		this.field1 = 1;
		this.field2 = 1;
		this.field3 = 1;
		method1();
		method2();
		method3();
	}
	
	public void method1() {}
	void method2() {}
	private void method3() {}
	
	
	
	
	
	
	
}
