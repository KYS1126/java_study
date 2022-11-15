package test.ch06.exam01.pakage2;

import test.ch06.exam01.pakage1.A;
import test.ch06.exam01.pakage1.B;

public class C {

//	A a =new A(); //A클래스(default) 접근불가
//	B b= new B();
	
	A a1 = new A(true); //문제없음
	A a2 = new A(1); //문제
	A a3 = new A("안녕"); //문제
	
}
