package A22_11_14.study;

public class Calculater2 {
	//1. 필드(속성)
	//정적 필드는 선언과 동시에 초기화시켜준다.
	
	static double pi = 3.14159;
	
	//정적블록
	static String model = "calc1";
	static String number = "1";
	static String info;
	
	//static블록: static 필드에 대한 초기화 작업이 필요할 때 사용
	static {  //정적 블록은 this를 안해도 됨
		info = model + "_" + number; //calc1_1
	}
	
	//2. 메소드(기능)
	//인스턴스 멤버
	//static은 run을 하자마자 메모리에 올려준다.
	//static이 아닌 객체는 객체(인스턴스)를 생성할때 올려준다.
	static int puls(int x, int y) {
		return x +y;
	}
	static int minus (int x, int y) {
		return x - y;
	}
	
	
	
	
	
}
