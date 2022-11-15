package A22_11_14.study;

public class Car2 {
	//인스턴스 필드
	int speed;
	static int test;
	
	//인스턴스 메소드
	void run() {
		System.out.println(this.speed + "으로 달립니다.");
	}
	
	void run2() {
		this.run(); //메소드에서 메소드를 불러올 수 있다.
		System.out.println(this.speed + "으로 달립니다.");
	}
	
	//정적(static) 블록
	static { 
//		this.speed = 200; //에러가 난다.
		//이유는 아래와 같음. static에서는 인스턴스 관련된 모든것들 접근 불가능
	}
	
	
	//정적(static) 메소드 , 정적 메소드에서는 인스턴스 속성과 기능을 그냥 불러올수없다.
	static void simulate() {
//		this.speed= 200; // 오류가 난다. 객체를 생성하기 전에는
		//메모리에 speed라는 필드가 안올라와 있기 때문.
		
		Car2 myCar = new Car2(); //인스턴스(객체) 생성을 스태틱안에서 할수있다.
	
		myCar.speed = 200; //인스턴스 필드에 있는 필드를 뽑아온다.
		myCar.run(); //인스턴트 메소드를 불러온다.
	}
	
	
	public static void main(String[] args) {
		simulate(); //정적 메소드 실행
		test = 10; //같은 클래스 안에 있기떄문에 클래스명을 안붙여도 괜찮다.
		
		Car2 myCar = new Car2(); //new를 쓸때마다 다른 객체가 생성된다.
		
		myCar.speed = 60; //스피드를 따로 지정해서 실행
		myCar.run(); 
		
	}

}
