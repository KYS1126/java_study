package test.ch07.package2;

import test.ch07.package1.A;

public class D extends A {
	public D() {
		super(); //A클래스 생성자 호출
		
	};
	
	public void method1 () {
//		super.field = "2";
//		super.method();
		
		this.field = "1";  //상속을 받으면 super를 써도 상관없고
		this.method();	   //this 를 써도 상관없다.
	}
	
	public void method2 () {
		//protected 사용시 직접 객체를 생성해서 사용할 수 없다.
		A a = new A();
		a.field = "1"; 
		a.method();
		
	}
	
	
}
