package A22_11_17.study;

public class childEX {

	public static void main(String[] args) {
		/*
		// 자식객체
		Child child = new Child();
		
		//부모가 자식을 안고있음
		//변수타입 변수의 명
		Parent parent = child; //자동 타입 변환
		parent.method1();
		parent.method2(); //자동 타입 변환이일어났을때 자식에서 오버라이딩 한걸 가져온다.
//		parent.method3(); //자식 객체에 있는 메소드는 불러오지 않는다.

		parent.a = 2; //부모 필드
//		parent.b = 1; //자식 필드는 불러오지 못한다.
		*/
		
		
		Parent parent = new Child(); //자동 타입 변환
		
		//instanceof : 자바에서 제공하는 객체타입 확인을 위한 자바에서 제공하는 연산자. 
		//parent가 Child객체를 갖고 있지 않다면 강제타입 변환을 할 수 없으므로
		//현재 instanceof => parent 에 Child가 참조를 하고 있는지 확인해주는 연산자
		if (parent instanceof Child) { //parent의 매개변수가 child 객체를 담고있냐!? //트루면 실행			
			//자동 타입 변환 하고나서 강제 타입변환 가능
			Child child = (Child)parent; //강제 타입 변환
			child.b = 1;	//자식 객체에 있는 필드에 접근 가능
			child.method3(); //자식 메소드에 있는 필드에 접근 가능
		}
		
		
		
		
	}

}
