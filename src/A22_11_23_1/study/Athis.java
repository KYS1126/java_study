package A22_11_23_1.study;

public class Athis {
	//Athis 클래스의 인스턴스 필드
	String field = "a-field";
	
	//Athis 클래스의 인스턴스 필드
	
	void method() {
		System.out.println("A-method");
	}
	
	//인스턴스 멤버 클래스
	class B {
		//B클래스의 인스턴스 필드
		//변수명이 똑같아도 클래스가 달라서 딱히 오류가 안난다.
		String field = "B-field";
		
		//B클래스의 인스턴스 메소드
		//메소드명이 똑같아도 클래스가 달라서 딱히 오류가 안난다.
		void method() {
			System.out.println("B-method");
		}	
		
		//B클래스의 인스턴스 메소드
		void print() {
			//B객체의 필드와 메소드를 사용
			System.out.println(this.field);
			this.method();
			
			//A객체의 필드와 메소드를 사용
			System.out.println(Athis.this.field);
			Athis.this.method();
	}
	
}
	//A클래스의 인스턴스 메소드
	void useB() {
		B b = new B();
		b.print();
	}
	
}
