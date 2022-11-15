package A22_11_11.study;

	//쉽게말해 Calculater 라는 설계도를 선언함.
	//지금 생성자,필드가 없다.
	//없으면 자동으로 자바가 만들어줌.

public class Calculater {
	//리턴값이 없는 메소드 선언
	//void메소드에서 return을 쓰면 에러가 남
	//void는 리턴값이 없을때 사용한다.
	//
	void powerOn() {
		System.out.println("전원을 켭니다.");
		return;
		//이렇게 쓰긴 써도됨, 대신 리턴밑에 추가로 뭘 쓰면 에러
	}
	
	//리턴값이 없는 메소드 선언
	void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	
	//int형으로 리턴값이 있는 메소드 선언
	//타입을 항상 생각해야함.
	//리턴 시키는 타입과, 선언한 타입과 동일해야한다.
	//아래 예제처럼 int plus 와 reuslt의 타입과 동일해야한다.
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	
	//double형으로 리턴값이 있는 메소드,
	double divide(int x, int y) {
		double result = (double)x / (double)y;
		return result;
	}
	
	
	
	
}
