package A22_11_23_1.study;

public class A {
	//A클래스의 인스턴스 필드와 메소드
	int field1;
	void method1() {}
	
	//A클래스의 정적 필드와 메소드
	static int field2;
	static void method2() {}
	
	//인스턴스 멤버 클래스
	class B {
		void method() {
			
			field1 = 10; //가능
			method1(); //가능
			
			field2 = 10; //가능
			method2(); //가능
		}
	}
	
	//정적 멤버 클래스
	static class C {
		void method() {
			//정적 멤버 클래스에서는 바깥 클래스의 인스턴스 필드와 메소드에 접근 할 수가 없다
//			field1 = 10; //불가능
//			method1(); //불가능
			
			field2 = 10; //가능
			method2(); //가능
			
		}
	} 
}
