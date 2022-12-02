package A22_11_23.study;

public class ALocal {
	void useB(int arg) { //final int age 처럼 작동됨
		
		//로컬변수
		int var = 1; //final int var 처럼 작동됨.
		
		class B {
			//인스터스 필드
			int field1 = 1;
			
			//생성자
			B() {
				System.out.println("B 생성자 실행");
			}
			
			//인스턴스 메소드
			void method1() {
				System.out.println("B 메소드 실행");				
			}
			
			void method2() {
//				arg = 2;  //클래스 중첩 사용시 바꿀수 없다.
//				var = 2;  
				
				
			}
			
		}
		//메소드 안에서 객체 생성
		B b = new B();
		System.out.println(b.field1);
		b.method1();
	}
	
}
